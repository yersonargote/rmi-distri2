package sensor.presentacion;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import mvcf.AModel;
import mvcf.AView;

/**
 *
 * @author yerso
 */
public class GUITemperatura extends javax.swing.JFrame implements AView {

    /**
     * Creates new form GUIAbrirSesion
     */
    public GUITemperatura() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnl0 = new javax.swing.JPanel();
        lblTituloTemperatura = new javax.swing.JLabel();
        pnl1 = new javax.swing.JPanel();
        lblTemperatura = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JTextField();
        pnl3 = new javax.swing.JPanel();
        btnEnviarTemperatura = new javax.swing.JButton();
        pnl4 = new javax.swing.JPanel();
        lblMensajeErrorTemperatura = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 300));

        pnlPrincipal.setLayout(new java.awt.GridLayout(4, 2));

        pnl0.setLayout(new java.awt.BorderLayout());

        lblTituloTemperatura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloTemperatura.setText("Sensor");
        pnl0.add(lblTituloTemperatura, java.awt.BorderLayout.CENTER);

        pnlPrincipal.add(pnl0);

        pnl1.setLayout(new java.awt.GridLayout(1, 2));

        lblTemperatura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTemperatura.setText("Temperatura del sensor");
        pnl1.add(lblTemperatura);
        pnl1.add(txtTemperatura);

        pnlPrincipal.add(pnl1);

        pnl3.setLayout(new java.awt.BorderLayout());

        btnEnviarTemperatura.setText("Enviar Temperatura");
        pnl3.add(btnEnviarTemperatura, java.awt.BorderLayout.CENTER);

        pnlPrincipal.add(pnl3);

        pnl4.setLayout(new java.awt.BorderLayout());

        lblMensajeErrorTemperatura.setText("-");
        pnl4.add(lblMensajeErrorTemperatura, java.awt.BorderLayout.CENTER);

        pnlPrincipal.add(pnl4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        </editor-fold>
//        </editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            new GUIPrincipal().setVisible(true);
//        });
//    }
    
    // GETTERS Y SETTERS GUI
    
    public JTextField getTxtTemperatura() {
        return txtTemperatura;
    }

    public JLabel getLblMensajeErrorTemperatura() {
        return lblMensajeErrorTemperatura;
    }

    public JButton getBtnEnviarTemperatura() {
        return btnEnviarTemperatura;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarTemperatura;
    private javax.swing.JLabel lblMensajeErrorTemperatura;
    private javax.swing.JLabel lblTemperatura;
    private javax.swing.JLabel lblTituloTemperatura;
    private javax.swing.JPanel pnl0;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl3;
    private javax.swing.JPanel pnl4;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtTemperatura;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizar(AModel arg0) {
    }
}
