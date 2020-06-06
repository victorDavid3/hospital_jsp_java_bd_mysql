CREATE DATABASE  IF NOT EXISTS `hospital` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `hospital`;
-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: hospital
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `consulta`
--

DROP TABLE IF EXISTS `consulta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consulta` (
  `cod_consulta` int(11) NOT NULL AUTO_INCREMENT,
  `hora_consulta` varchar(6) NOT NULL,
  `dia_consulta` varchar(30) NOT NULL,
  `descricao` varchar(45) NOT NULL,
  `CPF_Paciente_Consulta` varchar(45) NOT NULL,
  `CRM_Medico_Consulta` varchar(45) NOT NULL,
  PRIMARY KEY (`cod_consulta`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `medico`
--

DROP TABLE IF EXISTS `medico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medico` (
  `CMR_Medico` varchar(10) NOT NULL,
  `Nome_Medico` varchar(30) NOT NULL,
  `Cod_Medico` int(11) NOT NULL AUTO_INCREMENT,
  `Endere_Numero` varchar(45) NOT NULL,
  `Rua` varchar(45) NOT NULL,
  `Bairro` varchar(45) NOT NULL,
  `Cidede` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL,
  `Tele_1` varchar(45) NOT NULL,
  `Tele_2` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Cod_Medico`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paciente` (
  `CPF_Paciente` varchar(11) NOT NULL,
  `Nome_Paciente` varchar(30) NOT NULL,
  `Idade_Paciente` varchar(30) NOT NULL,
  `Tele_1_Paciente` varchar(11) NOT NULL,
  `Tele_2_Paciente` varchar(11) DEFAULT NULL,
  `Num_Paciente` int(11) NOT NULL AUTO_INCREMENT,
  `Nemero_Endere_Paciente` varchar(6) NOT NULL,
  `Rua_Endere_Paciente` varchar(45) NOT NULL,
  `Bairro_Endere_Paciente` varchar(45) NOT NULL,
  `Cidade_Endere_Paciente` varchar(45) NOT NULL,
  `Estado_Endere_Paciente` varchar(45) NOT NULL,
  PRIMARY KEY (`Num_Paciente`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-06  8:51:53
