CREATE DATABASE  IF NOT EXISTS `testco` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `testco`;
-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: localhost    Database: testco
-- ------------------------------------------------------
-- Server version	5.6.26

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
-- Table structure for table `loginpage`
--

DROP TABLE IF EXISTS `loginpage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `loginpage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loginpage`
--

LOCK TABLES `loginpage` WRITE;
/*!40000 ALTER TABLE `loginpage` DISABLE KEYS */;
INSERT INTO `loginpage` VALUES (1,'pruebacibertec','pruebacibertec'),(2,'asdasd','adasd');
/*!40000 ALTER TABLE `loginpage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registerpage`
--

DROP TABLE IF EXISTS `registerpage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registerpage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `confirmpassword` varchar(100) DEFAULT NULL,
  `firstname` varchar(100) DEFAULT NULL,
  `lastname` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `language` varchar(100) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  `company` varchar(100) DEFAULT NULL,
  `website` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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

-- Dump completed on 2015-11-27 17:02:50
