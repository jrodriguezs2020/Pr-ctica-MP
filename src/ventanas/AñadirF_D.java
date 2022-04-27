/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import practicamp.Cazador;
import practicamp.Jugador;
import practicamp.Licantropo;
import practicamp.Modificador;
import practicamp.Personaje;
import practicamp.Vampiro;

/**
 *
 * @author noeli
 */
public class AñadirF_D extends javax.swing.JFrame {
    private Menu_O menu;
    private Jugador jugador;
    private Personaje personaje;
    private int tipo;
    /**
     * Creates new form AñadirF_D
     */
    public AñadirF_D(Menu_O menu,Jugador jugador,Personaje personaje, int tipo) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.menu=menu;
        this.jugador=jugador;
        this.personaje=personaje;
        this.tipo=tipo;
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
        JDescrip = new javax.swing.JTextField();
        jValorF_D = new javax.swing.JComboBox<>();
        jVolver = new javax.swing.JButton();
        jAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Valor");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Descripcion");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 110, 30));

        JDescrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDescripActionPerformed(evt);
            }
        });
        getContentPane().add(JDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 180, 30));

        jValorF_D.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jValorF_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 80, 30));

        jVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jVolver.setForeground(new java.awt.Color(0, 102, 51));
        jVolver.setText("Volver");
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 90, 30));

        jAceptar.setBackground(new java.awt.Color(255, 255, 255));
        jAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jAceptar.setForeground(new java.awt.Color(0, 102, 51));
        jAceptar.setText("Aceptar");
        jAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5227842611_e65fa83134_b.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 418, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JDescripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDescripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JDescripActionPerformed

    private void jVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolverActionPerformed
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jVolverActionPerformed

    private void jAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAceptarActionPerformed
        int valor =(int) jValorF_D.getSelectedItem();
        Modificador mod =new Modificador(JDescrip.getText(),valor,tipo);
        personaje.getModificadorList().add(mod);
        // TODO add your handling code here:
    }//GEN-LAST:event_jAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(AñadirF_D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirF_D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirF_D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirF_D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new AñadirF_D().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JDescrip;
    private javax.swing.JButton jAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> jValorF_D;
    private javax.swing.JButton jVolver;
    // End of variables declaration//GEN-END:variables
}
