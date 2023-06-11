package uas_pbo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class menuPelanggan extends javax.swing.JFrame {
    // deklarasi
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    
    public menuPelanggan() {
        initComponents();
        
        //Koneksi ke Database
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        
        reset();
        tampilData();
    }
    
    //Method untuk membersihkan form
    private void reset(){
        txtCari1.setText("");
    }
    
    
    //Method untuk menampilkan data ke database
    private void tampilData(){
        try{
            sql = "SELECT * FROM tbdatahandphone";
            rs = stat.executeQuery(sql);
            tblHp1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch (Exception e){
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCari1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCari1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHp1 = new javax.swing.JTable();
        btnBatal1 = new javax.swing.JButton();
        btnKeluar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        btnCari1.setBackground(new java.awt.Color(0, 51, 102));
        btnCari1.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnCari1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.default.hoverBorderColor"));
        btnCari1.setText("Cari");
        btnCari1.setMargin(new java.awt.Insets(3, 5, 3, 5));
        btnCari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCari1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Centaur", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("APLIKASI PENJUALAN HANDPHONE");

        txtCari1.setFont(new java.awt.Font("Centaur", 2, 12)); // NOI18N
        txtCari1.setForeground(new java.awt.Color(153, 153, 255));
        txtCari1.setText("Cari berdasarkan Merk");

        tblHp1.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        tblHp1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Merk", "Seri", "RAM", "Baterai", "Harga (Rp)", "Stok"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHp1.setShowVerticalLines(true);
        jScrollPane3.setViewportView(tblHp1);

        btnBatal1.setBackground(new java.awt.Color(0, 51, 102));
        btnBatal1.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnBatal1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.default.hoverBorderColor"));
        btnBatal1.setText("Batal");
        btnBatal1.setMargin(new java.awt.Insets(3, 5, 3, 5));
        btnBatal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatal1ActionPerformed(evt);
            }
        });

        btnKeluar1.setBackground(new java.awt.Color(0, 51, 102));
        btnKeluar1.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnKeluar1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.default.hoverBorderColor"));
        btnKeluar1.setText("Keluar");
        btnKeluar1.setMargin(new java.awt.Insets(3, 5, 3, 5));
        btnKeluar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCari1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCari1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKeluar1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCari1)
                    .addComponent(txtCari1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal1)
                    .addComponent(btnKeluar1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCari1ActionPerformed
        // Mencari Data
        try{
            sql = "SELECT * FROM tbdatahandphone WHERE Merk LIKE '%"+txtCari1.getText()+"%'";
            rs = stat.executeQuery(sql);
            tblHp1.setModel(DbUtils.resultSetToTableModel(rs));            
        }catch (Exception e){
            
        }        
    }//GEN-LAST:event_btnCari1ActionPerformed

    private void btnBatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatal1ActionPerformed
        // untuk membersihkan form
        reset();
        tampilData();
    }//GEN-LAST:event_btnBatal1ActionPerformed

    private void btnKeluar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluar1ActionPerformed
        // keluar dari program
        int ok=JOptionPane.showConfirmDialog(null,"Apakah Yakin Ingin Keluar dari Halaman Pelanggan??", "Confirmation",JOptionPane.YES_NO_OPTION);
        if(ok==0)
        {
            dispose();
        }
    }//GEN-LAST:event_btnKeluar1ActionPerformed

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
            java.util.logging.Logger.getLogger(menuPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal1;
    private javax.swing.JButton btnCari1;
    private javax.swing.JButton btnKeluar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblHp1;
    private javax.swing.JTextField txtCari1;
    // End of variables declaration//GEN-END:variables
}
