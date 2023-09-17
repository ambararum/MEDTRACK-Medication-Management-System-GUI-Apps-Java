package medtrack;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.Date;

public class MSupplier extends javax.swing.JFrame {

    private Connection connection;

    /**
     * Creates new form MObatApoteker
     */
    public MSupplier() {
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
        cariMS = new javax.swing.JTextField();
        judulLabel = new javax.swing.JLabel();
        RiwayatTabel = new javax.swing.JScrollPane();
        RiwayatTable = new javax.swing.JTable();
        btnID = new javax.swing.JButton();
        btnNAMA = new javax.swing.JButton();
        editPanel = new javax.swing.JPanel();
        TambahBtn = new javax.swing.JButton();
        idObat = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idObat1 = new javax.swing.JLabel();
        idObat2 = new javax.swing.JLabel();
        idObat7 = new javax.swing.JLabel();
        id_supField = new javax.swing.JTextField();
        nama_supField = new javax.swing.JTextField();
        telponSupField = new javax.swing.JTextField();
        EditBtn1 = new javax.swing.JButton();
        HpsBtn = new javax.swing.JButton();
        ReserBtn = new javax.swing.JButton();
        alamat_supField = new javax.swing.JTextField();
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

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        cariLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cariLabel.setText("Cari");

        cariMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariMSActionPerformed(evt);
            }
        });
        cariMS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariMSKeyReleased(evt);
            }
        });

        judulLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        judulLabel.setText("Management Supplier");

        RiwayatTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID SUPPLIER", "NAMA SUPPLIER", "ALAMAT", "TELEPON"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        btnID.setBackground(new java.awt.Color(46, 204, 113));
        btnID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnID.setForeground(new java.awt.Color(255, 255, 255));
        btnID.setText("id_supplier");
        btnID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDActionPerformed(evt);
            }
        });

        btnNAMA.setBackground(new java.awt.Color(46, 204, 113));
        btnNAMA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNAMA.setForeground(new java.awt.Color(255, 255, 255));
        btnNAMA.setText("Nama");
        btnNAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNAMAActionPerformed(evt);
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
        idObat.setText("NAMA SUPPLIER");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Tambah Data Supplier");

        idObat1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idObat1.setText("ID SUPPLIER");

        idObat2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idObat2.setText("ALAMAT");

        idObat7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idObat7.setText("TELEPON");

        id_supField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_supFieldActionPerformed(evt);
            }
        });
        id_supField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_supFieldKeyPressed(evt);
            }
        });

        nama_supField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_supFieldActionPerformed(evt);
            }
        });
        nama_supField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nama_supFieldKeyPressed(evt);
            }
        });

        telponSupField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telponSupFieldActionPerformed(evt);
            }
        });
        telponSupField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telponSupFieldKeyPressed(evt);
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

        alamat_supField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamat_supFieldActionPerformed(evt);
            }
        });
        alamat_supField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                alamat_supFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addComponent(TambahBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(EditBtn1)
                        .addGap(18, 18, 18)
                        .addComponent(HpsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ReserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idObat7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idObat2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idObat1)
                            .addComponent(idObat))
                        .addGap(24, 24, 24)
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(telponSupField, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(alamat_supField)
                            .addComponent(nama_supField)
                            .addComponent(id_supField))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addGap(47, 47, 47)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idObat1)
                    .addComponent(id_supField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama_supField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idObat))
                .addGap(18, 18, 18)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idObat2)
                    .addComponent(alamat_supField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idObat7)
                    .addComponent(telponSupField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
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
                                        .addGap(48, 48, 48)
                                        .addComponent(btnID)
                                        .addGap(52, 52, 52)
                                        .addComponent(btnNAMA, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(cariLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(cariMS, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(RiwayatTabel, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(judulLabel)))
                .addContainerGap(511, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(judulLabel)
                .addGap(59, 59, 59)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cariMS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cariLabel))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(urutkanLabel)
                            .addComponent(btnID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNAMA))
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

        ManagemenObatBtn.setBackground(new java.awt.Color(0, 93, 146));
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

        ManagemenSupplierBtn.setBackground(new java.awt.Color(52, 152, 219));
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
                .addGap(19, 19, 19)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(ManagemenSupplierBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM supplier");

            // Menjalankan query SQL untuk mengambil data dari tabel transaksi_pembelian
            ResultSet rs = stmt.executeQuery();

            // Mendapatkan model tabel dari JTable
            DefaultTableModel model = new DefaultTableModel();

            // Menambahkan kolom-kolom pada model tabel
            model.addColumn("ID SUPPLIER");
            model.addColumn("NAMA SUPPLIER");
            model.addColumn("ALAMAT");
            model.addColumn("TELEPON");

            // Menghapus semua baris yang ada pada tabel
            model.setRowCount(0);

            // Iterasi melalui hasil query dan menambahkan data ke dalam tabel
            while (rs.next()) {
                String id_supplier = rs.getString("id_supplier");
                String nama_supplier = rs.getString("nama_supplier");
                String alamat = rs.getString("alamat");
                String telepon = rs.getString("telepon");

                // Menambahkan baris baru ke dalam tabel
                model.addRow(new Object[]{id_supplier, nama_supplier, alamat, telepon});
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

    //SORTING ID SUPPLIER
    public void sortingID(String id_supplier) {
        DefaultTableModel model = new DefaultTableModel(
                new Object[]{"ID SUPPLIER", "NAMA SUPPLIER", "ALAMAT", "TELEPON"}, 0
        );
        RiwayatTable.setModel(model);

        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM supplier ORDER BY id_supplier";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String kolom1 = resultSet.getString("id_supplier");
                String kolom2 = resultSet.getString("nama_supplier");
                String kolom3 = resultSet.getString("alamat");
                String kolom4 = resultSet.getString("telepon");

                model.addRow(new Object[]{kolom1, kolom2, kolom3, kolom4});
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal mendapatkan data dari database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // SORTING NAMA
    public void sortingNAMA(String nama_supplier) {
        DefaultTableModel model = new DefaultTableModel(
                new Object[]{"ID SUPPLIER", "NAMA SUPPLIER", "ALAMAT", "TELEPON"}, 0
        );
        RiwayatTable.setModel(model);

        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM supplier ORDER BY nama_supplier";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String kolom1 = resultSet.getString("id_supplier");
                String kolom2 = resultSet.getString("nama_supplier");
                String kolom3 = resultSet.getString("alamat");
                String kolom4 = resultSet.getString("telepon");

                model.addRow(new Object[]{kolom1, kolom2, kolom3, kolom4});
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal mendapatkan data dari database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // PENCARIAN NAMA SUPPLIER
    public void cariDataMS() {
        DefaultTableModel model = new DefaultTableModel(
                new Object[]{"ID SUPPLIER", "NAMA SUPPLIER", "ALAMAT", "TELEPON"}, 0
        );
        RiwayatTable.setModel(model);
        // Memanggil method koneksi untuk mendapatkan objek Connection
        Connection conn = KoneksiApo.getKoneksi();
        int jumlahRow = RiwayatTable.getRowCount();
        for (int n = 0; n < jumlahRow; n++) {
            model.removeRow(0);
        }
        String cari = cariMS.getText();
        try {
            String query = "SELECT * FROM supplier WHERE nama_supplier LIKE '%" + cari + "%'";
            PreparedStatement stmt = conn.prepareStatement(query);
            // Menjalankan query SQL untuk mengambil data dari tabel transaksi_pembelian
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String id_supplier = rs.getString("id_supplier");
                String nama_supplier = rs.getString("nama_supplier");
                String alamat = rs.getString("alamat");
                String telepon = rs.getString("telepon");

                // Menambahkan baris baru ke dalam tabel
                model.addRow(new Object[]{id_supplier, nama_supplier, alamat, telepon});
            }

        } catch (SQLException e) {
            System.out.print(e.getMessage());

        }
    }
    private void cariMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariMSActionPerformed
        // TODO add your handling code here:
        cariDataMS();
    }//GEN-LAST:event_cariMSActionPerformed

    private void btnIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIDActionPerformed
        // TODO add your handling code here:
        sortingID("id_supplier");
    }//GEN-LAST:event_btnIDActionPerformed

    private void btnNAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNAMAActionPerformed
        // TODO add your handling code here:
        sortingNAMA("nama_supplier");
    }//GEN-LAST:event_btnNAMAActionPerformed

    private void alamat_supFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamat_supFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamat_supFieldActionPerformed

    private void ReserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserBtnActionPerformed
        // TODO add your handling code here:
        // Mengosongkan inputan pada form
        id_supField.setText(" ");
        nama_supField.setText(" ");
        telponSupField.setText(" ");
        alamat_supField.setText(" ");

    }//GEN-LAST:event_ReserBtnActionPerformed

    private void HpsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HpsBtnActionPerformed
        // TODO add your handling code here:
        // Mendapatkan ID obat yang akan dihapus
        String id_supplier = id_supField.getText();

        // Memanggil method koneksi untuk mendapatkan objek Connection
        Connection conn = KoneksiApo.getKoneksi();

        try {
            // Membuat objek PreparedStatement dengan query SQL untuk menghapus data
            String query = "DELETE FROM supplier WHERE id_supplier=?";
            PreparedStatement stmt = conn.prepareStatement(query);

            // Mengisi parameter pada query SQL dengan nilai dari inputan pengguna
            stmt.setString(1, id_supplier);

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
        String id_supplier = id_supField.getText();
        String nama_supplier = nama_supField.getText();
        String alamat = alamat_supField.getText();
        String telepon = telponSupField.getText();

        // Memanggil method koneksi untuk mendapatkan objek Connection
        Connection conn = KoneksiApo.getKoneksi();

        try {
            // Membuat objek PreparedStatement dengan query SQL untuk mengupdate data
            String query = "UPDATE supplier SET nama_supplier=?, alamat=?, telepon=? WHERE id_supplier=?";
            PreparedStatement stmt = conn.prepareStatement(query);

            // Mengisi parameter pada query SQL dengan nilai dari inputan pengguna
            stmt.setString(1, nama_supplier);
            stmt.setString(2, alamat);
            stmt.setString(3, telepon);
            stmt.setString(4, id_supplier);

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

    private void telponSupFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telponSupFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telponSupFieldActionPerformed

    private void nama_supFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_supFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_supFieldActionPerformed

    private void id_supFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_supFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_supFieldActionPerformed

    private void TambahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahBtnActionPerformed
        String id_supplier = id_supField.getText();
        String nama_supplier = nama_supField.getText();
        String alamat = alamat_supField.getText();
        String telepon = telponSupField.getText();

        // Memanggil method koneksi untuk mendapatkan objek Connection
        Connection conn = KoneksiApo.getKoneksi();

        try {
            // Membuat objek PreparedStatement dengan query SQL
            String query = "INSERT INTO supplier (id_supplier, nama_supplier, alamat, telepon) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);

            // Mengisi parameter pada query SQL dengan nilai dari inputan pengguna
            stmt.setString(1, id_supplier);
            stmt.setString(2, nama_supplier);
            stmt.setString(3, alamat);
            stmt.setString(4, telepon);

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
        } catch (NumberFormatException ex) {
            // Menampilkan pesan error jika terjadi kesalahan dalam mengonversi input menjadi angka
            JOptionPane.showMessageDialog(null, "Jumlah obat, harga beli, dan harga jual harus berupa angka");
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

        if (dialogResult == 0) {
            //True condition
            System.exit(0);
        } else {
            //False condition
        }
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void cariMSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariMSKeyReleased
        // TODO add your handling code here:
        cariDataMS();
    }//GEN-LAST:event_cariMSKeyReleased

    private void RiwayatTableComponentResized(java.awt.event.ComponentEvent evt) {
        fetchData();
    }

    private void RiwayatTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RiwayatTableMouseClicked
        // TODO add your handling code here:
        // Mendapatkan indeks baris yang dipilih pada tabel
        int selectedRow = RiwayatTable.getSelectedRow();

        // Mendapatkan data dari baris yang dipilih pada tabel
        id_supField.setText(RiwayatTable.getValueAt(selectedRow, 0).toString());
        nama_supField.setText(RiwayatTable.getValueAt(selectedRow, 1).toString());
        alamat_supField.setText(RiwayatTable.getValueAt(selectedRow, 2).toString());
        telponSupField.setText(RiwayatTable.getValueAt(selectedRow, 3).toString());

    }//GEN-LAST:event_RiwayatTableMouseClicked

    private void RiwayatTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_RiwayatTableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_RiwayatTableAncestorAdded

    private void id_supFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_supFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           nama_supField.requestFocus();}
    }//GEN-LAST:event_id_supFieldKeyPressed

    private void nama_supFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nama_supFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           alamat_supField.requestFocus();}
    }//GEN-LAST:event_nama_supFieldKeyPressed

    private void alamat_supFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alamat_supFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           telponSupField.requestFocus();}
    }//GEN-LAST:event_alamat_supFieldKeyPressed

    private void telponSupFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telponSupFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_telponSupFieldKeyPressed

    public static void main(String args[]) {
        Connection connection = KoneksiApo.getKoneksi();
        if (connection != null) {
            System.out.println("Connected to the database.");

            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MSupplier().setVisible(true);
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
    private javax.swing.JTextField alamat_supField;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnID;
    private javax.swing.JButton btnNAMA;
    private javax.swing.JLabel cariLabel;
    private javax.swing.JTextField cariMS;
    private javax.swing.JPanel editPanel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idObat;
    private javax.swing.JLabel idObat1;
    private javax.swing.JLabel idObat2;
    private javax.swing.JLabel idObat7;
    private javax.swing.JPanel idTPPanel;
    private javax.swing.JTextField id_supField;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanelTP;
    private javax.swing.JTextField nama_supField;
    private javax.swing.JTextField telponSupField;
    private javax.swing.JLabel urutkanLabel;
    // End of variables declaration//GEN-END:variables
}
