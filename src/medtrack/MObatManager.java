package medtrack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MObatManager extends javax.swing.JFrame {
    private Connection connection;
    
    public MObatManager() {
        initComponents();
        connection = KoneksiApo.getKoneksi();
        tampilData();
    }
    
    public void setIdManagerLabel(String id_mana) {
        idManagerLabel.setText(id_mana);
    }
    
    public void tampilData() {
        DefaultTableModel model = new DefaultTableModel(
            new Object[]{"ID Obat", "Nama Obat", "ID Kategori", "Jumlah Obat", "Tgl. Kadaluarsa"}, 0
        );
        tabelMS1.setModel(model);

        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM obat";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String kolom1 = resultSet.getString("id_obat"); 
                String kolom2 = resultSet.getString("nama_obat"); 
                String kolom3 = resultSet.getString("id_kategori"); 
                String kolom4 = resultSet.getString("jumlah_obat"); 
                String kolom5 = resultSet.getString("tgl_kadaluarsa"); 
                
                model.addRow(new Object[]{kolom1, kolom2, kolom3, kolom4, kolom5});
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal mendapatkan data dari database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //SORTING KADALUARSA
    public void sortingKadaluarsa(String tanggal) {
    DefaultTableModel model = new DefaultTableModel(
        new Object[]{"ID Obat", "Nama Obat", "ID Kategori", "Jumlah Obat", "Tgl. Kadaluarsa"}, 0
    );
    tabelMS1.setModel(model);

    try {
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM obat ORDER BY " + tanggal;
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            String kolom1 = resultSet.getString("id_obat"); 
            String kolom2 = resultSet.getString("nama_obat"); 
            String kolom3 = resultSet.getString("id_kategori"); 
            String kolom4 = resultSet.getString("jumlah_obat"); 
            String kolom5 = resultSet.getString("tgl_kadaluarsa"); 
            
            model.addRow(new Object[]{kolom1, kolom2, kolom3, kolom4, kolom5});
        }

        resultSet.close();
        statement.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal mendapatkan data dari database.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
     // SORTING ID OBAT
    public void sortingObat(String id_obat) {
        DefaultTableModel model = new DefaultTableModel(
            new Object[]{"ID Obat", "Nama Obat", "ID Kategori", "Jumlah Obat", "Tgl. Kadaluarsa"}, 0
        );
        tabelMS1.setModel(model);

        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM obat ORDER BY id_obat";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String kolom1 = resultSet.getString("id_obat"); 
                String kolom2 = resultSet.getString("nama_obat"); 
                String kolom3 = resultSet.getString("id_kategori"); 
                String kolom4 = resultSet.getString("jumlah_obat"); 
                String kolom5 = resultSet.getString("tgl_kadaluarsa"); 
            
                model.addRow(new Object[]{kolom1, kolom2, kolom3, kolom4, kolom5});
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal mendapatkan data dari database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // SORTING JUMLAH OBAT
    public void sortingStock(String jumlah_obat) {
        DefaultTableModel model = new DefaultTableModel(
            new Object[]{"ID Obat", "Nama Obat", "ID Kategori", "Jumlah Obat", "Tgl. Kadaluarsa"}, 0
        );
        tabelMS1.setModel(model);

        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM obat ORDER BY jumlah_obat";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String kolom1 = resultSet.getString("id_obat");
                String kolom2 = resultSet.getString("nama_obat");
                String kolom3 = resultSet.getString("id_kategori");
                String kolom4 = resultSet.getString("jumlah_obat");
                String kolom5 = resultSet.getString("tgl_kadaluarsa");

                model.addRow(new Object[]{kolom1, kolom2, kolom3, kolom4, kolom5});
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal mendapatkan data dari database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    // PENCARIAN NAMA OBAT
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPanel = new javax.swing.JPanel();
        menupanelMD = new javax.swing.JPanel();
        medtrackPanelMD = new javax.swing.JPanel();
        managerLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idManagerLabel = new javax.swing.JLabel();
        btnMD = new javax.swing.JButton();
        btnStatistik = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        mainpanelMD = new javax.swing.JPanel();
        judulMD = new javax.swing.JLabel();
        urutkanMD = new javax.swing.JLabel();
        kadaluarsaMD = new javax.swing.JButton();
        idObatMD = new javax.swing.JButton();
        stockMD = new javax.swing.JButton();
        tabelManagementSupplier1 = new javax.swing.JScrollPane();
        tabelMS1 = new javax.swing.JTable();
        cariMD = new javax.swing.JTextField();
        cariLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1023));

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));

        menupanelMD.setBackground(new java.awt.Color(0, 93, 146));

        medtrackPanelMD.setBackground(new java.awt.Color(255, 255, 255));
        medtrackPanelMD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        medtrackPanelMD.setFocusCycleRoot(true);

        managerLabel.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        managerLabel.setText("Manager");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medtrackicon/medtrack.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconmedtrack/icons8-administrator-male-94.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout medtrackPanelMDLayout = new javax.swing.GroupLayout(medtrackPanelMD);
        medtrackPanelMD.setLayout(medtrackPanelMDLayout);
        medtrackPanelMDLayout.setHorizontalGroup(
            medtrackPanelMDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medtrackPanelMDLayout.createSequentialGroup()
                .addGroup(medtrackPanelMDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, medtrackPanelMDLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(medtrackPanelMDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(managerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idManagerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, medtrackPanelMDLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        medtrackPanelMDLayout.setVerticalGroup(
            medtrackPanelMDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medtrackPanelMDLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(medtrackPanelMDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(medtrackPanelMDLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                    .addGroup(medtrackPanelMDLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(managerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idManagerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        btnMD.setBackground(new java.awt.Color(52, 152, 219));
        btnMD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMD.setForeground(new java.awt.Color(255, 255, 255));
        btnMD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/medicine-icon-29791.png"))); // NOI18N
        btnMD.setText("Management Data");
        btnMD.setIconTextGap(20);
        btnMD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMDActionPerformed(evt);
            }
        });

        btnStatistik.setBackground(new java.awt.Color(0, 93, 146));
        btnStatistik.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnStatistik.setForeground(new java.awt.Color(255, 255, 255));
        btnStatistik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transaksi.png"))); // NOI18N
        btnStatistik.setText("Statistik Data");
        btnStatistik.setIconTextGap(20);
        btnStatistik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatistikActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(204, 204, 204));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setIconTextGap(10);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menupanelMDLayout = new javax.swing.GroupLayout(menupanelMD);
        menupanelMD.setLayout(menupanelMDLayout);
        menupanelMDLayout.setHorizontalGroup(
            menupanelMDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelMDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menupanelMDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStatistik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medtrackPanelMD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(menupanelMDLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        menupanelMDLayout.setVerticalGroup(
            menupanelMDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelMDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(medtrackPanelMD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMD, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStatistik, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(352, Short.MAX_VALUE))
        );

        mainpanelMD.setBackground(new java.awt.Color(255, 255, 255));

        judulMD.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        judulMD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulMD.setText("Management Data");

        urutkanMD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        urutkanMD.setText("Urutkan");

        kadaluarsaMD.setBackground(new java.awt.Color(46, 204, 113));
        kadaluarsaMD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kadaluarsaMD.setForeground(new java.awt.Color(255, 255, 255));
        kadaluarsaMD.setText("Kadaluarsa");
        kadaluarsaMD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kadaluarsaMDActionPerformed(evt);
            }
        });

        idObatMD.setBackground(new java.awt.Color(46, 204, 113));
        idObatMD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idObatMD.setForeground(new java.awt.Color(255, 255, 255));
        idObatMD.setText("id_obat");
        idObatMD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idObatMDActionPerformed(evt);
            }
        });

        stockMD.setBackground(new java.awt.Color(46, 204, 113));
        stockMD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stockMD.setForeground(new java.awt.Color(255, 255, 255));
        stockMD.setText("Stock");
        stockMD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockMDActionPerformed(evt);
            }
        });

        tabelMS1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID OBAT", "NAMA OBAT", "ID KATEGORI", "JUMLAH", "KADALUARSA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelManagementSupplier1.setViewportView(tabelMS1);

        cariMD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariMDActionPerformed(evt);
            }
        });
        cariMD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariMDKeyReleased(evt);
            }
        });

        cariLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cariLabel.setText("Cari");

        javax.swing.GroupLayout mainpanelMDLayout = new javax.swing.GroupLayout(mainpanelMD);
        mainpanelMD.setLayout(mainpanelMDLayout);
        mainpanelMDLayout.setHorizontalGroup(
            mainpanelMDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelMDLayout.createSequentialGroup()
                .addGroup(mainpanelMDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelMDLayout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addGroup(mainpanelMDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cariLabel)
                            .addComponent(urutkanMD))
                        .addGap(58, 58, 58)
                        .addGroup(mainpanelMDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainpanelMDLayout.createSequentialGroup()
                                .addComponent(kadaluarsaMD, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(idObatMD, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(stockMD, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cariMD, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelMDLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(judulMD, javax.swing.GroupLayout.PREFERRED_SIZE, 1042, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelMDLayout.createSequentialGroup()
                .addGap(0, 137, Short.MAX_VALUE)
                .addComponent(tabelManagementSupplier1, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        mainpanelMDLayout.setVerticalGroup(
            mainpanelMDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelMDLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(judulMD, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(mainpanelMDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cariMD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cariLabel))
                .addGap(18, 18, 18)
                .addGroup(mainpanelMDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelMDLayout.createSequentialGroup()
                        .addComponent(urutkanMD)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(idObatMD, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(stockMD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kadaluarsaMD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(tabelManagementSupplier1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(381, 381, 381))
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
            .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bodyPanelLayout.createSequentialGroup()
                    .addComponent(menupanelMD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1610, Short.MAX_VALUE)))
            .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                    .addGap(0, 720, Short.MAX_VALUE)
                    .addComponent(mainpanelMD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1038, Short.MAX_VALUE)
            .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bodyPanelLayout.createSequentialGroup()
                    .addComponent(menupanelMD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bodyPanelLayout.createSequentialGroup()
                    .addComponent(mainpanelMD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMDActionPerformed
        // TODO add your handling code here:
        new MObatManager().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMDActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int dialogBtn = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin akan keluar?", "PERINGATAN", dialogBtn);
        
        if(dialogResult==0){
            //True condition
            System.exit(0);
            new LoginAs().setVisible(true);
        }else{
            //False condition
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    public void cariDataTP() {
    DefaultTableModel model = new DefaultTableModel(
        new Object[]{"ID Obat", "Nama Obat", "ID Kategori", "Jumlah Obat", "Tgl. Kadaluarsa"}, 0
    );
    tabelMS1.setModel(model);
    // Memanggil method koneksi untuk mendapatkan objek Connection
    Connection conn = KoneksiApo.getKoneksi();
    
    int jumlahRow = tabelMS1.getRowCount();
        for (int n=0; n<jumlahRow; n++){
            model.removeRow(0);
        }
     String cari = cariMD.getText();
    
    try {
            String query = "SELECT * FROM obat WHERE nama_obat LIKE '%"+ cari +"%'";
            PreparedStatement stmt = conn.prepareStatement(query);
            // Menjalankan query SQL untuk mengambil data dari tabel transaksi_pembelian
            ResultSet rs = stmt.executeQuery();
       
        while (rs.next()) {
            String kolom1 = rs.getString("id_obat");
            String kolom2 = rs.getString("nama_obat");
            String kolom3 = rs.getString("id_kategori");
            String kolom4 = rs.getString("jumlah_obat");
            String kolom5 = rs.getString("tgl_kadaluarsa");
            
            // Menambahkan baris baru ke dalam tabel
            model.addRow(new Object[]{kolom1, kolom2, kolom3, kolom4, kolom5});
        }
    } catch (SQLException e) {
       System.out.print(e.getMessage());
    }
}

    
    private void btnStatistikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatistikActionPerformed
        // TODO add your handling code here:
        new StatistikData().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnStatistikActionPerformed

    private void kadaluarsaMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kadaluarsaMDActionPerformed
        // TODO add your handling code here:
        sortingKadaluarsa("tgl_kadaluarsa");
    }//GEN-LAST:event_kadaluarsaMDActionPerformed

    private void idObatMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idObatMDActionPerformed
        // TODO add your handling code here:
        sortingObat("id_obat");
    }//GEN-LAST:event_idObatMDActionPerformed

    private void stockMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockMDActionPerformed
        // TODO add your handling code here:
        sortingStock("jumlah_obat");
    }//GEN-LAST:event_stockMDActionPerformed

    private void cariMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariMDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariMDActionPerformed

    private void cariMDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariMDKeyReleased
       cariDataTP();
    }//GEN-LAST:event_cariMDKeyReleased

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
            java.util.logging.Logger.getLogger(MObatManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MObatManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MObatManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MObatManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MObatManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMD;
    private javax.swing.JButton btnStatistik;
    private javax.swing.JLabel cariLabel;
    private javax.swing.JTextField cariMD;
    private javax.swing.JLabel idManagerLabel;
    private javax.swing.JButton idObatMD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel judulMD;
    private javax.swing.JButton kadaluarsaMD;
    private javax.swing.JPanel mainpanelMD;
    private javax.swing.JLabel managerLabel;
    private javax.swing.JPanel medtrackPanelMD;
    private javax.swing.JPanel menupanelMD;
    private javax.swing.JButton stockMD;
    private javax.swing.JTable tabelMS1;
    private javax.swing.JScrollPane tabelManagementSupplier1;
    private javax.swing.JLabel urutkanMD;
    // End of variables declaration//GEN-END:variables

}
