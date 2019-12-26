DROP TABLE IF EXISTS `proverb`;

CREATE TABLE `proverb` (
  `proverb_id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `star` int(11) DEFAULT '0',
  `create_time` timestamp NULL DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`proverb_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `proverb` (`proverb_id`, `content`, `star`, `create_time`, `update_time`)
VALUES
	(1,'读书百遍其义自见',8,'2019-12-16 00:30:30','2019-12-20 12:01:27'),
	(2,'搬起石头砸自己的脚',29,'2019-12-16 00:30:30','2019-12-21 15:44:51'),
	(3,'一等二靠三落空,一想二干三成功',13,'2019-12-16 00:30:30','2019-12-20 12:01:25'),
	(4,'杀人不过头点地,要死也是屌朝天',4,'2019-12-16 00:30:30','2019-12-25 15:26:56'),
	(5,'人怕出名,猪怕肥',1,'2019-12-16 00:30:30','2019-12-20 12:45:09'),
	(6,'人摇福薄,树摇叶落',4,'2019-12-16 00:30:30','2019-12-21 10:47:40'),
	(7,'嘴上笑嘻嘻,心里mmp',4,'2019-12-16 00:30:30','2019-12-21 10:47:41'),
	(8,'谁人背后无人说,哪个人前不说人',9,'2019-12-16 00:30:30','2019-12-25 13:36:34'),
	(9,'是非终日有,不听自然无',2,'2019-12-16 00:30:30','2019-12-21 10:47:32'),
	(10,'人见白头嗔,我见白头喜',2,'2019-12-16 00:30:30','2019-12-21 10:47:33'),
	(11,'万事劝人休瞒昧,举头三尺有神明',2,'2019-12-16 00:30:30','2019-12-21 10:47:34'),
	(12,'闲时不烧香,急时抱佛脚',2,'2019-12-16 00:30:30','2019-12-21 10:47:35');

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(16) DEFAULT NULL,
  `password` varchar(16) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `user` (`user_id`, `username`, `password`, `create_time`, `update_time`)
VALUES
	(1,'cr','6549','2019-12-19 00:14:06','2019-12-26 21:48:33');