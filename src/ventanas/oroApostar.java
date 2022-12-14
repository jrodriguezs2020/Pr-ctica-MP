/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.JOptionPane;
import practicamp.Jugador;
import practicamp.Sistema;

/**
 *
 * @author javii
 */
public class oroApostar extends javax.swing.JFrame {
    DesafiarJugador desafiarJugador;
    Sistema sistema;
    String nick;
    Jugador jugador;
    MenuDesafios menuDesafios;
    
    public oroApostar(String nick, Sistema sistema, Jugador jugador, DesafiarJugador desafiarJugador, MenuDesafios menudesafios) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = sistema;
        this.nick = nick;
        this.jugador = jugador;
        this.desafiarJugador = desafiarJugador;
        this.menuDesafios = menudesafios;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldOro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jFondo2 = new javax.swing.JLabel();
        jButtonContinuar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldOro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldOro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 200, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("??Cu??nto oro desea apostar?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 290, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Oro:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jFondo2.setBackground(new java.awt.Color(0, 16, 49));
        jFondo2.setOpaque(true);
        getContentPane().add(jFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 330, 120));

        jButtonContinuar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonContinuar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonContinuar.setForeground(new java.awt.Color(0, 16, 49));
        jButtonContinuar.setText("Apostar");
        jButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        jButtonVolver.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVolver.setForeground(new java.awt.Color(0, 16, 49));
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        this.setVisible(false);
        desafiarJugador.setVisible(true);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jTextFieldOroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOroActionPerformed

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarActionPerformed
        String oroApostar = jTextFieldOro.getText();
        int oroApostado = Integer.parseInt(oroApostar);
        if(oroApostado>jugador.getPersonaje().getCantidadOro()){
            JOptionPane.showMessageDialog(null, "No tienes suficiente oro");
        }
        else{
            
            Jugador desafiado = sistema.devolucionUsuario(nick);
            if(desafiado.comprobarNorma()){
           
            sistema.desafiar(desafiado, jugador, oroApostado);
            this.setVisible(false);
            menuDesafios.setVisible(true);
        }
            else{
                 int val1 = JOptionPane.showConfirmDialog(null, "??Quiere a??n as?? desafiarle?", "Incumple las normas", JOptionPane.YES_NO_OPTION); 
                 if(val1==0){
                      sistema.desafiar(desafiado, jugador, oroApostado);
                      this.setVisible(false);
                      menuDesafios.setVisible(true);
                      jugador.setNorma(true);
                              
                 }
            }
        }
    }//GEN-LAST:event_jButtonContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(oroApostar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(oroApostar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(oroApostar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(oroApostar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new oroApostar().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonContinuar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jFondo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JTextField jTextFieldOro;
    // End of variables declaration//GEN-END:variables
}
