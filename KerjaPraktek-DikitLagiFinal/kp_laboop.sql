-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               10.1.35-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for kp_laboop
CREATE DATABASE IF NOT EXISTS `kp_laboop` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `kp_laboop`;


-- Dumping structure for table kp_laboop.dosen
CREATE TABLE IF NOT EXISTS `dosen` (
  `nidn` varchar(15) NOT NULL,
  `nama_dsn` varchar(30) NOT NULL,
  `tgllahir_dsn` varchar(30) NOT NULL,
  `jabatanakademik_dsn` varchar(30) NOT NULL,
  PRIMARY KEY (`nidn`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table kp_laboop.dosen: ~1 rows (approximately)
/*!40000 ALTER TABLE `dosen` DISABLE KEYS */;
INSERT INTO `dosen` (`nidn`, `nama_dsn`, `tgllahir_dsn`, `jabatanakademik_dsn`) VALUES
	('11031', 'saf', '129381', 'ketua jurusan');
/*!40000 ALTER TABLE `dosen` ENABLE KEYS */;


-- Dumping structure for table kp_laboop.kp
CREATE TABLE IF NOT EXISTS `kp` (
  `id_kp` varchar(9) NOT NULL,
  `nrp` varchar(9) DEFAULT NULL,
  `id_pmb` varchar(9) DEFAULT NULL,
  `id_perusahaan` varchar(9) DEFAULT NULL,
  `nip` varchar(9) DEFAULT NULL,
  PRIMARY KEY (`id_kp`),
  KEY `nrp` (`nrp`),
  KEY `id_pmb` (`id_pmb`),
  KEY `FK_kp_perusahaan` (`id_perusahaan`),
  KEY `FK_kp_dosen` (`nip`),
  CONSTRAINT `FK_kp_dosen` FOREIGN KEY (`nip`) REFERENCES `dosen` (`nidn`),
  CONSTRAINT `FK_kp_mahasiswa` FOREIGN KEY (`nrp`) REFERENCES `mahasiswa` (`nrp`),
  CONSTRAINT `FK_kp_pembimbing` FOREIGN KEY (`id_pmb`) REFERENCES `pembimbing` (`id_pmb`),
  CONSTRAINT `FK_kp_perusahaan` FOREIGN KEY (`id_perusahaan`) REFERENCES `perusahaan` (`id_perusahaan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table kp_laboop.kp: ~0 rows (approximately)
/*!40000 ALTER TABLE `kp` DISABLE KEYS */;
INSERT INTO `kp` (`id_kp`, `nrp`, `id_pmb`, `id_perusahaan`, `nip`) VALUES
	('KP001', '152010001', 'PM001', 'PR001', '11031');
/*!40000 ALTER TABLE `kp` ENABLE KEYS */;


-- Dumping structure for table kp_laboop.mahasiswa
CREATE TABLE IF NOT EXISTS `mahasiswa` (
  `nrp` varchar(9) NOT NULL,
  `nama_mhsw` varchar(30) NOT NULL,
  `jurusan` varchar(20) NOT NULL,
  `alamat_mhsw` varchar(30) NOT NULL,
  `no_tlp` varchar(13) NOT NULL,
  PRIMARY KEY (`nrp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table kp_laboop.mahasiswa: ~1 rows (approximately)
/*!40000 ALTER TABLE `mahasiswa` DISABLE KEYS */;
INSERT INTO `mahasiswa` (`nrp`, `nama_mhsw`, `jurusan`, `alamat_mhsw`, `no_tlp`) VALUES
	('152010001', 'Maba', 'Teknik Elektro', 'jl Keabadian', '082147483642');
/*!40000 ALTER TABLE `mahasiswa` ENABLE KEYS */;


-- Dumping structure for table kp_laboop.pembimbing
CREATE TABLE IF NOT EXISTS `pembimbing` (
  `id_pmb` varchar(9) NOT NULL,
  `nama_pmb` varchar(30) NOT NULL,
  `no_tlp_pmb` varchar(13) DEFAULT NULL,
  `keahlian_pmb` varchar(25) NOT NULL,
  PRIMARY KEY (`id_pmb`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table kp_laboop.pembimbing: ~0 rows (approximately)
/*!40000 ALTER TABLE `pembimbing` DISABLE KEYS */;
INSERT INTO `pembimbing` (`id_pmb`, `nama_pmb`, `no_tlp_pmb`, `keahlian_pmb`) VALUES
	('PM001', 'Novanto', '08384712463', 'sistem kompuer');
/*!40000 ALTER TABLE `pembimbing` ENABLE KEYS */;


-- Dumping structure for table kp_laboop.perusahaan
CREATE TABLE IF NOT EXISTS `perusahaan` (
  `id_perusahaan` varchar(9) NOT NULL,
  `nama_perusahaan` varchar(30) NOT NULL,
  `alamat_perusahaan` varchar(30) NOT NULL,
  `no_tlp_perusahaan` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`id_perusahaan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table kp_laboop.perusahaan: ~0 rows (approximately)
/*!40000 ALTER TABLE `perusahaan` DISABLE KEYS */;
INSERT INTO `perusahaan` (`id_perusahaan`, `nama_perusahaan`, `alamat_perusahaan`, `no_tlp_perusahaan`) VALUES
	('PR001', 'Citra Jaya', 'jl Jakarta', '022483747');
/*!40000 ALTER TABLE `perusahaan` ENABLE KEYS */;


-- Dumping structure for table kp_laboop.sidang
CREATE TABLE IF NOT EXISTS `sidang` (
  `id_sidang` varchar(9) NOT NULL,
  `tgl_sidang` date NOT NULL,
  `ruangan` varchar(15) NOT NULL,
  `id_kp` varchar(9) NOT NULL,
  PRIMARY KEY (`id_sidang`),
  KEY `FK_sidang_kp` (`id_kp`),
  CONSTRAINT `FK_sidang_kp` FOREIGN KEY (`id_kp`) REFERENCES `kp` (`id_kp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table kp_laboop.sidang: ~0 rows (approximately)
/*!40000 ALTER TABLE `sidang` DISABLE KEYS */;
/*!40000 ALTER TABLE `sidang` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
