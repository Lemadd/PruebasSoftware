CREATE DATABASE  IF NOT EXISTS `testco` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `testco`;
-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: testco
-- ------------------------------------------------------
-- Server version	5.6.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `nc_login_d`
--

LOCK TABLES `nc_login_d` WRITE;
/*!40000 ALTER TABLE `nc_login_d` DISABLE KEYS */;
INSERT INTO `nc_login_d` VALUES ('T01','admin@yourstore.com','admin','true','false'),('T02','admin@yourstore.com','12345','false','true');
/*!40000 ALTER TABLE `nc_login_d` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `registerpage`
--

LOCK TABLES `registerpage` WRITE;
/*!40000 ALTER TABLE `registerpage` DISABLE KEYS */;
INSERT INTO `registerpage` VALUES (1,'cibertecCibertec','cibertecCibertec','cibertecCibertec','cibertecCibertec','cibertecCibertec','cibertecCibertec@cibertecCibertec.com','English','Peru','San Jose','https://www.youtube.com/watch?v=z5o90P6YfEg'),(2,'cibertecCibertec2','cibertecCibertec2','cibertecCibertec2','cibertecCibertec2','cibertecCibertec2','cibertecCibertec2@cibertecCibertec2.com','(auto)','USA','San Francisco','https://www.hostedredmine.com/account/register'),(3,'cibertecCibertec3','cibertecCibertec3','cibertecCibertec3','cibertecCibertec3','cibertecCibertec3','cibertecCibertec3@cibertecCibertec3.com','Español','España','Madrid','https://www.hostedredmine.com/'),(4,'cibertecCibertec4','cibertecCibertec4','cibertecCibertec4','cibertecCibertec4','cibertecCibertec4','cibertecCibertec4@cibertecCibertec4.com','Italiano','Italia','Milan','novalido'),(5,'cibertecCibertec5','cibertecCibertec5','cibertecCibertec5','cibertecCibertec5','cibertecCibertec5','novalido','English','United Kingdom','Londres','http://stackoverflow.com/'),(6,'novalido','cibertecCibertec5','cibertecCibertec5','cibertecCibertec5','cibertecCibertec5','cibertecCibertec5@cibertecCibertec5.com','Italiano','United Kingdom','Londres','http://stackoverflow.com/'),(7,'cibertecCibertec7','novalido','cibertecCibertec7','cibertecCibertec7','cibertecCibertec7','cibertecCibertec7@cibertecCibertec7.com','Español','España','Valencia','https://www.hostedredmine.com/'),(8,'cibertecCibertec8','cibertecCibertec8','novalido','cibertecCibertec8','cibertecCibertec8','cibertecCibertec8@cibertecCibertec8.com','(auto)','USA','San Francisco','https://www.hostedredmine.com/');
/*!40000 ALTER TABLE `registerpage` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-11-27  8:53:58
