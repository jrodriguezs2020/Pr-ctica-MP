/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.JOptionPane;
import practicamp.ConcreteCazador;
import practicamp.ConcreteCreatorCazador;
import practicamp.Jugador;
import practicamp.Personaje;

/**
 *
 * @author noeli
 */
public class CambioEdadTalento extends javax.swing.JFrame {
    private ModificacionesPersonaje menu;
    private Jugador jugador;
    private ConcreteCazador personaje;
    /**
     * Creates new form CambioEdadTalento
     */
    public CambioEdadTalento(ModificacionesPersonaje menu, Jugador jugador,ConcreteCazador personaje) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.menu=menu;
        this.jugador=jugador;
        this.personaje=personaje;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEdad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jVolver = new javax.swing.JButton();
        jAceptar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jEdad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEdadActionPerformed(evt);
            }
        });
        getContentPane().add(jEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 190, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Edad a que desea cambiar el talento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 310, 30));

        jLabel1.setBackground(new java.awt.Color(0, 16, 49));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 330, 120));

        jVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jVolver.setForeground(new java.awt.Color(0, 16, 49));
        jVolver.setText("Volver");
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jAceptar.setForeground(new java.awt.Color(0, 16, 49));
        jAceptar.setText("Aceptar");
        jAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 373, 100, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo3.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 421, 413));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEdadActionPerformed
        
    }//GEN-LAST:event_jEdadActionPerformed

    private void jVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolverActionPerformed
        this.setVisible(false);
        menu.setVisible(true);
        
    }//GEN-LAST:event_jVolverActionPerformed

    private void jAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAceptarActionPerformed
       
        if (this.jEdad != null){
            try {
            int valor = (int) Integer.valueOf(this.jEdad.getText());
            personaje.getTalento().setEdad(valor);
            System.out.print(personaje.getTalento().getEdad());
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "No has introducido un valor numerico.");
        }

           
        }
        this.setVisible(false);
        this.menu.setVisible(true);
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
            java.util.logging.Logger.getLogger(CambioEdadTalento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioEdadTalento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioEdadTalento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioEdadTalento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new CambioEdadTalento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jAceptar;
    private javax.swing.JTextField jEdad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jVolver;
    // End of variables declaration//GEN-END:variables
}
