/*
Navicat MySQL Data Transfer

Source Server         : 10.110.1.240
Source Server Version : 50638
Source Host           : 10.110.1.240:3306
Source Database       : tuandai_bm_core

Target Server Type    : MYSQL
Target Server Version : 50638
File Encoding         : 65001

Date: 2017-11-20 09:00:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_account
-- ----------------------------
DROP TABLE IF EXISTS `tb_account`;
CREATE TABLE `tb_account` (
  `account_id` char(36) COLLATE utf8_unicode_ci NOT NULL COMMENT '账户编号guid',
  `account_no` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '账户号码,帐号标识',
  `account_type` int(11) NOT NULL DEFAULT '0' COMMENT '账户类型表账户编号0:借款人账户1:分公司账户...',
  `account_name` varchar(100) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '账户名称',
  `main_id` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '账户主体编号,个人是身份证,企业是统一信用编码或者营业执照',
  `main_type` int(11) NOT NULL DEFAULT '1' COMMENT '账户主体编号,1;个人,2:企业',
  `business_from` int(11) NOT NULL DEFAULT '1' COMMENT '所属资产端,1:鸿特,2:一点车贷...',
  `branch_id` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '所属分公司',
  `account_amount` decimal(18,2) NOT NULL DEFAULT '0.00' COMMENT '可用余额',
  `frozen_amount` decimal(18,2) NOT NULL DEFAULT '0.00' COMMENT '冻结余额',
  `status_flag` int(11) NOT NULL DEFAULT '1' COMMENT '账户状态,1:启用,0:禁用',
  `frozen_flag` int(11) NOT NULL DEFAULT '0' COMMENT '账户是否被冻结,1:冻结,0:未冻结',
  `create_user` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '创建用户',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_user` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '更新用户',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `remark` varchar(512) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`account_id`),
  UNIQUE KEY `idx_tb_account` (`account_no`),
  UNIQUE KEY `idx_main_id` (`main_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='账户表';

-- ----------------------------
-- Records of tb_account
-- ----------------------------
INSERT INTO `tb_account` VALUES ('1f3c9084-3021-4e2c-a149-c36a60bdb21e', '20171116113311783', '1', '二师兄', '20171116113311783', '1', '1', '猪八戒', '100.00', '0.11', '1', '1', '二师兄猪八戒', '2017-11-16 11:33:12', '小猪八戒', '2017-11-16 11:33:12', '测试数据是不是二师兄猪八戒 菜菜子');
INSERT INTO `tb_account` VALUES ('2ca045b7-9400-4b39-a5a1-86097d20d9e5', '2ca045b7-9400-4b39-a5a1-86097d20d9e5', '0', '', '513701198412010111', '1', '1', '', '272124.00', '0.00', '1', '0', 'vincent', '2017-11-17 22:26:26', 'vince', '2017-11-17 23:01:51', '');
INSERT INTO `tb_account` VALUES ('31fc9a73-e43e-49b5-96b4-476aba9c0e85', '20171116112422202', '1', '二师兄', '20171116112422202', '1', '1', '猪八戒', '100.00', '0.11', '1', '1', '二师兄猪八戒', '2017-11-16 11:24:22', '小猪八戒', '2017-11-16 11:24:22', '测试数据是不是二师兄猪八戒 菜菜子');
INSERT INTO `tb_account` VALUES ('42738dab-a93f-4c75-8da0-daaf38935421', '42738dab-a93f-4c75-8da0-daaf38935421', '0', '', '339005198106068314', '1', '1', '', '46788.00', '0.00', '1', '0', 'vince', '2017-11-17 22:54:42', 'vince', '2017-11-17 23:02:00', '');
INSERT INTO `tb_account` VALUES ('47de81b9-33c5-4ca5-bb67-f505412e17b5', '47de81b9-33c5-4ca5-bb67-f505412e17b5', '0', '', '440521197809121716', '1', '1', '', '54432.00', '0.00', '1', '0', 'vince', '2017-11-17 22:56:48', 'vince', '2017-11-17 23:02:00', '');
INSERT INTO `tb_account` VALUES ('71c639b6-35c1-4948-b44b-b2a1bd61c324', '20171116113546298', '1', '二师兄', '20171116113546298', '1', '1', '猪八戒', '100.00', '0.11', '1', '1', '二师兄猪八戒', '2017-11-16 11:35:46', '小猪八戒', '2017-11-16 11:35:46', '测试数据是不是二师兄猪八戒 菜菜子');
INSERT INTO `tb_account` VALUES ('7f5207c5-9a24-4d6f-b92b-808aaa83f314', '123456789', '1', '二师兄', '二师弟', '1', '1', '猪八戒', '100.00', '0.11', '1', '1', '二师兄猪八戒', '2017-11-16 10:53:16', '小猪八戒', '2017-11-16 10:53:16', '测试数据是不是二师兄猪八戒 菜菜子');
INSERT INTO `tb_account` VALUES ('8638de52-4216-4a04-886b-b00cd0ddaa39', '20171116112042589', '1', '二师兄', '20171116112042589', '1', '1', '猪八戒', '100.00', '0.11', '1', '1', '二师兄猪八戒', '2017-11-16 11:20:42', '小猪八戒', '2017-11-16 11:20:42', '测试数据是不是二师兄猪八戒 菜菜子');
INSERT INTO `tb_account` VALUES ('c1c4cb26-9a37-48ab-af32-f24c34bb336e', '20171116112727957', '1', '二师兄', '20171116112727957', '1', '1', '猪八戒', '100.00', '0.11', '1', '1', '二师兄猪八戒', '2017-11-16 11:27:28', '小猪八戒', '2017-11-16 11:27:28', '测试数据是不是二师兄猪八戒 菜菜子');
INSERT INTO `tb_account` VALUES ('c7d6c6d0-ab1d-4833-8730-8c4e264a0d7d', 'e2fd0614-6819-43b8-a24c-fd10743e7290', '0', '黄永胜', '429004197908120058', '1', '1', '3ee3ce48-26cf-4ffd-a258-aa4ec43d4cf8', '800.00', '0.00', '1', '0', 'admin', '2017-11-16 11:40:06', 'admin', '2017-11-17 14:51:54', '测试');
INSERT INTO `tb_account` VALUES ('f7bfdb68-eebc-4a24-98af-a10d3a223ff2', '20171116111908971', '1', '二师兄', '20171116111908971', '1', '1', '猪八戒', '100.00', '0.11', '1', '1', '二师兄猪八戒', '2017-11-16 11:19:09', '小猪八戒', '2017-11-16 11:19:09', '测试数据是不是二师兄猪八戒 菜菜子');

-- ----------------------------
-- Table structure for tb_account_action
-- ----------------------------
DROP TABLE IF EXISTS `tb_account_action`;
CREATE TABLE `tb_account_action` (
  `action_id` int(11) NOT NULL COMMENT '交易活动编号',
  `action_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '交易活动名称',
  `status_flag` int(1) NOT NULL DEFAULT '1' COMMENT '状态1:开启0:关闭',
  `create_user` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '创建用户',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_user` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '更新用户',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`action_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='交易活动表';

-- ----------------------------
-- Records of tb_account_action
-- ----------------------------
INSERT INTO `tb_account_action` VALUES ('0', '满标分润', '1', 'admin', '2017-11-17 10:28:16', 'admin', '2017-11-17 10:28:16');
INSERT INTO `tb_account_action` VALUES ('1', '提现放款', '1', 'admin', '2017-11-17 10:28:16', 'admin', '2017-11-17 10:28:16');
INSERT INTO `tb_account_action` VALUES ('2', '出款登记', '1', 'admin', '2017-11-17 10:28:16', 'admin', '2017-11-17 10:28:16');
INSERT INTO `tb_account_action` VALUES ('3', '还款确认', '1', 'admin', '2017-11-17 10:28:16', 'admin', '2017-11-17 10:28:16');
INSERT INTO `tb_account_action` VALUES ('4', '代扣还款', '1', 'admin', '2017-11-17 10:28:16', 'admin', '2017-11-17 10:28:16');
INSERT INTO `tb_account_action` VALUES ('5', '退费', '1', 'admin', '2017-11-17 10:28:16', 'admin', '2017-11-17 10:28:16');
INSERT INTO `tb_account_action` VALUES ('6', '充值', '1', 'admin', '2017-11-17 10:28:16', 'admin', '2017-11-17 10:28:16');
INSERT INTO `tb_account_action` VALUES ('7', '提现', '1', 'admin', '2017-11-17 10:28:16', 'admin', '2017-11-17 10:28:16');

-- ----------------------------
-- Table structure for tb_account_bank_card
-- ----------------------------
DROP TABLE IF EXISTS `tb_account_bank_card`;
CREATE TABLE `tb_account_bank_card` (
  `account_bank_id` char(36) COLLATE utf8_unicode_ci NOT NULL COMMENT '账户银行卡编号guid',
  `account_id` char(36) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '账户编号',
  `bank_card_no` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '银行账号',
  `open_bank` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '开户行',
  `open_sub_bank` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '开户支行',
  `bank_province` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '银行卡归属地省',
  `bank_city` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '银行卡归属地市',
  `phone_number` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '银行卡预留手机号码',
  `create_user` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '创建用户',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_user` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '更新用户',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `status_flag` int(11) NOT NULL DEFAULT '1' COMMENT '状态1:可用,0:不可用',
  `remark` varchar(512) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '备注',
  `main_flag` int(11) NOT NULL DEFAULT '0' COMMENT '是否主卡,1:主卡,0:副卡',
  `cunguan_flag` int(11) NOT NULL DEFAULT '0' COMMENT '是否注册了存管,1.是,0:否',
  PRIMARY KEY (`account_bank_id`),
  UNIQUE KEY `idx_tb_account_bank_card` (`account_id`,`bank_card_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='帐号银行卡';

-- ----------------------------
-- Records of tb_account_bank_card
-- ----------------------------
INSERT INTO `tb_account_bank_card` VALUES ('10b1d3b4-2415-4f23-bb5c-1cc0ec909e70', 'c7d6c6d0-ab1d-4833-8730-8c4e264a0d7d', '1234123412341234123', '', '', '', '', '', 'admin', '2017-11-17 10:50:37', 'admin', '2017-11-17 10:50:37', '1', '', '1', '0');
INSERT INTO `tb_account_bank_card` VALUES ('683b3a5c-45c6-4773-8389-aee54fc5ee0d', '42738dab-a93f-4c75-8da0-daaf38935421', '6228480323293000812', '', '', '', '', '', 'vince', '2017-11-17 22:54:42', 'vince', '2017-11-17 22:54:42', '1', '', '0', '0');
INSERT INTO `tb_account_bank_card` VALUES ('724068d7-8c2d-410a-8516-0dc063965854', '47de81b9-33c5-4ca5-bb67-f505412e17b5', '6222620730002508321', '', '', '', '', '', 'vince', '2017-11-17 22:56:48', 'vince', '2017-11-17 22:56:48', '1', '', '0', '0');
INSERT INTO `tb_account_bank_card` VALUES ('a4aeac77-6366-4964-b30d-56ff66cc4066', '2ca045b7-9400-4b39-a5a1-86097d20d9e5', '6222024402050236782', '', '', '', '', '', 'vincent', '2017-11-17 22:26:26', 'vincent', '2017-11-17 22:26:26', '1', '', '0', '0');

-- ----------------------------
-- Table structure for tb_account_list
-- ----------------------------
DROP TABLE IF EXISTS `tb_account_list`;
CREATE TABLE `tb_account_list` (
  `list_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '明细编号',
  `account_id` char(36) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '账户编号',
  `account_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记账日期',
  `business_id` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '业务编号',
  `amount` decimal(18,2) NOT NULL DEFAULT '0.00' COMMENT '记账金额',
  `bank_card_no` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '银行账号',
  `account_bank_id` char(36) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '账户银行卡编号guid',
  `fee_id` char(36) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '费用项目',
  `action_id` int(11) NOT NULL DEFAULT '0' COMMENT '交易活动,0满标分润,1提现放款...',
  `in_out` int(11) NOT NULL DEFAULT '1' COMMENT '收支类型,0支出,1收入',
  `create_user` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '创建用户',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `status_flag` int(11) NOT NULL DEFAULT '1' COMMENT '状态',
  `remark` varchar(512) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`list_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='账户明细表';

-- ----------------------------
-- Records of tb_account_list
-- ----------------------------
INSERT INTO `tb_account_list` VALUES ('1', 'c7d6c6d0-ab1d-4833-8730-8c4e264a0d7d', '0001-01-01 00:00:00', '', '100.00', '1234123412341234123', '10b1d3b4-2415-4f23-bb5c-1cc0ec909e70', '644899c4-cfa2-4de1-9274-c391a1b9fd33', '1', '1', 'admin', '2017-11-17 10:52:00', '1', '测试');
INSERT INTO `tb_account_list` VALUES ('2', 'c7d6c6d0-ab1d-4833-8730-8c4e264a0d7d', '2017-11-17 11:01:34', '', '100.00', '1234123412341234123', '4855741e-8697-4fd6-ba01-5eb05376463b', '49fd01a6-39ed-42fa-b18b-25d07b740d43', '1', '1', 'admin', '2017-11-17 11:05:42', '1', '测试');
INSERT INTO `tb_account_list` VALUES ('3', 'c7d6c6d0-ab1d-4833-8730-8c4e264a0d7d', '2017-11-17 11:29:14', '', '100.00', '1234123412341234123', 'f10cf60b-8894-47a5-8f0e-2ce7a20d8ad9', '7cc76311-7942-4a76-a6bb-1a6a023b063a', '1', '1', 'admin', '2017-11-17 11:30:10', '1', '测试');
INSERT INTO `tb_account_list` VALUES ('4', 'c7d6c6d0-ab1d-4833-8730-8c4e264a0d7d', '2017-11-17 11:33:17', '', '100.00', '1234123412341234123', '10b1d3b4-2415-4f23-bb5c-1cc0ec909e70', 'ba99c712-9ce5-4d11-acd5-fc46fa5901f5', '1', '1', 'admin', '2017-11-17 11:33:37', '1', '测试');
INSERT INTO `tb_account_list` VALUES ('5', 'c7d6c6d0-ab1d-4833-8730-8c4e264a0d7d', '2017-11-17 14:51:48', '', '100.00', '1234123412341234123', '10b1d3b4-2415-4f23-bb5c-1cc0ec909e70', '535b3453-5e7f-4b0f-be8e-c462af95a7df', '0', '1', 'admin', '2017-11-17 14:52:03', '1', '');
INSERT INTO `tb_account_list` VALUES ('6', '2ca045b7-9400-4b39-a5a1-86097d20d9e5', '2017-11-17 17:51:50', 'TDC5012017111402', '45354.00', '6222024402050236782', 'a4aeac77-6366-4964-b30d-56ff66cc4066', '068fb92b-bcad-4722-a110-07fe7c657124', '1', '1', 'vincent', '2017-11-17 22:26:26', '1', '');
INSERT INTO `tb_account_list` VALUES ('7', '2ca045b7-9400-4b39-a5a1-86097d20d9e5', '2017-11-17 17:51:50', 'TDC5012017111402', '45354.00', '6222024402050236782', 'a4aeac77-6366-4964-b30d-56ff66cc4066', '068fb92b-bcad-4722-a110-07fe7c657124', '1', '1', 'hys', '2017-11-17 22:31:19', '1', '');
INSERT INTO `tb_account_list` VALUES ('8', '2ca045b7-9400-4b39-a5a1-86097d20d9e5', '2017-11-17 17:51:50', 'TDC5012017111402', '45354.00', '6222024402050236782', 'a4aeac77-6366-4964-b30d-56ff66cc4066', '068fb92b-bcad-4722-a110-07fe7c657124', '1', '1', 'vince', '2017-11-17 22:39:43', '1', '');
INSERT INTO `tb_account_list` VALUES ('9', '2ca045b7-9400-4b39-a5a1-86097d20d9e5', '2017-11-17 17:51:50', 'TDC5012017111402', '45354.00', '6222024402050236782', 'a4aeac77-6366-4964-b30d-56ff66cc4066', '068fb92b-bcad-4722-a110-07fe7c657124', '1', '1', 'vince', '2017-11-17 22:44:49', '1', '');
INSERT INTO `tb_account_list` VALUES ('10', '42738dab-a93f-4c75-8da0-daaf38935421', '2017-11-17 17:52:27', 'TDC5012017111402', '15596.00', '6228480323293000812', '683b3a5c-45c6-4773-8389-aee54fc5ee0d', '068fb92b-bcad-4722-a110-07fe7c657124', '1', '1', 'vince', '2017-11-17 22:54:42', '1', '');
INSERT INTO `tb_account_list` VALUES ('11', '2ca045b7-9400-4b39-a5a1-86097d20d9e5', '2017-11-17 17:51:50', 'TDC5012017111402', '45354.00', '6222024402050236782', 'a4aeac77-6366-4964-b30d-56ff66cc4066', '068fb92b-bcad-4722-a110-07fe7c657124', '1', '1', 'vince', '2017-11-17 22:56:36', '1', '');
INSERT INTO `tb_account_list` VALUES ('12', '47de81b9-33c5-4ca5-bb67-f505412e17b5', '2017-11-17 17:52:47', 'TDC5012017111402', '27216.00', '6222620730002508321', '724068d7-8c2d-410a-8516-0dc063965854', '068fb92b-bcad-4722-a110-07fe7c657124', '1', '1', 'vince', '2017-11-17 22:56:48', '1', '');
INSERT INTO `tb_account_list` VALUES ('13', '42738dab-a93f-4c75-8da0-daaf38935421', '2017-11-17 17:52:27', 'TDC5012017111402', '15596.00', '6228480323293000812', '683b3a5c-45c6-4773-8389-aee54fc5ee0d', '068fb92b-bcad-4722-a110-07fe7c657124', '1', '1', 'vince', '2017-11-17 22:56:50', '1', '');
INSERT INTO `tb_account_list` VALUES ('14', '2ca045b7-9400-4b39-a5a1-86097d20d9e5', '2017-11-17 17:51:50', 'TDC5012017111402', '45354.00', '6222024402050236782', 'a4aeac77-6366-4964-b30d-56ff66cc4066', '068fb92b-bcad-4722-a110-07fe7c657124', '1', '1', 'vince', '2017-11-17 23:01:51', '1', '');
INSERT INTO `tb_account_list` VALUES ('15', '47de81b9-33c5-4ca5-bb67-f505412e17b5', '2017-11-17 17:52:47', 'TDC5012017111402', '27216.00', '6222620730002508321', '724068d7-8c2d-410a-8516-0dc063965854', '068fb92b-bcad-4722-a110-07fe7c657124', '1', '1', 'vince', '2017-11-17 23:02:00', '1', '');
INSERT INTO `tb_account_list` VALUES ('16', '42738dab-a93f-4c75-8da0-daaf38935421', '2017-11-17 17:52:27', 'TDC5012017111402', '15596.00', '6228480323293000812', '683b3a5c-45c6-4773-8389-aee54fc5ee0d', '068fb92b-bcad-4722-a110-07fe7c657124', '1', '1', 'vince', '2017-11-17 23:02:00', '1', '');

-- ----------------------------
-- Table structure for tb_account_type
-- ----------------------------
DROP TABLE IF EXISTS `tb_account_type`;
CREATE TABLE `tb_account_type` (
  `account_type_id` int(11) NOT NULL COMMENT '账户类型编号',
  `account_type_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '账户类型名称',
  `status_flag` int(1) NOT NULL DEFAULT '1' COMMENT '状态1:开启0:关闭',
  `create_user` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '创建用户',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_user` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '更新用户',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`account_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='账户类型表';

-- ----------------------------
-- Records of tb_account_type
-- ----------------------------
INSERT INTO `tb_account_type` VALUES ('0', '借款人账户', '1', 'admin', '2017-11-15 10:23:28', 'admin', '2017-11-15 10:23:34');
INSERT INTO `tb_account_type` VALUES ('1', '分公司账户', '1', 'admin', '2017-11-15 10:23:28', 'admin', '2017-11-15 10:23:34');
INSERT INTO `tb_account_type` VALUES ('2', '资金渠道账户', '1', 'admin', '2017-11-15 10:23:28', 'admin', '2017-11-15 10:23:34');
INSERT INTO `tb_account_type` VALUES ('3', '担保公司账户', '1', 'admin', '2017-11-15 10:23:28', 'admin', '2017-11-15 10:23:34');
INSERT INTO `tb_account_type` VALUES ('4', '合作渠道账户', '1', 'admin', '2017-11-15 10:23:28', 'admin', '2017-11-15 10:23:34');
INSERT INTO `tb_account_type` VALUES ('5', '中介机构账户', '1', 'admin', '2017-11-15 10:23:28', 'admin', '2017-11-15 10:23:34');
INSERT INTO `tb_account_type` VALUES ('6', '内部账户', '1', 'admin', '2017-11-15 10:23:28', 'admin', '2017-11-15 10:23:34');
INSERT INTO `tb_account_type` VALUES ('7', '业务员账户', '1', 'admin', '2017-11-15 10:23:28', 'admin', '2017-11-15 10:23:34');
INSERT INTO `tb_account_type` VALUES ('8', '代充值账户', '1', 'admin', '2017-11-15 10:23:28', 'admin', '2017-11-15 10:23:34');
INSERT INTO `tb_account_type` VALUES ('9', '贷后还款账户', '1', 'admin', '2017-11-15 10:23:28', 'admin', '2017-11-15 10:23:34');
