package medtrack;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; 
import java.sql.SQLException;
import java.sql.Date;
import java.awt.event.KeyEvent;


public class MObatApoteker extends javax.swing.JFrame {
    private Connection connection;

    /**
     * Creates new form MObatApoteker
     */
    public MObatApoteker() {
        initComponents();
        connection = KoneksiApo.getKoneksi();
        fetchData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        cariLabel = new javax.swing.JLabel();
        cariMO = new javax.swing.JTextField();
        judulLabel = new javax.swing.JLabel();
        RiwayatTabel = new javax.swing.JScrollPane();
        RiwayatTable = new javax.swing.JTable();
        btnKadaluarsa = new javax.swing.JButton();
        btnStock = new javax.swing.JButton();
        btnKategori = new javax.swing.JButton();
        editPanel = new javax.swing.JPanel();
        TambahBtn = new javax.swing.JButton();
        idObat = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idObat1 = new javax.swing.JLabel();
        idObat2 = new javax.swing.JLabel();
        idObat3 = new javax.swing.JLabel();
        idObat4 = new javax.swing.JLabel();
        idObat7 = new javax.swing.JLabel();
        id_obatField = new javax.swing.JTextField();
        nama_obatField = new javax.swing.JTextField();
        tgl_kadaluarsaField = new javax.swing.JTextField();
        id_suplierField = new javax.swing.JTextField();
        idKategoriField = new javax.swing.JTextField();
        EditBtn1 = new javax.swing.JButton();
        HpsBtn = new javax.swing.JButton();
        ReserBtn = new javax.swing.JButton();
        jumlah_obatField = new javax.swing.JTextField();
        urutkanLabel = new javax.swing.JLabel();
        menuPanelTP = new javax.swing.JPanel();
        idTPPanel = new javax.swing.JPanel();
        ApoLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        TransaksiBtn = new javax.swing.JButton();
        ManagemenObatBtn = new javax.swing.JButton();
        ManagemenSupplierBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1920, 1023));

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        cariLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cariLabel.setText("Cari");

        cariMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariMOActionPerformed(evt);
            }
        });
        cariMO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariMOKeyReleased(evt);
            }
        });

        judulLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        judulLabel.setText("Management Obat");

        RiwayatTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID OBAT", "NAMA OBAT", "ID KATEGORI", "JUMLAH ", "KADALUARSA", "ID SUPPLIER"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        RiwayatTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                RiwayatTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        RiwayatTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RiwayatTableMouseClicked(evt);
            }
        });
        RiwayatTabel.setViewportView(RiwayatTable);

        btnKadaluarsa.setBackground(new java.awt.Color(46, 204, 113));
        btnKadaluarsa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKadaluarsa.setForeground(new java.awt.Color(255, 255, 255));
        btnKadaluarsa.setText("Kadaluarsa");
        btnKadaluarsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKadaluarsaActionPerformed(evt);
            }
        });

        btnStock.setBackground(new java.awt.Color(46, 204, 113));
        btnStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnStock.setForeground(new java.awt.Color(255, 255, 255));
        btnStock.setText("Stok");
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });

        btnKategori.setBackground(new java.awt.Color(46, 204, 113));
        btnKategori.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKategori.setForeground(new java.awt.Color(255, 255, 255));
        btnKategori.setText("Kategori");
        btnKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKategoriActionPerformed(evt);
            }
        });

        editPanel.setBackground(new java.awt.Color(255, 255, 255));

        TambahBtn.setBackground(new java.awt.Color(102, 204, 255));
        TambahBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TambahBtn.setText("Tambah");
        TambahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahBtnActionPerformed(evt);
            }
        });

        idObat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idObat.setText("NAMA OBAT");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Tambah Data Obat");

        idObat1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idObat1.setText("ID OBAT");

        idObat2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idObat2.setText("JUMLAH");

        idObat3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idObat3.setText("TGL KADALUARSA");

        idObat4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idObat4.setText("ID SUPPLIER");

        idObat7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idObat7.setText("ID KATEGORI");

        id_obatField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_obatFieldActionPerformed(evt);
            }
        });
        id_obatField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_obatFieldKeyPressed(evt);
            }
        });

        nama_obatField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_obatFieldActionPerformed(evt);
            }
        });
        nama_obatField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nama_obatFieldKeyPressed(evt);
            }
        });

        tgl_kadaluarsaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgl_kadaluarsaFieldActionPerformed(evt);
            }
        });
        tgl_kadaluarsaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tgl_kadaluarsaFieldKeyPressed(evt);
            }
        });

        id_suplierField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_suplierFieldActionPerformed(evt);
            }
        });

        idKategoriField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idKategoriFieldActionPerformed(evt);
            }
        });
        idKategoriField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKategoriFieldKeyPressed(evt);
            }
        });

        EditBtn1.setBackground(new java.awt.Color(102, 204, 255));
        EditBtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditBtn1.setText("Edit");
        EditBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtn1ActionPerformed(evt);
            }
        });

        HpsBtn.setBackground(new java.awt.Color(102, 204, 255));
        HpsBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HpsBtn.setText("Hapus");
        HpsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HpsBtnActionPerformed(evt);
            }
        });

        ReserBtn.setBackground(new java.awt.Color(102, 204, 255));
        ReserBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ReserBtn.setText("Reset");
        ReserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserBtnActionPerformed(evt);
            }
        });

        jumlah_obatField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah_obatFieldActionPerformed(evt);
            }
        });
        jumlah_obatField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jumlah_obatFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel7))
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editPanelLayout.createSequentialGroup()
                                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(editPanelLayout.createSequentialGroup()
                                        .addComponent(idObat3)
                                        .addGap(125, 125, 125))
                                    .addGroup(editPanelLayout.createSequentialGroup()
                                        .addComponent(TambahBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                        .addComponent(EditBtn1)
                                        .addGap(18, 18, 18)
                                        .addComponent(HpsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addComponent(ReserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(idObat4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(editPanelLayout.createSequentialGroup()
                                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idObat1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idObat, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idObat7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idObat2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(id_suplierField, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(tgl_kadaluarsaField)
                                    .addComponent(idKategoriField)
                                    .addComponent(jumlah_obatField)
                                    .addComponent(nama_obatField)
                                    .addComponent(id_obatField))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idObat1)
                    .addComponent(id_obatField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama_obatField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idObat))
                .addGap(18, 18, 18)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idObat2)
                    .addComponent(jumlah_obatField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idObat7)
                    .addComponent(idKategoriField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tgl_kadaluarsaField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idObat3))
                .addGap(18, 18, 18)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_suplierField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idObat4))
                .addGap(44, 44, 44)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TambahBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HpsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        urutkanLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        urutkanLabel.setText("Urutkan");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(urutkanLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnKadaluarsa)
                                        .addGap(48, 48, 48)
                                        .addComponent(btnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(btnKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(cariLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(cariMO, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(RiwayatTabel, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(judulLabel)))
                .addContainerGap(511, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(judulLabel)
                .addGap(60, 60, 60)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cariMO, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cariLabel))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(urutkanLabel)
                            .addComponent(btnKadaluarsa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStock)
                            .addComponent(btnKategori))
                        .addGap(19, 19, 19)
                        .addComponent(RiwayatTabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(405, 405, 405))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        menuPanelTP.setBackground(new java.awt.Color(0, 93, 146));

        idTPPanel.setBackground(new java.awt.Color(0, 93, 146));
        idTPPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ApoLabel.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        ApoLabel.setForeground(new java.awt.Color(255, 255, 255));
        ApoLabel.setText("Apoteker A");

        idLabel.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText("ID Karyawan");

        javax.swing.GroupLayout idTPPanelLayout = new javax.swing.GroupLayout(idTPPanel);
        idTPPanel.setLayout(idTPPanelLayout);
        idTPPanelLayout.setHorizontalGroup(
            idTPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idTPPanelLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(idTPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel)
                    .addComponent(ApoLabel))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        idTPPanelLayout.setVerticalGroup(
            idTPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idTPPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ApoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        TransaksiBtn.setBackground(new java.awt.Color(0, 93, 146));
        TransaksiBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TransaksiBtn.setForeground(new java.awt.Color(255, 255, 255));
        TransaksiBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transaksi.png"))); // NOI18N
        TransaksiBtn.setText("Transaksi");
        TransaksiBtn.setIconTextGap(20);
        TransaksiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransaksiBtnActionPerformed(evt);
            }
        });

        ManagemenObatBtn.setBackground(new java.awt.Color(52, 152, 219));
        ManagemenObatBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ManagemenObatBtn.setForeground(new java.awt.Color(255, 255, 255));
        ManagemenObatBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/medicine-icon-29791.png"))); // NOI18N
        ManagemenObatBtn.setText("Management Obat");
        ManagemenObatBtn.setIconTextGap(20);
        ManagemenObatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagemenObatBtnActionPerformed(evt);
            }
        });

        ManagemenSupplierBtn.setBackground(new java.awt.Color(0, 93, 146));
        ManagemenSupplierBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ManagemenSupplierBtn.setForeground(new java.awt.Color(255, 255, 255));
        ManagemenSupplierBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/supplier.png"))); // NOI18N
        ManagemenSupplierBtn.setText("Managemen Supplier");
        ManagemenSupplierBtn.setIconTextGap(20);
        ManagemenSupplierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagemenSupplierBtnActionPerformed(evt);
            }
        });

        LogoutBtn.setBackground(new java.awt.Color(204, 204, 204));
        LogoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        LogoutBtn.setText("Logout");
        LogoutBtn.setFocusable(false);
        LogoutBtn.setIconTextGap(10);
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        logoLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medtrackicon/medtrack.png"))); // NOI18N
        logoLabel.setText("MedTrack");

        javax.swing.GroupLayout menuPanelTPLayout = new javax.swing.GroupLayout(menuPanelTP);
        menuPanelTP.setLayout(menuPanelTPLayout);
        menuPanelTPLayout.setHorizontalGroup(
            menuPanelTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(idTPPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelTPLayout.createSequentialGroup()
                .addGroup(menuPanelTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelTPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menuPanelTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ManagemenObatBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TransaksiBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ManagemenSupplierBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(menuPanelTPLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(menuPanelTPLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelTPLayout.setVerticalGroup(
            menuPanelTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelTPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idTPPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(ManagemenObatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TransaksiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ManagemenSupplierBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(menuPanelTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuPanelTP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void fetchData() {
        try {
            // Membuat objek PreparedStatement untuk menjalankan query SQL
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM obat");

            // Menjalankan query SQL untuk mengambil data dari tabel transaksi_pembelian
            ResultSet rs = stmt.executeQuery();

            // Mendapatkan model tabel dari JTable
            DefaultTableModel model = new DefaultTableModel();

             // Menambahkan kolom-kolom pada model tabel
            model.addColumn("ID OBAT");
            model.addColumn("NAMA OBAT");
            model.addColumn("ID KATEGORI");
            model.addColumn("JUMLAH OBAT");
            model.addColumn("KADALUARSA");
            model.addColumn("ID SUPPLIER");

            // Menghapus semua baris yang ada pada tabel
            model.setRowCount(0);

            // Iterasi melalui hasil query dan menambahkan data ke dalam tabel
            while (rs.next()) {
                String id_obat = rs.getString("id_obat");
                String nama_obat = rs.getString("nama_obat");
                String id_kategori = rs.getString("id_kategori");
                int jumlah_obat = rs.getInt("jumlah_obat");
                String tgl_kadaluarsa = rs.getString("tgl_kadaluarsa");
                String id_supplier = rs.getString("id_supplier");

                // Menambahkan baris baru ke dalam tabel
                model.addRow(new Object[]{id_obat, nama_obat, id_kategori,jumlah_obat,tgl_kadaluarsa,id_supplier });
            }

            // Mengatur model tabel pada komponen JTable
            RiwayatTable.setModel(model);

            // Menutup objek ResultSet dan PreparedStatement
            rs.close();
            stmt.close();
    } catch (SQLException e) {
            // Menampilkan pesan error jika terjadi kesalahan
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
        }
}
    //SORTING KADALUARSA
    public void sortingKadaluarsa(String tgl_kadaluarsa) {
    DefaultTableModel model = new DefaultTableModel(
        new Object[]{"ID OBAT", "NAMA OBAT", "ID KATEGORI", "JUMLAH OBAT", "KADALUARSA", "ID SUPPLIER"}, 0
    );
    RiwayatTable.setModel(model);

    try {
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM obat ORDER BY " + tgl_kadaluarsa;
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            String kolom1 = resultSet.getString("id_obat"); 
            String kolom2 = resultSet.getString("nama_obat"); 
            String kolom3 = resultSet.getString("id_kategori"); 
            int kolom4 = resultSet.getInt("jumlah_obat");
            String kolom5 = resultSet.getString("tgl_kadaluarsa"); 
            String kolom6 = resultSet.getString("id_supplier"); 

            model.addRow(new Object[]{kolom1, kolom2, kolom3, kolom4, kolom5, kolom6});
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
            new Object[]{"ID OBAT", "NAMA OBAT", "ID KATEGORI", "JUMLAH OBAT", "KADALUARSA", "ID SUPPLIER"}, 0
        );
        RiwayatTable.setModel(model);

        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM obat ORDER BY jumlah_obat";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String kolom1 = resultSet.getString("id_obat"); 
                String kolom2 = resultSet.getString("nama_obat"); 
                String kolom3 = resultSet.getString("id_kategori"); 
                int kolom4 = resultSet.getInt("jumlah_obat");
                String kolom5 = resultSet.getString("tgl_kadaluarsa"); 
                String kolom6 = resultSet.getString("id_supplier"); 

            model.addRow(new Object[]{kolom1, kolom2, kolom3, kolom4, kolom5, kolom6});
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal mendapatkan data dari database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // SORTING KATEGORI OBAT
    public void sortingKategori(String id_kategori) {
        DefaultTableModel model = new DefaultTableModel(
            new Object[]{"ID OBAT", "NAMA OBAT", "ID KATEGORI", "JUMLAH OBAT", "KADALUARSA", "ID SUPPLIER"}, 0
        );
        RiwayatTable.setModel(model);

        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM obat ORDER BY id_kategori";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String kolom1 = resultSet.getString("id_obat"); 
                String kolom2 = resultSet.getString("nama_obat"); 
                String kolom3 = resultSet.getString("id_kategori"); 
                int kolom4 = resultSet.getInt("jumlah_obat");
                String kolom5 = resultSet.getString("tgl_kadaluarsa"); 
                String kolom6 = resultSet.getString("id_supplier"); 

            model.addRow(new Object[]{kolom1, kolom2, kolom3, kolom4, kolom5, kolom6});
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal mendapatkan data dari database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // PENCARIAN NAMA OBAT
    public void cariDataMO() {
        DefaultTableModel model = new DefaultTableModel(
            new Object[]{"ID OBAT", "NAMA OBAT", "ID KATEGORI", "JUMLAH OBAT", "KADALUARSA", "ID SUPPLIER"}, 0
        );
        RiwayatTable.setModel(model);   
        // Memanggil method koneksi untuk mendapatkan objek Connection
        Connection conn = KoneksiApo.getKoneksi();
        int jumlahRow = RiwayatTable.getRowCount();
        for (int n=0; n<jumlahRow; n++){
            model.removeRow(0);
        }
        String cari = cariMO.getText();
        try{
            String query = "SELECT * FROM obat WHERE nama_obat LIKE '%"+ cari +"%'";
            PreparedStatement stmt = conn.prepareStatement(query);
            // Menjalankan query SQL untuk mengambil data dari tabel transaksi_pembelian
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                String id_obat = rs.getString("id_obat");
                String nama_obat = rs.getString("nama_obat");
                String id_kategori = rs.getString("id_kategori");
                int jumlah_obat = rs.getInt("jumlah_obat");
                String tgl_kadaluarsa = rs.getString("tgl_kadaluarsa");
                String id_supplier = rs.getString("id_supplier");

            // Menambahkan baris baru ke dalam tabel
            model.addRow(new Object[]{id_obat, nama_obat, id_kategori,jumlah_obat,tgl_kadaluarsa,id_supplier });
        }
            
        }catch(SQLException e){
            System.out.print(e.getMessage());
            
        }
    }        
    private void cariMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariMOActionPerformed
        // TODO add your handling code here:
        cariDataMO();
    }//GEN-LAST:event_cariMOActionPerformed

    private void btnKadaluarsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKadaluarsaActionPerformed
        // TODO add your handling code here:
        sortingKadaluarsa("tgl_kadaluarsa");
    }//GEN-LAST:event_btnKadaluarsaActionPerformed

    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
        // TODO add your handling code here:
        sortingStock("jumlah_obat");
    }//GEN-LAST:event_btnStockActionPerformed

    private void btnKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKategoriActionPerformed
        // TODO add your handling code here:
        sortingKategori("id_kategori");
    }//GEN-LAST:event_btnKategoriActionPerformed

    private void jumlah_obatFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah_obatFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlah_obatFieldActionPerformed

    private void ReserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserBtnActionPerformed
        // TODO add your handling code here:
        // Mengosongkan inputan pada form
        id_obatField.setText(" ");
        nama_obatField.setText(" ");
        idKategoriField.setText(" ");
        jumlah_obatField.setText(" ");
        tgl_kadaluarsaField.setText(" ");
        id_suplierField.setText(" ");
       
    }//GEN-LAST:event_ReserBtnActionPerformed

    private void HpsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HpsBtnActionPerformed
        // TODO add your handling code here:
        // Mendapatkan ID obat yang akan dihapus
        String id_obat = id_obatField.getText();

        // Memanggil method koneksi untuk mendapatkan objek Connection
        Connection conn = KoneksiApo.getKoneksi();

        try {
            // Membuat objek PreparedStatement dengan query SQL untuk menghapus data
            String query = "DELETE FROM obat WHERE id_obat=?";
            PreparedStatement stmt = conn.prepareStatement(query);

            // Mengisi parameter pada query SQL dengan nilai dari inputan pengguna
            stmt.setString(1, id_obat);

            // Menjalankan query SQL untuk menghapus data dari database
            int rowsDeleted = stmt.executeUpdate();

            // Memeriksa apakah data berhasil dihapus
            if (rowsDeleted > 0) {
                // Menampilkan pesan berhasil
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                fetchData(); // Mengambil data terbaru setelah penghapusan
            } else {
                // Menampilkan pesan jika tidak ada data yang dihapus
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
            }

            // Menutup objek PreparedStatement
            stmt.close();
        } catch (SQLException e) {
            // Menampilkan pesan error jika terjadi kesalahan
           
        }
    }//GEN-LAST:event_HpsBtnActionPerformed

    private void EditBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtn1ActionPerformed
        // TODO add your handling code here:
        // Mendapatkan data dari inputan pengguna
        String id_obat = id_obatField.getText();
        String nama_obat = nama_obatField.getText();
        String id_kategori = idKategoriField.getText();
        int jumlah_obat = Integer.parseInt(jumlah_obatField.getText());
        String tgl_kadaluarsa = tgl_kadaluarsaField.getText();
        String id_supplier = id_suplierField.getText();

        // Memanggil method koneksi untuk mendapatkan objek Connection
        Connection conn = KoneksiApo.getKoneksi();

        try {
            // Membuat objek PreparedStatement dengan query SQL untuk mengupdate data
            String query = "UPDATE obat SET nama_obat=?, id_kategori=?, jumlah_obat=?, tgl_kadaluarsa=?, id_supplier=? WHERE id_obat=?";
            PreparedStatement stmt = conn.prepareStatement(query);

            // Mengisi parameter pada query SQL dengan nilai dari inputan pengguna
            stmt.setString(1, nama_obat);
            stmt.setString(2, id_kategori);
            stmt.setInt(3, jumlah_obat);
            stmt.setString(4, tgl_kadaluarsa);
            stmt.setString(5, id_supplier);
            stmt.setString(6, id_obat);

            // Menjalankan query SQL untuk mengupdate data di database
            int rowsUpdated = stmt.executeUpdate();

            // Memeriksa apakah data berhasil diupdate
            if (rowsUpdated > 0) {
                // Menampilkan pesan berhasil
                JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
                fetchData(); // Mengambil data terbaru setelah update
            } else {
                // Menampilkan pesan jika tidak ada data yang diupdate
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
            }

            // Menutup objek PreparedStatement
            stmt.close();
        } catch (SQLException e) {
            // Menampilkan pesan error jika terjadi kesalahan
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
        } catch (NumberFormatException ex) {
            // Menampilkan pesan error jika terjadi kesalahan dalam mengonversi input menjadi angka
            JOptionPane.showMessageDialog(null, "Jumlah obat harus berupa angka");
        }
    }//GEN-LAST:event_EditBtn1ActionPerformed

    private void idKategoriFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idKategoriFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idKategoriFieldActionPerformed

    private void id_suplierFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_suplierFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_suplierFieldActionPerformed

    private void tgl_kadaluarsaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgl_kadaluarsaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tgl_kadaluarsaFieldActionPerformed

    private void nama_obatFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_obatFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_obatFieldActionPerformed

    private void id_obatFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_obatFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_obatFieldActionPerformed
    
    private void validateJumlahObat(int jumlah_obat) throws MyException {
    if (jumlah_obat <= 0) {
        throw new MyException("Jumlah obat harus lebih dari 0", connection);
    }
    }
    
    private void TambahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahBtnActionPerformed
        String id_obat = id_obatField.getText();
    String nama_obat = nama_obatField.getText();
    String id_kategori = idKategoriField.getText();
    int jumlah_obat;

    try {
        jumlah_obat = Integer.parseInt(jumlah_obatField.getText());
        validateJumlahObat(jumlah_obat); // Memvalidasi jumlah obat
    } catch (NumberFormatException ex) {
        // Menampilkan pesan error jika terjadi kesalahan dalam mengonversi input menjadi angka
        JOptionPane.showMessageDialog(null, "Jumlah obat harus berupa angka");
        return; // Menghentikan eksekusi selanjutnya
    } catch (MyException ex) {
        // Menampilkan pesan error jika jumlah obat tidak valid
        JOptionPane.showMessageDialog(null, ex.getMessage());
        return; // Menghentikan eksekusi selanjutnya
    }

    String tgl_kadaluarsa = tgl_kadaluarsaField.getText();
    String id_supplier = id_suplierField.getText();

    // Memanggil method koneksi untuk mendapatkan objek Connection
    Connection conn = KoneksiApo.getKoneksi();

    try {
        // Membuat objek PreparedStatement dengan query SQL
        String query = "INSERT INTO obat (id_obat, nama_obat, id_kategori, jumlah_obat, tgl_kadaluarsa, id_supplier) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);

        // Mengisi parameter pada query SQL dengan nilai dari inputan pengguna
        stmt.setString(1, id_obat);
        stmt.setString(2, nama_obat);
        stmt.setString(3, id_kategori);
        stmt.setInt(4, jumlah_obat);
        stmt.setString(5, tgl_kadaluarsa);
        stmt.setString(6, id_supplier);

        // Menjalankan query SQL untuk menambahkan data ke database
        stmt.executeUpdate();

        // Menampilkan pesan berhasil
        JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");

        // Menutup objek PreparedStatement
        stmt.close();
        fetchData();
    } catch (SQLException e) {
        // Menampilkan pesan error jika terjadi kesalahan
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
    }
    }//GEN-LAST:event_TambahBtnActionPerformed

    private void TransaksiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransaksiBtnActionPerformed
        // TODO add your handling code here:
        new Transaksi_Pembelian().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TransaksiBtnActionPerformed

    private void ManagemenObatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagemenObatBtnActionPerformed
        // TODO add your handling code here:
        new MObatApoteker().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ManagemenObatBtnActionPerformed

    private void ManagemenSupplierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagemenSupplierBtnActionPerformed
        // TODO add your handling code here:
        new MSupplier().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ManagemenSupplierBtnActionPerformed

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        // TODO add your handling code here:
        int dialogBtn = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin akan keluar?", "PERINGATAN", dialogBtn);

        if(dialogResult==0){
            //True condition
            System.exit(0);
        }else{
            //False condition
        }
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void cariMOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariMOKeyReleased
        // TODO add your handling code here:
        cariDataMO();
    }//GEN-LAST:event_cariMOKeyReleased

    private void RiwayatTableComponentResized(java.awt.event.ComponentEvent evt) {                                            
        fetchData();
    }
    
    private void RiwayatTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RiwayatTableMouseClicked
        // TODO add your handling code here:
        // Mendapatkan indeks baris yang dipilih pada tabel
        int selectedRow = RiwayatTable.getSelectedRow();

        // Mendapatkan data dari baris yang dipilih pada tabel
        id_obatField.setText(RiwayatTable.getValueAt(selectedRow, 0).toString());
        nama_obatField.setText (RiwayatTable.getValueAt(selectedRow, 1).toString());
        idKategoriField.setText( RiwayatTable.getValueAt(selectedRow, 2).toString());
        jumlah_obatField.setText(RiwayatTable.getValueAt(selectedRow, 3).toString());
        tgl_kadaluarsaField.setText( RiwayatTable.getValueAt(selectedRow, 4).toString());
        id_suplierField.setText(RiwayatTable.getValueAt(selectedRow, 5).toString());
    }//GEN-LAST:event_RiwayatTableMouseClicked

    private void RiwayatTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_RiwayatTableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_RiwayatTableAncestorAdded

    private void id_obatFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_obatFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            nama_obatField.requestFocus();}
    }//GEN-LAST:event_id_obatFieldKeyPressed

    private void nama_obatFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nama_obatFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jumlah_obatField.requestFocus();}
    }//GEN-LAST:event_nama_obatFieldKeyPressed

    private void jumlah_obatFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlah_obatFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            idKategoriField.requestFocus();}
    }//GEN-LAST:event_jumlah_obatFieldKeyPressed

    private void idKategoriFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKategoriFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           tgl_kadaluarsaField.requestFocus();}
    }//GEN-LAST:event_idKategoriFieldKeyPressed

    private void tgl_kadaluarsaFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tgl_kadaluarsaFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           id_suplierField.requestFocus();}
    }//GEN-LAST:event_tgl_kadaluarsaFieldKeyPressed

  
    
public static void main(String args[]) {
    Connection connection = KoneksiApo.getKoneksi();
    if (connection != null) {
        System.out.println("Connected to the database.");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MObatApoteker().setVisible(true);
            }
        });
        
        // Lakukan operasi database atau tampilkan pesan lain yang sesuai di sini
    } else {
        System.out.println("Failed to connect to the database.");
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApoLabel;
    private javax.swing.JButton EditBtn1;
    private javax.swing.JButton HpsBtn;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton ManagemenObatBtn;
    private javax.swing.JButton ManagemenSupplierBtn;
    private javax.swing.JButton ReserBtn;
    private javax.swing.JScrollPane RiwayatTabel;
    private javax.swing.JTable RiwayatTable;
    private javax.swing.JButton TambahBtn;
    private javax.swing.JButton TransaksiBtn;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnKadaluarsa;
    private javax.swing.JButton btnKategori;
    private javax.swing.JButton btnStock;
    private javax.swing.JLabel cariLabel;
    private javax.swing.JTextField cariMO;
    private javax.swing.JPanel editPanel;
    private javax.swing.JTextField idKategoriField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idObat;
    private javax.swing.JLabel idObat1;
    private javax.swing.JLabel idObat2;
    private javax.swing.JLabel idObat3;
    private javax.swing.JLabel idObat4;
    private javax.swing.JLabel idObat7;
    private javax.swing.JPanel idTPPanel;
    private javax.swing.JTextField id_obatField;
    private javax.swing.JTextField id_suplierField;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JTextField jumlah_obatField;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanelTP;
    private javax.swing.JTextField nama_obatField;
    private javax.swing.JTextField tgl_kadaluarsaField;
    private javax.swing.JLabel urutkanLabel;
    // End of variables declaration//GEN-END:variables
}
