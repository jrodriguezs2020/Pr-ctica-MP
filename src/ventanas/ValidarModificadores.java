/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practicamp;

import java.util.Scanner;
import javax.swing.DefaultListModel;

/**
 *
 * @author Laura
 */
public class ValidarModificadores extends javax.swing.JFrame {
    private Jugador jug1;
    private Jugador jug2;
    /**
     * Creates new form ValidarModificadores
     */
    public ValidarModificadores(Jugador jug1, Jugador jug2) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.jug1 = jug1;
        this.jug2 = jug2;
       
        DefaultListModel modelF1 = new DefaultListModel<>();
        DefaultListModel modelD1 = new DefaultListModel<>();
        DefaultListModel modelF2 = new DefaultListModel<>();
        DefaultListModel modelD2 = new DefaultListModel<>();
        
        for (Modificador j: jug1.getPersonaje().getModificadorList()){
            if (j.getTipo()==0){
                String nombre = j.getNombre();
                String valor = Integer.toString(j.getValor());
                String notificacion=nombre+" - Valor: "+valor;
                modelD1.addElement(notificacion);
            } else{
                String nombre = j.getNombre();
                String valor = Integer.toString(j.getValor());
                String notificacion=nombre+" - Valor: "+valor;
                modelF1.addElement(notificacion);                
            }
        } 
        for (Modificador j: jug2.getPersonaje().getModificadorList()){
            if (j.getTipo()==0){
                String nombre = j.getNombre();
                String valor = Integer.toString(j.getValor());
                String notificacion=nombre+" - Valor: "+valor;
                modelD2.addElement(notificacion);
            } else{
                String nombre = j.getNombre();
                String valor = Integer.toString(j.getValor());
                String notificacion=nombre+" - Valor: "+valor;
                modelF2.addElement(notificacion);                
            }
        }         
        
        jDeb1.setModel(modelD1); 
        jFort1.setModel(modelF1);
        jDeb2.setModel(modelD2); 
        jFort2.setModel(modelF2);  
                
    }
    
       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jFort2 = new javax.swing.JList<>();
        jLabelNotificaciones = new javax.swing.JLabel();
        jLabelNotificaciones1 = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jFort1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jDeb1 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jDeb2 = new javax.swing.JList<>();
        jButtonVolver = new javax.swing.JButton();
        jLabelNotificaciones2 = new javax.swing.JLabel();
        jLabelNotificaciones3 = new javax.swing.JLabel();
        jLabelNotificaciones4 = new javax.swing.JLabel();
        jLabelNotificaciones5 = new javax.swing.JLabel();
        jLabelNotificaciones6 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 102));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jFort2.setBackground(new java.awt.Color(0, 16, 49));
        jFort2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jFort2.setForeground(new java.awt.Color(255, 255, 255));
        jFort2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jFort2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFort2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jFort2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 130, 90));

        jLabelNotificaciones.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNotificaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNotificaciones.setForeground(new java.awt.Color(0, 16, 49));
        jLabelNotificaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNotificaciones.setText("Fortalezas");
        jLabelNotificaciones.setOpaque(true);
        getContentPane().add(jLabelNotificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, 30));

        jLabelNotificaciones1.setBackground(new java.awt.Color(0, 16, 49));
        jLabelNotificaciones1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelNotificaciones1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNotificaciones1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNotificaciones1.setText("Fortalezas y debilidades");
        jLabelNotificaciones1.setOpaque(true);
        getContentPane().add(jLabelNotificaciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 300, 40));

        jButtonAceptar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAceptar.setForeground(new java.awt.Color(0, 16, 49));
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 102));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        jFort1.setBackground(new java.awt.Color(0, 16, 49));
        jFort1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jFort1.setForeground(new java.awt.Color(255, 255, 255));
        jFort1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jFort1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFort1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jFort1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, 90));

        jScrollPane3.setBackground(new java.awt.Color(0, 0, 102));
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));

        jDeb1.setBackground(new java.awt.Color(0, 16, 49));
        jDeb1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jDeb1.setForeground(new java.awt.Color(255, 255, 255));
        jDeb1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jDeb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDeb1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jDeb1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 130, 90));

        jScrollPane4.setBackground(new java.awt.Color(0, 0, 102));
        jScrollPane4.setForeground(new java.awt.Color(255, 255, 255));

        jDeb2.setBackground(new java.awt.Color(0, 16, 49));
        jDeb2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jDeb2.setForeground(new java.awt.Color(255, 255, 255));
        jDeb2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jDeb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDeb2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jDeb2);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 130, 90));

        jButtonVolver.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVolver.setForeground(new java.awt.Color(0, 16, 49));
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabelNotificaciones2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNotificaciones2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNotificaciones2.setForeground(new java.awt.Color(0, 16, 49));
        jLabelNotificaciones2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNotificaciones2.setText("Debilidades");
        jLabelNotificaciones2.setOpaque(true);
        getContentPane().add(jLabelNotificaciones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 130, 30));

        jLabelNotificaciones3.setBackground(new java.awt.Color(0, 16, 49));
        jLabelNotificaciones3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNotificaciones3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNotificaciones3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNotificaciones3.setText("Jugador desafiado");
        jLabelNotificaciones3.setOpaque(true);
        getContentPane().add(jLabelNotificaciones3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 310, 30));

        jLabelNotificaciones4.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNotificaciones4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNotificaciones4.setForeground(new java.awt.Color(0, 16, 49));
        jLabelNotificaciones4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNotificaciones4.setText("Debilidades");
        jLabelNotificaciones4.setOpaque(true);
        getContentPane().add(jLabelNotificaciones4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 130, 30));

        jLabelNotificaciones5.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNotificaciones5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNotificaciones5.setForeground(new java.awt.Color(0, 16, 49));
        jLabelNotificaciones5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNotificaciones5.setText("Fortalezas");
        jLabelNotificaciones5.setOpaque(true);
        getContentPane().add(jLabelNotificaciones5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 130, 30));

        jLabelNotificaciones6.setBackground(new java.awt.Color(0, 16, 49));
        jLabelNotificaciones6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNotificaciones6.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNotificaciones6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNotificaciones6.setText("Jugador desafiante");
        jLabelNotificaciones6.setOpaque(true);
        getContentPane().add(jLabelNotificaciones6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 320, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 430, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFort2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFort2MouseClicked

    }//GEN-LAST:event_jFort2MouseClicked

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        String nombre1 = "";
        String nombre2 = "";
        String nombre3 = "";
        String nombre4 = "";       
        
        String f1 = jFort1.getSelectedValue();
        if (f1!=null){
            Scanner scf1 = new Scanner(f1);
            nombre1 = scf1.next();            
        }
        String d1 = jDeb1.getSelectedValue();
        if (d1!=null){
            Scanner scd1 = new Scanner(d1);
            nombre2 = scd1.next();             
        }
       
        for (Modificador m: jug1.getPersonaje().getModificadorList()){
            if (m.getNombre().equals(nombre1)){
                jug1.getPersonaje().setFortaleza(m);
            } else if (m.getNombre().equals(nombre2)){
                jug1.getPersonaje().setDebilidad(m);
            }
        }
        String f2 = jFort2.getSelectedValue();
        if (f2 != null){
            Scanner scf2 = new Scanner(f2);
            nombre3 = scf2.next();            
        }
        String d2 = jDeb2.getSelectedValue();
        if (d2 != null){
            Scanner scd2 = new Scanner(d2);
            nombre4 = scd2.next();            
        }
        for (Modificador m: jug2.getPersonaje().getModificadorList()){
            if (m.getNombre().equals(nombre3)){
                jug2.getPersonaje().setFortaleza(m);
            } else if (m.getNombre().equals(nombre4)){
                jug2.getPersonaje().setDebilidad(m);
            } 
        }
        this.setVisible(false);
        //menu.setVisible(true);
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jFort1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFort1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jFort1MouseClicked

    private void jDeb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDeb1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDeb1MouseClicked

    private void jDeb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDeb2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDeb2MouseClicked

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVolverActionPerformed

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
            java.util.logging.Logger.getLogger(ValidarModificadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValidarModificadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValidarModificadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValidarModificadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ValidarModificadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JList<String> jDeb1;
    private javax.swing.JList<String> jDeb2;
    private javax.swing.JList<String> jFort1;
    private javax.swing.JList<String> jFort2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNotificaciones;
    private javax.swing.JLabel jLabelNotificaciones1;
    private javax.swing.JLabel jLabelNotificaciones2;
    private javax.swing.JLabel jLabelNotificaciones3;
    private javax.swing.JLabel jLabelNotificaciones4;
    private javax.swing.JLabel jLabelNotificaciones5;
    private javax.swing.JLabel jLabelNotificaciones6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
