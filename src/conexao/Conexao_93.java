package conexao;

/**
 * @author: Lucas Lourenço 
 * @date: 13/12/2018 
 * @location: Ciarama Máquinas Ltda.
 */
import java.sql.*;
import javax.swing.JOptionPane;

public abstract class Conexao_93 {

    private static final String DRIVER = "net.sourceforge.jtds.jdbc.Driver";
    private static final String URL = "jdbc:jtds:sqlserver://192.168.10.93:1433/PRODUCAO";
    private static final String USER = "ti";
    private static final String PASSWORD = "Cavalo200!";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossível conectar! \n" + ex);
        }
        return null;
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException desc) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar" + desc);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stm) {

        closeConnection(con);

        try {
            if (stm != null) {
                stm.close();
            }
        } catch (SQLException desc) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar" + desc);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stm, ResultSet rs) {

        closeConnection(con, stm);

        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException desc) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar" + desc);
        }
    }
}
