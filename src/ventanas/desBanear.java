/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.util.TreeSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import practicamp.Jugador;
import practicamp.Sistema;

/**
 *
 * @author Victo
 */
public class desBanear extends javax.swing.JFrame {
     String nick;
     Sistema sistema;
     Menu_O menu;
    /**
     * Creates new form Banear
     */
    public desBanear(Sistema sistema,Menu_O menu) {
        initComponents();
        TreeSet<Jugador> jugadores = sistema.getUsuariosList();
        this.sistema=sistema;
        this.menu= menu;
        this.setLocationRelativeTo(null);
        DefaultListModel model = new DefaultListModel<>();
        for (Jugador s: jugadores){
            if (s.isBaneado()) {
            String nick= s.getNick();
            model.addElement(nick);
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

        jList = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jVolver = new javax.swing.JButton();
        jBanear = new javax.swing.JButton();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setBackground(new java.awt.Color(0, 153, 0));
        jList1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList.setViewportView(jList1);

        getContentPane().add(jList, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 270, 290));

        jVolver.setBackground(new java.awt.Color(0, 153, 0));
        jVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jVolver.setForeground(new java.awt.Color(255, 255, 255));
        jVolver.setText("Volver");
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jBanear.setBackground(new java.awt.Color(0, 153, 0));
        jBanear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBanear.setForeground(new java.awt.Color(255, 255, 255));
        jBanear.setText("Desbanear");
        jBanear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBanearActionPerformed(evt);
            }
        });
        getContentPane().add(jBanear, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5227842611_e65fa83134_b.png"))); // NOI18N
        jFondo.setText("jLabel1");
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

       nick = jList1.getSelectedValue();
    }//GEN-LAST:event_jList1MouseClicked

    private void jBanearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBanearActionPerformed
        sistema.desBanear(nick);
        JOptionPane.showMessageDialog(null, "Usuario desbaneado.");
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jBanearActionPerformed

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
            java.util.logging.Logger.getLogger(desBanear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(desBanear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(desBanear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(desBanear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      /*  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banear().setVisible(true);
            }
        //</editor-fold>

        /* Create and display the form */
      /*  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banear().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBanear;
    private javax.swing.JLabel jFondo;
    private javax.swing.JScrollPane jList;
    private javax.swing.JList<String> jList1;
    private javax.swing.JButton jVolver;
    // End of variables declaration//GEN-END:variables
}
