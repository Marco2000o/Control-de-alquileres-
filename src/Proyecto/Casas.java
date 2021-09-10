/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.swing.ImageIconUIResource;

/**
 *
 * @author messi
 */
public class Casas extends javax.swing.JFrame {

    static String[] casas = new String[5];
    static int valor;
   static DefaultTableModel modelo = new DefaultTableModel();
    PreparedStatement ps;
    ResultSet rs;
    Connection conexion;
    static int a1,a2,a3,a4;
    public void llenar() {

        for (int i = 0; i < casas.length; i++) {
            casas[i] = "casa" + (1 + i);
        }
    }

    public Casas() throws ClassNotFoundException, SQLException {
        initComponents();
        llenar();
        Conexion db_conexion = new Conexion();
        conexion = db_conexion.getConnection();
        consultar();
        

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
        combOpcion = new javax.swing.JComboBox();
        Cas1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dispo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableValor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Elije la casa");

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

        jButton1.setText("CONFIRMAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dispo.setForeground(new java.awt.Color(0, 102, 102));

        jtableValor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "disponibilidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtableValor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(combOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(158, 158, 158)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dispo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(jButton1))
                            .addComponent(Cas1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(combOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(Cas1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(dispo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combOpcionActionPerformed

    }//GEN-LAST:event_combOpcionActionPerformed

    private void combOpcionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combOpcionItemStateChanged
        int a = combOpcion.getSelectedIndex();
        String tipo = (String) combOpcion.getSelectedItem();
        System.out.println(a);
        if (tipo.equals("Casa 1")) {
            ImageIcon lacasa = new ImageIcon(getClass().getResource("/iconos/casa1.jpg"));
            ImageIcon icon = new ImageIcon(lacasa.getImage().getScaledInstance(Cas1.getWidth(), Cas1.getHeight(), Image.SCALE_DEFAULT));
            Cas1.setIcon(icon);
            if (a1==0) {
             dispo.setText("ocupada");
            }else dispo.setText("Libre");

        }
        if (tipo.equals("Casa 2")) {
            ImageIcon lacasa = new ImageIcon(getClass().getResource("/iconos/casa2.jpg"));
            ImageIcon icon = new ImageIcon(lacasa.getImage().getScaledInstance(Cas1.getWidth(), Cas1.getHeight(), Image.SCALE_DEFAULT));
            Cas1.setIcon(icon);
            if (a2==0) {
             dispo.setText("ocupada");
            }else dispo.setText("Libre");
            
        }
        if (tipo.equals("Casa 3")) {
            ImageIcon lacasa = new ImageIcon(getClass().getResource("/iconos/casa3_1.jpg"));
            ImageIcon icon = new ImageIcon(lacasa.getImage().getScaledInstance(Cas1.getWidth(), Cas1.getHeight(), Image.SCALE_DEFAULT));
            Cas1.setIcon(icon);
            if (a3==0) {
             dispo.setText("ocupada");
            }else dispo.setText("Libre");
        }
        if (tipo.equals("Casa 4")) {
            ImageIcon lacasa = new ImageIcon(getClass().getResource("/iconos/casa4.jpg"));
            ImageIcon icon = new ImageIcon(lacasa.getImage().getScaledInstance(Cas1.getWidth(), Cas1.getHeight(), Image.SCALE_DEFAULT));
            Cas1.setIcon(icon);
            if (a4==0) {
             dispo.setText("ocupada");
            }else dispo.setText("Libre");
        }
    }//GEN-LAST:event_combOpcionItemStateChanged

    public void consultar() throws SQLException {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            jtableValor.setModel(modelo);
            String query = "SELECT * FROM OPENQUERY(SQL, 'SELECT * FROM admin.propiedades')";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidaColumna = rsmd.getColumnCount();
            modelo.addColumn("propiedades");
            modelo.addColumn("metros2");
            modelo.addColumn("estado");
            modelo.addColumn("precioat");
            modelo.addColumn("ncuarto");
            modelo.addColumn("ubicacion");
            modelo.addColumn("tipo");
            modelo.addColumn("disponibilidad");
            while (rs.next()) {
                Object[] filas = new Object[cantidaColumna];
                for (int i = 0; i < cantidaColumna; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);

            }
   
   int  dis =  (int) modelo.getValueAt(0, 7);
   int dis2 = (int)modelo.getValueAt(1, 7);
   int dis3 = (int)modelo.getValueAt(2, 7);
   int dis4 = (int)modelo.getValueAt(3, 7);
   
   a1=dis;
   a2=dis2;
   a3=dis3;
   a4=dis4;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void actualizarVendedorNombre() throws SQLException {
        try {
            String query = "update openquery(SQL, 'SELECT * FROM admin.propiedades') set disponibilidad = ?  WHERE (idpropiedad= ?)";
            ps = conexion.prepareStatement(query);
            ps.setInt(1, 0);
            ps.setInt(2, combOpcion.getSelectedIndex() + 1);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (a1==0 && a2==0 && a3==0 && a4==0) {
              JOptionPane.showMessageDialog(null, "Todas las casas en uso");
        } else {
        
        try {
            valor = combOpcion.getSelectedIndex() + 1;
            actualizarVendedorNombre();
            Contrato contrato;
            contrato = new Contrato();
            this.dispose();
            contrato.setVisible(true);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Casas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Casas.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Casas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Casas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Casas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Casas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Casas().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Casas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Casas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cas1;
    private javax.swing.JComboBox combOpcion;
    private javax.swing.JLabel dispo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableValor;
    // End of variables declaration//GEN-END:variables
}
