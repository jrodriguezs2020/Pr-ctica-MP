/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import practicamp.Armadura;
import practicamp.Jugador;
import practicamp.Sistema;

/**
 *
 * @author noeli
 */
public class ElegirArmadura extends javax.swing.JFrame {
    private Menu menu;
    private Sistema sistema;
    private Jugador jugador;
    private ArrayList<Armadura> armaduraList;
    private ModificacionesPersonaje mod;
    /**
     * Creates new form ElegirArmadura
     */
    public ElegirArmadura(Sistema sistema, ArrayList<Armadura> armaduraList, Jugador jugador, Menu menu, ModificacionesPersonaje mod) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.menu=menu;
        this.jugador=jugador;
        this.armaduraList=armaduraList;
        this.sistema = sistema;
        this.mod = mod;

        DefaultListModel model = new DefaultListModel<>();        
        for (Armadura a: armaduraList){
            String nombre = a.getNombre();
            model.addElement(nombre);
        }
        jList1.setModel(model);        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jVolver = new javax.swing.JButton();
        jAceptar = new javax.swing.JButton();
        jLista = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jMenu = new javax.swing.JLabel();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jVolver.setForeground(new java.awt.Color(51, 51, 0));
        jVolver.setText("Volver");
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 80, 30));

        jAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jAceptar.setForeground(new java.awt.Color(51, 51, 0));
        jAceptar.setText("Aceptar");
        jAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 403, 90, 30));

        jLista.setBackground(new java.awt.Color(0, 0, 102));

        jList1.setBackground(new java.awt.Color(102, 102, 0));
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jLista.setViewportView(jList1);

        getContentPane().add(jLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 310, 220));

        jMenu.setBackground(new java.awt.Color(102, 102, 0));
        jMenu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jMenu.setForeground(new java.awt.Color(255, 255, 255));
        jMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu.setText("Elegir Armadura");
        jMenu.setOpaque(true);
        getContentPane().add(jMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 50));

        jFondo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_neutro.jpg"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolverActionPerformed
        if (menu == null){
            mod.setVisible(true);
        } else {
            menu.setVisible(true);
        }
        this.setVisible(false);
        
// TODO add your handling code here:
    }//GEN-LAST:event_jVolverActionPerformed

    private void jAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAceptarActionPerformed
       String a= jList1.getSelectedValue();
       for(Armadura armadura: armaduraList){
       if(a.equals(armadura.getNombre())){
       jugador.getPersonaje().setArmadura(armadura);
       }}
        try {
            sistema.guardarDatos();
        } catch (IOException ex) {
            Logger.getLogger(ElegirArmadura.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (menu == null){
            mod.setVisible(true);
        } else {
            menu.setVisible(true);
        }
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(ElegirArmadura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElegirArmadura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElegirArmadura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElegirArmadura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           //     new ElegirArmadura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAceptar;
    private javax.swing.JLabel jFondo;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jLista;
    private javax.swing.JLabel jMenu;
    private javax.swing.JButton jVolver;
    // End of variables declaration//GEN-END:variables
}
