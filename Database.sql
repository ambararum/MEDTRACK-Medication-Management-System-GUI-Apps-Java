-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 07, 2023 at 02:44 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `medtrack3`
--

-- --------------------------------------------------------

--
-- Table structure for table `kategori`
--

CREATE TABLE `kategori` (
  `id_kategori` varchar(10) NOT NULL,
  `nama_kategori` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kategori`
--

INSERT INTO `kategori` (`id_kategori`, `nama_kategori`) VALUES
('K1', 'Antasid'),
('K2', 'Suplemen'),
('K3', 'Obat Flu'),
('K4', 'Antihistamin'),
('K5', 'Analgesik');

-- --------------------------------------------------------

--
-- Table structure for table `login_apok`
--

CREATE TABLE `login_apok` (
  `id_apo` varchar(10) NOT NULL,
  `passApo` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login_apok`
--

INSERT INTO `login_apok` (`id_apo`, `passApo`) VALUES
('APO1', '123'),
('APO2', '123'),
('APO3', '123'),
('APO4', '123'),
('APO5', '123'),
('APO6', '123'),
('APO7', '123');

-- --------------------------------------------------------

--
-- Table structure for table `login_mana`
--

CREATE TABLE `login_mana` (
  `id_mana` varchar(10) NOT NULL,
  `passM` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login_mana`
--

INSERT INTO `login_mana` (`id_mana`, `passM`) VALUES
('MANA1', '123'),
('MANA2', '123'),
('MANA3', '123'),
('MANA4', '123'),
('MANA5', '123'),
('MANA6', '123'),
('MANA7', '123');

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `id_obat` varchar(10) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `jumlah_obat` int(100) NOT NULL,
  `id_kategori` varchar(10) NOT NULL,
  `id_supplier` varchar(10) NOT NULL,
  `tgl_kadaluarsa` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`id_obat`, `nama_obat`, `jumlah_obat`, `id_kategori`, `id_supplier`, `tgl_kadaluarsa`) VALUES
('ANH001', 'Cetirizine', 35, 'K4', 'S4', '2028-07-31'),
('ANH002', 'Loratadine', 59, 'K4', 'S4', '2028-07-20'),
('ANH003', 'Fexofenadine', 4, 'K4', 'S4', '2027-07-31'),
('ANL001', 'Ibuprofen', 60, 'K5', 'S5', '2028-07-31'),
('ANL002', 'Aspiran', 40, 'K5', 'S5', '2029-07-31'),
('ANL003', 'Naproxen', 30, 'K5', 'S5', '2027-07-31'),
('ANT001', 'Maalox', 35, 'K1', 'S1', '2026-07-31'),
('ANT002', 'Tums', 22, 'K1', 'S1', '2025-07-18'),
('ANT003', 'Gaviscon', 30, 'K1', 'S1', '2027-07-31'),
('OF001', 'Paracetamol', 30, 'K3', 'S3', '2026-07-31'),
('OF002', 'Coldrex', 33, 'K3', 'S3', '2029-07-31'),
('OF003', 'Nyquil', 14, 'K3', 'S3', '2027-07-31'),
('SUP001', 'Vitamin C', 37, 'K2', 'S2', '2026-07-31'),
('SUP002', 'Fish Oil', 20, 'K2', 'S2', '2025-07-18'),
('SUP003', 'Probiotic', 28, 'K2', 'S2', '2027-07-31');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id_supplier` varchar(10) NOT NULL,
  `nama_supplier` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `telepon` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id_supplier`, `nama_supplier`, `alamat`, `telepon`) VALUES
('S1', 'ABC Pharmacy', 'Jl. Merdeka No. 123, Jakarta', '081234567890'),
('S2', 'Jamu Pharmacy', 'Jl. Gatot Subroto No. 456, Surabaya', '082345678901'),
('S3', 'PharmaCare', 'Jl. Diponegoro No. 789, Bandung', '083456789012'),
('S4', 'MedicoSupplies', 'Jl. Sudirman No. 234, Yogyakarta', '084567890123'),
('S5', 'BestPharma', ' Jl. A. Yani No. 567, Semarang', '085678901234'),
('S6', 'BestP', ' Jl. A. Yani No. 567, Semarang', '085678901234');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_pembelian`
--

CREATE TABLE `transaksi_pembelian` (
  `id_pembelian` varchar(10) NOT NULL,
  `tgl_pembelian` date NOT NULL,
  `jumlah_beli` int(100) NOT NULL,
  `total_HrgBeli` int(100) NOT NULL,
  `id_obat` varchar(10) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `hrg_beli` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaksi_pembelian`
--

INSERT INTO `transaksi_pembelian` (`id_pembelian`, `tgl_pembelian`, `jumlah_beli`, `total_HrgBeli`, `id_obat`, `nama_obat`, `hrg_beli`) VALUES
('BELI1', '2023-08-23', 3, 48000, 'ANH002', 'LoratadInE', 16000),
('BELI2', '2023-08-23', 2, 28000, 'ANH001', 'Cetirizine', 14000),
('BELI3', '2023-08-23', 1, 17000, 'ANL001', 'Ibuprofen', 17000),
('BELI4', '2023-08-23', 5, 90000, 'ANT001', 'Maalox', 18000),
('BELI5', '2023-08-23', 3, 33000, 'OF002', 'Coldrex', 11000),
('BELI6', '2023-08-23', 7, 70000, 'SUP001', 'Vitamin C', 10000),
('BELI7', '2023-08-23', 7, 70000, 'ANH003', 'Fexofenadine', 10000);

--
-- Triggers `transaksi_pembelian`
--
DELIMITER $$
CREATE TRIGGER `tambahStock` AFTER INSERT ON `transaksi_pembelian` FOR EACH ROW BEGIN 
UPDATE obat set jumlah_obat = jumlah_obat + New.jumlah_beli
WHERE id_obat = New.id_obat;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_penjualan`
--

CREATE TABLE `transaksi_penjualan` (
  `id_penjualan` varchar(10) NOT NULL,
  `id_obat` varchar(10) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `hrg_jual` int(100) NOT NULL,
  `jumlah_jual` int(100) NOT NULL,
  `total_HrgJual` int(100) NOT NULL,
  `tgl_penjualan` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaksi_penjualan`
--

INSERT INTO `transaksi_penjualan` (`id_penjualan`, `id_obat`, `nama_obat`, `hrg_jual`, `jumlah_jual`, `total_HrgJual`, `tgl_penjualan`) VALUES
('JUAL1', 'ANH001', 'Cetirizine', 20000, 3, 60000, '2023-07-03'),
('JUAL2', 'ANH002', 'Loratadine', 16000, 6, 96000, '2023-07-04'),
('JUAL3', 'ANH003', 'Fexofenadine', 17000, 6, 102000, '2023-07-05'),
('JUAL4', 'ANT002', 'Tums', 19000, 4, 76000, '2023-07-05'),
('JUAL5', 'OF003', 'Nyquil', 17000, 6, 102000, '2023-07-05'),
('JUAL6', 'SUP003', 'Probiotic', 18000, 2, 36000, '2023-07-05');

--
-- Triggers `transaksi_penjualan`
--
DELIMITER $$
CREATE TRIGGER `ambilStock` AFTER INSERT ON `transaksi_penjualan` FOR EACH ROW BEGIN
UPDATE obat set jumlah_obat = jumlah_obat - New.jumlah_jual
WHERE id_obat = New.id_obat;
END
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`id_kategori`);

--
-- Indexes for table `login_apok`
--
ALTER TABLE `login_apok`
  ADD PRIMARY KEY (`id_apo`);

--
-- Indexes for table `login_mana`
--
ALTER TABLE `login_mana`
  ADD PRIMARY KEY (`id_mana`);

--
-- Indexes for table `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`id_obat`),
  ADD KEY `id_kategori` (`id_kategori`),
  ADD KEY `id_supplier` (`id_supplier`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id_supplier`);

--
-- Indexes for table `transaksi_pembelian`
--
ALTER TABLE `transaksi_pembelian`
  ADD PRIMARY KEY (`id_pembelian`),
  ADD KEY `id_obat` (`id_obat`),
  ADD KEY `nama_obat` (`nama_obat`);

--
-- Indexes for table `transaksi_penjualan`
--
ALTER TABLE `transaksi_penjualan`
  ADD PRIMARY KEY (`id_penjualan`),
  ADD KEY `id_obat` (`id_obat`),
  ADD KEY `nama_obat` (`nama_obat`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `obat`
--
ALTER TABLE `obat`
  ADD CONSTRAINT `obat_ibfk_1` FOREIGN KEY (`id_kategori`) REFERENCES `kategori` (`id_kategori`),
  ADD CONSTRAINT `obat_ibfk_2` FOREIGN KEY (`id_supplier`) REFERENCES `supplier` (`id_supplier`);

--
-- Constraints for table `transaksi_pembelian`
--
ALTER TABLE `transaksi_pembelian`
  ADD CONSTRAINT `transaksi_pembelian_ibfk_1` FOREIGN KEY (`id_obat`) REFERENCES `obat` (`id_obat`);

--
-- Constraints for table `transaksi_penjualan`
--
ALTER TABLE `transaksi_penjualan`
  ADD CONSTRAINT `transaksi_penjualan_ibfk_1` FOREIGN KEY (`id_obat`) REFERENCES `obat` (`id_obat`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
