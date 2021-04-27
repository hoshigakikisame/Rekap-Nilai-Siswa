-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 04, 2020 at 03:19 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rekapnilai`
--

-- --------------------------------------------------------

--
-- Table structure for table `guru`
--

CREATE TABLE `guru` (
  `nama` varchar(70) NOT NULL,
  `kode` int(11) NOT NULL,
  `mapel` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `guru`
--

INSERT INTO `guru` (`nama`, `kode`, `mapel`) VALUES
('siti', 9, 'matematika'),
('arif', 2, 'kelautan');

-- --------------------------------------------------------

--
-- Table structure for table `siswa`
--

CREATE TABLE `siswa` (
  `nama` varchar(70) NOT NULL,
  `nis` int(11) NOT NULL,
  `jurusan` varchar(70) NOT NULL,
  `kelas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `siswa`
--

INSERT INTO `siswa` (`nama`, `nis`, `jurusan`, `kelas`) VALUES
('Rian', 5, 'RPL', 11),
('Rian', 5, 'RPL', 11),
('Rian', 5, 'RPL', 11),
('Rian', 5, 'RPL', 11),
('Rian', 5, 'RPL', 11),
('Rian', 5, 'RPL', 11),
('Rian', 5, 'RPL', 11),
('Rian', 5, 'RPL', 11),
('Rian', 5, 'RPL', 11),
('Rian', 5, 'RPL', 11),
('Rian', 5, 'RPL', 11),
('Rian', 5, 'RPL', 11),
('Rian', 5, 'RPL', 11),
('Rian', 5, 'RPL', 11),
('Rian', 5, 'RPL', 11),
('Rian', 5, 'RPL', 11),
('Rian', 5, 'RPL', 11),
('Rian', 5, 'RPL', 11),
('Rian', 5, 'RPL', 11),
('Rian', 5, 'RPL', 11);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
