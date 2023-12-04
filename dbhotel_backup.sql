/*
SQLyog Ultimate v12.4.0 (64 bit)
MySQL - 8.2.0 : Database - dbhotel
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dbhotel` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `dbhotel`;

/*Table structure for table `clientes` */

DROP TABLE IF EXISTS `clientes`;

CREATE TABLE `clientes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_persona` int NOT NULL,
  `empresa` varchar(250) DEFAULT NULL,
  `fecha_creado` datetime NOT NULL,
  `fecha_actualizado` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_persona` (`id_persona`),
  CONSTRAINT `clientes_ibfk_1` FOREIGN KEY (`id_persona`) REFERENCES `personas` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `clientes` */

insert  into `clientes`(`id`,`id_persona`,`empresa`,`fecha_creado`,`fecha_actualizado`) values 
(1,2,'Alex Quispe','2023-11-25 15:02:21','2023-12-01 23:20:17'),
(2,3,'Mario quispe','2023-11-25 15:11:44','2023-12-01 21:16:38'),
(3,4,'Deysi Quispe','2023-11-25 16:00:25','2023-12-01 21:13:09'),
(4,5,'trytrytry tryrtytry','2023-12-01 10:44:44','2023-12-01 21:12:33'),
(5,6,'Jon SA TRavolta','2023-12-01 17:40:29','2023-12-03 10:35:20'),
(6,7,'Lorena Gutierrez','2023-12-01 19:11:10','2023-12-01 21:12:42'),
(7,8,'Jova Sa Robles','2023-12-01 19:19:50','2023-12-01 21:12:46'),
(8,9,'Luis Quinteros','2023-12-01 20:20:11',NULL),
(9,10,'Leopoldo test','2023-12-01 20:23:10',NULL),
(10,11,'Ruth Lopez','2023-12-01 20:27:47',NULL),
(11,12,'ghjghjhgj hgjghjhgj','2023-12-01 22:45:35','2023-12-01 22:54:16'),
(12,13,'Raquel Torres','2023-12-01 22:49:22',NULL),
(13,14,'Rosa Palacios Samaritano','2023-12-01 23:06:04','2023-12-01 23:11:01'),
(14,15,'Arturo Vidal','2023-12-02 01:02:41',NULL),
(15,16,'Yoga Tesla','2023-12-02 01:08:28',NULL);

/*Table structure for table `comprobantes` */

DROP TABLE IF EXISTS `comprobantes`;

CREATE TABLE `comprobantes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_reserva` int NOT NULL,
  `id_empleado` int NOT NULL,
  `tipo_comprobante` int NOT NULL,
  `estado` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `fecha_pagado` datetime DEFAULT NULL,
  `fecha_creado` datetime NOT NULL,
  `fecha_actualizado` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_reserva` (`id_reserva`),
  KEY `id_empleado` (`id_empleado`),
  CONSTRAINT `comprobantes_ibfk_1` FOREIGN KEY (`id_reserva`) REFERENCES `reservas` (`id`),
  CONSTRAINT `comprobantes_ibfk_2` FOREIGN KEY (`id_empleado`) REFERENCES `empleados` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `comprobantes` */

/*Table structure for table `empleados` */

DROP TABLE IF EXISTS `empleados`;

CREATE TABLE `empleados` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_persona` int NOT NULL,
  `id_perfil` int NOT NULL,
  `sueldo` decimal(10,0) NOT NULL,
  `fecha_creado` datetime NOT NULL,
  `fecha_actualizado` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_persona` (`id_persona`),
  KEY `id_perfil` (`id_perfil`),
  CONSTRAINT `empleados_ibfk_1` FOREIGN KEY (`id_persona`) REFERENCES `personas` (`id`),
  CONSTRAINT `empleados_ibfk_2` FOREIGN KEY (`id_perfil`) REFERENCES `perfiles` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `empleados` */

insert  into `empleados`(`id`,`id_persona`,`id_perfil`,`sueldo`,`fecha_creado`,`fecha_actualizado`) values 
(1,17,1,7800,'2023-12-04 12:31:54','2023-12-04 15:16:46'),
(2,18,2,2500,'2023-12-04 14:13:01','2023-12-04 15:03:46');

/*Table structure for table `habitaciones` */

DROP TABLE IF EXISTS `habitaciones`;

CREATE TABLE `habitaciones` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_tipohabitacion` int NOT NULL,
  `descripcion` varchar(250) NOT NULL,
  `nivel` varchar(25) NOT NULL,
  `numero_piso` varchar(25) NOT NULL,
  `precio` decimal(10,0) NOT NULL,
  `cantidad_camas` int NOT NULL,
  `fecha_creado` datetime NOT NULL,
  `fecha_actualizado` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_tipohabitacion` (`id_tipohabitacion`),
  CONSTRAINT `habitaciones_ibfk_1` FOREIGN KEY (`id_tipohabitacion`) REFERENCES `tipo_habitacion` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `habitaciones` */

/*Table structure for table `perfiles` */

DROP TABLE IF EXISTS `perfiles`;

CREATE TABLE `perfiles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `permisos` varchar(250) NOT NULL,
  `fecha_creado` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `perfiles` */

insert  into `perfiles`(`id`,`nombre`,`permisos`,`fecha_creado`) values 
(1,'Administrador','{}','2023-11-25 13:38:01'),
(2,'Recepcionista','{}','2023-12-04 12:16:24');

/*Table structure for table `personas` */

DROP TABLE IF EXISTS `personas`;

CREATE TABLE `personas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `tipo_documento` int NOT NULL,
  `nrodocumento` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sexo` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `edad` varchar(5) DEFAULT NULL,
  `telefono` varchar(25) DEFAULT NULL,
  `estado` varchar(50) DEFAULT NULL,
  `fecha_creado` datetime NOT NULL,
  `fecha_actualizado` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `personas` */

insert  into `personas`(`id`,`nombre`,`apellido`,`tipo_documento`,`nrodocumento`,`sexo`,`edad`,`telefono`,`estado`,`fecha_creado`,`fecha_actualizado`) values 
(1,'alex','quispe',1,'72482060','M','30','938590453','activo','2023-11-25 14:56:55',NULL),
(2,'Alex','Quispe',1,'72482060','M','30','988545643','activo','2023-11-25 15:02:21','2023-12-01 23:20:17'),
(3,'Mario','quispe',1,'72482060','M','30','999387502','activo','2023-11-25 15:11:44','2023-12-01 21:16:38'),
(4,'Deysi','Quispe',1,'98598366','F','28','909095945','activo','2023-11-25 16:00:25','2023-12-01 21:13:09'),
(5,'trytrytry','tryrtytry',1,'7686786867','M','57','9686767','activo','2023-12-01 10:44:44','2023-12-01 21:12:33'),
(6,'Jon SA','TRavolta',2,'20502945344','M','67','845645645','activo','2023-12-01 17:40:29','2023-12-03 10:35:20'),
(7,'Lorena','Gutierrez',1,'67676767','F','35','985363556','activo','2023-12-01 19:11:10','2023-12-01 21:12:42'),
(8,'Jova Sa','Robles',1,'20849545354','M','29','9887787','activo','2023-12-01 19:19:50','2023-12-01 21:12:46'),
(9,'Luis','Quinteros',1,'98895454','M','78','99884453','activo','2023-12-01 20:20:11',NULL),
(10,'Leopoldo','test',1,'985454','M','34','98848545','activo','2023-12-01 20:23:10',NULL),
(11,'Ruth','Lopez',1,'72498535','F','24','999555999','activo','2023-12-01 20:27:47',NULL),
(12,'ghjghjhgj','hgjghjhgj',1,'67567567','M','56','879879','inactivo','2023-12-01 22:45:35','2023-12-01 22:54:16'),
(13,'Raquel','Torres',1,'73545643','F','34','999456285','activo','2023-12-01 22:49:22',NULL),
(14,'Rosa','Palacios Samaritano',1,'67543285','F','60','999435765','inactivo','2023-12-01 23:06:04','2023-12-01 23:11:01'),
(15,'Arturo','Vidal',1,'86765863','M','56','99083953','activo','2023-12-02 01:02:41',NULL),
(16,'Yoga','Tesla',1,'6546456','M','45','6576756756','activo','2023-12-02 01:08:28',NULL),
(17,'Jhon','Vasco de Gama',0,'967989','M','34','9998787','activo','2023-12-04 12:31:54','2023-12-04 15:16:46'),
(18,'Luisa','Chavez',0,'095969546','F','42','999563655','activo','2023-12-04 14:13:01','2023-12-04 15:03:46');

/*Table structure for table `productos` */

DROP TABLE IF EXISTS `productos`;

CREATE TABLE `productos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(250) NOT NULL,
  `precio` decimal(10,0) NOT NULL,
  `cantidad_stock` int NOT NULL,
  `fecha_creado` datetime NOT NULL,
  `fecha_actualizado` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `productos` */

/*Table structure for table `reserva_consumos` */

DROP TABLE IF EXISTS `reserva_consumos`;

CREATE TABLE `reserva_consumos` (
  `id_reserva` int NOT NULL,
  `id_producto` int NOT NULL,
  `cantidad` int NOT NULL,
  `precio` decimal(2,0) NOT NULL,
  `fecha_creado` datetime NOT NULL,
  `fecha_actualizado` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `reserva_consumos` */

/*Table structure for table `reservas` */

DROP TABLE IF EXISTS `reservas`;

CREATE TABLE `reservas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_cliente` int NOT NULL,
  `id_habitacion` int NOT NULL,
  `id_empleado` int NOT NULL,
  `monto_total` decimal(2,0) NOT NULL,
  `estado` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `fecha_reserva` datetime DEFAULT NULL,
  `fecha_entrada` datetime DEFAULT NULL,
  `fecha_salida` datetime DEFAULT NULL,
  `fecha_creado` datetime NOT NULL,
  `fecha_actualizado` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_cliente` (`id_cliente`),
  KEY `id_habitacion` (`id_habitacion`),
  KEY `id_empleado` (`id_empleado`),
  CONSTRAINT `reservas_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id`),
  CONSTRAINT `reservas_ibfk_2` FOREIGN KEY (`id_habitacion`) REFERENCES `habitaciones` (`id`),
  CONSTRAINT `reservas_ibfk_3` FOREIGN KEY (`id_empleado`) REFERENCES `empleados` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `reservas` */

/*Table structure for table `tipo_habitacion` */

DROP TABLE IF EXISTS `tipo_habitacion`;

CREATE TABLE `tipo_habitacion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(250) NOT NULL,
  `fecha_creado` datetime NOT NULL,
  `fecha_actualizado` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `tipo_habitacion` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
