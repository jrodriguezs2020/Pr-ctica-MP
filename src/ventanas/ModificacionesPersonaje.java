/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import practicamp.Arma;
import practicamp.Armadura;
import practicamp.Jugador;
import practicamp.Personaje;
import practicamp.Sistema;

/**
 *
 * @author noeli
 */
public class ModificacionesPersonaje extends javax.swing.JFrame {
    private Jugador jugador;
    private Sistema sistema;
    private Menu_O menu;
    private Personaje personaje;
    private ElegirPersonaje elPer;

    /**
     * Creates new form ModificacionesPersonaje
     */
    public ModificacionesPersonaje(Personaje personje, Jugador jugador, Sistema sistema, Menu_O menu, ElegirPersonaje elPer) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema=sistema;
        this.jugador=jugador;
        this.personaje=personaje;
        this.menu=menu;
        this.elPer=elPer;
        
        DefaultComboBoxModel modelA = new DefaultComboBoxModel<>();
        DefaultComboBoxModel modelB = new DefaultComboBoxModel<>();
        for(int i=1;i<=5;i++){
            modelA.addElement(i);
        }
        for(int i=0;i<=5;i++){
            modelB.addElement(i);
        }
        PoderChange.setModel(modelA);
        SaludChange.setModel(modelB);
        
        
        DefaultListModel model2 = new DefaultListModel<>();        
        for (Armadura am: sistema.getArmaduraList()){
            String nombre2 = am.getNombre();
            model2.addElement(nombre2);
        }
        jList1.setModel(model2);
    
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jVolver = new javax.swing.JButton();
        jAceptar = new javax.swing.JButton();
        Oro = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Salud = new javax.swing.JLabel();
        Poder = new javax.swing.JLabel();
        OroChange = new javax.swing.JTextField();
        NombreChange = new javax.swing.JTextField();
        SaludChange = new javax.swing.JComboBox<>();
        PoderChange = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        ArmaChange = new javax.swing.JLabel();
        ArmaduraChange = new javax.swing.JLabel();
        CambiarArma = new javax.swing.JButton();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Atributos");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 240, 40));

        jVolver.setBackground(new java.awt.Color(255, 255, 255));
        jVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jVolver.setForeground(new java.awt.Color(0, 102, 51));
        jVolver.setText("Volver");
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 90, 30));

        jAceptar.setBackground(new java.awt.Color(255, 255, 255));
        jAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jAceptar.setForeground(new java.awt.Color(0, 102, 0));
        jAceptar.setText("Aceptar");
        jAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 380, 100, 30));

        Oro.setBackground(new java.awt.Color(0, 102, 0));
        Oro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Oro.setForeground(new java.awt.Color(255, 255, 255));
        Oro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Oro.setText("Oro");
        Oro.setOpaque(true);
        getContentPane().add(Oro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 110, 30));

        Nombre.setBackground(new java.awt.Color(0, 102, 0));
        Nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre.setText("Nombre");
        Nombre.setOpaque(true);
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 110, 30));

        Salud.setBackground(new java.awt.Color(0, 102, 0));
        Salud.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Salud.setForeground(new java.awt.Color(255, 255, 255));
        Salud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salud.setText("Salud");
        Salud.setOpaque(true);
        getContentPane().add(Salud, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, 30));

        Poder.setBackground(new java.awt.Color(0, 102, 0));
        Poder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Poder.setForeground(new java.awt.Color(255, 255, 255));
        Poder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Poder.setText("Poder");
        Poder.setOpaque(true);
        getContentPane().add(Poder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 110, 30));

        OroChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OroChangeActionPerformed(evt);
            }
        });
        getContentPane().add(OroChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 100, 30));
        getContentPane().add(NombreChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 100, 30));

        SaludChange.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SaludChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaludChangeActionPerformed(evt);
            }
        });
        getContentPane().add(SaludChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 100, 30));

        PoderChange.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(PoderChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 100, 30));

        jList1.setBackground(new java.awt.Color(0, 102, 0));
        jList1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 110, 100));

        ArmaChange.setBackground(new java.awt.Color(0, 102, 0));
        ArmaChange.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ArmaChange.setForeground(new java.awt.Color(255, 255, 255));
        ArmaChange.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ArmaChange.setText("Armas");
        ArmaChange.setOpaque(true);
        getContentPane().add(ArmaChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 110, 30));

        ArmaduraChange.setBackground(new java.awt.Color(0, 102, 0));
        ArmaduraChange.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ArmaduraChange.setForeground(new java.awt.Color(255, 255, 255));
        ArmaduraChange.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ArmaduraChange.setText("Armaduras");
        ArmaduraChange.setOpaque(true);
        getContentPane().add(ArmaduraChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 110, 30));

        CambiarArma.setBackground(new java.awt.Color(255, 255, 255));
        CambiarArma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CambiarArma.setText("Cambiar");
        CambiarArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarArmaActionPerformed(evt);
            }
        });
        getContentPane().add(CambiarArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 100, 30));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5227842611_e65fa83134_b.png"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 422, 419));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OroChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OroChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OroChangeActionPerformed

    private void SaludChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaludChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaludChangeActionPerformed

    private void jVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolverActionPerformed
        this.setVisible(false);
        elPer.setVisible(true);
    }//GEN-LAST:event_jVolverActionPerformed

    private void jAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAceptarActionPerformed

    if(!NombreChange.getText().equals("")){
       jugador.getPersonaje().setNombre(NombreChange.getText());
       }
    if(!OroChange.getText().equals("")){
    jugador.getPersonaje().setCantidadOro(Integer.valueOf(OroChange.getText()));
    }
    if(jList1.getSelectedValue() !=null){
    for(Armadura a:sistema.getArmaduraList()){
    if (a.getNombre().equals(jList1.getSelectedValue())){
    jugador.getPersonaje().setArmadura(a);
    }}
    }
    if(PoderChange.getSelectedItem()!=null){
    int poder =(int) PoderChange.getSelectedItem();
    jugador.getPersonaje().setPoder(poder);
    }
    if(SaludChange.getSelectedItem()!=null){
    int salud=(int) SaludChange.getSelectedItem();
    jugador.getPersonaje().setSalud(salud);
    }
        try {
            sistema.guardarDatos();
        } catch (IOException ex) {
            Logger.getLogger(ModificacionesPersonaje.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }//GEN-LAST:event_jAceptarActionPerformed

    private void CambiarArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarArmaActionPerformed
       this.setVisible(false);
       ElegirArma elAr= new ElegirArma(sistema,sistema.getArmaList(),jugador,null,menu);    
    }//GEN-LAST:event_CambiarArmaActionPerformed

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
            java.util.logging.Logger.getLogger(ModificacionesPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificacionesPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificacionesPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificacionesPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new ModificacionesPersonaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ArmaChange;
    private javax.swing.JLabel ArmaduraChange;
    private javax.swing.JButton CambiarArma;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField NombreChange;
    private javax.swing.JLabel Oro;
    private javax.swing.JTextField OroChange;
    private javax.swing.JLabel Poder;
    private javax.swing.JComboBox<String> PoderChange;
    private javax.swing.JLabel Salud;
    private javax.swing.JComboBox<String> SaludChange;
    private javax.swing.JButton jAceptar;
    private javax.swing.JLabel jFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jVolver;
    // End of variables declaration//GEN-END:variables
}
