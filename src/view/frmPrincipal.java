package view;

import java.awt.Toolkit;

/**
 * @author: Lucas Lourenço
 * @date: 13/12/2018
 * @location: Ciarama Máquinas Ltda.
 */
public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnNota = new javax.swing.JButton();
        btnSemNota = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnLote = new javax.swing.JButton();
        lblVersao = new javax.swing.JLabel();
        btnLote1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ciarama Máquinas ");
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(34, 119, 44));

        btnNota.setBackground(new java.awt.Color(255, 255, 255));
        btnNota.setText("Produto com Nota Fiscal");
        btnNota.setBorder(null);
        btnNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotaActionPerformed(evt);
            }
        });

        btnSemNota.setBackground(new java.awt.Color(255, 255, 255));
        btnSemNota.setText("Produto sem Nota Fiscal");
        btnSemNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemNotaActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Selecione o tipo de Produto: ");

        btnLote.setBackground(new java.awt.Color(255, 255, 255));
        btnLote.setText("Produto por lote em locação");
        btnLote.setMaximumSize(new java.awt.Dimension(147, 23));
        btnLote.setMinimumSize(new java.awt.Dimension(147, 23));
        btnLote.setPreferredSize(new java.awt.Dimension(147, 23));
        btnLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoteActionPerformed(evt);
            }
        });

        lblVersao.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblVersao.setForeground(new java.awt.Color(255, 255, 255));
        lblVersao.setText("V 1.6");

        btnLote1.setBackground(new java.awt.Color(255, 255, 255));
        btnLote1.setText("Imprimir Locação");
        btnLote1.setMaximumSize(new java.awt.Dimension(147, 23));
        btnLote1.setMinimumSize(new java.awt.Dimension(147, 23));
        btnLote1.setPreferredSize(new java.awt.Dimension(147, 23));
        btnLote1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLote1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(lblVersao)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(164, 164, 164))))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSemNota, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNota, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLote, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLote1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 127, Short.MAX_VALUE))
        );

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLote, btnLote1, btnNota, btnSemNota});

        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(31, 31, 31)
                .addComponent(btnNota, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSemNota, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLote, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLote1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVersao)
                .addContainerGap())
        );

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLote, btnLote1, btnNota, btnSemNota});

        jDesktopPane1.setLayer(btnNota, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnSemNota, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnLote, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblVersao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnLote1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotaActionPerformed
        new frmXml().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNotaActionPerformed

    private void btnSemNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemNotaActionPerformed
        new frmProd().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSemNotaActionPerformed

    private void btnLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoteActionPerformed
        new frmLote().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoteActionPerformed

    private void btnLote1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLote1ActionPerformed
        new frmLocacao().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLote1ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo.png")));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLote;
    private javax.swing.JButton btnLote1;
    private javax.swing.JButton btnNota;
    private javax.swing.JButton btnSemNota;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVersao;
    // End of variables declaration//GEN-END:variables
}
