-- MySQL dump 10.13  Distrib 5.7.24, for Win64 (x86_64)
--
-- Host: localhost    Database: farmacia
-- ------------------------------------------------------
-- Server version	5.7.24

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `id_cliente` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `cli_nome` varchar(300) CHARACTER SET latin1 NOT NULL,
  `cli_endereco` varchar(350) CHARACTER SET latin1 NOT NULL,
  `cli_bairro` varchar(200) CHARACTER SET latin1 NOT NULL,
  `cli_cidade` varchar(200) CHARACTER SET latin1 NOT NULL,
  `cli_estado` varchar(2) CHARACTER SET latin1 NOT NULL,
  `cli_CEP` varchar(9) CHARACTER SET latin1 NOT NULL,
  `cli_telefone` varchar(15) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`id_cliente`),
  UNIQUE KEY `id_cliente` (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (4,'rodrigo','rua lalala','rio doce','olinda','RJ','123','12345'),(6,'leopoldo','rua alguma coisa','jardins','papapa','RN','4444','55555'),(7,'José Santos','rua alguma coisa','paulista','São Paulo','SP','56799-767','478987');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forma_pagamento`
--

DROP TABLE IF EXISTS `forma_pagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forma_pagamento` (
  `id_for_pag` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `descricao_for_pag` varchar(255) NOT NULL,
  `desconto_for_pag` float NOT NULL,
  `parcelas_for_pag` int(11) NOT NULL,
  `situacao_for_pag` int(11) NOT NULL,
  PRIMARY KEY (`id_for_pag`),
  UNIQUE KEY `id_for_pag` (`id_for_pag`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forma_pagamento`
--

LOCK TABLES `forma_pagamento` WRITE;
/*!40000 ALTER TABLE `forma_pagamento` DISABLE KEYS */;
INSERT INTO `forma_pagamento` VALUES (1,'A Vista',0,1,1);
/*!40000 ALTER TABLE `forma_pagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionarios`
--

DROP TABLE IF EXISTS `funcionarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionarios` (
  `id_fun` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `nome_fun` varchar(255) NOT NULL,
  `cpf_fun` varchar(50) NOT NULL,
  `salario_fun` double NOT NULL,
  `cargo_fun` varchar(100) NOT NULL,
  `endereco_fun` varchar(300) NOT NULL,
  `bairro_fun` varchar(50) NOT NULL,
  `cidade_fun` varchar(50) NOT NULL,
  `estado_fun` varchar(2) NOT NULL,
  `cep_fun` varchar(20) NOT NULL,
  `telefone_fun` varchar(20) NOT NULL,
  PRIMARY KEY (`id_fun`),
  UNIQUE KEY `id_fun` (`id_fun`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionarios`
--

LOCK TABLES `funcionarios` WRITE;
/*!40000 ALTER TABLE `funcionarios` DISABLE KEYS */;
INSERT INTO `funcionarios` VALUES (1,'joao silva','1234',4000,'farmacêutico','rua 123','teste','teste','BA','1234','12345'),(6,'josé santos','1233456',4000,'vendedor','av.alguma coisa','teste2','recife','PE','12345-   ','1234123'),(7,'osvaldo da costa','12945621',4000,'segurança','av.qualquer coisa','lalala','olinda','PE','12314-123','1234'),(8,'rodrigo','123123',8000,'vendedor','teste','teste','teste','BA','12341-231','12313');
/*!40000 ALTER TABLE `funcionarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produtos`
--

DROP TABLE IF EXISTS `produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produtos` (
  `pro_id` int(11) NOT NULL AUTO_INCREMENT,
  `pro_nome` varchar(100) CHARACTER SET latin1 NOT NULL,
  `pro_valor_custo` double(25,2) NOT NULL,
  `pro_valor_venda` double(25,2) NOT NULL,
  `pro_quantidade` int(11) NOT NULL,
  PRIMARY KEY (`pro_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produtos`
--

LOCK TABLES `produtos` WRITE;
/*!40000 ALTER TABLE `produtos` DISABLE KEYS */;
INSERT INTO `produtos` VALUES (1,'escova vermelha',20.00,30.00,98),(4,'Escova BRANCA',4.50,6.70,2),(5,'Chá verde',10.30,20.50,92),(6,'chá de bodo',20.40,30.00,33),(9,'caneta azul',2.00,3.00,21),(10,'compromidos',32.78,43.99,100),(11,'dipirona',10.00,20.00,198),(12,'pastilha',20.50,30.70,31),(13,'desodorante',4.50,8.10,499);
/*!40000 ALTER TABLE `produtos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id_usuario` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `usu_nome` varchar(150) NOT NULL,
  `usu_login` varchar(100) NOT NULL,
  `usu_senha` varchar(100) NOT NULL,
  PRIMARY KEY (`id_usuario`),
  UNIQUE KEY `id_usuario` (`id_usuario`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Rodrigo Sarmento','rodrigo','123'),(3,'João Silva','joao','123'),(4,'Maria Santos','maria','123');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendas`
--

DROP TABLE IF EXISTS `vendas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendas` (
  `id_vendas` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `fk_cliente` bigint(20) unsigned NOT NULL,
  `ven_data_venda` date NOT NULL,
  `ven_valor_liquido` double NOT NULL,
  `ven_valor_bruto` double NOT NULL,
  `ven_desconto` double NOT NULL,
  PRIMARY KEY (`id_vendas`),
  KEY `fkcliente` (`fk_cliente`),
  CONSTRAINT `vendas_ibfk_1` FOREIGN KEY (`fk_cliente`) REFERENCES `cliente` (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendas`
--

LOCK TABLES `vendas` WRITE;
/*!40000 ALTER TABLE `vendas` DISABLE KEYS */;
INSERT INTO `vendas` VALUES (1,4,'2019-05-18',50,60,10),(2,4,'2019-05-18',382.1,392.1,10),(3,4,'2019-05-18',115.7,120.7,5),(4,4,'2019-05-18',169.1,172.1,3),(5,4,'2019-05-18',167.1,172.1,5),(6,4,'2019-05-18',58,60,2),(7,4,'2019-05-18',182.2,184.2,2),(8,4,'2019-05-18',182.2,184.2,2),(9,4,'2019-05-18',182.2,184.2,2),(10,4,'2019-05-18',297,300,3),(11,4,'2019-05-18',298,300,2),(12,4,'2019-05-19',453.3,453.3,0),(14,4,'2019-05-18',179,180,1),(15,4,'2019-05-19',90,90,0),(17,4,'2019-05-18',28.7,30.7,2),(19,6,'2019-05-19',12.4,13.4,1),(23,6,'2019-05-19',306,306,0),(27,6,'2019-05-19',93,93,0),(29,4,'2019-05-19',120,120,0),(34,4,'2019-05-20',0,0,0),(35,4,'2019-05-20',0,0,0),(37,4,'2019-05-21',49.5,50.5,1),(38,4,'2019-05-21',56.5,60,3.5),(39,4,'2019-05-21',29.5,30,0.5),(40,4,'2019-05-21',30,30,0),(41,4,'2019-05-21',29,30,1),(42,4,'2019-05-21',29.5,30,0.5),(43,4,'2019-05-22',152,153.5,1.5),(44,4,'2019-05-25',15.2,16.2,1),(45,7,'2019-05-25',14.2,16.2,2),(46,4,'2019-05-25',51.79999923706055,54.3,2.5),(47,4,'2019-05-25',8.100000381469727,8.1,0),(48,7,'2019-05-25',24.299999999999997,24.299999999999997,0),(49,4,'2019-05-25',6.599999904632568,8.1,1.5),(50,4,'2019-05-27',7.099999904632568,8.1,1),(51,4,'2019-05-27',87,90,3),(52,4,'2019-05-27',127.0999984741211,128.1,1),(53,4,'2019-05-27',7.099999904632568,8.1,1);
/*!40000 ALTER TABLE `vendas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendas_produtos`
--

DROP TABLE IF EXISTS `vendas_produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendas_produtos` (
  `id_vendas_produtos` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `fk_produtos` bigint(20) unsigned NOT NULL,
  `fk_vendas` bigint(20) unsigned NOT NULL,
  `ven_pro_valor` double NOT NULL,
  `ven_pro_quantidade` int(11) NOT NULL,
  PRIMARY KEY (`id_vendas_produtos`),
  KEY `fkprodutos` (`fk_produtos`),
  KEY `fkvendas` (`fk_vendas`) USING BTREE,
  CONSTRAINT `vendas_produtos_ibfk_1` FOREIGN KEY (`fk_vendas`) REFERENCES `vendas` (`id_vendas`)
) ENGINE=InnoDB AUTO_INCREMENT=120 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendas_produtos`
--

LOCK TABLES `vendas_produtos` WRITE;
/*!40000 ALTER TABLE `vendas_produtos` DISABLE KEYS */;
INSERT INTO `vendas_produtos` VALUES (1,12,5,30.7,3),(3,1,6,30,2),(4,12,7,30.7,3),(6,12,8,30.7,3),(8,12,9,30.7,3),(10,1,10,30,5),(12,1,11,30,5),(14,1,12,30,3),(18,1,14,30,3),(24,12,17,30.7,1),(30,1,15,30,3),(31,4,1,6.7,2),(32,10,1,43.99,10),(45,4,19,6.7,2),(67,11,23,20,3),(68,5,23,20.5,10),(69,5,23,20.5,2),(84,1,29,30,2),(85,1,29,30,2),(90,1,34,30,1),(91,4,34,6.7,1),(92,1,35,30,1),(94,1,37,30,1),(95,5,37,20.5,1),(96,1,38,30,1),(97,6,38,30,1),(98,1,39,30,1),(99,1,40,30,1),(100,1,41,30,1),(101,1,42,30,1),(102,12,43,30.7,5),(103,13,44,8.1,2),(106,13,45,8.1,2),(107,1,46,30,1),(108,13,46,8.1,3),(109,1,46,30,1),(110,13,46,8.1,3),(111,13,47,8.1,1),(112,13,48,8.1,3),(113,13,49,8.1,1),(114,13,50,8.1,1),(115,6,51,30,3),(116,1,52,30,1),(117,6,52,30,3),(118,13,52,8.1,1),(119,13,53,8.1,1);
/*!40000 ALTER TABLE `vendas_produtos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'farmacia'
--

--
-- Dumping routines for database 'farmacia'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-27 22:02:34
