/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import practicamp.Sistema;
import practicamp.Usuario;

/**
 *
 * @author Victo
 */
public class Menu extends javax.swing.JFrame {
    private Sistema sistema;
    private Usuario usuario;
    
    /**
     * Creates new form Menu
     */
    public Menu(Usuario usuario, Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema=sistema;
        this.usuario=usuario;
        
    }
    
    public void bajaMensaje () throws IOException {
        int val = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere dar de baja su cuenta?", "Dar de baja la cuenta", JOptionPane.YES_NO_OPTION);
        if (val == 0) {
            if (sistema.darBaja(usuario)){
            System.exit(0);}
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSalir = new javax.swing.JButton();
        jRegPersonaje = new javax.swing.JButton();
        jMenu = new javax.swing.JLabel();
        jBajaPersonaje = new javax.swing.JButton();
        jConsultOro = new javax.swing.JButton();
        jArma = new javax.swing.JButton();
        jDesafios = new javax.swing.JButton();
        jConsultRanking = new javax.swing.JButton();
        jArmadura = new javax.swing.JButton();
        jBaja = new javax.swing.JButton();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSalir.setBackground(new java.awt.Color(255, 255, 255));
        jSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSalir.setForeground(new java.awt.Color(0, 0, 102));
        jSalir.setText("Salir");
        jSalir.setMaximumSize(new java.awt.Dimension(65, 25));
        jSalir.setMinimumSize(new java.awt.Dimension(65, 25));
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jRegPersonaje.setBackground(new java.awt.Color(255, 255, 255));
        jRegPersonaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRegPersonaje.setForeground(new java.awt.Color(0, 0, 102));
        jRegPersonaje.setText("Registrar Personaje");
        jRegPersonaje.setMaximumSize(new java.awt.Dimension(209, 25));
        jRegPersonaje.setMinimumSize(new java.awt.Dimension(209, 25));
        jRegPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegPersonajeActionPerformed(evt);
            }
        });
        getContentPane().add(jRegPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 70, 210, -1));

        jMenu.setBackground(new java.awt.Color(0, 0, 102));
        jMenu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jMenu.setForeground(new java.awt.Color(255, 255, 255));
        jMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu.setText("Menú");
        jMenu.setOpaque(true);
        getContentPane().add(jMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 40));

        jBajaPersonaje.setBackground(new java.awt.Color(255, 255, 255));
        jBajaPersonaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBajaPersonaje.setForeground(new java.awt.Color(0, 0, 102));
        jBajaPersonaje.setText("Dar de baja un personaje");
        getContentPane().add(jBajaPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 210, -1));

        jConsultOro.setBackground(new java.awt.Color(255, 255, 255));
        jConsultOro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jConsultOro.setForeground(new java.awt.Color(0, 0, 102));
        jConsultOro.setText("Consultar Oro");
        jConsultOro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultOroActionPerformed(evt);
            }
        });
        getContentPane().add(jConsultOro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 210, -1));

        jArma.setBackground(new java.awt.Color(255, 255, 255));
        jArma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jArma.setForeground(new java.awt.Color(0, 0, 102));
        jArma.setText("Elegir arma");
        getContentPane().add(jArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 210, -1));

        jDesafios.setBackground(new java.awt.Color(255, 255, 255));
        jDesafios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDesafios.setForeground(new java.awt.Color(0, 0, 102));
        jDesafios.setText("Desafios");
        jDesafios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDesafiosActionPerformed(evt);
            }
        });
        getContentPane().add(jDesafios, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 210, -1));

        jConsultRanking.setBackground(new java.awt.Color(255, 255, 255));
        jConsultRanking.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jConsultRanking.setForeground(new java.awt.Color(0, 0, 102));
        jConsultRanking.setText("Ranking");
        jConsultRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultRankingActionPerformed(evt);
            }
        });
        getContentPane().add(jConsultRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 210, -1));

        jArmadura.setBackground(new java.awt.Color(255, 255, 255));
        jArmadura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jArmadura.setForeground(new java.awt.Color(0, 0, 102));
        jArmadura.setText("Elegir armadura");
        jArmadura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jArmaduraActionPerformed(evt);
            }
        });
        getContentPane().add(jArmadura, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 210, -1));

        jBaja.setBackground(new java.awt.Color(255, 255, 255));
        jBaja.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBaja.setForeground(new java.awt.Color(0, 0, 102));
        jBaja.setText("Darse de baja");
        jBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBajaActionPerformed(evt);
            }
        });
        getContentPane().add(jBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jFondo.setText("jLabel1");
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jSalirActionPerformed

    private void jRegPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegPersonajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRegPersonajeActionPerformed

    private void jConsultOroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultOroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultOroActionPerformed

    private void jDesafiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDesafiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDesafiosActionPerformed

    private void jConsultRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultRankingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultRankingActionPerformed

    private void jArmaduraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jArmaduraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jArmaduraActionPerformed

    private void jBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBajaActionPerformed
        try {
            bajaMensaje ();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBajaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Menu(usuario, sistema).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jArma;
    private javax.swing.JButton jArmadura;
    private javax.swing.JButton jBaja;
    private javax.swing.JButton jBajaPersonaje;
    private javax.swing.JButton jConsultOro;
    private javax.swing.JButton jConsultRanking;
    private javax.swing.JButton jDesafios;
    private javax.swing.JLabel jFondo;
    private javax.swing.JLabel jMenu;
    private javax.swing.JButton jRegPersonaje;
    private javax.swing.JButton jSalir;
    // End of variables declaration//GEN-END:variables
}
