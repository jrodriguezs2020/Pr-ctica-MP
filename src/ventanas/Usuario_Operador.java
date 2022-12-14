/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.JButton;
import practicamp.Sistema;

/**
 *
 * @author noeli
 */
public class Usuario_Operador extends javax.swing.JFrame {
    private Sistema sistema;
    /**
     * Creates new form Usuario_Operador
     */
    public Usuario_Operador(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
       this.sistema= sistema;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Boton_U = new javax.swing.JButton();
        Boton_O = new javax.swing.JButton();
        Boton_Salida = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_U.setBackground(new java.awt.Color(255, 255, 255));
        Boton_U.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Boton_U.setText("Jugador");
        Boton_U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_UActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_U, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 160, 50));

        Boton_O.setBackground(new java.awt.Color(255, 255, 255));
        Boton_O.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Boton_O.setText("Operador");
        Boton_O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_OActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_O, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 160, 50));

        Boton_Salida.setBackground(new java.awt.Color(255, 255, 255));
        Boton_Salida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Boton_Salida.setText("Salir");
        Boton_Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SalidaActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MicrosoftTeams-image.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_UActionPerformed
        this.setVisible(false);
        inicioSesion iniSes =new inicioSesion(sistema,1);
        
    }//GEN-LAST:event_Boton_UActionPerformed

    private void Boton_SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SalidaActionPerformed
      System.exit(0);
    }//GEN-LAST:event_Boton_SalidaActionPerformed

    private void Boton_OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_OActionPerformed
      this.setVisible(false);
      inicioSesion iniSes =new inicioSesion(sistema,0);
    }//GEN-LAST:event_Boton_OActionPerformed




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
            java.util.logging.Logger.getLogger(Usuario_Operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario_Operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario_Operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario_Operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            //    new Usuario_Operador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_O;
    private javax.swing.JButton Boton_Salida;
    private javax.swing.JButton Boton_U;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}
