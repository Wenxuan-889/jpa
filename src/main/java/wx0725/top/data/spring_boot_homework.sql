# Host: 39.106.42.58  (Version: 5.7.32-log)
# Date: 2021-03-19 12:32:09
# Generator: MySQL-Front 5.3  (Build 4.234)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "t_article"
#

CREATE TABLE `t_article` (
  `Id` int(2) NOT NULL AUTO_INCREMENT COMMENT '文章id',
  `title` varchar(255) DEFAULT '' COMMENT '文章标题',
  `content` longtext COMMENT '文章内容',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

#
# Data for table "t_article"
#

INSERT INTO `t_article` VALUES (1,'Spring Boot 基础入门','从入门到精通讲解......'),(2,'Spring Cloud 基础入门','从入门到放弃......');

#
# Structure for table "t_comment"
#

CREATE TABLE `t_comment` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `content` longtext COMMENT '评论内容',
  `author` varchar(255) DEFAULT NULL COMMENT '评论作者',
  `a_id` int(2) DEFAULT NULL COMMENT '关联文章id',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

#
# Data for table "t_comment"
#

INSERT INTO `t_comment` VALUES (1,'很全、很详细 。\t','狂奔的蜗牛',1),(2,'赞一个','张三',1),(3,'写的不错','Tom',1),(4,'欢迎私信','Kitty',2),(5,'很好','文轩',2);
