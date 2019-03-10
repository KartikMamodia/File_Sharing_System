-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 10, 2019 at 05:49 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `filesystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `data`
--

CREATE TABLE `data` (
  `ID` int(11) NOT NULL,
  `email_id` varchar(63) DEFAULT NULL,
  `datapath` varchar(100) DEFAULT NULL,
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `File_Name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data`
--

INSERT INTO `data` (`ID`, `email_id`, `datapath`, `time`, `File_Name`) VALUES
(1, 'mohitbhatia@gmail.com', 'C:UsersKartikDesktopjsajaxe.html', '2019-03-09 19:05:55', 'ajaxe.html'),
(2, 'mohitbhatia@gmail.com', 'D:Kartik6th sem.PNG', '2019-03-09 19:07:14', '6th_sem.PNG'),
(8, 'deepakmishra@gmail.com', 'D:JavaHibernateEmployee.class', '2019-03-09 19:18:21', 'Employee.class'),
(9, 'mohitbhatia@gmail.com', 'C:\\Users\\Kartik\\Desktop\\js\\eventListner.html', '2019-03-09 19:47:45', 'eventListner.html'),
(10, 'mohitbhatia@gmail.com', 'D:\\Java\\Hibernate\\Employee.hbm.xml', '2019-03-09 20:07:10', 'Employee.hbm.xml');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `userID` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `email_id` varchar(63) NOT NULL,
  `password` varchar(20) NOT NULL,
  `date_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `contactNo` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`userID`, `username`, `email_id`, `password`, `date_time`, `contactNo`) VALUES
(1, 'Kartik', 'kartikmamodia2015@gmail.com', 'Mamodia', '2019-03-09 17:25:06', '8877665544'),
(2, 'Rahul Mishra', 'rahulmishra@gmail.com', 'rahulmishra', '2019-03-09 17:50:50', '8899001122'),
(3, 'Mohit Bhatia', 'mohitbhatia@gmail.com', 'mohitbhatia', '2019-03-09 17:52:25', '8899112233'),
(4, 'Deepak Mishra', 'deepakmishra@gmail.com', 'deepakmishra', '2019-03-09 17:53:59', '9988112299');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data`
--
ALTER TABLE `data`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `userID` (`ID`),
  ADD KEY `userID_2` (`ID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`userID`),
  ADD UNIQUE KEY `userID` (`userID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data`
--
ALTER TABLE `data`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `userID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
