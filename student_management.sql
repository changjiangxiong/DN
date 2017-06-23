/*
Navicat MySQL Data Transfer

Source Server         : myDB
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : student_management

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2017-06-21 22:41:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_grade`
-- ----------------------------
DROP TABLE IF EXISTS `t_grade`;
CREATE TABLE `t_grade` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `s_id` bigint(20) NOT NULL COMMENT '学生主键',
  `regular_grade` decimal(5,2) DEFAULT NULL COMMENT '平时成绩',
  `major_grade` decimal(5,2) DEFAULT NULL COMMENT '大作业成绩',
  `final_grade` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_grade
-- ----------------------------
INSERT INTO `t_grade` VALUES ('1', '1', '20.00', '40.00', '30.00');
INSERT INTO `t_grade` VALUES ('2', '7', '20.00', '30.00', '40.00');

-- ----------------------------
-- Table structure for `t_student`
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `student_id` varchar(20) NOT NULL COMMENT '学号',
  `student_name` varchar(20) NOT NULL COMMENT '学生姓名',
  `major_name` varchar(20) NOT NULL COMMENT '专业名称',
  `grade_name` varchar(10) NOT NULL COMMENT '年级名称“大一”“大二”“大三”“大四”',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES ('1', '2017022001', '赵匡胤', '计算机', '大一');
INSERT INTO `t_student` VALUES ('3', '2017022002', '赵光义', '文科', '大一');
INSERT INTO `t_student` VALUES ('7', '2017022005', '李世民', '建筑', '大四');
