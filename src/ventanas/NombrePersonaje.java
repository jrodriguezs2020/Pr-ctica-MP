/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author noeli
 */
public class NombrePersonaje extends javax.swing.JFrame {

    /**
     * Creates new form NombrePersonaje
     */
    public NombrePersonaje() {
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
        jUsuario = new javax.swing.JLabel();
        jTextEsbirro = new javax.swing.JTextField();
        jFondo2 = new javax.swing.JLabel();
        jVolver = new javax.swing.JButton();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¿Como desea llamar a su personaje?");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 290, 30));

        jUsuario.setBackground(new java.awt.Color(0, 0, 102));
        jUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jUsuario.setText(" Nombre");
        getContentPane().add(jUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 90, -1));

        jTextEsbirro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextEsbirro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEsbirroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextEsbirro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 180, 30));

        jFondo2.setBackground(new java.awt.Color(0, 0, 102));
        jFondo2.setOpaque(true);
        getContentPane().add(jFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 330, 120));

        jVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jVolver.setForeground(new java.awt.Color(0, 0, 102));
        jVolver.setText("Volver");
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 691));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextEsbirroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEsbirroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEsbirroActionPerformed

    private void jVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolverActionPerformed
        this.setVisible(false);
        this.comp.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jVolverActionPerformed

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
            java.util.logging.Logger.getLogger(NombrePersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NombrePersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NombrePersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NombrePersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NombrePersonaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jFondo;
    private javax.swing.JLabel jFondo2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextEsbirro;
    private javax.swing.JLabel jUsuario;
    private javax.swing.JButton jVolver;
    // End of variables declaration//GEN-END:variables
}
