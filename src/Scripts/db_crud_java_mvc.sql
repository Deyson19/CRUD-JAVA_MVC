-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.1.72-community - MySQL Community Server (GPL)
-- SO del servidor:              Win32
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para crud_java_mvc
CREATE DATABASE IF NOT EXISTS `crud_java_mvc` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish2_ci */;
USE `crud_java_mvc`;

-- Volcando estructura para tabla crud_java_mvc.persona
CREATE TABLE IF NOT EXISTS `persona` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `Apellidos` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `Correo` varchar(150) COLLATE utf8_spanish2_ci NOT NULL,
  `Fecha_Nacimiento` date NOT NULL,
  `Pais` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `Profesion` varchar(150) COLLATE utf8_spanish2_ci NOT NULL,
  `rol_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `rol_id` (`rol_id`)
) ENGINE=MyISAM AUTO_INCREMENT=106 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- Volcando datos para la tabla crud_java_mvc.persona: 51 rows
DELETE FROM `persona`;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` (`id`, `Nombre`, `Apellidos`, `Correo`, `Fecha_Nacimiento`, `Pais`, `Profesion`, `rol_id`) VALUES
	(99, 'Lethia', 'Matchell', 'lmatchell1a@printfriendly.com', '1987-02-19', 'Paraguay', 'Docente', 3),
	(98, 'Fraser', 'Le Prevost', 'fleprevost19@blogger.com', '1999-05-09', 'Argentina', 'Operator', 2),
	(96, 'Siffre', 'Brilleman', 'sbrilleman17@google.com.hk', '1987-05-14', 'Angola', 'Sales Representative', 3),
	(95, 'Meta', 'Sheryne', 'msheryne16@hud.gov', '2002-10-01', 'Polonia', 'Ejecutivo de Cuentas bancarias', 3),
	(94, 'Kimble', 'Lourenco', 'klourenco15@angelfire.com', '1981-10-16', 'Brazil', 'Payment Adjustment Coordinator', 2),
	(90, 'Flora', 'Railton', 'frailton11@tripod.com', '1975-12-12', 'Yemen', 'Chemical Engineer', 4),
	(89, 'Abie', 'Poupard', 'apoupard10@squidoo.com', '2012-10-19', 'Thailand', 'Media Manager IV', 3),
	(88, 'Lonni', 'Taks', 'ltaksz@princeton.edu', '1992-02-14', 'China', 'Speech Pathologist', 4),
	(87, 'Phil', 'Seery', 'pseeryy@studiopress.com', '1978-09-27', 'China', 'Software Engineer IV', 1),
	(86, 'Kial', 'Chismon', 'kchismonx@timesonline.co.uk', '1980-08-08', 'Indonesia', 'Accounting Assistant IV', 4),
	(84, 'Clarette', 'Hamill', 'chamillv@hexun.com', '1977-01-15', 'France', 'Environmental Specialist', 1),
	(82, 'Currey', 'Murdy', 'cmurdyt@forbes.com', '1997-11-10', 'Albania', 'Account Coordinator', 4),
	(81, 'Yasmeen', 'Cockerill', 'ycockerills@yahoo.co.jp', '1974-03-26', 'Brazil', 'Technical Writer', 3),
	(80, 'Ruprecht', 'Bineham', 'rbinehamr@google.nl', '1999-03-02', 'Indonesia', 'Teacher', 2),
	(78, 'Tamera', 'Callear', 'tcallearp@shareasale.com', '1976-08-10', 'China', 'Structural Engineer', 1),
	(79, 'Alexei', 'Fluger', 'aflugerq@sbwire.com', '2005-12-12', 'Dominica', 'Pharmacist', 4),
	(72, 'Leif', 'Flemmich', 'lflemmichj@devhub.com', '1976-06-08', 'Croatia', 'Cost Accountant', 4),
	(70, 'Arvy', 'Liddel', 'aliddelh@theatlantic.com', '1993-05-10', 'Myanmar', 'Internal Auditor', 2),
	(105, 'Luciana Andrea', 'Castro Bonilla', 'luciana.castro8516@outlook.com', '1994-10-10', 'Argentina', 'Periodista', 3),
	(66, 'Eudora', 'Howsan', 'ehowsand@domainmarket.com', '1979-10-20', 'Thailand', 'Senior Financial Analyst', 1),
	(61, 'Athene', 'O\'Hanley', 'aohanley8@gravatar.com', '2016-12-13', 'Albania', 'Nurse', 3),
	(59, 'Caroljean', 'Guiden', 'cguiden6@bluehost.com', '2011-09-20', 'Indonesia', 'Graphic Designer', 2),
	(53, 'Timmie', 'Stewart', 'tstewart0@netlog.com', '2002-11-05', 'Philippines', 'Health Coach III', 2),
	(97, 'Molli', 'Ashworth', 'mashworth18@rambler.ru', '2018-03-16', 'Greece', 'Research Assistant I', 2),
	(93, 'Hedwiga', 'Perle', 'hperle14@baidu.com', '2010-08-23', 'Philippines', 'Compensation Analyst', 2),
	(92, 'Indira', 'Hinder', 'ihinder13@weibo.com', '2016-12-01', 'China', 'Technical Writer', 2),
	(91, 'Nicko', 'Vinton', 'nvinton12@macromedia.com', '1983-06-29', 'Syria', 'Senior Quality Engineer', 4),
	(85, 'Karalee', 'Plante', 'kplantew@imdb.com', '1982-04-18', 'Canada', 'Engineer I', 1),
	(83, 'Lee', 'Cleugh', 'lcleughu@wp.com', '1977-01-05', 'Sweden', 'Paralegal', 2),
	(77, 'Syd', 'Hincks', 'shinckso@ftc.gov', '1981-05-23', 'Tunisia', 'Account Coordinator', 1),
	(76, 'Elinore', 'Sergeant', 'esergeantn@lulu.com', '1983-09-09', 'Peru', 'Software Consultant', 2),
	(75, 'Belinda', 'Godbald', 'bgodbaldm@biglobe.ne.jp', '1971-07-12', 'Finland', 'Senior Editor', 4),
	(74, 'Karol', 'Erwin', 'kerwinl@vkontakte.ru', '2004-06-21', 'Brazil', 'Administrative Officer', 3),
	(73, 'Rachel', 'Antonietti', 'rantoniettik@craigslist.org', '1969-09-22', 'Indonesia', 'Civil Engineer', 4),
	(69, 'Andree', 'Bibb', 'abibbg@drupal.org', '2016-06-01', 'South Africa', 'Business Systems Development Analyst', 3),
	(67, 'Bette', 'Callway', 'bcallwaye@icq.com', '1992-09-11', 'Republic of the Congo', 'Design Engineer', 1),
	(65, 'Ashla', 'Woodhead', 'awoodheadc@microsoft.com', '1978-01-31', 'Indonesia', 'Business Systems Development Analyst', 2),
	(64, 'Midge', 'Oertzen', 'moertzenb@imgur.com', '1986-12-06', 'China', 'Assistant Media Planner', 4),
	(63, 'Aili', 'Salzburg', 'asalzburga@ezinearticles.com', '1968-09-18', 'Indonesia', 'Web Developer IV', 1),
	(62, 'Rance', 'Lark', 'rlark9@samsung.com', '1991-03-13', 'Russia', 'Engineer I', 2),
	(60, 'Dave', 'Strodder', 'dstrodder7@cnet.com', '1986-01-26', 'Yemen', 'Structural Analysis Engineer', 1),
	(58, 'Israel Jesse', 'MacCoveney Kurt', 'israel.maccoveney4733@mail.com', '2004-06-02', 'Ukraine', 'Software Test Engineer IV', 3),
	(57, 'Dallas', 'Agirre', 'dagirre4@reuters.com', '1973-05-18', 'China', 'Payment Adjustment Coordinator', 4),
	(56, 'Felix', 'Oiller', 'foiller3@ihg.com', '1995-02-13', 'China', 'Director of Sales', 2),
	(55, 'Livy', 'Ricardin', 'lricardin2@google.es', '1983-12-28', 'Brazil', 'Mechanical Systems Engineer', 3),
	(54, 'Vincent', 'Stit', 'vstit1@posterous.com', '1994-08-28', 'Russia', 'Junior Executive', 4),
	(100, 'Irwinn', 'Suttie', 'isuttie1b@sfgate.com', '2002-10-19', 'Armenia', 'Professor', 1),
	(101, 'Aubrey', 'Talboy', 'atalboy1c@springer.com', '1980-06-02', 'Bolivia', 'Sales Representative', 1),
	(102, 'Justis', 'Lant', 'jlant1d@mozilla.com', '1986-12-29', 'Republic of the Congo', 'Account Executive', 2),
	(103, 'Andres Camilo', 'Lopez', 'andres camilo.lopez_@mail.com', '2023-04-02', 'Dinamarca', 'Empleado del gobierno', 3),
	(104, 'Delicios Famoues', 'Lopez Perez', 'delicios.lopez-@yahoo.com', '2023-04-02', 'Caribean', 'Odontologo', 3);
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;

-- Volcando estructura para tabla crud_java_mvc.roles
CREATE TABLE IF NOT EXISTS `roles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- Volcando datos para la tabla crud_java_mvc.roles: 5 rows
DELETE FROM `roles`;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` (`id`, `nombre`) VALUES
	(1, 'Admin'),
	(2, 'Estudiante'),
	(3, 'Empleado'),
	(4, 'Secretario');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
