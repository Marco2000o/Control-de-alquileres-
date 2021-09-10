/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author messi
 */
public class Casas2 extends javax.swing.JFrame {

    /**
     * Creates new form Casas2
     */
    public Casas2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        combOpcion = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        Cas1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Regresar a clientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        combOpcion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Casa 1", "Casa 2", "Casa 3", "Casa 4" }));
        combOpcion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combOpcionItemStateChanged(evt);
            }
        });
        combOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combOpcionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Casas Disponibles");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Cas1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(combOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButton1)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(combOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Cas1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Clientes cliente = new Clientes();
        this.dispose();
        cliente.setVisible(true);
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combOpcionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combOpcionItemStateChanged
        int a = combOpcion.getSelectedIndex();
        String tipo = (String)combOpcion.getSelectedItem();
        System.out.println(a);
        if (tipo.equals("Casa 1")) {
            ImageIcon lacasa = new ImageIcon(getClass().getResource("/iconos/casa1.jpg"));
            ImageIcon icon = new ImageIcon(lacasa.getImage().getScaledInstance(Cas1.getWidth(), Cas1.getHeight(), Image.SCALE_DEFAULT));
            Cas1.setIcon(icon);}
        if (tipo.equals("Casa 2")) {
            ImageIcon lacasa = new ImageIcon(getClass().getResource("/iconos/casa2.jpg"));
            ImageIcon icon = new ImageIcon(lacasa.getImage().getScaledInstance(Cas1.getWidth(), Cas1.getHeight(), Image.SCALE_DEFAULT));
            Cas1.setIcon(icon);}
        if (tipo.equals("Casa 3")) {
            ImageIcon lacasa = new ImageIcon(getClass().getResource("/iconos/casa3_1.jpg"));
            ImageIcon icon = new ImageIcon(lacasa.getImage().getScaledInstance(Cas1.getWidth(), Cas1.getHeight(), Image.SCALE_DEFAULT));
            Cas1.setIcon(icon);}
        if (tipo.equals("Casa 4")) {
            ImageIcon lacasa = new ImageIcon(getClass().getResource("/iconos/casa4.jpg"));
            ImageIcon icon = new ImageIcon(lacasa.getImage().getScaledInstance(Cas1.getWidth(), Cas1.getHeight(), Image.SCALE_DEFAULT));
            Cas1.setIcon(icon);}
    }//GEN-LAST:event_combOpcionItemStateChanged

    private void combOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combOpcionActionPerformed

    }//GEN-LAST:event_combOpcionActionPerformed

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
            java.util.logging.Logger.getLogger(Casas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Casas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Casas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Casas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Casas2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cas1;
    private javax.swing.JComboBox combOpcion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}