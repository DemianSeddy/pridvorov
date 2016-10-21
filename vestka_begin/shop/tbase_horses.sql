--
-- Current Database: `tbase`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `tbase` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `tbase`;

-- MySQL dump 10.13  Distrib 5.7.12, for Win32 (AMD64)
--
-- Host: 192.168.100.99    Database: tbase
-- ------------------------------------------------------
-- Server version	5.7.12-0ubuntu1.1

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
-- Table structure for table `horses`
--

DROP TABLE IF EXISTS `horses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `horses` (
  `id` mediumint(9) NOT NULL AUTO_INCREMENT,
  `path` char(60) NOT NULL,
  `id_feature` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horses`
--

LOCK TABLES `horses` WRITE;
/*!40000 ALTER TABLE `horses` DISABLE KEYS */;
INSERT INTO `horses` VALUES (7,'good_horse.jpg',3),(8,'good_horse1.jpg',3),(9,'good_horse2.jpg',1),(10,'horse1.jpg',3),(11,'horse10.jpg',3),(12,'horse11.jpg',3),(13,'horse12.jpg',2),(14,'horse13.jpg',3),(15,'horse15.jpg',3),(16,'horse16.jpg',3),(17,'horse17.jpg',2),(18,'horse18.jpg',3),(19,'horse19.jpg',3),(20,'horse2.jpg',3),(21,'horse20.jpg',2),(22,'horse21.jpg',3),(23,'horse22.jpg',3),(24,'horse3.jpg',3),(25,'horse4.jpg',2),(26,'horse5.jpg',3),(27,'horse6.jpg',3),(28,'horse7.jpg',3),(29,'horse8.jpg',3),(30,'horse9.jpg',3),(31,'hqdefault.jpg',1),(32,'igruch.jpg',3),(33,'images.jpg',1),(34,'index_Banner1_bkgrnd.png',3),(35,'pedal_horse_3.jpg',3),(36,'phorse.jpg',1),(37,'placeholder.gif',3),(38,'puhh.jpg',1),(39,'spechorce.jpg',3),(40,'speed.jpg',1),(41,'speed1.jpg',3),(42,'tn_good_horse.jpg',3),(43,'tn_good_horse1.jpg',3),(44,'tn_good_horse2.jpg',3),(45,'tn_horse1.jpg',3),(46,'tn_horse10.jpg',3),(47,'tn_horse11.jpg',3),(48,'tn_horse12.jpg',3),(49,'tn_horse13.jpg',3),(50,'tn_horse15.jpg',2),(51,'tn_horse16.jpg',3),(52,'tn_horse17.jpg',3),(53,'tn_horse18.jpg',2),(54,'tn_horse19.jpg',3),(55,'tn_horse2.jpg',1),(56,'tn_horse20.jpg',3),(57,'tn_horse21.jpg',3),(58,'tn_horse22.jpg',2),(59,'tn_horse3.jpg',3),(60,'tn_horse4.jpg',2),(61,'tn_horse5.jpg',3),(62,'tn_horse6.jpg',3),(63,'tn_horse7.jpg',3),(64,'tn_horse8.jpg',3),(65,'tn_horse9.jpg',2),(66,'tn_hqdefault.jpg',3),(67,'tn_igruch.jpg',3),(68,'tn_images.jpg',3),(69,'tn_pedal_horse_3.jpg',3),(70,'tn_phorse.jpg',3),(71,'tn_puhh.jpg',3),(72,'tn_spechorce.jpg',2),(73,'tn_speed.jpg',3),(74,'tn_speed1.jpg',3);
/*!40000 ALTER TABLE `horses` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-10-12 11:59:34
