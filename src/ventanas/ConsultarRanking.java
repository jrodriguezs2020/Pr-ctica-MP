/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import practicamp.Sistema;
public class ConsultarRanking extends javax.swing.JFrame {
    Menu menu;
    /**
     * Creates new form ConsultarRanking
     */
    public ConsultarRanking(ArrayList<String>ranking, Menu menu) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.menu=menu;
        DefaultListModel model = new DefaultListModel<>();
        
        for (String s: ranking){
        model.addElement(s);}
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

        JList = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jVolver = new javax.swing.JButton();
        jRanking = new javax.swing.JLabel();
        JFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JList.setBackground(new java.awt.Color(0, 0, 102));
        JList.setForeground(new java.awt.Color(255, 255, 255));

        jList1.setBackground(new java.awt.Color(0, 0, 102));
        jList1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        JList.setViewportView(jList1);

        getContentPane().add(JList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 200, 220));

        jVolver.setBackground(new java.awt.Color(255, 255, 255));
        jVolver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jVolver.setForeground(new java.awt.Color(0, 0, 102));
        jVolver.setText("Volver");
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jRanking.setBackground(new java.awt.Color(0, 0, 102));
        jRanking.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRanking.setForeground(new java.awt.Color(255, 255, 255));
        jRanking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRanking.setText("Ranking");
        jRanking.setOpaque(true);
        getContentPane().add(jRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 40));

        JFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        JFondo.setText("jLabel1");
        getContentPane().add(JFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ConsultarRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarRanking().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JFondo;
    private javax.swing.JScrollPane JList;
    private javax.swing.JList<String> jList1;
    private javax.swing.JLabel jRanking;
    private javax.swing.JButton jVolver;
    // End of variables declaration//GEN-END:variables
}
