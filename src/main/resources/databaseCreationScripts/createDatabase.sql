DROP DATABASE restapi;

CREATE DATABASE restapi;

USE restapi;

CREATE TABLE `blog` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `content` varchar(50000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;


INSERT INTO blog
VALUES(1, "Test", "Test text");