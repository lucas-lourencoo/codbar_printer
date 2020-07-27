package model;

/**
 * @author: Lucas Lourenço
 * @date: 13/12/2018
 * @location: Ciarama Máquinas Ltda.
 */
import conexao.Conexao_92;
import conexao.Conexao_93;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LeitorDAO {

    private Connection con;
    private PreparedStatement stm;
    private ResultSet rs;

    public List<Leitor> getAllLeitor(String id) throws Exception {
        List<Leitor> leitor = new ArrayList<>();
        con = Conexao_92.getConnection();
        try {
            stm = con.prepareStatement("SELECT * FROM XML WHERE id_xml = ?");
            stm.setString(1, "NFe" + id);
            rs = stm.executeQuery();
            while (rs.next()) {
                Leitor l = new Leitor();
                l.setId_xml(rs.getString("id_xml").trim());
                l.setProduto(rs.getString("produto").trim());
                l.setQuantidade(rs.getInt("quantidade"));
                l.setCnpj(rs.getString("cnpj").trim());
                leitor.add(l);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no Select!" + ex);
        } finally {
            Conexao_92.closeConnection(con, stm, rs);
            stm.close();
            rs.close();
        }
        try {
            if (!leitor.isEmpty()) {
                return leitor;
            } else {
                JOptionPane.showMessageDialog(null, "XML não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
        }
        return null;
    }

    public void selectLocal(String c, Leitor l) {
        con = Conexao_93.getConnection();
        try {
            stm = con.prepareStatement("SELECT BZ_LOCALI2 FROM SBZ010 WHERE "
                    + "BZ_FILIAL = 010104 AND BZ_COD = ? ORDER BY BZ_LOCALI2");
            stm.setString(1, c);
            rs = stm.executeQuery();
            l.setLocal(null);
            while (rs.next()) {
                l.setLocal(rs.getString("BZ_LOCALI2").trim());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no select! \n" + ex);
        } finally {
            Conexao_93.closeConnection(con, stm, rs);
        }
    }

    public List<Leitor> selectLote(String local, String local2) {
        List<Leitor> leitor = new ArrayList<>();
        con = Conexao_93.getConnection();
        try {
            stm = con.prepareStatement("SELECT BZ_COD, BZ_LOCALI2 FROM SBZ010 WHERE BZ_FILIAL = 010104 AND BZ_LOCALI2 BETWEEN ? AND ?"
                    + " ORDER BY BZ_LOCALI2");
            stm.setString(1, local + "%");
            stm.setString(2, local2 + "%");
            rs = stm.executeQuery();
            while (rs.next()) {
                Leitor l = new Leitor();
                l.setProduto(rs.getString("BZ_COD").trim());
                l.setLocal(rs.getString("BZ_LOCALI2").trim());
                leitor.add(l);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no select! \n" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao_93.closeConnection(con, stm, rs);
        }
        return leitor;
    }

    public List<Leitor> selectLocacao(String local, String local2) {
        List<Leitor> leitor = new ArrayList<>();
        con = Conexao_93.getConnection();
        try {
            stm = con.prepareStatement("SELECT DISTINCT BZ_LOCALI2 FROM SBZ010 WHERE BZ_FILIAL = 010104 AND BZ_LOCALI2 BETWEEN ? AND ?"
                    + " GROUP BY BZ_LOCALI2 ORDER BY BZ_LOCALI2");
            stm.setString(1, local + "%");
            stm.setString(2, local2 + "%");
            rs = stm.executeQuery();
            while (rs.next()) {
                Leitor l = new Leitor();
                l.setLocal(rs.getString("BZ_LOCALI2").trim());
                leitor.add(l);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no select! \n" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao_93.closeConnection(con, stm, rs);
        }
        return leitor;
    }

    public String selectZBC(Leitor l) {
        con = Conexao_93.getConnection();
        try {
            stm = con.prepareStatement("SELECT ZBC_PROD FROM ZBC010 WHERE ZBC_CNPJ = ? AND ZBC_PRODF = ?");
            stm.setString(1, l.getCnpj());
            stm.setString(2, l.getProduto());
            rs = stm.executeQuery();
            while (rs.next()) {
                String prod = rs.getString("ZBC_PROD").trim();
                return prod;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no select! \n" + ex);
        } finally {
            Conexao_93.closeConnection(con, stm, rs);
        }
        return null;
    }
}
