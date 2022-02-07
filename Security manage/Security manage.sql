/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80025
Source Host           : localhost:3306
Source Database       : Security manage

Target Server Type    : MYSQL
Target Server Version : 80025
File Encoding         : 65001

Date: 2022-01-29 17:02:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin_info`
-- ----------------------------
DROP TABLE IF EXISTS `admin_info`;
CREATE TABLE `admin_info` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `login_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '登录名',
  `password` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100002 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin COMMENT='管理员';

-- ----------------------------
-- Records of admin_info
-- ----------------------------
INSERT INTO `admin_info` VALUES ('100001', 'admin', '123');

-- ----------------------------
-- Table structure for `meeting_info`
-- ----------------------------
DROP TABLE IF EXISTS `meeting_info`;
CREATE TABLE `meeting_info` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `meeting_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '会议名',
  `room_id` int DEFAULT NULL COMMENT '会议室ID',
  `user_id` int DEFAULT NULL COMMENT '用户ID',
  `meeting_intro` varchar(1000) COLLATE utf8_bin DEFAULT NULL COMMENT '会议简介',
  `order_date` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '预约日期',
  `order_time` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '预约时间',
  `order_status` int DEFAULT NULL COMMENT '预约状态',
  `check_remark` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '审核备注',
  `create_time` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '申请时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin COMMENT='会议';

-- ----------------------------
-- Records of meeting_info
-- ----------------------------

-- ----------------------------
-- Table structure for `meeting_user_info`
-- ----------------------------
DROP TABLE IF EXISTS `meeting_user_info`;
CREATE TABLE `meeting_user_info` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `meeting_id` int DEFAULT NULL COMMENT '会议ID',
  `meeting_user_id` int DEFAULT NULL COMMENT '会议发起人',
  `user_id` int DEFAULT NULL COMMENT '参会人员',
  `user_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '姓名',
  `user_cel` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户手机号',
  `order_date` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '会议日期',
  `order_time` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '会议时间',
  `sign_status` int DEFAULT NULL COMMENT '签到状态',
  `create_time` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '发起时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin COMMENT='参会人员';

-- ----------------------------
-- Records of meeting_user_info
-- ----------------------------

-- ----------------------------
-- Table structure for `notice_info`
-- ----------------------------
DROP TABLE IF EXISTS `notice_info`;
CREATE TABLE `notice_info` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `title` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '标题',
  `content` varchar(1000) COLLATE utf8_bin DEFAULT NULL COMMENT '内容',
  `create_time` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin COMMENT='公告';

-- ----------------------------
-- Records of notice_info
-- ----------------------------

-- ----------------------------
-- Table structure for `room_info`
-- ----------------------------
DROP TABLE IF EXISTS `room_info`;
CREATE TABLE `room_info` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `room_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '会议室名',
  `room_address` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '地址',
  `room_status` int DEFAULT NULL COMMENT '当前状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin COMMENT='会议室';

-- ----------------------------
-- Records of room_info
-- ----------------------------

-- ----------------------------
-- Table structure for `service_info`
-- ----------------------------
DROP TABLE IF EXISTS `service_info`;
CREATE TABLE `service_info` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `service_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '设备名',
  `room_id` int DEFAULT NULL COMMENT '会议室ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin COMMENT='会议室设备';

-- ----------------------------
-- Records of service_info
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_setting_info`
-- ----------------------------
DROP TABLE IF EXISTS `sys_setting_info`;
CREATE TABLE `sys_setting_info` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `order_model` int DEFAULT NULL COMMENT '预约模式',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin COMMENT='系统设置';

-- ----------------------------
-- Records of sys_setting_info
-- ----------------------------
INSERT INTO `sys_setting_info` VALUES ('1', '1');

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `login_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '登录名',
  `password` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '密码',
  `real_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '姓名',
  `cel_phone` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '联系电话',
  `sex` int DEFAULT NULL COMMENT '性别',
  `department` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `region` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `levels` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `banzu` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `post` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `create_time` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '注册时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin COMMENT='用户';

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('4', '070290', '123', '王帅', '15661472960', '1', '电气自动化部', '1#冷区', '第一层级', '甲班', '无', '2022-01-24 09:58:02');
INSERT INTO `user_info` VALUES ('5', '016766', '123', '刘超', '13739979093', '1', '电气自动化部', '1#冷区', '第二层级', '甲班', '班长', '2022-01-24 10:31:47');
INSERT INTO `user_info` VALUES ('6', '100002', '123', '测试', '19536653655', '2', '电气自动化部', '1#冷区', '第一层级', '甲班', '白班', '2022-01-27 09:19:58');
INSERT INTO `user_info` VALUES ('7', '100003', '123', '小王', '13947228721', '1', '电气自动化部', '1#冷区', '第一层级', '甲班', '技术员', '2022-01-27 09:26:50');
INSERT INTO `user_info` VALUES ('9', '100004', '123', '王帅帅', '13947228721', '1', '机械', '1#热', '第三层级', '常白班', '技术员', '2022-01-29 08:57:46');
INSERT INTO `user_info` VALUES ('10', '100005', '123', '张晋德', '15661472960', '1', '机械', '1#热', '第二层级', '丙班', '班长', '2022-01-29 10:02:02');
