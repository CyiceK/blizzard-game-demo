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

 Date: 12/12/2021 13:49:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

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
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (3, 'admin', '1728936494@qq.com', 13768307794, '战网#6', '$2a$08$NP7VI9lLkGWTxd8G97uJKeVfZeXfcUIU5fAxdlWTGrDbTolHss/ru', '111111111111111111', 1);
INSERT INTO `user` VALUES (4, '张三', 'tanzeyv280@gmail.com', 11123223213, '战网#7', '$2a$08$KMCj0zfZybJKiK87vvBKY.M3RBByi.7d0EFTRGoSNAu0UB1qNB.7i', '111111111111111111', 1);

SET FOREIGN_KEY_CHECKS = 1;
