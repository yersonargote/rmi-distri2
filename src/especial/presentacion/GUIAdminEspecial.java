/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package especial.presentacion;

import javax.swing.JButton;
import javax.swing.JLabel;
import mvcf.AModel;
import mvcf.AView;

/**
 *
 * @author yerso
 */
public class GUIAdminEspecial extends javax.swing.JFrame implements AView {

    /**
     * Creates new form GUIAdminEspecial
     */
    public GUIAdminEspecial() {
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

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAConsulta = new javax.swing.JTextArea();
        btnConsultar = new javax.swing.JButton();
        pnlCantidad = new javax.swing.JPanel();
        lblCantidad = new javax.swing.JLabel();
        lblCantidadRes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new java.awt.GridLayout(4, 0));

        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Administrador Especial");
        getContentPane().add(lblTitulo);

        txtAConsulta.setEditable(false);
        txtAConsulta.setColumns(20);
        txtAConsulta.setLineWrap(true);
        txtAConsulta.setRows(5);
        txtAConsulta.setText("Consultar en el servidor la  cantidad de veces que ha sido leída una  temperatura por fuera del rango en el último minuto.");
        txtAConsulta.setWrapStyleWord(true);
        txtAConsulta.setCaretPosition(0);
        jScrollPane1.setViewportView(txtAConsulta);

        getContentPane().add(jScrollPane1);

        btnConsultar.setText("Consultar");
        getContentPane().add(btnConsultar);

        pnlCantidad.setLayout(new java.awt.GridLayout(1, 0));

        lblCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidad.setText("CANTIDAD");
        pnlCantidad.add(lblCantidad);

        lblCantidadRes.setText("-");
        pnlCantidad.add(lblCantidadRes);

        getContentPane().add(pnlCantidad);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
//            java.util.logging.Logger.getLogger(GUIAdminEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUIAdminEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUIAdminEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUIAdminEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUIAdminEspecial().setVisible(true);
//            }
//        });
//    }
    
    // Getters
    public JLabel getLblCantidadRes() {
        return lblCantidadRes;
    }    

    public JButton getBtnConsultar() {
        return btnConsultar;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCantidadRes;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlCantidad;
    private javax.swing.JTextArea txtAConsulta;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizar(AModel arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
