package view;

/**
 * @author: Lucas Lourenço
 * @date: 13/12/2018
 * @location: Ciarama Máquinas Ltda.
 */
import util.CriarCodigo;
import java.awt.Toolkit;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import model.Leitor;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.LeitorDAO;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import util.qrcode.QrCode;

public class frmXml extends javax.swing.JFrame {

    Leitor leia = new Leitor();
    LeitorDAO dao = new LeitorDAO();

    public frmXml() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tblXml1.getModel();
        tblXml1.setRowSorter(new TableRowSorter(modelo));
        tblXml1.getColumnModel().getColumn(0).setPreferredWidth(300);
        tblXml1.getColumnModel().getColumn(1).setPreferredWidth(20);
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblXml = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        bntImprimir = new javax.swing.JButton();
        lblNota = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblXml1 = new javax.swing.JTable();
        lblVersao = new javax.swing.JLabel();

        tblXml.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblXml);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Produto Com Nota Fiscal");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTitulo.setText("XML");

        btnVoltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reply.png"))); // NOI18N
        btnVoltar.setText(" Voltar");
        btnVoltar.setMaximumSize(new java.awt.Dimension(93, 31));
        btnVoltar.setMinimumSize(new java.awt.Dimension(93, 31));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        bntImprimir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bntImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/printer.png"))); // NOI18N
        bntImprimir.setText(" Imprimir");
        bntImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntImprimirActionPerformed(evt);
            }
        });

        lblNota.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNota.setText("Chave da nota: ");

        tblXml1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblXml1.getTableHeader().setResizingAllowed(false);
        tblXml1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblXml1);

        lblVersao.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblVersao.setForeground(new java.awt.Color(153, 153, 153));
        lblVersao.setText("V 1.6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblVersao))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(bntImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNota)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNota))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNota))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVersao)
                .addGap(7, 7, 7))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntImprimirActionPerformed
        String xml = txtNota.getText();
        if (!"".equals(xml)) {
            try {
                DefaultTableModel modelo = (DefaultTableModel) tblXml1.getModel();
                modelo.setNumRows(0);
                for (Iterator<Leitor> it = dao.getAllLeitor(xml).iterator(); it.hasNext();) {
                    leia = it.next();
                    modelo.addRow(new Object[]{
                        leia.getProduto(),
                        leia.getQuantidade()});
                    if (dao.selectZBC(leia) == null) {
                        executarA();
                    } else {
                        executarB();
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(frmXml.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("".equals(xml)) {
            JOptionPane.showMessageDialog(null, "Digite o Número da Nota! ");
        }
    }//GEN-LAST:event_bntImprimirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new frmPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void executarA() {
        try {
            Barcode barcode = BarcodeFactory.createCode128(leia.getProduto());
            barcode.setBarWidth(1);
            QrCode.Ecc errCorLvl = QrCode.Ecc.LOW;
            if (leia.getQuantidade() <= 2) {
                for (int i = 0; i < leia.getQuantidade(); i++) {
                    dao.selectLocal(leia.getProduto(), leia);
                    JFrame frm = new JFrame();
                    frm.getRootPane().setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
                    JPanel pan = new JPanel();
                    JLabel lbl;
                    if (leia.getLocal() != null) {
                        QrCode qr = QrCode.encodeText(leia.getProduto().trim(), errCorLvl);
                        lbl = new JLabel(CriarCodigo.criarImagem(barcode, leia.getLocal().trim(), qr.toImage(2, 0)));
                    } else {
                        leia.setLocal("SEM LOCAL");
                        QrCode qr = QrCode.encodeText(leia.getProduto().trim(), errCorLvl);
                        lbl = new JLabel(CriarCodigo.criarImagem(barcode, leia.getLocal().trim(), qr.toImage(2, 0)));
                    }
                    pan.add(lbl);
                    frm.getContentPane().add(pan);
                    frm.pack();
                    CriarCodigo.imprimir(pan);
                }
            } else {
                dao.selectLocal(leia.getProduto(), leia);
                JFrame frm = new JFrame();
                frm.getRootPane().setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
                JPanel pan = new JPanel();
                JLabel lbl;
                if (leia.getLocal() != null) {
                    QrCode qr = QrCode.encodeText(leia.getProduto().trim(), errCorLvl);
                    lbl = new JLabel(CriarCodigo.criarImagem(barcode, leia.getLocal().trim(), qr.toImage(2, 0)));
                } else {
                    leia.setLocal("SEM LOCAL");
                    QrCode qr = QrCode.encodeText(leia.getProduto().trim(), errCorLvl);
                    lbl = new JLabel(CriarCodigo.criarImagem(barcode, leia.getLocal().trim(), qr.toImage(2, 0)));
                }
                pan.add(lbl);
                frm.getContentPane().add(pan);
                frm.pack();
                CriarCodigo.imprimir(pan);
            }
        } catch (BarcodeException ex) {
            JOptionPane.showMessageDialog(null, "Erro! \n" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void executarB() {
        try {
            Barcode barcode = BarcodeFactory.createCode128(leia.getProduto());
            barcode.setBarWidth(1);
            QrCode.Ecc errCorLvl = QrCode.Ecc.LOW;
            for (int i = 0; i < leia.getQuantidade(); i++) {
                dao.selectLocal(leia.getProduto(), leia);
                JFrame frm = new JFrame();
                frm.getRootPane().setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
                JPanel pan = new JPanel();
                JLabel lbl;
                if (leia.getLocal() != null) {
                    QrCode qr = QrCode.encodeText(leia.getProduto().trim(), errCorLvl);
                    lbl = new JLabel(CriarCodigo.criarImagem(barcode, leia.getLocal().trim(), qr.toImage(2, 0)));
                } else {
                    leia.setLocal("SEM LOCAL");
                    QrCode qr = QrCode.encodeText(leia.getProduto().trim(), errCorLvl);
                    lbl = new JLabel(CriarCodigo.criarImagem(barcode, leia.getLocal().trim(), qr.toImage(2, 0)));
                }
                pan.add(lbl);
                frm.getContentPane().add(pan);
                frm.pack();
                CriarCodigo.imprimir(pan);
            }
        } catch (BarcodeException ex) {
            JOptionPane.showMessageDialog(null, "Erro! \n" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmXml.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmXml().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntImprimir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVersao;
    private javax.swing.JTable tblXml;
    private javax.swing.JTable tblXml1;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo.png")));
    }

}
