
package ventanas;




import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import practicamp.Armadura;
import practicamp.Sistema;


/**
 *
 * @author Victo
 */
public class CrearArmadura extends javax.swing.JFrame {
    String nombre;
    int ataque;
    int defensa;
    Menu_O menu;
    Sistema sistema;
    /**
     * Creates new form CrearArma
     */
    public CrearArmadura( Menu_O menu,Sistema sistema) {
        initComponents();
        this.menu=menu;
        this.sistema=sistema;
        this.setLocationRelativeTo(null);
        DefaultComboBoxModel modelA = new DefaultComboBoxModel<>();
        DefaultComboBoxModel modelB = new DefaultComboBoxModel<>();
        for(int i=0;i<=3;i++){
            modelA.addElement(i);
            modelB.addElement(i);
        }
        jBoxDefensa.setModel(modelB);
        jBoxAtaque.setModel(modelA);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextNombre = new javax.swing.JTextField();
        jAtaque = new javax.swing.JLabel();
        jDefensa = new javax.swing.JLabel();
        jNombre = new javax.swing.JLabel();
        JNivelModi = new javax.swing.JLabel();
        jBoxDefensa = new javax.swing.JComboBox<>();
        jBoxAtaque = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jCrear = new javax.swing.JButton();
        jVolver = new javax.swing.JButton();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 170, 30));

        jAtaque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jAtaque.setForeground(new java.awt.Color(255, 255, 255));
        jAtaque.setText("Ataque:");
        getContentPane().add(jAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jDefensa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDefensa.setForeground(new java.awt.Color(255, 255, 255));
        jDefensa.setText("Defensa:");
        getContentPane().add(jDefensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jNombre.setForeground(new java.awt.Color(255, 255, 255));
        jNombre.setText("Nombre:");
        getContentPane().add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        JNivelModi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JNivelModi.setForeground(new java.awt.Color(255, 255, 255));
        JNivelModi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JNivelModi.setText("Valor de los Modificadores:");
        getContentPane().add(JNivelModi, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 190, 300, -1));

        jBoxDefensa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBoxDefensa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jBoxDefensa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoxDefensaActionPerformed(evt);
            }
        });
        getContentPane().add(jBoxDefensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 160, -1));

        jBoxAtaque.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBoxAtaque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jBoxAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoxAtaqueActionPerformed(evt);
            }
        });
        getContentPane().add(jBoxAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 160, -1));

        jLabel1.setBackground(new java.awt.Color(0, 16, 49));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 300, 270));

        jCrear.setBackground(new java.awt.Color(255, 255, 255));
        jCrear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCrear.setForeground(new java.awt.Color(0, 16, 49));
        jCrear.setText("Crear");
        jCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCrearActionPerformed(evt);
            }
        });
        getContentPane().add(jCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, -1));

        jVolver.setBackground(new java.awt.Color(255, 255, 255));
        jVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jVolver.setForeground(new java.awt.Color(0, 16, 49));
        jVolver.setText("Volver");
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo3.jpg"))); // NOI18N
        jFondo.setText("jLabel1");
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
       
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jBoxAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoxAtaqueActionPerformed
       
    }//GEN-LAST:event_jBoxAtaqueActionPerformed

    private void jBoxDefensaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoxDefensaActionPerformed
     
    }//GEN-LAST:event_jBoxDefensaActionPerformed

    private void jVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolverActionPerformed
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jVolverActionPerformed

    private void jCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCrearActionPerformed
        nombre=jTextNombre.getText();
        ataque = (int) jBoxAtaque.getSelectedItem();
        defensa = (int) jBoxDefensa.getSelectedItem();
                Armadura armadura = new Armadura(nombre, ataque, defensa);
        sistema.getArmaduraList().add(armadura);
        try {
            sistema.guardarDatos();
        } catch (IOException ex) {
            Logger.getLogger(CrearArmadura.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Armadura creada.");
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jCrearActionPerformed

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
            java.util.logging.Logger.getLogger(CrearArmadura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearArmadura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearArmadura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearArmadura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearArma().setVisible(true);
            }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearArma().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JNivelModi;
    private javax.swing.JLabel jAtaque;
    private javax.swing.JComboBox<String> jBoxAtaque;
    private javax.swing.JComboBox<String> jBoxDefensa;
    private javax.swing.JButton jCrear;
    private javax.swing.JLabel jDefensa;
    private javax.swing.JLabel jFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jNombre;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JButton jVolver;
    // End of variables declaration//GEN-END:variables
}
