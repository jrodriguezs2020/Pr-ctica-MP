/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import practicamp.Arma;
import practicamp.Jugador;
import practicamp.Sistema;

/**
 *
 * @author Laura
 */
public class ElegirArma extends javax.swing.JFrame {
    private Sistema sis;
    private ArrayList<Arma> armas;
    private Jugador jugador;
    private Menu menu;
    private int dosManos;
    private int unaMano;

    /**
     * Creates new form ElegirArma
     */
    public ElegirArma(Sistema sis, ArrayList<Arma> armas, Jugador jugador, Menu menu) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.sis = sis;
        this.armas = armas;
        this.jugador = jugador;
        this.menu = menu;
        dosManos = 0;
        unaMano = 0;
        DefaultListModel model = new DefaultListModel<>();  
        for (Arma a: jugador.getPersonaje().getArmaList()){
            String nombre = a.getNombre();
            model.addElement(nombre);
            if (a.isDosManos()){
                dosManos += 1;
            } else {
                unaMano += 1;
            }
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

        jVolver = new javax.swing.JToggleButton();
        jAceptar = new javax.swing.JToggleButton();
        jTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDesArma = new javax.swing.JButton();
        j2Manos = new javax.swing.JButton();
        j1Mano = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jVolver.setForeground(new java.awt.Color(0, 0, 102));
        jVolver.setText("Volver");
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jAceptar.setForeground(new java.awt.Color(0, 0, 102));
        jAceptar.setText("Aceptar");
        jAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        jTitulo.setBackground(new java.awt.Color(0, 0, 102));
        jTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTitulo.setText("Elegir armas");
        jTitulo.setOpaque(true);
        getContentPane().add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 50));

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Armas actuales");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 140, 30));

        jDesArma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDesArma.setForeground(new java.awt.Color(0, 0, 102));
        jDesArma.setText("Deselecionar arma");
        jDesArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDesArmaActionPerformed(evt);
            }
        });
        getContentPane().add(jDesArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 360, -1));

        j2Manos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j2Manos.setForeground(new java.awt.Color(0, 0, 102));
        j2Manos.setText("Armas de dos manos");
        j2Manos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ManosActionPerformed(evt);
            }
        });
        getContentPane().add(j2Manos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 180, -1));

        j1Mano.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j1Mano.setForeground(new java.awt.Color(0, 0, 102));
        j1Mano.setText("Armas de una mano");
        j1Mano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ManoActionPerformed(evt);
            }
        });
        getContentPane().add(j1Mano, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 102));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jList1.setBackground(new java.awt.Color(0, 0, 102));
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 200, 160));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolverActionPerformed
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jVolverActionPerformed

    private void jAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAceptarActionPerformed
        try {
            sis.guardarDatos();
        } catch (IOException ex) {
            Logger.getLogger(ElegirArma.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jAceptarActionPerformed

    private void jDesArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDesArmaActionPerformed
        for (Arma a: jugador.getPersonaje().getArmaList()){
            if (a.getNombre().equals(jList1.getSelectedValue())){
                jugador.getPersonaje().getArmaList().remove(a);
                break;
            }
        }
        try {
            sis.guardarDatos();
        } catch (IOException ex) {
            Logger.getLogger(ElegirArma.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        ElegirArma armas = new ElegirArma(sis, sis.getArmaList(),jugador,menu);
    }//GEN-LAST:event_jDesArmaActionPerformed

    private void j1ManoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ManoActionPerformed
        if ((unaMano>1)||(dosManos>0)){
            JOptionPane.showMessageDialog(null, "Tiene que deseleccionar algun arma.");
        } else {
            ArmasUnaMano ArmaUnaMano = new ArmasUnaMano(sis,armas,jugador,menu);
            this.setVisible(false);            
        }
    }//GEN-LAST:event_j1ManoActionPerformed

    private void j2ManosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ManosActionPerformed
        if ((dosManos>0)||(unaMano>0)){
            JOptionPane.showMessageDialog(null, "Tiene que deseleccionar algun arma.");
        } else {        
            ArmasDosManos ArmasDosManos = new ArmasDosManos(sis,armas,jugador,menu);
            this.setVisible(false); 
        }
    }//GEN-LAST:event_j2ManosActionPerformed

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
            java.util.logging.Logger.getLogger(ElegirArma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElegirArma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElegirArma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElegirArma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ElegirArma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton j1Mano;
    private javax.swing.JButton j2Manos;
    private javax.swing.JToggleButton jAceptar;
    private javax.swing.JButton jDesArma;
    private javax.swing.JLabel jFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JToggleButton jVolver;
    // End of variables declaration//GEN-END:variables
}
