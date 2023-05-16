/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FRONTEND;

/**
 *
 * @author James
 */
public class frmInicio extends javax.swing.JFrame {

    /**
     * Creates new form frmInicio
     */
    public frmInicio() {
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
        btAgregarP = new javax.swing.JButton();
        btEditarE = new javax.swing.JButton();
        btCita = new javax.swing.JButton();
        btAgregarR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 255, 204));
        jLabel2.setFont(new java.awt.Font("Magneto", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BIENVENIDO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 60));

        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Elija a que parte de la Galaxia desea viajar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 470, 40));

        btAgregarP.setBackground(new java.awt.Color(0, 51, 255));
        btAgregarP.setText("AGREGAR PERSONAJE");
        btAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarPActionPerformed(evt);
            }
        });
        getContentPane().add(btAgregarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 180, -1));

        btEditarE.setBackground(new java.awt.Color(255, 0, 0));
        btEditarE.setText("EDITAR EXPERTOS");
        btEditarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarEActionPerformed(evt);
            }
        });
        getContentPane().add(btEditarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 180, -1));

        btCita.setBackground(new java.awt.Color(0, 51, 255));
        btCita.setText("CREAR CITA");
        btCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCitaActionPerformed(evt);
            }
        });
        getContentPane().add(btCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 180, -1));

        btAgregarR.setBackground(new java.awt.Color(255, 0, 51));
        btAgregarR.setText("AGREGAR RECEPCIONISTA");
        btAgregarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarRActionPerformed(evt);
            }
        });
        getContentPane().add(btAgregarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/ESPACIO.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEditarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarEActionPerformed
        frmSesionExpertos objVentana = new frmSesionExpertos();
            objVentana.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_btEditarEActionPerformed

    private void btCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCitaActionPerformed
        frmSesionCita objVentana = new frmSesionCita();
            objVentana.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_btCitaActionPerformed

    private void btAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarPActionPerformed
        frmSesionPersonajes objVentana = new frmSesionPersonajes();
            objVentana.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_btAgregarPActionPerformed

    private void btAgregarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarRActionPerformed
        frmSesionRecepcionistas objVentana = new frmSesionRecepcionistas();
            objVentana.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_btAgregarRActionPerformed

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
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregarP;
    private javax.swing.JButton btAgregarR;
    private javax.swing.JButton btCita;
    private javax.swing.JButton btEditarE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
