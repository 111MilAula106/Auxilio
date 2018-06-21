package generarfactura.views;

import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class UIfacturaGenerada extends javax.swing.JFrame {

    public UIfacturaGenerada() {
        initComponents();
        btncerrar.addActionListener((ActionEvent ae) -> {
            this.dispose();
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnimprimir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btncancelar = new javax.swing.JButton();
        btnaceptar = new javax.swing.JButton();
        tflisto = new javax.swing.JLabel();
        tfnuemerofactura = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btncerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_imprimir_off.png"))); // NOI18N
        btnimprimir.setBorder(null);
        btnimprimir.setBorderPainted(false);
        btnimprimir.setContentAreaFilled(false);
        btnimprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnimprimir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_imprimir_on.png"))); // NOI18N
        btnimprimir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_imprimir_on.png"))); // NOI18N
        btnimprimir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_imprimir_on.png"))); // NOI18N
        getContentPane().add(btnimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 480, 138, 1));

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_cancelar_off.png"))); // NOI18N
        btncancelar.setBorder(null);
        btncancelar.setBorderPainted(false);
        btncancelar.setContentAreaFilled(false);
        btncancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_cancelar_on.png"))); // NOI18N
        btncancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_cancelar_on.png"))); // NOI18N
        btncancelar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_cancelar_on.png"))); // NOI18N
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        btnaceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_aceptar_off.png"))); // NOI18N
        btnaceptar.setBorder(null);
        btnaceptar.setBorderPainted(false);
        btnaceptar.setContentAreaFilled(false);
        btnaceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnaceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_aceptar_on.png"))); // NOI18N
        btnaceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_aceptar_on.png"))); // NOI18N
        btnaceptar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_aceptar_on.png"))); // NOI18N
        getContentPane().add(btnaceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        tflisto.setFont(new java.awt.Font("Antonio", 0, 20)); // NOI18N
        tflisto.setForeground(new java.awt.Color(255, 255, 255));
        tflisto.setText("¡Listo!");
        getContentPane().add(tflisto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 305, -1, -1));

        tfnuemerofactura.setFont(new java.awt.Font("Antonio", 0, 30)); // NOI18N
        tfnuemerofactura.setForeground(new java.awt.Color(255, 255, 255));
        tfnuemerofactura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfnuemerofactura.setText("000456123");
        tfnuemerofactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tfnuemerofactura.setOpaque(false);
        getContentPane().add(tfnuemerofactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 255, 260, 45));

        jLabel4.setFont(new java.awt.Font("Antonio", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("N° de Factura:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/logo_p.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Antonio", 1, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_factura.png"))); // NOI18N
        jLabel2.setText("FACTURA GENERADA");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 60));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 355, 1));

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/cerrar_off.png"))); // NOI18N
        btncerrar.setToolTipText("");
        btncerrar.setBorder(null);
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/cerrar_on.png"))); // NOI18N
        btncerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/cerrar_on.png"))); // NOI18N
        btncerrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/cerrar_on.png"))); // NOI18N
        getContentPane().add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 22, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/UIfacturaGenerada_bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIfacturaGenerada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIfacturaGenerada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIfacturaGenerada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIfacturaGenerada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIfacturaGenerada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel tflisto;
    private javax.swing.JTextField tfnuemerofactura;
    // End of variables declaration//GEN-END:variables
}
