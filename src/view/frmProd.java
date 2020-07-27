package view;

/**
 * @author: Lucas Lourenço
 * @date: 13/12/2018
 * @location: Ciarama Máquinas Ltda.
 */
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import util.CriarCodigo;
import model.Leitor;
import model.LeitorDAO;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import util.qrcode.QrCode;

public class frmProd extends javax.swing.JFrame {

    Leitor leia = new Leitor();
    LeitorDAO dao = new LeitorDAO();

    public frmProd() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblProd = new javax.swing.JLabel();
        txtProd = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        bntImprimir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblVersao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Produto Sem Nota Fiscal");
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTitulo.setText("Produto");

        lblProd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProd.setText("Código do produto:");

        lblQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblQuantidade.setText("Quantidade: ");

        txtQuantidade.setMinimumSize(new java.awt.Dimension(115, 22));
        txtQuantidade.setPreferredSize(new java.awt.Dimension(115, 22));

        bntImprimir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bntImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/printer.png"))); // NOI18N
        bntImprimir.setText(" Imprimir");
        bntImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntImprimirActionPerformed(evt);
            }
        });

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

        lblVersao.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblVersao.setForeground(new java.awt.Color(153, 153, 153));
        lblVersao.setText("V 1.6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblProd)
                .addGap(18, 18, 18)
                .addComponent(txtProd)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(lblTitulo)
                .addGap(0, 230, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVersao)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(bntImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bntImprimir, btnVoltar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProd)
                    .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidade))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(lblVersao)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtProd, txtQuantidade});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bntImprimir, btnVoltar});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntImprimirActionPerformed
        leia.setProduto(txtProd.getText().trim());
        if (txtQuantidade.getText().trim().isEmpty() == false && txtProd.getText().trim().isEmpty() == false) {
            leia.setQuantidade(Integer.parseInt(txtQuantidade.getText().trim()));
            executarB();
        } else if ("".equals(txtProd.getText().trim())) {
            JOptionPane.showMessageDialog(null, "Digite o código do produto! ");
        } else {
            JOptionPane.showMessageDialog(null, "Digite a quantidade");
        }
    }//GEN-LAST:event_bntImprimirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new frmPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void executarB() {
        try {
            Barcode barcode = BarcodeFactory.createCode128(leia.getProduto().trim());
            barcode.setBarWidth(1);
            QrCode.Ecc errCorLvl = QrCode.Ecc.LOW;
            for (int i = 0; i < leia.getQuantidade(); i++) {
                dao.selectLocal(leia.getProduto().trim(), leia);
                JFrame frm = new JFrame();
                frm.getRootPane().setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
                JPanel pan = new JPanel();
                JLabel lbl;
                if (leia.getLocal() != null) {
                    QrCode qr = QrCode.encodeText(leia.getProduto().trim(), errCorLvl);
                    lbl = new JLabel(CriarCodigo.criarImagem(barcode, leia.getLocal().trim(), qr.toImage(2, 0)));
                } else {
                    leia.setLocal("SEM LOCAL");
                    QrCode qr = QrCode.encodeText(leia.getProduto(), errCorLvl);
                    lbl = new JLabel(CriarCodigo.criarImagem(barcode, leia.getLocal().trim(), qr.toImage(2, 0)));
                }
                pan.add(lbl);
                frm.getContentPane().add(pan);
                frm.pack();
                //frm.setVisible(true);
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
            java.util.logging.Logger.getLogger(frmProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProd().setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntImprimir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblProd;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVersao;
    private javax.swing.JTextField txtProd;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
