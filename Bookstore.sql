CREATE DATABASE  IF NOT EXISTS `bookstore_directory`;
USE `bookstore_directory`;

--
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `author`;

CREATE TABLE `author` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `pseudonym` varchar(45),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `author` varchar(45) DEFAULT NULL,
  `cover` varchar(200) DEFAULT NULL,
  `price` float(5) DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `author`
--
INSERT INTO `author` VALUES 
	('1','Ann'),
	('2','Beth'),
	('3','Cass'),
	('4','Dolly'),
	('5','Emma');
    
--
-- Data for table `book`
--

INSERT INTO `book` VALUES 
	('1','Never gonna give you up','lyrics1','Ann','','1.99'),
	('2', 'Never gonna let you down','lyrics2','Beth','','2.99'),
	('3', 'Never gonna run around and desert you','lyrics3','Cass','','3.99'),
	('4', 'Never gonna make you cry','lyrics4','Dolly','','4.99'),
	('5', 'Never gonna say goodbye','lyrics5','Emma','','5.99');

