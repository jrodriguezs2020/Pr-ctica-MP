 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import javax.swing.JOptionPane;
import practicamp.Demonio;
import practicamp.Esbirro;
import practicamp.Jugador;
import practicamp.Sistema;

/**
 *
 * @author Laura
 */
public class AniadirEsbirroDemonio extends javax.swing.JFrame {
    private Sistema sis;
    private EsbirroDemonio antes;
    private Jugador jugador;
    private AniadirEsbirro ad;
    private Demonio demi;
    /**
     * Creates new form ComprarEsbirro
     */
    public AniadirEsbirroDemonio(Sistema sis, Jugador jugador, EsbirroDemonio antes, AniadirEsbirro ad, Demonio demi) {
        this.sis = sis;
        this.jugador = jugador;
        this.antes = antes;
        this.ad = ad;
        this.demi = demi;
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComprarEsbi = new javax.swing.JLabel();
        jSalir = new javax.swing.JButton();
        jDemonio = new javax.swing.JButton();
        jGhoul = new javax.swing.JButton();
        jHumano = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComprarEsbi.setBackground(new java.awt.Color(0, 16, 49));
        jComprarEsbi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jComprarEsbi.setForeground(new java.awt.Color(255, 255, 255));
        jComprarEsbi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jComprarEsbi.setText("Comprar esbirros");
        jComprarEsbi.setOpaque(true);
        getContentPane().add(jComprarEsbi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 40));

        jSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSalir.setForeground(new java.awt.Color(0, 16, 49));
        jSalir.setText("Volver");
        jSalir.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 60, -1));
        jSalir.getAccessibleContext().setAccessibleParent(jSalir);

        jDemonio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDemonio.setForeground(new java.awt.Color(0, 16, 49));
        jDemonio.setText("Demonio");
        jDemonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDemonioActionPerformed(evt);
            }
        });
        getContentPane().add(jDemonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 40));

        jGhoul.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jGhoul.setForeground(new java.awt.Color(0, 16, 49));
        jGhoul.setText("Ghoul");
        jGhoul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGhoulActionPerformed(evt);
            }
        });
        getContentPane().add(jGhoul, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 90, 40));

        jHumano.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jHumano.setForeground(new java.awt.Color(0, 16, 49));
        jHumano.setText("Humano");
        jHumano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHumanoActionPerformed(evt);
            }
        });
        getContentPane().add(jHumano, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/capitan-america.jpg"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 110, 140));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ghoul.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 110, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/demonio.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, 140));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 430, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDemonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDemonioActionPerformed
        int oro = jugador.getPersonaje().getCantidadOro();
        if (oro<100){
            JOptionPane.showMessageDialog(null, "No tiene suficiente oro.");
        } else {
            this.setVisible(false);
            NombreEsbirroOp esbi = new NombreEsbirroOp(sis, ad, this, jugador, demi, 0);
            esbi.setVisible(true);
        }
    }//GEN-LAST:event_jDemonioActionPerformed

    private void jGhoulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGhoulActionPerformed
        int oro = jugador.getPersonaje().getCantidadOro();
        if (oro<20){
            JOptionPane.showMessageDialog(null, "No tiene suficiente oro.");
        } else {
            this.setVisible(false);
            NombreEsbirroOp esbi = new NombreEsbirroOp(sis, ad, this, jugador, demi, 1);
            esbi.setVisible(true);
        }
    }//GEN-LAST:event_jGhoulActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        this.setVisible(false);
        antes.setVisible(true);
    }//GEN-LAST:event_jSalirActionPerformed

    private void jHumanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHumanoActionPerformed
        int oro = jugador.getPersonaje().getCantidadOro();
        if (oro<50){
            JOptionPane.showMessageDialog(null, "No tiene suficiente oro.");
        } else {
            this.setVisible(false);
            NombreEsbirroOp esbi = new NombreEsbirroOp(sis, ad, this, jugador, demi, 2);
            esbi.setVisible(true);
        }
    }//GEN-LAST:event_jHumanoActionPerformed

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
            java.util.logging.Logger.getLogger(AniadirEsbirroDemonio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AniadirEsbirroDemonio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AniadirEsbirroDemonio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AniadirEsbirroDemonio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ComprarEsbirro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jComprarEsbi;
    private javax.swing.JButton jDemonio;
    private javax.swing.JButton jGhoul;
    private javax.swing.JButton jHumano;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JButton jSalir;
    // End of variables declaration//GEN-END:variables
}
