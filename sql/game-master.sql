/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : game-master

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 20/12/2021 16:22:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `bg_img_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `jump` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `text` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `icon_type` int(0) NULL DEFAULT NULL,
  `golden` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `white` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `price` decimal(10, 2) NOT NULL,
  `game_id` int(0) NOT NULL,
  `discount` double NOT NULL,
  `type_id` int(0) NULL DEFAULT NULL,
  `big_bg_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `show_icon_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES (1, 'http://product.cnc.blzstatic.cn//36/66a9f4f80640962dff8bc1ae43d9f0d0-WoW_9.0_ProductPage_ASIA_Collection_ProductCard_Vert_Epic_MN01.jpg', '', '《魔兽世界®:暗影国度》数字礼包', 1, '立即购买', '礼包', 198.00, 1, 0, 1, 'https://product.cnc.blzstatic.cn//f88/2273aa0b3225e6c6f8c281a6c94ac6a4-WoW_Sub_Product_Pageprod-mobile-bg-1536x1000.png', NULL);
INSERT INTO `commodity` VALUES (2, 'http://product.cnc.blzstatic.cn//fb7/e21ed11c2dedfd884e0aea0df46cd4c6-prod-card-tall.jpg', '', '《星际争霸Ⅱ》:战争宝箱6', 7, '下架时间:2020年9月2日', '礼包', 60.00, 6, 0, 26, 'https://product.cnc.blzstatic.cn//25/3c8d2a1e5f04172ffd945e4296c0f3cc-prod-mobile-bg.png', NULL);
INSERT INTO `commodity` VALUES (3, 'http://product.cnc.blzstatic.cn//27/ac8817e4c0cfc2f6b4fd66d99cf4ce88-prod-card-tall.jpg', '', '《守望先锋®》游戏货币:赠送补给', 0, '', '可解锁内容', 12.00, 2, 0, 8, 'https://product.cnc.blzstatic.cn//55/0060a9085524e0cf12aac9701d0d5071-prod-full-bg.jpg', NULL);
INSERT INTO `commodity` VALUES (4, 'http://product.cnc.blzstatic.cn//2/2f4190e5b4ee1680a72680ccd65de657-prod-card-vert.jpg', '', '炉石传说®:外域的灰烬', 2, '最新扩展包!', '卡牌包', 180.00, 4, 0, 13, 'https://product.cnc.blzstatic.cn//fba/6cf6eb24053574260b826685326b54f0-prod-mobile-bg.jpg', NULL);
INSERT INTO `commodity` VALUES (5, 'http://product.cnc.blzstatic.cn//ff6/856907e8e87225f5ed1e891655283bed-HS_CN_Rune_Shop_Product_Pages_prod-card-vert_TS01.jpg', '', '《炉石传说®》', 2, '', '可解锁内容', 30.00, 4, 0, 12, 'https://product.cnc.blzstatic.cn//fac/895ca992a21d9c960bd30f9738d7bfb8-prod-mobile-bg.jpg', NULL);
INSERT INTO `commodity` VALUES (6, 'http://product.cnc.blzstatic.cn//fe6/89fa735b8b71abd3660695dab3e937ae-prod-card-tall.jpg', '', '《守望先锋®》:传奇典藏版', 0, '', '团队设计游戏', 158.00, 2, 0, 7, 'https://product.cnc.blzstatic.cn//e/f48d35fbdb32d8f70200dd6c36cf6202-prod-mobile-bg2.jpg', 'https://product.cnc.blzstatic.cn//f9a/7f5bf30fc831da74fb8ae1cf05a1cbe0-overwatch-cn-1000.png');
INSERT INTO `commodity` VALUES (7, 'http://product.cnc.blzstatic.cn//5f/3d885e4077747a04a646186a17607769-WC3R_2020_Orc_Art_Shop_Product_Page_Assets_prod-card-vert_TS03.jpg', '', '《魔兽争霸Ⅲ》:重制版', 4, '立即购买!', '即时策略游戏', 168.00, 8, 0, 31, 'https://product.cnc.blzstatic.cn//fbc/f66923163a6c1e5ec2c2888d003a2f0a-WC3R_2020_Orc_Art_Shop_Product_Page_Assets_prod-thumb_TS03.jpg', NULL);
INSERT INTO `commodity` VALUES (8, 'http://product.cnc.blzstatic.cn//fad/f857b83256b2a93ae6ac56c85050c99f-HS_16.2_Prepurch_prod-card-vert_BK01.png', '', '\"迦拉克隆的觉醒\"冒险模式', 2, '', '冒险模式', 128.00, 4, 0, 14, 'https://product.cnc.blzstatic.cn//74/4d274f21c827751e94560fbc0f28dee2-HS_16.2_Prepurch_prod-mobile-bg_BK01.png', NULL);
INSERT INTO `commodity` VALUES (9, 'http://product.cnc.blzstatic.cn//4b/cd69d541bb3ba43461c757ecc7755bfd-HS16_product-pageprod-card-vert-pack.jpg', '', '巨龙降临', 2, '', '卡牌包', 180.00, 4, 0, 13, 'https://product.cnc.blzstatic.cn//fd4/edb264bb8f34ff9004cb8fd2c1837971-prod-mobile-bg.jpg', NULL);
INSERT INTO `commodity` VALUES (10, 'http://product.cnc.blzstatic.cn//26/fe94b086ae36a98b7e2974a7841d51db-HS_CN_Orb_Shop_Product_Pages_prod-card-vert_TS01.jpg', '', '10奥术宝珠', 2, '', '可解锁内容', 1.00, 4, 0, 17, 'https://product.cnc.blzstatic.cn//fe8/4f3b2fbe608fda82942dd8bedea92953-HS_CN_Orb_Shop_Product_Pages_prod-mobile-bg_TS01.jpg', NULL);

-- ----------------------------
-- Table structure for game
-- ----------------------------
DROP TABLE IF EXISTS `game`;
CREATE TABLE `game`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `bg` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `icon` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `price` decimal(10, 2) NOT NULL,
  `discount` double(255, 0) NOT NULL,
  `announcement` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `game_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `jump` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of game
-- ----------------------------
INSERT INTO `game` VALUES (1, 'http://product.cnc.blzstatic.cn//38/d6150070253dd80803aec718563233ed-WoW_9.0_BattleNet_Shop_2200x700.jpg', 'http://product.cnc.blzstatic.cn//f87/f07df7142c9ec15de82837176b2bb7c9-battle-for-azeroth-cn-clipped.png', '魔兽世界', 0.00, 0, 'test', '大型多人角色扮演游戏', '#');
INSERT INTO `game` VALUES (2, 'http://product.cnc.blzstatic.cn//29/483a96d077d8852bbfdb114309b1e070-2200x700.jpg', 'http://product.cnc.blzstatic.cn//f9a/7f5bf30fc831da74fb8ae1cf05a1cbe0-overwatch-cn-1000.png', '守望先锋', 80.00, 0, 'test', '第一人称射击游戏', '#');
INSERT INTO `game` VALUES (3, 'http://product.cnc.blzstatic.cn//fee/c3ed856397e63affc3ad067180198630-diablo-III-cn-base-1000x800.png', 'http://product.cnc.blzstatic.cn//fd9/63c4daed635df8c4ce42a525c77360cb-D3_Shop-Header-Template_FIX012820-2200x700.jpg', '暗黑破坏神3', 0.00, 0, 'test', '动作角色扮演游戏', '#');
INSERT INTO `game` VALUES (4, 'http://product.cnc.blzstatic.cn//11/193819ae5a32da6b4b72b585331f49aa-2200x700.jpg', 'http://product.cnc.blzstatic.cn//fac/2a201141e3cfdd8b3bb80db7bad7772d-1200x630-cn-glow.png', '炉石传说', 0.00, 0, 'test', '策略类卡牌游戏', '#');
INSERT INTO `game` VALUES (5, 'http://product.cnc.blzstatic.cn//fba/f832cc5cf2db65b90301f8f3b8d241e1-hs2-cn-1000x522.png', 'http://product.cnc.blzstatic.cn//fb0/6ccbe232470a8ed14183b8dfa574a27f-2200x700.jpg', '风暴英雄', 0.00, 0, 'test', '多人在线战术竞技游戏', '#');
INSERT INTO `game` VALUES (6, 'http://product.cnc.blzstatic.cn//57/6c1904686302e59668b14e76c02fc907-logo-sc2-CC-zhcn.png', 'http://product.cnc.blzstatic.cn//fcf/a1b219ec20471e1cef9c4ce02bc2f7f6-2200x700.jpg', '星际争霸2', 0.00, 0, 'test', '即时策略游戏', '#');
INSERT INTO `game` VALUES (7, 'http://product.cnc.blzstatic.cn//fa1/d8ac9dd02a30596c8dfb933c1efb26f2-scr-remastered-cn-1000.png', 'http://product.cnc.blzstatic.cn//50/db68f455d727d2201b8358cfa9f42747-2200x700.jpg', '星际争霸', 0.00, 0, 'test', '即时策略游戏', '#');
INSERT INTO `game` VALUES (8, 'http://product.cnc.blzstatic.cn//67/08fb01a52b61882255838d33fe746f5b-warcraft3-reforged-zhcn-1000x500.png', 'http://product.cnc.blzstatic.cn//11/2bcf6793453fb5ae206cb6f9cc989f9a-WC3_Arthas_BNet_Shop_2200x700_MN02.jpg', '魔兽争霸3', 0.00, 0, 'test', '即时策略游戏', '#');

-- ----------------------------
-- Table structure for game_commodity_type
-- ----------------------------
DROP TABLE IF EXISTS `game_commodity_type`;
CREATE TABLE `game_commodity_type`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `titile` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `game_id` int(0) UNSIGNED NOT NULL,
  `text` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of game_commodity_type
-- ----------------------------
INSERT INTO `game_commodity_type` VALUES (1, '新玩家起步', 1, '魔兽世界新玩家？从这里开始吧。');
INSERT INTO `game_commodity_type` VALUES (2, '虚拟坐骑', 1, '坐稳了————你的骑术有多高,坐骑就能跑多快');
INSERT INTO `game_commodity_type` VALUES (3, '虚拟宠物', 1, '收养小宠物,带着新伙伴在宠物对战中大展拳脚。');
INSERT INTO `game_commodity_type` VALUES (4, '虚拟玩具', 1, '将各种趣味玩具加入你的游戏收藏,逗乐你的盟友或是捉弄你的敌人!');
INSERT INTO `game_commodity_type` VALUES (5, '游戏服务', 1, '自定义你的游戏体验。');
INSERT INTO `game_commodity_type` VALUES (6, '周边商品', 1, '前往周边商城尽情选购');
INSERT INTO `game_commodity_type` VALUES (7, '游戏', 2, '置身明日战场,在活力四射的团队射击游戏中为了未来而战');
INSERT INTO `game_commodity_type` VALUES (8, '可解锁内容', 2, '让各种虚拟好礼提升你的游戏体验');
INSERT INTO `game_commodity_type` VALUES (9, '游戏', 3, '跨越天堂和低于,在动作角色扮演游戏中为了庇护之地的同胞而战');
INSERT INTO `game_commodity_type` VALUES (10, '资料片', 3, '探索全新游戏内容，感受更精彩的冒险体验');
INSERT INTO `game_commodity_type` VALUES (11, '周边商品', 3, '前往周边商城尽情选购');
INSERT INTO `game_commodity_type` VALUES (12, '新玩家起步', 4, '炉石传说新玩家?从这里开始吧。');
INSERT INTO `game_commodity_type` VALUES (13, '卡牌包', 4, '用卡牌包来打造你的理想套牌');
INSERT INTO `game_commodity_type` VALUES (14, '冒险模式', 4, '探索冒险模式,突破重重关卡。');
INSERT INTO `game_commodity_type` VALUES (15, '仅限狂野模式', 4, '加入狂野模式,玩转所有卡牌,探索无限可能');
INSERT INTO `game_commodity_type` VALUES (16, '游戏', 4, '傍着酒馆的炉火,在免费的集成类卡牌游戏中来一场脑力比拼。');
INSERT INTO `game_commodity_type` VALUES (17, '可解锁内容', 4, '让各种虚拟好礼提升你的游戏体验。');
INSERT INTO `game_commodity_type` VALUES (18, '周边商品', 4, '前往周边商城尽情选购');
INSERT INTO `game_commodity_type` VALUES (19, '游戏', 5, '进入时空枢纽,和暴雪宇宙的英雄们一起在多人在线战术竞技游戏中奋斗');
INSERT INTO `game_commodity_type` VALUES (20, '可解锁内容', 5, '让各种虚拟好礼提升你的游戏体验');
INSERT INTO `game_commodity_type` VALUES (21, '周边商品', 5, '前往周边商城尽情选购');
INSERT INTO `game_commodity_type` VALUES (22, '新玩家起步', 6, '星际争霸2新玩家?从这里开始吧。');
INSERT INTO `game_commodity_type` VALUES (23, '游戏', 6, '进入科普卢星区,化身异虫、星灵和人类，在即时策略游戏中冲锋陷阵');
INSERT INTO `game_commodity_type` VALUES (24, '指挥官', 6, '化身英雄指挥官,称霸星际战场');
INSERT INTO `game_commodity_type` VALUES (25, '播报员', 6, '让播报员的精彩解说提升你的《星际争霸Ⅱ》游戏体验!');
INSERT INTO `game_commodity_type` VALUES (26, '礼包', 6, '让一系列虚拟好礼提升你的游戏体验');
INSERT INTO `game_commodity_type` VALUES (27, '周边商品', 6, '前往周边商城尽情选购');
INSERT INTO `game_commodity_type` VALUES (28, '游戏', 7, '重温暴雪经典游戏。进入科普卢星区,化身异虫、星灵和人类,在即时战略游戏中冲锋陷阵');
INSERT INTO `game_commodity_type` VALUES (29, '可解锁内容', 7, '让各种虚拟好礼提升你的游戏体验。');
INSERT INTO `game_commodity_type` VALUES (30, '周边商品', 7, '前往周边商城尽情选购');
INSERT INTO `game_commodity_type` VALUES (31, '游戏', 8, '重温暴雪经典游戏。扮演兽人、人类、亡灵和暗夜精灵，在即时战略游戏中展开奇幻之旅。');
INSERT INTO `game_commodity_type` VALUES (32, '周边商品', 8, '前往周边商城尽情选购');

-- ----------------------------
-- Table structure for rotation
-- ----------------------------
DROP TABLE IF EXISTS `rotation`;
CREATE TABLE `rotation`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `game_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `bg_img_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `icon` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `announcement` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `jump` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rotation
-- ----------------------------
INSERT INTO `rotation` VALUES (1, '魔兽世界', 'product.cnc.blzstatic.cn//74/4b382158fcc7d9aeb92c30fde57e2812-WoW_Steamscale_Incinerator_Plus_Panda_Cub_Shop_Banners_1900x300_TS01.jpg', 'product.cnc.blzstatic.cn//f87/f07df7142c9ec15de82837176b2bb7c9-battle-for-azeroth-cn-clipped.png', '在《魔兽世界》中驾驭坐骑,让宠物伴你漫游《魔兽世界》经典怀旧服，畅享180天游戏时间', '#');
INSERT INTO `rotation` VALUES (2, '魔兽世界', 'product.cnc.blzstatic.cn//29/50817669fbbc553777b407401a98faa5-WoW_Summer_Sale_Shop_Banners_TS011900x300_TS01.jpg', 'product.cnc.blzstatic.cn//f87/f07df7142c9ec15de82837176b2bb7c9-battle-for-azeroth-cn-clipped.png', '截至7月20日，坐骑、宠物等精选商品立享五折优惠', '#');
INSERT INTO `rotation` VALUES (3, '炉石传说', 'product.cnc.blzstatic.cn//fc5/71654210aac15bb5eeb9048fb33b9020-1900x300.jpg', 'product.cnc.blzstatic.cn//64/ac8cce7590f19a85b0dfc5c52c1eb12f-HS17_AoO_Logo_CN_wHS.png', '全新扩展包', '#');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '名字',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `phone` bigint(0) NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '昵称',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `identity_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `enabled` tinyint(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `INDEX_EMAIL`(`email`) USING BTREE,
  UNIQUE INDEX `INDEX_PHONE`(`phone`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (3, 'admin', '1728936494@qq.com', 13768307794, '战网#6', '$2a$08$NP7VI9lLkGWTxd8G97uJKeVfZeXfcUIU5fAxdlWTGrDbTolHss/ru', '111111111111111111', 1);
INSERT INTO `user` VALUES (4, '张三', 'tanzeyv280@gmail.com', 11123223213, '战网#7', '$2a$08$KMCj0zfZybJKiK87vvBKY.M3RBByi.7d0EFTRGoSNAu0UB1qNB.7i', '111111111111111111', 1);

SET FOREIGN_KEY_CHECKS = 1;
