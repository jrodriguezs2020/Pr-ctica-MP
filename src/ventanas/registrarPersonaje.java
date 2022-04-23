/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import practicamp.Jugador;
import practicamp.Sistema;

/**
 *
 * @author javii
 */
public class registrarPersonaje extends javax.swing.JFrame {
    private Sistema sistema;
    private Menu menu;
    private Jugador jugador;
    private NombrePersonaje nombre;

    /**
     * Creates new form registrarPersonaje
     */
    public registrarPersonaje(Sistema sistema, Menu menu, Jugador jugador) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema=sistema;
        this.menu= menu;
        this.jugador = jugador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVolver = new javax.swing.JButton();
        jButtonVampiro = new javax.swing.JButton();
        jButtonCazador = new javax.swing.JButton();
        jButtonLicantropo = new javax.swing.JButton();
        jFV = new javax.swing.JLabel();
        jFL = new javax.swing.JLabel();
        jFC = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVolver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonVolver.setForeground(new java.awt.Color(0, 0, 102));
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jButtonVampiro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVampiro.setForeground(new java.awt.Color(0, 0, 102));
        jButtonVampiro.setText("Vampiro");
        jButtonVampiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVampiroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVampiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 110, 50));

        jButtonCazador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCazador.setForeground(new java.awt.Color(0, 0, 102));
        jButtonCazador.setText("Cazador");
        jButtonCazador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCazadorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCazador, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 110, 50));

        jButtonLicantropo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLicantropo.setForeground(new java.awt.Color(0, 0, 102));
        jButtonLicantropo.setText("Licantropo");
        jButtonLicantropo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLicantropoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLicantropo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 120, 50));

        jFV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vampiro.jpg"))); // NOI18N
        getContentPane().add(jFV, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 110, -1));

        jFL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jFL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hombrelobo.jpg"))); // NOI18N
        getContentPane().add(jFL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, -1));

        jFC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cazador.jpg"))); // NOI18N
        getContentPane().add(jFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 110, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonCazadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCazadorActionPerformed
        NombrePersonaje nombre = new NombrePersonaje(sistema, menu, this, jugador, 0);
        this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonCazadorActionPerformed

    private void jButtonLicantropoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLicantropoActionPerformed
        NombrePersonaje nombre = new NombrePersonaje(sistema, menu, this, jugador, 1);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLicantropoActionPerformed

    private void jButtonVampiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVampiroActionPerformed
        NombrePersonaje nombre = new NombrePersonaje(sistema, menu, this, jugador, 2);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVampiroActionPerformed

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
            java.util.logging.Logger.getLogger(registrarPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarPersonaje().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCazador;
    private javax.swing.JButton jButtonLicantropo;
    private javax.swing.JButton jButtonVampiro;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jFC;
    private javax.swing.JLabel jFL;
    private javax.swing.JLabel jFV;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}
