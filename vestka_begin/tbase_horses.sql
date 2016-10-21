--
-- Current Database: `tbase`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `tbase` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `tbase`;

-- MySQL dump 10.13  Distrib 5.7.12, for Win32 (AMD64)
--
-- Host: 192.168.159.130    Database: tbase
-- ------------------------------------------------------
-- Server version	5.7.15-0ubuntu0.16.04.1

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
INSERT INTO `horses` VALUES (7,'good_horse.jpg',2),(8,'good_horse1.jpg',3),(9,'good_horse2.jpg',4),(10,'horse1.jpg',5),(11,'horse10.jpg',6),(12,'horse11.jpg',7),(13,'horse12.jpg',8),(14,'horse13.jpg',9),(15,'horse15.jpg',10),(16,'horse16.jpg',11),(17,'horse17.jpg',12),(18,'horse18.jpg',13),(19,'horse19.jpg',14),(20,'horse2.jpg',15),(21,'horse20.jpg',16),(22,'horse21.jpg',17),(23,'horse22.jpg',18),(24,'horse3.jpg',19),(25,'horse4.jpg',20),(26,'horse5.jpg',21),(27,'horse6.jpg',22),(28,'horse7.jpg',23),(29,'horse8.jpg',24),(30,'horse9.jpg',25),(31,'hqdefault.jpg',26),(32,'igruch.jpg',27),(33,'images.jpg',28),(34,'index_Banner1_bkgrnd.png',29),(35,'pedal_horse_3.jpg',30),(36,'phorse.jpg',31),(37,'placeholder.gif',32),(38,'puhh.jpg',33),(39,'spechorce.jpg',34),(40,'speed.jpg',35),(41,'speed1.jpg',36),(42,'tn_good_horse.jpg',37),(43,'tn_good_horse1.jpg',38),(44,'tn_good_horse2.jpg',39),(45,'tn_horse1.jpg',40),(46,'tn_horse10.jpg',41),(47,'tn_horse11.jpg',42),(48,'tn_horse12.jpg',43),(49,'tn_horse13.jpg',44),(50,'tn_horse15.jpg',45),(51,'tn_horse16.jpg',46),(52,'tn_horse17.jpg',47),(53,'tn_horse18.jpg',48),(54,'tn_horse19.jpg',49),(55,'tn_horse2.jpg',50),(56,'tn_horse20.jpg',51),(57,'tn_horse21.jpg',52),(58,'tn_horse22.jpg',53),(59,'tn_horse3.jpg',54),(60,'tn_horse4.jpg',55),(61,'tn_horse5.jpg',56),(62,'tn_horse6.jpg',57),(63,'tn_horse7.jpg',58),(64,'tn_horse8.jpg',59),(65,'tn_horse9.jpg',60),(66,'tn_hqdefault.jpg',61),(67,'tn_igruch.jpg',62),(68,'tn_images.jpg',63),(69,'tn_pedal_horse_3.jpg',64),(70,'tn_phorse.jpg',65),(71,'tn_puhh.jpg',66),(72,'tn_spechorce.jpg',67),(73,'tn_speed.jpg',68),(74,'tn_speed1.jpg',69);
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

-- Dump completed on 2016-10-09 22:05:45
