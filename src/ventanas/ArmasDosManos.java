/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import practicamp.Arma;
import practicamp.Jugador;
import practicamp.Sistema;

/**
 *
 * @author Laura
 */
public class ArmasDosManos extends javax.swing.JFrame {

    private  Sistema sis;
    private  ArrayList<Arma> armas;
    private  Jugador jugador;
    private  Menu menu;
    private Menu_O menuO;

    /**
     * Creates new form ArmasDosManos
     */
    public ArmasDosManos(Sistema sis, ArrayList<Arma> armas, Jugador jugador, Menu menu, Menu_O menuO) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.sis = sis;
        this.armas = armas;
        this.jugador = jugador;
        this.menu = menu;
        this.menuO=menuO;
        
        DefaultListModel model = new DefaultListModel<>();  
        for (Arma a: armas){
            String nombre = a.getNombre();
            if (a.isDosManos()) {
                model.addElement(nombre);
            }
        }
        jLista.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jAceptar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLista = new javax.swing.JList<>();
        jTitulo = new javax.swing.JLabel();
        jVolver = new javax.swing.JToggleButton();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jAceptar.setForeground(new java.awt.Color(51, 51, 0));
        jAceptar.setText("Aceptar");
        jAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        jLabel1.setBackground(new java.awt.Color(102, 102, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("solo puede elegir un arma de dos manos");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 380, 30));

        jLista.setBackground(new java.awt.Color(102, 102, 0));
        jLista.setForeground(new java.awt.Color(255, 255, 255));
        jLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jLista);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 380, 220));

        jTitulo.setBackground(new java.awt.Color(102, 102, 0));
        jTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTitulo.setText("Armas de dos manos");
        jTitulo.setOpaque(true);
        getContentPane().add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, 50));

        jVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jVolver.setForeground(new java.awt.Color(51, 51, 0));
        jVolver.setText("Volver");
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jFondo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_neutro.jpg"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAceptarActionPerformed
        for (Arma a: armas){
            if (a.getNombre().equals(jLista.getSelectedValue())){
                jugador.getPersonaje().getArmaList().add(a);
            }
        }
        try {
            sis.guardarDatos();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ArmasDosManos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        ElegirArma armas = new ElegirArma(sis, sis.getArmaList(),jugador,menu,menuO);
        this.setVisible(false);
    }//GEN-LAST:event_jAceptarActionPerformed

    private void jVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolverActionPerformed
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jVolverActionPerformed

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
            java.util.logging.Logger.getLogger(ArmasDosManos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArmasDosManos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArmasDosManos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArmasDosManos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ArmasDosManos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jAceptar;
    private javax.swing.JLabel jFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JToggleButton jVolver;
    // End of variables declaration//GEN-END:variables
}
