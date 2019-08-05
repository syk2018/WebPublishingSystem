/*
 Navicat Premium Data Transfer

 Source Server         : cloud
 Source Server Type    : MySQL
 Source Server Version : 50643
 Source Host           : syk2018.cn:3306
 Source Schema         : WebPublishingSystem

 Target Server Type    : MySQL
 Target Server Version : 50643
 File Encoding         : 65001

 Date: 05/08/2019 17:49:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Article
-- ----------------------------
DROP TABLE IF EXISTS `Article`;
CREATE TABLE `Article` (
  `articleId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'article_ID',
  `articleSessionId` bigint(20) NOT NULL COMMENT 'article_ ID of sessions',
  `articleUserId` bigint(20) NOT NULL COMMENT 'article_ ID of users',
  `articleTitle` text NOT NULL COMMENT 'artcle_Title',
  `articleTime` datetime NOT NULL COMMENT 'article_Publish Time',
  `articleClickCount` int(11) DEFAULT NULL COMMENT 'article_Click_Count',
  `articleConsentient` int(11) NOT NULL COMMENT 'article_publish_Is_Allowed',
  `articleLastCommentTime` datetime DEFAULT NULL COMMENT 'article_Lastest_Comment_Time',
  `articleContentsHTML` longtext NOT NULL COMMENT 'article_Contents_With_HTML',
  PRIMARY KEY (`articleId`),
  KEY `articleSID` (`articleSessionId`),
  KEY `Article_Users_user_id_fk` (`articleUserId`),
  CONSTRAINT `Article_Sessions_session_id_fk` FOREIGN KEY (`articleSessionId`) REFERENCES `Sessions` (`session_id`),
  CONSTRAINT `Article_Users_user_id_fk` FOREIGN KEY (`articleUserId`) REFERENCES `Users` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=118 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for Comments
-- ----------------------------
DROP TABLE IF EXISTS `Comments`;
CREATE TABLE `Comments` (
  `commentID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'comment_ID',
  `commentAID` bigint(20) NOT NULL COMMENT 'comment_ ID of article include the comment',
  `commentUID` bigint(20) NOT NULL COMMENT 'comment_ ID of user sent it',
  `commentContent` text NOT NULL COMMENT 'comment_Content',
  `commentTIme` datetime DEFAULT NULL COMMENT 'comment_Publish_Time',
  PRIMARY KEY (`commentID`),
  KEY `commentAID` (`commentAID`),
  KEY `commentUID` (`commentUID`),
  CONSTRAINT `comments_ibfk_1` FOREIGN KEY (`commentAID`) REFERENCES `Article` (`articleId`),
  CONSTRAINT `comments_ibfk_2` FOREIGN KEY (`commentUID`) REFERENCES `Users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for File
-- ----------------------------
DROP TABLE IF EXISTS `File`;
CREATE TABLE `File` (
  `file_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'file_ID',
  `fileUrl` varchar(100) NOT NULL COMMENT 'file_Url',
  `type` enum('pic','viedo') DEFAULT NULL,
  `fileName` varchar(100) NOT NULL,
  `groupName` varchar(100) NOT NULL,
  PRIMARY KEY (`file_id`)
) ENGINE=InnoDB AUTO_INCREMENT=189 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for Following
-- ----------------------------
DROP TABLE IF EXISTS `Following`;
CREATE TABLE `Following` (
  `user_id` bigint(20) NOT NULL DEFAULT '0' COMMENT 'user_id PRIMARY KEY',
  `following_user_id` bigint(20) NOT NULL DEFAULT '0' COMMENT 'attention_user_id PRIMARY KEY',
  PRIMARY KEY (`user_id`,`following_user_id`),
  KEY `attention_user_id` (`following_user_id`),
  CONSTRAINT `Following_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `Users` (`user_id`),
  CONSTRAINT `Following_ibfk_2` FOREIGN KEY (`following_user_id`) REFERENCES `Users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for Log
-- ----------------------------
DROP TABLE IF EXISTS `Log`;
CREATE TABLE `Log` (
  `log_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'log_ID',
  `user_id` bigint(20) NOT NULL COMMENT 'user_ID',
  `logTime` datetime NOT NULL COMMENT 'log_Time',
  `logLastIPAdress` varchar(20) NOT NULL COMMENT 'Lastest_IP_Address of user to login',
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB AUTO_INCREMENT=149 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for Sessions
-- ----------------------------
DROP TABLE IF EXISTS `Sessions`;
CREATE TABLE `Sessions` (
  `session_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'session_ID',
  `sessionName` varchar(20) NOT NULL COMMENT 'session_Name',
  `session_img_id` bigint(20) NOT NULL,
  PRIMARY KEY (`session_id`),
  UNIQUE KEY `Sessions_sessionName_uindex` (`sessionName`),
  KEY `Sessions_File_file_id_fk` (`session_img_id`),
  CONSTRAINT `Sessions_File_file_id_fk` FOREIGN KEY (`session_img_id`) REFERENCES `File` (`file_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for Users
-- ----------------------------
DROP TABLE IF EXISTS `Users`;
CREATE TABLE `Users` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'user_ID',
  `userName` varchar(20) NOT NULL COMMENT 'user_Name',
  `userPwd` varchar(50) NOT NULL COMMENT 'user_Password',
  `userAvatar` bigint(20) DEFAULT '1' COMMENT 'user_Avatar',
  `userDescription` varchar(100) DEFAULT NULL COMMENT 'user_Description',
  `userRegDate` datetime NOT NULL COMMENT 'user_Register_Date',
  `userIsManager` int(11) NOT NULL COMMENT 'user_IsManager',
  `userNickname` varchar(20) NOT NULL COMMENT 'user_nickname',
  `userAttention` int(11) DEFAULT '0',
  `userFans` int(11) DEFAULT '0',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `userName` (`userName`),
  KEY `userAvatar` (`userAvatar`),
  CONSTRAINT `Users_FIle_file_id_fk` FOREIGN KEY (`userAvatar`) REFERENCES `File` (`file_id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Triggers structure for table Following
-- ----------------------------
DROP TRIGGER IF EXISTS `trigger_addAttention`;
delimiter ;;
CREATE TRIGGER `trigger_addAttention` AFTER INSERT ON `Following` FOR EACH ROW BEGIN
	UPDATE Users set userAttention=userAttention+1 WHERE Users.user_id=(SELECT user_id FROM INSERTED);
	UPDATE Users set userFans=userFans+1 WHERE Users.user_id=(SELECT attention_user_id FROM INSERTED);
END
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table Following
-- ----------------------------
DROP TRIGGER IF EXISTS `trigger_deleteAttention`;
delimiter ;;
CREATE TRIGGER `trigger_deleteAttention` AFTER DELETE ON `Following` FOR EACH ROW BEGIN
	UPDATE Users set userAttention=userAttention-1 WHERE Users.user_id=(SELECT user_id FROM DELETED);
	UPDATE Users set userFans=userFans-1 WHERE Users.user_id=(SELECT attention_user_id FROM DELETED);
END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
