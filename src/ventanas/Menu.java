/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import practicamp.GestionMenu;
import practicamp.Jugador;
import practicamp.Sistema;
import practicamp.Usuario;

/**
 *
 * @author Laura
 */
public class Menu extends javax.swing.JFrame {
    private Sistema sistema;
    private Jugador jugador;
    private GestionMenu gestionador;
    /**
     * Creates new form Menu_J
     */
    public Menu(Jugador jugador, Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema=sistema;
        this.jugador=jugador;
        this.gestionador= new GestionMenu();
        
    }
    
        public void bajaMensaje () throws IOException {
        int val = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere dar de baja su cuenta?", "Dar de baja la cuenta", JOptionPane.YES_NO_OPTION);
        if (val == 0) {
            if (sistema.darBajaJ(jugador)){
            System.exit(0);}
            }
        }
        
        public void bajaPersonaje () throws IOException {
        int val = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere eliminar su personaje?", "Dar de baja su personaje", JOptionPane.YES_NO_OPTION);
        if (val == 0) {
            jugador.setPersonaje(null);
            try {
                sistema.guardarDatos();
            } catch (IOException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }            
            }
        }

        public void desArmadura () throws IOException {
        int val = JOptionPane.showConfirmDialog(null, "¿Desea deselecionar su armadura actual?", "Desseleccionar su armadura", JOptionPane.YES_NO_OPTION);
        if (val == 0) {
            jugador.getPersonaje().setArmadura(null);
            sistema.guardarDatos();
            ElegirArmadura armadura = new ElegirArmadura(sistema.getArmaduraList(),jugador,this,sistema);
            this.setVisible(false);          
            
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

        jRegistrarPersonaje = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();
        jDarseDeBaja = new javax.swing.JButton();
        jElegirArma = new javax.swing.JButton();
        jDarBajaPersonaje = new javax.swing.JButton();
        jElegirArmadura = new javax.swing.JButton();
        jComprarEsbi = new javax.swing.JButton();
        jDesafios = new javax.swing.JButton();
        jRanking = new javax.swing.JButton();
        jComprobarOro = new javax.swing.JButton();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRegistrarPersonaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRegistrarPersonaje.setForeground(new java.awt.Color(0, 0, 102));
        jRegistrarPersonaje.setText("Registrar Personaje");
        jRegistrarPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegistrarPersonajeActionPerformed(evt);
            }
        });
        getContentPane().add(jRegistrarPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, -1));

        jSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSalir.setForeground(new java.awt.Color(0, 0, 102));
        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jDarseDeBaja.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDarseDeBaja.setForeground(new java.awt.Color(0, 0, 102));
        jDarseDeBaja.setText("Darse de baja");
        jDarseDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDarseDeBajaActionPerformed(evt);
            }
        });
        getContentPane().add(jDarseDeBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        jElegirArma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jElegirArma.setForeground(new java.awt.Color(0, 0, 102));
        jElegirArma.setText("Elegir Arma");
        jElegirArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jElegirArmaActionPerformed(evt);
            }
        });
        getContentPane().add(jElegirArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 250, -1));

        jDarBajaPersonaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDarBajaPersonaje.setForeground(new java.awt.Color(0, 0, 102));
        jDarBajaPersonaje.setText("Dar de baja Personaje");
        jDarBajaPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDarBajaPersonajeActionPerformed(evt);
            }
        });
        getContentPane().add(jDarBajaPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 250, -1));

        jElegirArmadura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jElegirArmadura.setForeground(new java.awt.Color(0, 0, 102));
        jElegirArmadura.setText("Elegir Armadura");
        jElegirArmadura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jElegirArmaduraActionPerformed(evt);
            }
        });
        getContentPane().add(jElegirArmadura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 250, -1));

        jComprarEsbi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComprarEsbi.setForeground(new java.awt.Color(0, 0, 102));
        jComprarEsbi.setText("Comprar Esbirros");
        jComprarEsbi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComprarEsbiActionPerformed(evt);
            }
        });
        getContentPane().add(jComprarEsbi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 250, -1));

        jDesafios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDesafios.setForeground(new java.awt.Color(0, 0, 102));
        jDesafios.setText("Desafios");
        jDesafios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDesafiosActionPerformed(evt);
            }
        });
        getContentPane().add(jDesafios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 250, -1));

        jRanking.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRanking.setForeground(new java.awt.Color(0, 0, 102));
        jRanking.setText("Ranking");
        jRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRankingActionPerformed(evt);
            }
        });
        getContentPane().add(jRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 250, -1));

        jComprobarOro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComprobarOro.setForeground(new java.awt.Color(0, 0, 102));
        jComprobarOro.setText("Comprobar Oro");
        jComprobarOro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComprobarOroActionPerformed(evt);
            }
        });
        getContentPane().add(jComprobarOro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 250, -1));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRegistrarPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegistrarPersonajeActionPerformed
        if (jugador.getPersonaje() == null){
            
            registrarPersonaje nuevoPersonaje = new registrarPersonaje (sistema, this, jugador,0,null);
        this.setVisible(false);
        nuevoPersonaje.setVisible(true);              
        } else {
            JOptionPane.showMessageDialog(null, "Ya tienes un personaje.");
        }
      // TODO add your handling code here:
    }//GEN-LAST:event_jRegistrarPersonajeActionPerformed

    private void jDarseDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDarseDeBajaActionPerformed
        try {
            bajaMensaje ();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jDarseDeBajaActionPerformed

    private void jElegirArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jElegirArmaActionPerformed
        if (jugador.getPersonaje() == null){
            JOptionPane.showMessageDialog(null, "No tienes personaje.");
        } else {
        ElegirArma armas = new ElegirArma(sistema, sistema.getArmaList(),jugador,this,null);
        this.setVisible(false);
        }
    }//GEN-LAST:event_jElegirArmaActionPerformed

    private void jDarBajaPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDarBajaPersonajeActionPerformed
        if (jugador.getPersonaje() == null){
            JOptionPane.showMessageDialog(null, "No tienes personaje que eliminar.");         
        } else {
            try {
                bajaPersonaje ();
            } catch (IOException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }           
        }
    }//GEN-LAST:event_jDarBajaPersonajeActionPerformed

    private void jElegirArmaduraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jElegirArmaduraActionPerformed
         if (jugador.getPersonaje() == null){
            JOptionPane.showMessageDialog(null, "No tienes personaje.");
        } else {
             if (jugador.getPersonaje().getArmadura() == null){
                ElegirArmadura armadura = new ElegirArmadura(sistema.getArmaduraList(),jugador,this,sistema);
                this.setVisible(false);             
             } else {
                 try {
                     desArmadura();
                 } catch (IOException ex) {
                     Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }

        }
    }//GEN-LAST:event_jElegirArmaduraActionPerformed

    private void jComprarEsbiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComprarEsbiActionPerformed
        if (jugador.getPersonaje() == null){
            JOptionPane.showMessageDialog(null, "Aun no tienes personaje.");         
        } else {
        ComprarEsbirro compEsbi = new ComprarEsbirro(sistema, jugador, this);
        compEsbi.setVisible(true);
        this.setVisible(false);          
        }
    }//GEN-LAST:event_jComprarEsbiActionPerformed

    private void jDesafiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDesafiosActionPerformed
        MenuDesafios menuDesafios = new MenuDesafios(this,sistema,jugador);
        this.setVisible(false);
        menuDesafios.setVisible(true);
    }//GEN-LAST:event_jDesafiosActionPerformed

    private void jComprobarOroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComprobarOroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComprobarOroActionPerformed

    private void jRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRankingActionPerformed
        TreeSet<Jugador> ranking =sistema.ranking();
        ConsultarRanking consultarRanking = new ConsultarRanking(ranking, this);
        this.setVisible(false);
        consultarRanking.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jRankingActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        int val = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere salir?", "Salir del juego", JOptionPane.YES_NO_OPTION);
        if (val == 0) {
            try {
                sistema.guardarDatos();
            } catch (IOException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jSalirActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jComprarEsbi;
    private javax.swing.JButton jComprobarOro;
    private javax.swing.JButton jDarBajaPersonaje;
    private javax.swing.JButton jDarseDeBaja;
    private javax.swing.JButton jDesafios;
    private javax.swing.JButton jElegirArma;
    private javax.swing.JButton jElegirArmadura;
    private javax.swing.JLabel jFondo;
    private javax.swing.JButton jRanking;
    private javax.swing.JButton jRegistrarPersonaje;
    private javax.swing.JButton jSalir;
    // End of variables declaration//GEN-END:variables
}
