/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FRONTEND;

import BACKEND.clsGeneral;
import DAO.clsQuerys;
import javax.swing.JOptionPane;

/**
 *
 * @author James
 */
public class frmRecepcionista extends javax.swing.JFrame {

    /**
     * Creates new form frmRecepcionista
     */
    public frmRecepcionista() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ctNombreR = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ctContraseña = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btRegreso = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 255, 204));
        jLabel2.setFont(new java.awt.Font("Magneto", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RECEPCIONISTA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("NOMBRE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 120, -1));
        getContentPane().add(ctNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 180, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("CONTRASEÑA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 120, -1));
        getContentPane().add(ctContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 180, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        btEditar.setBackground(new java.awt.Color(153, 153, 153));
        btEditar.setText("EDITAR");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        btRegreso.setBackground(new java.awt.Color(153, 153, 153));
        btRegreso.setText("VOLVER A LA PRIMERA GALAXIA");
        btRegreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegresoActionPerformed(evt);
            }
        });
        getContentPane().add(btRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 340, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/ESPACIO.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegresoActionPerformed
        frmInicio objVentana = new frmInicio();
            objVentana.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_btRegresoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         clsQuerys objQuery = new clsQuerys();


       if( 
               objQuery.fncIngresoRecepcionista (ctNombreR.getText(), ctContraseña.getText())
               ==1){
           JOptionPane.showMessageDialog(null, "REGISTRO DE RECEPCIONISTA REALIZADO CORRECTAMENTE.", "REGISTRO DE RECEPCIONISTA", JOptionPane.INFORMATION_MESSAGE);
       }else{
           JOptionPane.showMessageDialog(null, "REGISTRO DE RECEPCIONISTA NO REALIZADO.", "REGISTRO DE RECEPCIONISTA", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        clsGeneral objRecepcionista = new clsGeneral();
          clsQuerys objQuery = new clsQuerys();
          objRecepcionista.setNOMBRE_RECEPCIONISTA(ctNombreR.getText());
          objRecepcionista.setCONTRASEÑA(  ctContraseña.getText()     );
          
          if (objQuery.fncEditarExperto(objRecepcionista)==1){
               JOptionPane.showMessageDialog(null, "REGISTRO DE RECEPCIONISTA MODIFICADO CORRECTAMENTE.", "REGISTRO DE RECEPCIONISTA", JOptionPane.INFORMATION_MESSAGE);
          }else{
               JOptionPane.showMessageDialog(null, "REGISTRO DE RECEPCIONISTA SIN MODIFICAR.", "REGISTRO DE RECEPCIONISTA", JOptionPane.ERROR_MESSAGE);
          }
    }//GEN-LAST:event_btEditarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ctNombreR.setText("");
        ctContraseña.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRecepcionista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btRegreso;
    private javax.swing.JTextField ctContraseña;
    private javax.swing.JTextField ctNombreR;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
