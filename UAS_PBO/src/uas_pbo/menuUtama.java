package uas_pbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class menuUtama extends javax.swing.JFrame {
    // deklarasi
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    
    public menuUtama() {
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
        cbMerk.setSelectedItem("Samsung");
        txtSeri.setText("");
        txtBaterai.setText("");
        txtHarga.setText("");
        txtStok.setText("");
        rdRam.clearSelection();
    }
    
    //Method untuk menampilkan data ke database
    private void tampilData(){
        try{
            sql = "SELECT * FROM tbdatahandphone";
            rs = stat.executeQuery(sql);
            tblHp.setModel(DbUtils.resultSetToTableModel(rs));
        }catch (Exception e){
            
        }
    }
    
    //Untuk menampilkan data yang diklik di tabel ke dalam form
    private void klikData() {
        String a = tblHp.getValueAt(tblHp.getSelectedRow(), 1).toString();
        cbMerk.setSelectedItem(a);
        String b = tblHp.getValueAt(tblHp.getSelectedRow(), 2).toString();
        txtSeri.setText(b);
        String ram = (String) tblHp.getValueAt(tblHp.getSelectedRow(), 3);
        if (ram.equals("4 GB")){
            rb4GB.setSelected(true);
            rb8GB.setSelected(false);
            rb16GB.setSelected(false);
        } else if (ram.equals("8 GB")){
            rb4GB.setSelected(false);
            rb8GB.setSelected(true);
            rb16GB.setSelected(false);
        } else if (ram.equals("16 GB")){
            rb4GB.setSelected(false);
            rb8GB.setSelected(false);
            rb16GB.setSelected(true);
        }
        String d = tblHp.getValueAt(tblHp.getSelectedRow(), 4).toString();
        txtBaterai.setText(d);
        String e = tblHp.getValueAt(tblHp.getSelectedRow(), 5).toString();
        txtHarga.setText(e);
        String f = tblHp.getValueAt(tblHp.getSelectedRow(), 6).toString();
        txtStok.setText(f);   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        rdRam = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbMerk = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rb4GB = new javax.swing.JRadioButton();
        rb8GB = new javax.swing.JRadioButton();
        rb16GB = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtBaterai = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSeri = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHp = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Centaur", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("APLIKASI PENJUALAN HANDPHONE");

        txtStok.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        txtStok.setFont(new java.awt.Font("Centaur", 0, 15)); // NOI18N
        txtStok.setForeground(new java.awt.Color(0, 0, 51));
        txtStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStokActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Merk ");

        cbMerk.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        cbMerk.setFont(new java.awt.Font("Centaur", 0, 15)); // NOI18N
        cbMerk.setForeground(new java.awt.Color(0, 0, 102));
        cbMerk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Samsung", "Oppo", "Vivo", "Apple", "Xiaomi" }));

        jLabel3.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Seri");

        jLabel4.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("RAM");

        rdRam.add(rb4GB);
        rb4GB.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        rb4GB.setForeground(new java.awt.Color(0, 0, 102));
        rb4GB.setText("4 GB");

        rdRam.add(rb8GB);
        rb8GB.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        rb8GB.setForeground(new java.awt.Color(0, 0, 102));
        rb8GB.setText("8 GB");

        rdRam.add(rb16GB);
        rb16GB.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        rb16GB.setForeground(new java.awt.Color(0, 0, 102));
        rb16GB.setText("16 GB");

        jLabel5.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Baterai");

        txtBaterai.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        txtBaterai.setFont(new java.awt.Font("Centaur", 0, 15)); // NOI18N
        txtBaterai.setForeground(new java.awt.Color(0, 0, 51));

        jLabel6.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Stok");

        jLabel7.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Harga       Rp");

        txtSeri.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        txtSeri.setFont(new java.awt.Font("Centaur", 0, 15)); // NOI18N
        txtSeri.setForeground(new java.awt.Color(0, 0, 51));

        txtHarga.setBackground(java.awt.SystemColor.inactiveCaptionBorder);
        txtHarga.setFont(new java.awt.Font("Centaur", 0, 15)); // NOI18N
        txtHarga.setForeground(new java.awt.Color(0, 0, 51));

        btnTambah.setBackground(new java.awt.Color(0, 51, 102));
        btnTambah.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnTambah.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.default.hoverBorderColor"));
        btnTambah.setText("Tambah");
        btnTambah.setMargin(new java.awt.Insets(3, 5, 3, 5));
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnCari.setBackground(new java.awt.Color(0, 51, 102));
        btnCari.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnCari.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.default.hoverBorderColor"));
        btnCari.setText("Cari");
        btnCari.setMargin(new java.awt.Insets(3, 5, 3, 5));
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnUbah.setBackground(new java.awt.Color(0, 51, 102));
        btnUbah.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnUbah.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.default.hoverBorderColor"));
        btnUbah.setText("Ubah");
        btnUbah.setMargin(new java.awt.Insets(3, 5, 3, 5));
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(0, 51, 102));
        btnHapus.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnHapus.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.default.hoverBorderColor"));
        btnHapus.setText("Hapus");
        btnHapus.setMargin(new java.awt.Insets(3, 5, 3, 5));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(0, 51, 102));
        btnBatal.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnBatal.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.default.hoverBorderColor"));
        btnBatal.setText("Batal");
        btnBatal.setMargin(new java.awt.Insets(3, 5, 3, 5));
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnKeluar.setBackground(new java.awt.Color(0, 51, 102));
        btnKeluar.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        btnKeluar.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.default.hoverBorderColor"));
        btnKeluar.setText("Keluar");
        btnKeluar.setMargin(new java.awt.Insets(3, 5, 3, 5));
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        tblHp.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        tblHp.setModel(new javax.swing.table.DefaultTableModel(
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
        tblHp.setShowVerticalLines(true);
        tblHp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHpMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblHp);

        jLabel8.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("mAh");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbMerk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSeri))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rb4GB)
                                .addGap(6, 6, 6)
                                .addComponent(rb8GB)
                                .addGap(6, 6, 6)
                                .addComponent(rb16GB))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtBaterai, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtStok, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(txtHarga)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addComponent(txtSeri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(rb4GB)
                    .addComponent(rb8GB)
                    .addComponent(rb16GB)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTambah)
                        .addComponent(btnUbah)
                        .addComponent(btnHapus)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5))
                            .addComponent(txtBaterai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCari)
                            .addComponent(btnBatal)
                            .addComponent(btnKeluar)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // Menambahkan Data ke dalam database
        String ram="";
        if (rb4GB.isSelected()){
             ram = rb4GB.getText();
        }else if (rb8GB.isSelected()){
             ram = rb8GB.getText();
        }else if (rb16GB.isSelected()){
            ram = rb16GB.getText();
        }
        
        try {
            sql = "INSERT into tbdatahandphone (Merk, Seri, RAM, Baterai, Harga, Stok) VALUES ('"+cbMerk.getSelectedItem()+"','"+txtSeri.getText()+"','"+ram+"','"+txtBaterai.getText()+" mAh','Rp "+txtHarga.getText()+"',"+txtStok.getText()+")";
            stat.executeUpdate(sql);
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbapkhandphone", "root", "");
            stat = con.createStatement();
            JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
            tampilData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error : " + e.getMessage());
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStokActionPerformed

    }//GEN-LAST:event_txtStokActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // Mengubah Data
        String ram="";
        if (rb4GB.isSelected()){
             ram = rb4GB.getText();
        }else if (rb8GB.isSelected()){
             ram = rb8GB.getText();
        }else if (rb16GB.isSelected()){
            ram = rb16GB.getText();
        }
        
        try {
            sql = "UPDATE tbdatahandphone SET Merk = '"+cbMerk.getSelectedItem()+"', Seri = '"+txtSeri.getText()+"', RAM = '"+ram+"', Baterai = '"+txtBaterai.getText()+"', Harga = 'Rp "+txtHarga.getText()+"', Stok = "+txtStok.getText()+" WHERE No = '"+tblHp.getValueAt( tblHp.getSelectedRow(), 0)+"'";
            stat.executeUpdate(sql);
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbapkhandphone", "root", "");
            stat = con.createStatement();
            JOptionPane.showMessageDialog(null,"Data Berhasil Diubah");
            tampilData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error : " + e.getMessage());
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void tblHpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHpMouseClicked
        // memanggil method yang menampilkan data selection di tabel ke dalam form
        klikData();
    }//GEN-LAST:event_tblHpMouseClicked

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // keluar dari program
        int ok=JOptionPane.showConfirmDialog(null,"Apakah Yakin Ingin Keluar dari Halaman Admin??", "Confirmation",JOptionPane.YES_NO_OPTION);
        if(ok==0)
        {
            dispose();
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // untuk membersihkan form
        reset();
        tampilData();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // Menghapus Data
        int ok=JOptionPane.showConfirmDialog(null,"Apakah Yakin Menghapus Data"+ cbMerk.getSelectedItem()+" "+txtSeri.getText()+" ini??", "Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0)
        {
            try{
                String sql ="DELETE from tbdatahandphone where No = "+tblHp.getValueAt( tblHp.getSelectedRow(), 0);
                stat.executeUpdate(sql);
                con = DriverManager.getConnection("jdbc:mysql://localhost/dbapkhandphone", "root", "");
                stat = con.createStatement();
                JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
                tampilData();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
            }
       }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // Mencari Data
        try{
            sql = "SELECT * FROM tbdatahandphone WHERE Merk LIKE '%"+cbMerk.getSelectedItem()+"%'";
            rs = stat.executeQuery(sql);
            tblHp.setModel(DbUtils.resultSetToTableModel(rs));            
        }catch (Exception e){
            
        }
    }//GEN-LAST:event_btnCariActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cbMerk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rb16GB;
    private javax.swing.JRadioButton rb4GB;
    private javax.swing.JRadioButton rb8GB;
    private javax.swing.ButtonGroup rdRam;
    private javax.swing.JTable tblHp;
    private javax.swing.JTextField txtBaterai;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtSeri;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
}
