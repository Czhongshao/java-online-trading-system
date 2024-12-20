/*
 Navicat Premium Data Transfer

 Source Server         : sql_test
 Source Server Type    : MySQL
 Source Server Version : 80030
 Source Host           : localhost:3306
 Source Schema         : onlinetradingsystem

 Target Server Type    : MySQL
 Target Server Version : 80030
 File Encoding         : 65001

 Date: 20/12/2024 20:23:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for orderdetails
-- ----------------------------
DROP TABLE IF EXISTS `orderdetails`;
CREATE TABLE `orderdetails`  (
  `OrderDetailsID` int NOT NULL AUTO_INCREMENT COMMENT '订单详情唯一标识',
  `OrderID` int NOT NULL COMMENT '所属订单ID',
  `ProductID` int NOT NULL COMMENT '购买商品ID',
  `Quantity` int NOT NULL COMMENT '购买数量',
  `UnitPrice` decimal(10, 2) NOT NULL COMMENT '单价',
  PRIMARY KEY (`OrderDetailsID`) USING BTREE,
  INDEX `orderid`(`OrderID` ASC) USING BTREE,
  INDEX `productid`(`ProductID` ASC) USING BTREE,
  INDEX `Quantity`(`Quantity` ASC, `UnitPrice` ASC) USING BTREE,
  INDEX `unitprice`(`UnitPrice` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orderdetails
-- ----------------------------
INSERT INTO `orderdetails` VALUES (1, 100004, 100743, 791, 18999.00);
INSERT INTO `orderdetails` VALUES (2, 100001, 100033, 913, 99.00);
INSERT INTO `orderdetails` VALUES (3, 100002, 100723, 494, 8999.00);
INSERT INTO `orderdetails` VALUES (4, 100002, 100041, 159, 99.00);
INSERT INTO `orderdetails` VALUES (5, 100001, 100023, 138, 39.00);
INSERT INTO `orderdetails` VALUES (6, 100001, 100711, 272, 4999.00);
INSERT INTO `orderdetails` VALUES (7, 100002, 100405, 261, 399.00);
INSERT INTO `orderdetails` VALUES (8, 100003, 100405, 164, 399.00);
INSERT INTO `orderdetails` VALUES (9, 100003, 100042, 195, 99.99);
INSERT INTO `orderdetails` VALUES (10, 100001, 100709, 300, 3999.00);

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `OrderID` int NOT NULL AUTO_INCREMENT COMMENT '订单唯一标识',
  `UserID` int NOT NULL COMMENT '下单用户ID',
  `OrderDate` datetime NOT NULL COMMENT '订单日期',
  `TotalAmount` decimal(10, 2) NOT NULL COMMENT '订单总金额',
  `OrderStatus` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '订单状态',
  PRIMARY KEY (`OrderID`) USING BTREE,
  INDEX `users`(`UserID` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (1, 123457, '2024-04-12 19:20:15', 30000.00, '正在装配');
INSERT INTO `orders` VALUES (2, 2345678, '2023-10-19 19:22:50', 5000.00, '正在运输');
INSERT INTO `orders` VALUES (3, 4567123, '2024-01-12 19:24:00', 565656.00, '已经抵达');
INSERT INTO `orders` VALUES (4, 11234567, '2024-03-09 19:26:04', 35.00, '正在装配');

-- ----------------------------
-- Table structure for productcategories
-- ----------------------------
DROP TABLE IF EXISTS `productcategories`;
CREATE TABLE `productcategories`  (
  `CategoryID` int NOT NULL AUTO_INCREMENT COMMENT '商品类别唯一表示',
  `CategoryName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '商品类别名称',
  `ParentCategoryID` int NULL DEFAULT NULL COMMENT '父类别ID',
  PRIMARY KEY (`CategoryID`) USING BTREE,
  INDEX `CategoryID`(`CategoryID` ASC) USING BTREE,
  INDEX `ParentCategoryID`(`ParentCategoryID` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of productcategories
-- ----------------------------
INSERT INTO `productcategories` VALUES (10000, '电子产品', NULL);
INSERT INTO `productcategories` VALUES (10001, '手机', 10000);
INSERT INTO `productcategories` VALUES (10002, '平板电脑', 10000);
INSERT INTO `productcategories` VALUES (10003, '笔记本电脑', 10000);
INSERT INTO `productcategories` VALUES (10004, '相机', 10000);
INSERT INTO `productcategories` VALUES (10010, '家用电器', NULL);
INSERT INTO `productcategories` VALUES (10011, '冰箱', 10010);
INSERT INTO `productcategories` VALUES (10012, '洗衣机', 10010);
INSERT INTO `productcategories` VALUES (10013, '空调', 10010);
INSERT INTO `productcategories` VALUES (10014, '电视', 10010);
INSERT INTO `productcategories` VALUES (10020, '服装', NULL);
INSERT INTO `productcategories` VALUES (10021, '男装', 10020);
INSERT INTO `productcategories` VALUES (10022, '女装', 10020);
INSERT INTO `productcategories` VALUES (10023, '童装', 10020);
INSERT INTO `productcategories` VALUES (10024, '运动装', 10020);
INSERT INTO `productcategories` VALUES (10030, '食品', NULL);
INSERT INTO `productcategories` VALUES (10031, '零食', 10030);
INSERT INTO `productcategories` VALUES (10032, '饮料', 10030);
INSERT INTO `productcategories` VALUES (10033, '新鲜水果', 10030);
INSERT INTO `productcategories` VALUES (10034, '蔬菜', 10030);
INSERT INTO `productcategories` VALUES (10040, '书籍', NULL);
INSERT INTO `productcategories` VALUES (10041, '小说', 10040);
INSERT INTO `productcategories` VALUES (10042, '教育', 10040);
INSERT INTO `productcategories` VALUES (10043, '科技', 10040);
INSERT INTO `productcategories` VALUES (10044, '艺术', 10040);
INSERT INTO `productcategories` VALUES (10050, '玩具', NULL);
INSERT INTO `productcategories` VALUES (10051, '儿童玩具', 10050);
INSERT INTO `productcategories` VALUES (10052, '益智玩具', 10050);
INSERT INTO `productcategories` VALUES (10053, '电子玩具', 10050);
INSERT INTO `productcategories` VALUES (10054, '毛绒玩具', 10050);
INSERT INTO `productcategories` VALUES (10060, '体育用品', NULL);
INSERT INTO `productcategories` VALUES (10061, '球类', 10060);
INSERT INTO `productcategories` VALUES (10062, '健身器材', 10060);
INSERT INTO `productcategories` VALUES (10063, '运动服装', 10060);
INSERT INTO `productcategories` VALUES (10064, '运动鞋', 10060);
INSERT INTO `productcategories` VALUES (10070, '家居用品', NULL);
INSERT INTO `productcategories` VALUES (10071, '床上用品', 10070);
INSERT INTO `productcategories` VALUES (10072, '厨房用品', 10070);
INSERT INTO `productcategories` VALUES (10073, '清洁用品', 10070);
INSERT INTO `productcategories` VALUES (10074, '装饰用品', 10070);

-- ----------------------------
-- Table structure for products
-- ----------------------------
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products`  (
  `ProductID` int NOT NULL AUTO_INCREMENT COMMENT '商品唯一标识',
  `ProductName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '商品名称',
  `ProductDescription` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '商品描述',
  `Price` decimal(10, 2) NOT NULL COMMENT '商品价格',
  `StockQuantity` int NOT NULL COMMENT '商品库存数量',
  `CategoryID` int NOT NULL COMMENT '商品类别ID',
  PRIMARY KEY (`ProductID`) USING BTREE,
  INDEX `Product`(`CategoryID` ASC) USING BTREE,
  INDEX `Price`(`Price` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of products
-- ----------------------------
INSERT INTO `products` VALUES (100011, 'iPhone 13', '苹果13高级机', 6999.00, 50, 10001);
INSERT INTO `products` VALUES (100012, 'Samsung S21\r\n', '三星S21旗舰手机\r\n', 5999.00, 30, 10001);
INSERT INTO `products` VALUES (100013, 'Xiaomi Mi 11', '小米11高性能手机', 4999.00, 40, 10001);
INSERT INTO `products` VALUES (100021, 'iPad Pro', '苹果高端平板电脑', 8999.00, 20, 10002);
INSERT INTO `products` VALUES (100022, 'Samsung Tab S7', '三星高端平板电脑', 4999.00, 25, 10002);
INSERT INTO `products` VALUES (100023, 'Huawei MatePad', '华为平板电脑', 3999.00, 35, 10002);
INSERT INTO `products` VALUES (100031, 'MacBook Pro', '苹果笔记本电脑', 12999.00, 15, 10003);
INSERT INTO `products` VALUES (100032, 'Dell XPS 13', '戴尔高端笔记本', 9999.00, 10, 10003);
INSERT INTO `products` VALUES (100033, 'Lenovo ThinkPad', '联想商务笔记本', 8999.00, 18, 10003);
INSERT INTO `products` VALUES (100041, 'Canon EOS R5', '佳能高端相机', 15999.00, 10, 10004);
INSERT INTO `products` VALUES (100042, 'Nikon D850', '尼康专业相机', 18999.00, 8, 10004);
INSERT INTO `products` VALUES (100043, 'Sony A7 III', '索尼全画幅相机', 13999.00, 12, 10004);
INSERT INTO `products` VALUES (100101, 'Haier Fridge', '海尔双门冰箱', 3999.00, 60, 10010);
INSERT INTO `products` VALUES (100102, 'Siemens Wash', '西门子洗衣机', 2999.00, 70, 10010);
INSERT INTO `products` VALUES (100103, 'Gree AC', '格力空调', 5499.00, 40, 10010);
INSERT INTO `products` VALUES (100204, 'Nike Air Max', '耐克运动鞋', 1299.00, 80, 10020);
INSERT INTO `products` VALUES (100205, 'Adidas Ultra Boost', '阿迪达斯跑鞋', 1199.00, 70, 10020);
INSERT INTO `products` VALUES (100206, 'Puma RS-X', '彪马复古运动鞋', 999.00, 60, 10020);
INSERT INTO `products` VALUES (100305, 'Snickers Bar', '士力架巧克力棒', 19.00, 500, 10030);
INSERT INTO `products` VALUES (100306, 'Coca-Cola', '可口可乐2L瓶装', 4.00, 200, 10030);
INSERT INTO `products` VALUES (100307, 'Fresh Apples', '新鲜苹果5斤装', 39.00, 150, 10030);
INSERT INTO `products` VALUES (100405, 'Harry Potter', '哈利波特全集', 199.00, 100, 10040);
INSERT INTO `products` VALUES (100406, 'Science Textbook', '科学教科书', 120.00, 60, 10040);
INSERT INTO `products` VALUES (100407, 'Art History', '艺术史书籍', 8.99, 300, 10040);
INSERT INTO `products` VALUES (100506, 'LEGO City', '乐高城市系列', 99.99, 200, 10050);
INSERT INTO `products` VALUES (100507, 'Rubik\'s Cube', '魔方', 29.99, 400, 10050);
INSERT INTO `products` VALUES (100508, 'Plush Teddy', '大号泰迪熊', 149.00, 50, 10050);
INSERT INTO `products` VALUES (100608, 'Nike Basketball', '耐克篮球', 199.00, 45, 10060);
INSERT INTO `products` VALUES (100609, 'Yoga Mat Pro', '高级瑜伽垫', 179.00, 60, 10060);
INSERT INTO `products` VALUES (100610, 'Running Shoes', '跑步鞋', 159.00, 90, 10060);
INSERT INTO `products` VALUES (100708, 'Duvet Comforter', '羽绒被', 699.00, 40, 10070);
INSERT INTO `products` VALUES (100709, 'Kitchen Knife Set', '厨房刀具套装', 299.00, 50, 10070);
INSERT INTO `products` VALUES (100710, 'Cleaning Kit', '清洁工具套装', 99.00, 200, 10070);
INSERT INTO `products` VALUES (100711, 'Sealy Posturepedic', 'Sealy床垫', 1299.00, 20, 10071);
INSERT INTO `products` VALUES (100712, 'Tempur-Pedic ProAdapt', 'Tempur-Pedic床垫', 3999.00, 15, 10071);
INSERT INTO `products` VALUES (100713, 'Casper Mattress', 'Casper床垫', 999.00, 25, 10071);
INSERT INTO `products` VALUES (100721, 'IKEA Duvet Cover', 'IKEA被套', 59.00, 100, 10072);
INSERT INTO `products` VALUES (100722, 'Pottery Barn Sheets', 'Pottery Barn床单', 149.00, 80, 10072);
INSERT INTO `products` VALUES (100723, 'West Elm Comforter', 'West Elm抱枕', 89.00, 50, 10072);
INSERT INTO `products` VALUES (100731, 'OXO Good Grips Sponge', 'OXO洗碗海绵', 4.99, 300, 10073);
INSERT INTO `products` VALUES (100732, 'Dyson V11 Cordless', 'Dyson无线吸尘器', 699.00, 40, 10073);
INSERT INTO `products` VALUES (100733, 'Swiffer WetJet', 'Swiffer拖地机', 129.00, 60, 10073);
INSERT INTO `products` VALUES (100741, 'Le Creuset Dutch Oven', 'Le Creuset荷兰烤箱', 299.00, 10, 10074);
INSERT INTO `products` VALUES (100742, 'Instant Pot Duo', 'Instant Pot压力锅', 99.00, 30, 10074);
INSERT INTO `products` VALUES (100743, 'KitchenAid Mixer', 'KitchenAid搅拌机', 399.00, 20, 10074);

-- ----------------------------
-- Table structure for salesstatistics
-- ----------------------------
DROP TABLE IF EXISTS `salesstatistics`;
CREATE TABLE `salesstatistics`  (
  `StatisticID` int NOT NULL COMMENT '统计记录唯一标识',
  `Date` datetime NOT NULL COMMENT '统计日期',
  `CategoryID` int NOT NULL COMMENT '商品类别ID',
  `MerchantID` int NOT NULL COMMENT '商家用户ID',
  `SalesAmount` decimal(10, 2) NOT NULL COMMENT '销售金额',
  PRIMARY KEY (`StatisticID`) USING BTREE,
  INDEX `cateid`(`CategoryID` ASC) USING BTREE,
  INDEX `merid`(`MerchantID` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 100002 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of salesstatistics
-- ----------------------------
INSERT INTO `salesstatistics` VALUES (1, '2013-12-29 12:06:48', 10071, 3456712, 350.93);
INSERT INTO `salesstatistics` VALUES (2, '2007-03-27 23:08:09', 10003, 99123466, 219.88);
INSERT INTO `salesstatistics` VALUES (3, '2015-07-07 02:38:39', 10072, 2345678, 635.03);
INSERT INTO `salesstatistics` VALUES (4, '2020-03-24 02:55:51', 10002, 22123459, 779.11);
INSERT INTO `salesstatistics` VALUES (5, '2013-05-24 22:30:28', 10030, 44123461, 798.29);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `UserID` int NOT NULL AUTO_INCREMENT COMMENT '用户ID（唯一标识）',
  `UserName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
  `Password` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户密码（加密存储）',
  `Email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户邮箱',
  `Role` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户身份',
  `RegistrationDate` datetime(6) NOT NULL COMMENT '注册日期',
  PRIMARY KEY (`UserID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 99123470 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (123456, '小吴', '123456', '012@gmail.com', '管理员', '2023-04-10 23:50:00.000000');
INSERT INTO `users` VALUES (123457, '小高', '123457', '012@163.com', '普通用户', '2023-04-20 10:00:00.000000');
INSERT INTO `users` VALUES (1234567, '小郑', '1234567', '123@163.com', '普通用户', '2023-04-11 00:15:00.000000');
INSERT INTO `users` VALUES (2345671, '小冯', '2345671', '234@qq.com', '商家', '2023-04-12 01:20:00.000000');
INSERT INTO `users` VALUES (2345678, '小李', '2345678', '234@163.com', '普通用户', '2023-04-02 15:30:00.000000');
INSERT INTO `users` VALUES (3456712, '小谢', '3456712', '345@gmail.com', '管理员', '2023-04-13 02:25:00.000000');
INSERT INTO `users` VALUES (3456789, '小王', '3456789', '345@gmail.com', '商家', '2023-04-03 16:45:00.000000');
INSERT INTO `users` VALUES (4567123, '小韩', '4567123', '456@163.com', '普通用户', '2023-04-14 03:30:00.000000');
INSERT INTO `users` VALUES (4567890, '小张', '4567890', '456@qq.com', '管理员', '2023-04-04 17:20:00.000000');
INSERT INTO `users` VALUES (5671234, '小朱', '5671234', '567@qq.com', '商家', '2023-04-15 04:35:00.000000');
INSERT INTO `users` VALUES (5678901, '小刘', '5678901', '567@163.com', '普通用户', '2023-04-05 18:10:00.000000');
INSERT INTO `users` VALUES (6781235, '小马', '6781235', '678@gmail.com', '管理员', '2023-04-16 05:40:00.000000');
INSERT INTO `users` VALUES (6789012, '小陈', '6789012', '678@qq.com', '商家', '2023-04-06 19:05:00.000000');
INSERT INTO `users` VALUES (7890123, '小杨', '7890123', '789@gmail.com', '管理员', '2023-04-07 20:00:00.000000');
INSERT INTO `users` VALUES (7891236, '小胡', '7891236', '789@163.com', '普通用户', '2023-04-17 06:45:00.000000');
INSERT INTO `users` VALUES (8901234, '小赵', '8901234', '890@163.com', '普通用户', '2023-04-08 21:30:00.000000');
INSERT INTO `users` VALUES (8901237, '小郭', '8901237', '890@qq.com', '商家', '2023-04-18 07:50:00.000000');
INSERT INTO `users` VALUES (9012345, '小周', '9012345', '901@qq.com', '商家', '2023-04-09 22:45:00.000000');
INSERT INTO `users` VALUES (9012347, '小何', '9012347', '901@gmail.com', '管理员', '2023-04-19 08:55:00.000000');
INSERT INTO `users` VALUES (11123458, '小冯', '11123458', '1113@163.com', '商家', '2023-04-12 01:20:00.000000');
INSERT INTO `users` VALUES (11234567, '小李', '11234567', '1234@qq.com', '普通用户', '2023-04-02 15:30:00.000000');
INSERT INTO `users` VALUES (12345677, '老王', '12345678', '123@qq.com', '用户', '2023-04-01 16:04:26.000000');
INSERT INTO `users` VALUES (12345756, '小郑', '123457', '1012@qq.com', '普通用户', '2023-04-11 00:15:00.000000');
INSERT INTO `users` VALUES (22123459, '小谢', '22123459', '2114@gmail.com', '管理员', '2023-04-13 02:25:00.000000');
INSERT INTO `users` VALUES (22345678, '小王', '22345678', '2345@163.com', '商家', '2023-04-03 16:45:00.000000');
INSERT INTO `users` VALUES (33123460, '小韩', '33123460', '3115@qq.com', '普通用户', '2023-04-14 03:30:00.000000');
INSERT INTO `users` VALUES (33456789, '小张', '33456789', '3456@gmail.com', '管理员', '2023-04-04 17:20:00.000000');
INSERT INTO `users` VALUES (44123461, '小朱', '44123461', '4116@163.com', '商家', '2023-04-15 04:35:00.000000');
INSERT INTO `users` VALUES (44567890, '小刘', '44567890', '4567@qq.com', '普通用户', '2023-04-05 18:10:00.000000');
INSERT INTO `users` VALUES (55123462, '小马', '55123462', '5117@gmail.com', '管理员', '2023-04-16 05:40:00.000000');
INSERT INTO `users` VALUES (55679001, '小陈', '55679001', '5678@163.com', '商家', '2023-04-06 19:05:00.000000');
INSERT INTO `users` VALUES (66123463, '小胡', '66123463', '6118@qq.com', '普通用户', '2023-04-17 06:45:00.000000');
INSERT INTO `users` VALUES (66790123, '小杨', '66790123', '6789@gmail.com', '管理员', '2023-04-07 20:00:00.000000');
INSERT INTO `users` VALUES (77123464, '小郭', '77123464', '7119@163.com', '商家', '2023-04-18 07:50:00.000000');
INSERT INTO `users` VALUES (77901234, '小赵', '77901234', '7890@qq.com', '普通用户', '2023-04-08 21:30:00.000000');
INSERT INTO `users` VALUES (88012345, '小周', '88012345', '8901@163.com', '商家', '2023-04-09 22:45:00.000000');
INSERT INTO `users` VALUES (88123465, '小何', '88123465', '8120@gmail.com', '管理员', '2023-04-19 08:55:00.000000');
INSERT INTO `users` VALUES (99123456, '小吴', '99123456', '9010@gmail.com', '管理员', '2023-04-10 23:50:00.000000');
INSERT INTO `users` VALUES (99123467, 'john_doe', 'password123', 'john.doe@example.com', '管理员', '2024-12-19 22:31:31.000000');
INSERT INTO `users` VALUES (99123468, '天才~', 'pass6623', 'tiancai@example.com', '普通用户', '2024-12-19 22:45:38.000000');
INSERT INTO `users` VALUES (99123469, '高启强', '666666', '666666', '管理员', '2024-12-20 12:51:53.000000');

SET FOREIGN_KEY_CHECKS = 1;
