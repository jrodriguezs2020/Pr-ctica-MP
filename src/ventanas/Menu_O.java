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
import practicamp.Operador;
import practicamp.Sistema;
import practicamp.Usuario;

/**
 *
 * @author noeli
 */
public class Menu_O extends javax.swing.JFrame {
 private Sistema sistema;
 private Operador operador;
    /**
     * Creates new form Menu_O
     */
    public Menu_O(Operador operador, Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.sistema=sistema;
        this.operador=operador;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jButtonDarBaja = new javax.swing.JButton();
        jButtonEditarPersonaje = new javax.swing.JButton();
        jCrearArma = new javax.swing.JButton();
        jButtonValidarCombate = new javax.swing.JButton();
        jButtonBanear = new javax.swing.JButton();
        jButtonDesbanear = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 73, -1));

        jButtonDarBaja.setBackground(new java.awt.Color(0, 153, 0));
        jButtonDarBaja.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDarBaja.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDarBaja.setText("Darse de baja");
        jButtonDarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDarBajaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDarBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 130, 30));

        jButtonEditarPersonaje.setBackground(new java.awt.Color(0, 153, 0));
        jButtonEditarPersonaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEditarPersonaje.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarPersonaje.setText("Editar un personaje");
        getContentPane().add(jButtonEditarPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 330, 30));

        jCrearArma.setBackground(new java.awt.Color(0, 153, 0));
        jCrearArma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCrearArma.setForeground(new java.awt.Color(255, 255, 255));
        jCrearArma.setText("Crear arma");
        jCrearArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCrearArmaActionPerformed(evt);
            }
        });
        getContentPane().add(jCrearArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 330, 30));

        jButtonValidarCombate.setBackground(new java.awt.Color(0, 153, 0));
        jButtonValidarCombate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonValidarCombate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonValidarCombate.setText("Validar desafio y gestion for. y deb.");
        jButtonValidarCombate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarCombateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonValidarCombate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 330, 30));

        jButtonBanear.setBackground(new java.awt.Color(0, 153, 0));
        jButtonBanear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBanear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBanear.setText("Banear usuario");
        jButtonBanear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBanearActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBanear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 330, 30));

        jButtonDesbanear.setBackground(new java.awt.Color(0, 153, 0));
        jButtonDesbanear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDesbanear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDesbanear.setText("Desbanear usuario");
        jButtonDesbanear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesbanearActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDesbanear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 330, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5227842611_e65fa83134_b.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDarBajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDarBajaActionPerformed

    private void jButtonBanearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBanearActionPerformed
        Banear banear= new Banear(sistema,this);
        banear.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBanearActionPerformed

    private void jButtonValidarCombateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarCombateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonValidarCombateActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        int val = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere salir?", "Salir del juego", JOptionPane.YES_NO_OPTION);
        if (val == 0) {
            try {
                sistema.guardarDatos(); //No tengo claro que es lo que hay que guatrdar en este caso ya que puede modificar usuarios
            } catch (IOException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonDesbanearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesbanearActionPerformed
        desBanear desbanear= new desBanear(sistema,this);
        desbanear.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonDesbanearActionPerformed

    private void jCrearArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCrearArmaActionPerformed
        CrearArma arma = new CrearArma(this,sistema);
        arma.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jCrearArmaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_O.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_O.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_O.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_O.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Menu_O().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBanear;
    private javax.swing.JButton jButtonDarBaja;
    private javax.swing.JButton jButtonDesbanear;
    private javax.swing.JButton jButtonEditarPersonaje;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonValidarCombate;
    private javax.swing.JButton jCrearArma;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}
