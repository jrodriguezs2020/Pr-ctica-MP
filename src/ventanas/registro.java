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
import practicamp.Jugador;
import practicamp.Operador;
import practicamp.Sistema;
import practicamp.Usuario;

/**
 *
 * @author javii
 */
public class registro extends javax.swing.JFrame {

    int action;
    private String nombre;
    private String nick;
    private String contraseña;
    private Sistema sistema;
    private int modo;
    private inicioSesion inicio;


    public int getAction() {
        return action;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Creates new form registro
     */

    public registro(Sistema sistema, int modo,inicioSesion inicio) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = sistema;
        this.modo=modo;
        this.inicio = inicio;
    }
    
    public void error () {
        int val = JOptionPane.showConfirmDialog(null, "¿Volver a intentarlo?", "Nick no válido", JOptionPane.YES_NO_OPTION);
        if (val == 1) {
            System.exit(0);
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

        jButtonSalir = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        jLabelNick = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jContraseña = new javax.swing.JPasswordField();
        jTextFieldNick = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jLabelFondo2 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(0, 16, 49));
        jButtonSalir.setText("Salir");
        jButtonSalir.setMaximumSize(new java.awt.Dimension(63, 25));
        jButtonSalir.setMinimumSize(new java.awt.Dimension(63, 25));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 70, -1));

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre:");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabelNick.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNick.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNick.setText("Nick:");
        getContentPane().add(jLabelNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabelContraseña.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContraseña.setText("Contraseña:");
        getContentPane().add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jContraseña.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 210, 30));

        jTextFieldNick.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldNick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNickActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 210, 30));

        jTextFieldNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, 30));

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(0, 16, 49));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        jLabelFondo2.setBackground(new java.awt.Color(0, 16, 49));
        jLabelFondo2.setOpaque(true);
        getContentPane().add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 370, 150));

        jLabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 427, 413));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        nombre = this.jTextFieldNombre.getText();
        nick = this.jTextFieldNick.getText();
        char[] arrayC = jContraseña.getPassword();
        String pass = new String(arrayC);
        contraseña = pass;
        if (sistema.comprobarNick(nick, modo)) {
            error();
        }
        else {
            try {
           // Usuario operador=sistema.nuevaPersona(nombre, nick, contraseña, modo);
            Usuario usuario =sistema.nuevaPersona(nombre, nick, contraseña,modo);
            this.setVisible(false);
            if (modo==1){
            Menu menu = new Menu((Jugador) usuario,sistema);
            menu.setVisible(true);}
            else{
            //Operador ope=sistema.devolucionOperador(nick);
            Menu_O menu = new Menu_O((Operador) usuario,sistema);
            menu.setVisible(true);}
            } catch (IOException ex) {
            Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextFieldNickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNickActionPerformed

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
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
 /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JPasswordField jContraseña;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JLabel jLabelNick;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JTextField jTextFieldNick;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
