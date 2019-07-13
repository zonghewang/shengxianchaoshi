/*
Navicat MySQL Data Transfer

Source Server         : shixun
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : sxcs

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2019-07-11 13:35:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for xt_buy
-- ----------------------------
DROP TABLE IF EXISTS `xt_buy`;
CREATE TABLE `xt_buy` (
`pk_bid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '采购订单唯一标识' ,
`buy_name`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '采购订单的名称' ,
`buy_time`  timestamp NOT NULL COMMENT '采购时间' ,
`pk_uid`  bigint(20) UNSIGNED NOT NULL COMMENT '采购用户的id' ,
`buy_info`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '采购备注信息' ,
`is_seasonal`  tinyint(3) UNSIGNED NOT NULL COMMENT '是否为应季采购' ,
`is_in_storehouse`  tinyint(3) UNSIGNED NOT NULL COMMENT '表明商品是否入库' ,
PRIMARY KEY (`pk_bid`),
FOREIGN KEY (`pk_uid`) REFERENCES `xt_user` (`pk_uid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX `buy_user_fk_1` (`pk_uid`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=17

;

-- ----------------------------
-- Records of xt_buy
-- ----------------------------
BEGIN;
INSERT INTO `xt_buy` VALUES ('1', '1', '2019-07-10 12:42:26', '2', '1', '1', '0'), ('8', '666', '2019-07-10 18:35:51', '2', '12', '0', '0'), ('9', '666', '2019-07-10 18:35:51', '2', '12', '0', '0'), ('10', '666', '2019-07-10 18:35:51', '2', '12', '0', '0'), ('11', '666', '2019-07-10 18:35:51', '2', '12', '0', '0'), ('18', '1111', '2019-07-10 22:54:11', '2', '5645', '0', '0');
COMMIT;

-- ----------------------------
-- Table structure for xt_buy_info
-- ----------------------------
DROP TABLE IF EXISTS `xt_buy_info`;
CREATE TABLE `xt_buy_info` (
`pk_biid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '采购订单子表唯一标识' ,
`pk_bid`  bigint(20) UNSIGNED NOT NULL COMMENT '采购订单唯一标识' ,
`pk_pid`  bigint(20) UNSIGNED NOT NULL COMMENT '采购商品唯一标识' ,
`pk_spid`  bigint(20) UNSIGNED NOT NULL COMMENT '采购的供应唯一标识' ,
`buy_info_num`  int(10) UNSIGNED NOT NULL COMMENT '采购数量' ,
`buy_info_other`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '备注信息' ,
PRIMARY KEY (`pk_biid`),
FOREIGN KEY (`pk_bid`) REFERENCES `xt_buy` (`pk_bid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
FOREIGN KEY (`pk_pid`) REFERENCES `xt_product` (`pk_pid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
FOREIGN KEY (`pk_spid`) REFERENCES `xt_supplier_product` (`pk_spid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX `buyinfo_buy_fk_1` (`pk_bid`) USING BTREE ,
INDEX `buyinfo_product_fk_2` (`pk_pid`) USING BTREE ,
INDEX `buyinfo_spid_fk_3` (`pk_spid`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of xt_buy_info
-- ----------------------------
BEGIN;
INSERT INTO `xt_buy_info` VALUES ('2', '18', '1', '3', '10', '1111');
COMMIT;

-- ----------------------------
-- Table structure for xt_customer
-- ----------------------------
DROP TABLE IF EXISTS `xt_customer`;
CREATE TABLE `xt_customer` (
`pk_cid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '顾客唯一标识' ,
`customer_name`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '顾客姓名' ,
`customer_age`  tinyint(3) UNSIGNED NOT NULL COMMENT '顾客年龄' ,
`customer_sex`  tinyint(3) UNSIGNED NOT NULL COMMENT '顾客性别' ,
`customer_id_no`  varchar(21) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '顾客身份证号' ,
`customer_addr`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '顾客地址' ,
`customer_tel`  varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '顾客联系方式' ,
`is_vip`  tinyint(3) UNSIGNED NOT NULL COMMENT '是否为本店会员' ,
`vip_no`  varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '会员卡编号' ,
`vip_date`  timestamp NULL DEFAULT NULL COMMENT '会员办卡日期' ,
`vip_who_use`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '会员持卡人' ,
`vip_pcid`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '会员商品编号' ,
`vip_gread`  int(10) UNSIGNED NULL DEFAULT NULL COMMENT '会员积分' ,
PRIMARY KEY (`pk_cid`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=2

;

-- ----------------------------
-- Records of xt_customer
-- ----------------------------
BEGIN;
INSERT INTO `xt_customer` VALUES ('1', '1', '1', '0', '1', '1', '1', '1', '10010', '2019-07-09 23:17:22', '1', '1', '1');
COMMIT;

-- ----------------------------
-- Table structure for xt_employee
-- ----------------------------
DROP TABLE IF EXISTS `xt_employee`;
CREATE TABLE `xt_employee` (
`pk_eid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '员工信息唯一标识' ,
`pk_uid`  bigint(20) UNSIGNED NOT NULL COMMENT '员工用户关联表' ,
`emp_no`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工编号' ,
`emp_name`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工名称' ,
`emp_sex`  tinyint(3) UNSIGNED NOT NULL COMMENT '员工性别' ,
`emp_age`  tinyint(3) UNSIGNED NOT NULL COMMENT '员工年龄' ,
`emp_tel`  char(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工电话' ,
PRIMARY KEY (`pk_eid`),
FOREIGN KEY (`pk_uid`) REFERENCES `xt_user` (`pk_uid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
UNIQUE INDEX `emp_no` (`emp_no`) USING BTREE ,
INDEX `employee_user_fk_1` (`pk_uid`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=7

;

-- ----------------------------
-- Records of xt_employee
-- ----------------------------
BEGIN;
INSERT INTO `xt_employee` VALUES ('2', '2', '10011', '10011', '1', '11', '11111111111'), ('6', '6', '2222', '22222', '1', '22', '22222222');
COMMIT;

-- ----------------------------
-- Table structure for xt_employee_product_category
-- ----------------------------
DROP TABLE IF EXISTS `xt_employee_product_category`;
CREATE TABLE `xt_employee_product_category` (
`pk_epcid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '用户员工商品类别唯一标识' ,
`pk_uid`  bigint(20) UNSIGNED NOT NULL COMMENT '用户唯一标识' ,
`pk_pcid`  bigint(20) UNSIGNED NOT NULL COMMENT '商品唯一标识' ,
PRIMARY KEY (`pk_epcid`),
FOREIGN KEY (`pk_pcid`) REFERENCES `xt_product` (`pk_pid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
FOREIGN KEY (`pk_uid`) REFERENCES `xt_user` (`pk_uid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX `employeeproductcategory_user_fk_1` (`pk_uid`) USING BTREE ,
INDEX `employeeproductcategory_product_fk_2` (`pk_pcid`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of xt_employee_product_category
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for xt_menu
-- ----------------------------
DROP TABLE IF EXISTS `xt_menu`;
CREATE TABLE `xt_menu` (
`pk_mid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '菜单唯一标识' ,
`menu_name`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜单项名称' ,
`menu_mid`  bigint(20) UNSIGNED NOT NULL COMMENT '父菜单mid' ,
`is_parent`  tinyint(3) UNSIGNED NOT NULL COMMENT '是否为父节点' ,
`menu_url`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '对应网址' ,
PRIMARY KEY (`pk_mid`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=72

;

-- ----------------------------
-- Records of xt_menu
-- ----------------------------
BEGIN;
INSERT INTO `xt_menu` VALUES ('1', '用户登陆', '0', '1', '/admin/login'), ('2', '首页', '0', '1', '/admin/index'), ('3', '首页展示', '0', '1', '/admin/indexShow'), ('4', '商品分类管理', '0', '1', ''), ('5', '一级分类管理', '0', '1', '/admin/productcategory/first/show'), ('6', '一级分类添加', '0', '1', '/admin/productcategory/first/add'), ('7', '一级分类删除', '0', '1', '/admin/productcategory/first/delete'), ('8', '一级分类修改', '0', '1', '/admin/productcategory/first/update'), ('9', '二级分类管理', '0', '1', '/admin/productcategory/second/show'), ('10', '二级分类添加', '0', '1', '/admin/productcategory/second/add'), ('11', '二级分类删除', '0', '1', '/admin/productcategory/second/delete'), ('12', '二级分类修改', '0', '1', '/admin/productcategory/second/update'), ('13', '三级分类管理', '0', '1', '/admin/productcategory/thread/show'), ('14', '三级分类添加', '0', '1', '/admin/productcategory/thread/add'), ('15', '三级分类删除', '0', '1', '/admin/productcategory/thread/delete'), ('16', '三级分类修改', '0', '1', '/admin/productcategory/thread/update'), ('17', '货物管理', '0', '1', ''), ('18', '采购管理', '0', '1', '/admin/product/buy/show'), ('19', '采购删除', '0', '1', '/admin/product/buy/delete'), ('20', '采购和详单管理', '0', '1', '/admin/product/buy/buyandinfo/show'), ('21', '采购和详单修改', '0', '1', '/admin/product/buy/buyandinfo/update'), ('22', '采购和详单添加', '0', '1', '/admin/product/buy/buyandinfo/add'), ('23', '采购和详单删除', '0', '1', '/admin/product/buy/buyandinfo/delete'), ('24', '销售管理', '0', '1', '/admin/product/sales/show'), ('25', '销售删除', '0', '1', '/admin/product/sales/delete'), ('26', '销售和详单管理', '0', '1', '/admin/product/sales/info/show'), ('27', '销售和详单修改', '0', '1', '/admin/product/sales/info/update'), ('28', '销售和详单添加', '0', '1', '/admin/product/sales/info/add'), ('29', '销售和详单删除', '0', '1', '/admin/product/sales/info/delete'), ('30', '退货管理', '0', '1', '/admin/product/refunds/show'), ('31', '退货删除', '0', '1', '/admin/product/refunds/delete'), ('32', '退货和详单管理', '0', '1', '/admin/product/refunds/info/show'), ('33', '退货和详单修改', '0', '1', '/admin/product/refunds/info/update'), ('34', '退货和详单添加', '0', '1', '/admin/product/refunds/info/add'), ('35', '退货和详单删除', '0', '1', '/admin/product/refunds/info/delete'), ('36', '货物盘点', '0', '1', '/admin/product/show'), ('37', '货物盘点修改', '0', '1', '/admin/product/update'), ('38', '货物盘点添加', '0', '1', '/admin/product/add'), ('39', '货物盘点删除', '0', '1', '/admin/product/delete'), ('40', '库存管理', '0', '1', ''), ('41', '仓库管理', '0', '1', '/admin/storehouse/name/show'), ('42', '仓库添加', '0', '1', '/admin/storehouse/name/add'), ('43', '仓库删除', '0', '1', '/admin/storehouse/name/delete'), ('44', '仓库更新', '0', '1', '/admin/storehouse/name/update'), ('45', '出入库管理', '0', '1', '/admin/storehouse/outgoing/show'), ('46', '出入库信息删除', '0', '1', '/admin/storehouse/outgoing/delete'), ('47', '入库信息和详单管理', '0', '1', '/admin/storehouse/outgoing/outgoingandinfo/showg'), ('48', '出库信息和详单管理', '0', '1', '/admin/storehouse/outgoing/outgoingandinfo/showo'), ('49', '入库信息和详单添加', '0', '1', '/admin/storehouse/outgoing/outgoingandinfo/addg'), ('50', '出库信息和详单添加', '0', '1', '/admin/storehouse/outgoing/outgoingandinfo/addo'), ('51', '入库信息和详单修改', '0', '1', '/admin/storehouse/outgoing/outgoingandinfo/updateg'), ('52', '出库信息和详单修改', '0', '1', '/admin/storehouse/outgoing/outgoingandinfo/updateo'), ('53', '入库信息和详单删除', '0', '1', '/admin/storehouse/outgoing/outgoingandinfo/deleteg'), ('54', '出库信息和详单删除', '0', '1', '/admin/storehouse/outgoing/outgoingandinfo/deleteo'), ('55', '库存报表', '0', '1', '/admin/storehouse/show'), ('56', '预警信息', '0', '1', '/admin/storehouse/alert/show'), ('57', '员工管理', '0', '1', ''), ('58', '用户添加', '0', '1', '/admin/user/add'), ('59', '用户列表', '0', '1', '/admin/user/show'), ('60', '用户修改', '0', '1', '/admin/user/update'), ('61', '用户删除', '0', '1', '/admin/user/delete'), ('62', '供应商管理', '0', '1', ''), ('63', '供应商添加', '0', '1', '/admin/supplier/add'), ('64', '供应商列表', '0', '1', '/admin/supplier/show'), ('65', '供应商修改', '0', '1', '/admin/supplier/update'), ('66', '供应商删除', '0', '1', '/admin/supplier/delete'), ('67', '客户管理', '0', '1', ''), ('68', '会员添加', '0', '1', '/admin/customer/add'), ('69', '会员列表', '0', '1', '/admin/customer/show'), ('70', '会员修改', '0', '1', '/admin/customer/update'), ('71', '会员删除', '0', '1', '/admin/customer/delete');
COMMIT;

-- ----------------------------
-- Table structure for xt_outgoing_record
-- ----------------------------
DROP TABLE IF EXISTS `xt_outgoing_record`;
CREATE TABLE `xt_outgoing_record` (
`pk_orid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '出入库信息唯一标识' ,
`pk_sid`  bigint(20) UNSIGNED NOT NULL COMMENT '仓库信息唯一标识' ,
`is_going`  tinyint(3) UNSIGNED NOT NULL COMMENT '出入库单编号' ,
`outgoing_record_time`  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '出入库时间' ,
`pk_bid`  bigint(20) UNSIGNED NULL DEFAULT NULL COMMENT '采购订单唯一标识' ,
`pk_pid`  bigint(20) UNSIGNED NULL DEFAULT NULL COMMENT '出入库商品编号' ,
`outgoing_record_num`  int(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '出入库商品数量' ,
`pk_uid`  bigint(20) UNSIGNED NOT NULL COMMENT '出入库人员' ,
`outgoing_record_result`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '出入库原因' ,
PRIMARY KEY (`pk_orid`),
FOREIGN KEY (`pk_bid`) REFERENCES `xt_buy` (`pk_bid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
FOREIGN KEY (`pk_pid`) REFERENCES `xt_product` (`pk_pid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
FOREIGN KEY (`pk_uid`) REFERENCES `xt_user` (`pk_uid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
FOREIGN KEY (`pk_sid`) REFERENCES `xt_storehouse` (`pk_sid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX `outgoingrecord_buy_fk_1` (`pk_bid`) USING BTREE ,
INDEX `outgoingrecord_product_fk_1` (`pk_pid`) USING BTREE ,
INDEX `outgoingrecord_refunds_fk_1` (`pk_uid`) USING BTREE ,
INDEX `outgoingrecord_storehouse_fk_1` (`pk_sid`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=3

;

-- ----------------------------
-- Records of xt_outgoing_record
-- ----------------------------
BEGIN;
INSERT INTO `xt_outgoing_record` VALUES ('1', '2', '1', '2019-07-10 12:43:19', '1', null, '0', '2', '无'), ('2', '2', '0', '2019-07-10 12:44:00', null, null, '0', '2', '无');
COMMIT;

-- ----------------------------
-- Table structure for xt_outgoing_record_info
-- ----------------------------
DROP TABLE IF EXISTS `xt_outgoing_record_info`;
CREATE TABLE `xt_outgoing_record_info` (
`pk_oriid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '出入库信息唯一标识' ,
`pk_orid`  bigint(20) UNSIGNED NOT NULL COMMENT '出入库记录唯一标识' ,
`pk_pid`  bigint(20) UNSIGNED NOT NULL COMMENT '商品唯一标识' ,
`outgoing_record_num`  int(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '出入库商品数量' ,
PRIMARY KEY (`pk_oriid`),
FOREIGN KEY (`pk_orid`) REFERENCES `xt_outgoing_record` (`pk_orid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
FOREIGN KEY (`pk_pid`) REFERENCES `xt_product` (`pk_pid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX `outgoingrecordinfo_outgoingrecord_fk_1` (`pk_orid`) USING BTREE ,
INDEX `outgoingrecordinfo_product_fk_1` (`pk_pid`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=4

;

-- ----------------------------
-- Records of xt_outgoing_record_info
-- ----------------------------
BEGIN;
INSERT INTO `xt_outgoing_record_info` VALUES ('1', '1', '1', '1'), ('2', '1', '1', '100'), ('3', '2', '1', '100');
COMMIT;

-- ----------------------------
-- Table structure for xt_product
-- ----------------------------
DROP TABLE IF EXISTS `xt_product`;
CREATE TABLE `xt_product` (
`pk_pid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '商品类别唯一标识' ,
`product_category_name`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称' ,
`product_category_num`  int(10) UNSIGNED NULL DEFAULT 0 COMMENT '总数量' ,
`product_category_price`  decimal(10,0) NOT NULL COMMENT '商品单价' ,
`vip_price`  decimal(10,0) NOT NULL COMMENT '会员单价' ,
`pk_pcid`  bigint(20) UNSIGNED NOT NULL COMMENT '类别编号' ,
PRIMARY KEY (`pk_pid`),
FOREIGN KEY (`pk_pcid`) REFERENCES `xt_product_category` (`pk_pcid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX `product_productcategory_fk_1` (`pk_pcid`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=6

;

-- ----------------------------
-- Records of xt_product
-- ----------------------------
BEGIN;
INSERT INTO `xt_product` VALUES ('1', '西湖红鲤鱼', '1000', '8888', '6666', '1002001001'), ('2', '北京红鲤鱼', '100', '1000', '100', '1002001001'), ('3', '信息红鲤鱼', '0', '66666', '6666', '1002001001'), ('5', '美国红鲤鱼', '0', '9986', '8822', '1002001001');
COMMIT;

-- ----------------------------
-- Table structure for xt_product_category
-- ----------------------------
DROP TABLE IF EXISTS `xt_product_category`;
CREATE TABLE `xt_product_category` (
`pk_pcid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '商品类别唯一标识' ,
`product_category_name`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称' ,
`pid`  bigint(20) UNSIGNED NOT NULL COMMENT '父级编号' ,
PRIMARY KEY (`pk_pcid`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1002001002

;

-- ----------------------------
-- Records of xt_product_category
-- ----------------------------
BEGIN;
INSERT INTO `xt_product_category` VALUES ('1001', '水果', '1'), ('1002', '水产品', '1'), ('1003', '饮品', '1'), ('1001001', '苹果', '1001'), ('1001002', '香蕉', '1001'), ('1001003', '梨', '1001'), ('1001004', '菠萝', '1001'), ('1002001', '鱼', '1002'), ('1002002', '虾', '1002'), ('1003001', '饮料', '1003'), ('1002001001', '红鲤鱼', '1002001');
COMMIT;

-- ----------------------------
-- Table structure for xt_refunds
-- ----------------------------
DROP TABLE IF EXISTS `xt_refunds`;
CREATE TABLE `xt_refunds` (
`pk_reid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '退货订单唯一标识' ,
`pk_soid`  bigint(20) UNSIGNED NOT NULL COMMENT '商品销售唯一标识' ,
`refunds_time`  timestamp NOT NULL COMMENT '退货时间' ,
`pk_cid`  bigint(20) UNSIGNED NOT NULL COMMENT '退货人' ,
`pk_uid`  bigint(20) UNSIGNED NOT NULL COMMENT '退货经办人' ,
`refunds_result`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '退货原因' ,
PRIMARY KEY (`pk_reid`),
FOREIGN KEY (`pk_cid`) REFERENCES `xt_customer` (`pk_cid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
FOREIGN KEY (`pk_soid`) REFERENCES `xt_sales_order` (`pk_soid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
FOREIGN KEY (`pk_uid`) REFERENCES `xt_user` (`pk_uid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX `refunds_salesorder_fk_1` (`pk_soid`) USING BTREE ,
INDEX `refunds_customer_fk_2` (`pk_cid`) USING BTREE ,
INDEX `refunds_user_fk_3` (`pk_uid`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of xt_refunds
-- ----------------------------
BEGIN;
INSERT INTO `xt_refunds` VALUES ('1', '10', '2019-07-11 09:49:21', '1', '2', ''), ('2', '11', '2019-07-11 09:49:40', '1', '2', null);
COMMIT;

-- ----------------------------
-- Table structure for xt_refunds_info
-- ----------------------------
DROP TABLE IF EXISTS `xt_refunds_info`;
CREATE TABLE `xt_refunds_info` (
`pk_reiid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '退货订单子表唯一标识' ,
`pk_reid`  bigint(20) UNSIGNED NOT NULL COMMENT '退货订单唯一标识' ,
`pk_pid`  bigint(20) UNSIGNED NOT NULL COMMENT '商品唯一标识' ,
`refunds_info_num`  int(10) UNSIGNED NOT NULL COMMENT '退货数量' ,
`refunds_info_price`  decimal(10,0) NOT NULL COMMENT '退货单价金额' ,
PRIMARY KEY (`pk_reiid`),
FOREIGN KEY (`pk_pid`) REFERENCES `xt_product` (`pk_pid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
FOREIGN KEY (`pk_reid`) REFERENCES `xt_refunds` (`pk_reid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX `refundsinfo_refunds_fk_1` (`pk_reid`) USING BTREE ,
INDEX `refundsinfo_product_fk_2` (`pk_pid`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of xt_refunds_info
-- ----------------------------
BEGIN;
INSERT INTO `xt_refunds_info` VALUES ('1', '1', '1', '10', '60'), ('2', '2', '1', '2', '30');
COMMIT;

-- ----------------------------
-- Table structure for xt_role
-- ----------------------------
DROP TABLE IF EXISTS `xt_role`;
CREATE TABLE `xt_role` (
`pk_rid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '角色信息唯一标识' ,
`role_name`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '记录角色名称' ,
`role_description`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '记录角色描述' ,
PRIMARY KEY (`pk_rid`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=11

;

-- ----------------------------
-- Records of xt_role
-- ----------------------------
BEGIN;
INSERT INTO `xt_role` VALUES ('1', '管理员', '管理整个系统 显示全部功能 包括系统设置'), ('2', '总经理', '拥有全部功能除系统设置'), ('3', '人力经理', '员工管理'), ('4', '客服经理', '客户管理，销售管理，退货管理'), ('5', '后勤经理', '管理商品分类，货物盘点，预警信息'), ('6', '采购经理', '管理供应商信息，采购管理'), ('7', '采购员', '采购管理'), ('8', '销售员', '销售管理'), ('9', '退货员', '退货管理'), ('10', '仓储员', '出入库管理');
COMMIT;

-- ----------------------------
-- Table structure for xt_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `xt_role_menu`;
CREATE TABLE `xt_role_menu` (
`pk_rmid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '角色菜单唯一标识' ,
`pk_rid`  bigint(20) UNSIGNED NOT NULL COMMENT '角色唯一标识' ,
`pk_mid`  bigint(20) UNSIGNED NOT NULL COMMENT '菜单唯一标识' ,
PRIMARY KEY (`pk_rmid`),
FOREIGN KEY (`pk_mid`) REFERENCES `xt_menu` (`pk_mid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
FOREIGN KEY (`pk_rid`) REFERENCES `xt_role` (`pk_rid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX `rolemenu_role_fk_1` (`pk_rid`) USING BTREE ,
INDEX `rolemenu_menu_fk_2` (`pk_mid`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=254

;

-- ----------------------------
-- Records of xt_role_menu
-- ----------------------------
BEGIN;
INSERT INTO `xt_role_menu` VALUES ('1', '1', '1'), ('2', '1', '2'), ('3', '1', '3'), ('4', '1', '4'), ('5', '1', '5'), ('6', '1', '6'), ('7', '1', '7'), ('8', '1', '8'), ('9', '1', '9'), ('10', '1', '10'), ('11', '1', '11'), ('12', '1', '12'), ('13', '1', '13'), ('14', '1', '14'), ('15', '1', '15'), ('16', '1', '16'), ('17', '1', '17'), ('18', '1', '18'), ('19', '1', '19'), ('20', '1', '20'), ('21', '1', '21'), ('22', '1', '22'), ('23', '1', '23'), ('24', '1', '24'), ('25', '1', '25'), ('26', '1', '26'), ('27', '1', '27'), ('28', '1', '28'), ('29', '1', '29'), ('30', '1', '30'), ('31', '1', '31'), ('32', '1', '32'), ('33', '1', '33'), ('34', '1', '34'), ('35', '1', '35'), ('36', '1', '36'), ('37', '1', '37'), ('38', '1', '38'), ('39', '1', '39'), ('40', '1', '40'), ('41', '1', '41'), ('42', '1', '42'), ('43', '1', '43'), ('44', '1', '44'), ('45', '1', '45'), ('46', '1', '46'), ('47', '1', '47'), ('48', '1', '48'), ('49', '1', '49'), ('50', '1', '50'), ('51', '1', '51'), ('52', '1', '52'), ('53', '1', '53'), ('54', '1', '54'), ('55', '1', '55'), ('56', '1', '56'), ('57', '1', '57'), ('58', '1', '58'), ('59', '1', '59'), ('60', '1', '60'), ('61', '1', '61'), ('62', '1', '62'), ('63', '1', '63'), ('64', '1', '64'), ('65', '1', '65'), ('66', '1', '66'), ('67', '1', '67'), ('68', '1', '68'), ('69', '1', '69'), ('70', '1', '70'), ('71', '1', '71'), ('72', '2', '1'), ('73', '2', '2'), ('74', '2', '3'), ('75', '2', '4'), ('76', '2', '5'), ('77', '2', '6'), ('78', '2', '7'), ('79', '2', '8'), ('80', '2', '9'), ('81', '2', '10'), ('82', '2', '11'), ('83', '2', '12'), ('84', '2', '13'), ('85', '2', '14'), ('86', '2', '15'), ('87', '2', '16'), ('88', '2', '17'), ('89', '2', '18'), ('90', '2', '19'), ('91', '2', '20'), ('92', '2', '21'), ('93', '2', '22'), ('94', '2', '23'), ('95', '2', '24'), ('96', '2', '25'), ('97', '2', '26'), ('98', '2', '27'), ('99', '2', '28'), ('100', '2', '29');
INSERT INTO `xt_role_menu` VALUES ('101', '2', '30'), ('102', '2', '31'), ('103', '2', '32'), ('104', '2', '33'), ('105', '2', '34'), ('106', '2', '35'), ('107', '2', '36'), ('108', '2', '37'), ('109', '2', '38'), ('110', '2', '39'), ('111', '2', '40'), ('112', '2', '41'), ('113', '2', '42'), ('114', '2', '43'), ('115', '2', '44'), ('116', '2', '45'), ('117', '2', '46'), ('118', '2', '47'), ('119', '2', '48'), ('120', '2', '49'), ('121', '2', '50'), ('122', '2', '51'), ('123', '2', '52'), ('124', '2', '53'), ('125', '2', '54'), ('126', '2', '55'), ('127', '2', '56'), ('128', '2', '57'), ('129', '2', '58'), ('130', '2', '59'), ('131', '2', '60'), ('132', '2', '61'), ('133', '2', '62'), ('134', '2', '63'), ('135', '2', '64'), ('136', '2', '65'), ('137', '2', '66'), ('138', '2', '67'), ('139', '2', '68'), ('140', '2', '69'), ('141', '2', '70'), ('142', '2', '71'), ('143', '3', '1'), ('144', '3', '2'), ('145', '3', '3'), ('146', '3', '57'), ('147', '3', '58'), ('148', '3', '59'), ('149', '3', '60'), ('150', '3', '61'), ('151', '4', '1'), ('152', '4', '2'), ('153', '4', '3'), ('154', '4', '67'), ('155', '4', '68'), ('156', '4', '69'), ('157', '4', '70'), ('158', '4', '71'), ('159', '4', '17'), ('160', '4', '24'), ('161', '4', '25'), ('162', '4', '26'), ('163', '4', '27'), ('164', '4', '28'), ('165', '4', '29'), ('166', '4', '30'), ('167', '4', '31'), ('168', '4', '32'), ('169', '4', '33'), ('170', '4', '34'), ('171', '4', '35'), ('172', '5', '1'), ('173', '5', '2'), ('174', '5', '3'), ('175', '5', '4'), ('176', '5', '5'), ('177', '5', '6'), ('178', '5', '7'), ('179', '5', '8'), ('180', '5', '9'), ('181', '5', '10'), ('182', '5', '11'), ('183', '5', '12'), ('184', '5', '13'), ('185', '5', '14'), ('186', '5', '15'), ('187', '5', '16'), ('188', '5', '17'), ('189', '5', '36'), ('190', '5', '37'), ('191', '5', '38'), ('192', '5', '39'), ('193', '5', '40'), ('194', '5', '56'), ('195', '6', '1'), ('196', '6', '2'), ('197', '6', '3'), ('198', '6', '62'), ('199', '6', '63'), ('200', '6', '64');
INSERT INTO `xt_role_menu` VALUES ('201', '6', '65'), ('202', '6', '66'), ('203', '6', '17'), ('204', '6', '18'), ('205', '6', '19'), ('206', '6', '20'), ('207', '6', '21'), ('208', '6', '22'), ('209', '6', '23'), ('210', '7', '1'), ('211', '7', '2'), ('212', '7', '3'), ('213', '7', '17'), ('214', '7', '18'), ('215', '7', '19'), ('216', '7', '20'), ('217', '7', '21'), ('218', '7', '22'), ('219', '7', '23'), ('220', '8', '1'), ('221', '8', '2'), ('222', '8', '3'), ('223', '8', '17'), ('224', '8', '24'), ('225', '8', '25'), ('226', '8', '26'), ('227', '8', '27'), ('228', '8', '28'), ('229', '8', '29'), ('230', '9', '1'), ('231', '9', '2'), ('232', '9', '3'), ('233', '9', '17'), ('234', '9', '30'), ('235', '9', '31'), ('236', '9', '32'), ('237', '9', '33'), ('238', '9', '34'), ('239', '9', '35'), ('240', '10', '1'), ('241', '10', '2'), ('242', '10', '3'), ('243', '10', '40'), ('244', '10', '45'), ('245', '10', '46'), ('246', '10', '47'), ('247', '10', '48'), ('248', '10', '49'), ('249', '10', '50'), ('250', '10', '51'), ('251', '10', '52'), ('252', '10', '53'), ('253', '10', '54');
COMMIT;

-- ----------------------------
-- Table structure for xt_sales_order
-- ----------------------------
DROP TABLE IF EXISTS `xt_sales_order`;
CREATE TABLE `xt_sales_order` (
`pk_soid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '销售订单唯一标识' ,
`sales_order_time`  timestamp NOT NULL COMMENT '销售时间' ,
`pk_uid`  bigint(20) UNSIGNED NOT NULL COMMENT '销售用户的唯一标识' ,
`sales_order_pay`  decimal(10,0) NULL DEFAULT NULL COMMENT '本订单的销售总金额' ,
`pk_cid`  bigint(20) UNSIGNED NULL DEFAULT NULL COMMENT '客户唯一标识' ,
`sales_order_info`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '销售备注信息' ,
PRIMARY KEY (`pk_soid`),
FOREIGN KEY (`pk_cid`) REFERENCES `xt_customer` (`pk_cid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
FOREIGN KEY (`pk_uid`) REFERENCES `xt_user` (`pk_uid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX `salesorder_user_fk_1` (`pk_uid`) USING BTREE ,
INDEX `salesorder_costomer_fk_2` (`pk_cid`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of xt_sales_order
-- ----------------------------
BEGIN;
INSERT INTO `xt_sales_order` VALUES ('10', '2019-07-11 09:25:41', '2', '8888', null, ''), ('11', '2019-07-11 09:26:07', '2', '6666', '1', '');
COMMIT;

-- ----------------------------
-- Table structure for xt_sales_order_info
-- ----------------------------
DROP TABLE IF EXISTS `xt_sales_order_info`;
CREATE TABLE `xt_sales_order_info` (
`pk_soiid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '销售订单子订单唯一标识' ,
`pk_soid`  bigint(20) UNSIGNED NOT NULL COMMENT '商品销售唯一标识' ,
`pk_pcid`  bigint(20) UNSIGNED NOT NULL COMMENT '商品类别唯一标识' ,
`sales_order_info_num`  int(10) UNSIGNED NOT NULL COMMENT '商品销售数量' ,
`sales_order_info_price`  decimal(10,0) NOT NULL COMMENT '商品销售总金额' ,
PRIMARY KEY (`pk_soiid`),
FOREIGN KEY (`pk_pcid`) REFERENCES `xt_product` (`pk_pid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
FOREIGN KEY (`pk_soid`) REFERENCES `xt_sales_order` (`pk_soid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX `salesorderinfo_salesorderr_fk_1` (`pk_soid`) USING BTREE ,
INDEX `salesorderinfo_productcategory_fk_2` (`pk_pcid`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of xt_sales_order_info
-- ----------------------------
BEGIN;
INSERT INTO `xt_sales_order_info` VALUES ('2', '10', '1', '1', '8888'), ('3', '11', '1', '1', '6666');
COMMIT;

-- ----------------------------
-- Table structure for xt_storehouse
-- ----------------------------
DROP TABLE IF EXISTS `xt_storehouse`;
CREATE TABLE `xt_storehouse` (
`pk_sid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '仓库信息唯一标识' ,
`storehouse_name`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '仓库名称' ,
`pk_pid`  bigint(20) UNSIGNED NULL DEFAULT NULL COMMENT '商品唯一标识' ,
`storehouse_num`  int(10) UNSIGNED NULL DEFAULT NULL COMMENT '仓库内商品数量' ,
`storehouse_time`  timestamp NULL DEFAULT NULL COMMENT '商品存入时间' ,
`storehouse_min`  int(10) UNSIGNED NULL DEFAULT 0 COMMENT '商品最小库存量' ,
`storehouse_max`  int(10) UNSIGNED NULL DEFAULT NULL COMMENT '商品最大库存量' ,
PRIMARY KEY (`pk_sid`),
FOREIGN KEY (`pk_pid`) REFERENCES `xt_product` (`pk_pid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX `storehouse_product_fk_1` (`pk_pid`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=4

;

-- ----------------------------
-- Records of xt_storehouse
-- ----------------------------
BEGIN;
INSERT INTO `xt_storehouse` VALUES ('2', '8仓', null, '0', null, '10', '100'), ('3', '8仓', '1', '9', '2019-07-10 14:29:09', '10', '100');
COMMIT;

-- ----------------------------
-- Table structure for xt_supplier_product
-- ----------------------------
DROP TABLE IF EXISTS `xt_supplier_product`;
CREATE TABLE `xt_supplier_product` (
`pk_spid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '供应商唯一标识' ,
`supplier_name`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称' ,
`supplier_tel`  varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '联系电话' ,
`supplier_addr`  text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '供应商所在地' ,
`pk_pid`  bigint(20) UNSIGNED NOT NULL COMMENT '商品编号' ,
PRIMARY KEY (`pk_spid`),
FOREIGN KEY (`pk_pid`) REFERENCES `xt_product` (`pk_pid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX `rsupplierproduct_product_fk_1` (`pk_pid`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=6

;

-- ----------------------------
-- Records of xt_supplier_product
-- ----------------------------
BEGIN;
INSERT INTO `xt_supplier_product` VALUES ('3', '你好供应商', '13222222222', '四平推', '1'), ('4', '你好供', '13222222222', '四平推66666', '1'), ('5', '你好供啊啊啊', '13222222222', '四平推', '1');
COMMIT;

-- ----------------------------
-- Table structure for xt_user
-- ----------------------------
DROP TABLE IF EXISTS `xt_user`;
CREATE TABLE `xt_user` (
`pk_uid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '用户在系统中的唯一编号' ,
`user_name`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户账号' ,
`user_password`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户的md5密码' ,
PRIMARY KEY (`pk_uid`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=7

;

-- ----------------------------
-- Records of xt_user
-- ----------------------------
BEGIN;
INSERT INTO `xt_user` VALUES ('2', '1111', '1111'), ('6', '2222', '2222');
COMMIT;

-- ----------------------------
-- Table structure for xt_user_role
-- ----------------------------
DROP TABLE IF EXISTS `xt_user_role`;
CREATE TABLE `xt_user_role` (
`pk_urid`  bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '用户角色唯一标识' ,
`pk_uid`  bigint(20) UNSIGNED NOT NULL COMMENT '用户唯一id' ,
`pk_rid`  bigint(20) UNSIGNED NOT NULL COMMENT '角色唯一id' ,
PRIMARY KEY (`pk_urid`),
FOREIGN KEY (`pk_rid`) REFERENCES `xt_role` (`pk_rid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
FOREIGN KEY (`pk_uid`) REFERENCES `xt_user` (`pk_uid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX `userrole_user_fk_1` (`pk_uid`) USING BTREE ,
INDEX `userrole_role_fk_2` (`pk_rid`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=7

;

-- ----------------------------
-- Records of xt_user_role
-- ----------------------------
BEGIN;
INSERT INTO `xt_user_role` VALUES ('2', '2', '1'), ('6', '6', '2');
COMMIT;

-- ----------------------------
-- Auto increment value for xt_buy
-- ----------------------------
ALTER TABLE `xt_buy` AUTO_INCREMENT=17;

-- ----------------------------
-- Auto increment value for xt_buy_info
-- ----------------------------
ALTER TABLE `xt_buy_info` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for xt_customer
-- ----------------------------
ALTER TABLE `xt_customer` AUTO_INCREMENT=2;

-- ----------------------------
-- Auto increment value for xt_employee
-- ----------------------------
ALTER TABLE `xt_employee` AUTO_INCREMENT=7;

-- ----------------------------
-- Auto increment value for xt_employee_product_category
-- ----------------------------
ALTER TABLE `xt_employee_product_category` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for xt_menu
-- ----------------------------
ALTER TABLE `xt_menu` AUTO_INCREMENT=72;

-- ----------------------------
-- Auto increment value for xt_outgoing_record
-- ----------------------------
ALTER TABLE `xt_outgoing_record` AUTO_INCREMENT=3;

-- ----------------------------
-- Auto increment value for xt_outgoing_record_info
-- ----------------------------
ALTER TABLE `xt_outgoing_record_info` AUTO_INCREMENT=4;

-- ----------------------------
-- Auto increment value for xt_product
-- ----------------------------
ALTER TABLE `xt_product` AUTO_INCREMENT=6;
DROP TRIGGER IF EXISTS `before_xt_product_category_insert`;
DELIMITER ;;
CREATE TRIGGER `before_xt_product_category_insert` BEFORE INSERT ON `xt_product_category` FOR EACH ROW BEGIN

IF new.pid LIKE '_' THEN
SET new.pk_pcid =(select  IFNULL(max(xt_product_category.pk_pcid)+1,new.pid*1000+1)  FROM xt_product_category WHERE pid = new.pid);
ELSEIF new.pid LIKE '____' THEN	
SET new.pk_pcid =(select  IFNULL(max(xt_product_category.pk_pcid)+1,new.pid*1000+1)  FROM xt_product_category WHERE pid = new.pid);
ELSEIF new.pid LIKE '_______' THEN
SET new.pk_pcid =(select  IFNULL(max(xt_product_category.pk_pcid)+1,new.pid*1000+1)  FROM xt_product_category WHERE pid = new.pid);
END IF;

END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `before_xt_product_category_update`;
DELIMITER ;;
CREATE TRIGGER `before_xt_product_category_update` BEFORE UPDATE ON `xt_product_category` FOR EACH ROW BEGIN
DECLARE new_pk_pcid LONG;
IF old.pid != new.pid THEN
IF new.pid LIKE '_' THEN
SET new.pk_pcid =(select  IFNULL(max(xt_product_category.pk_pcid)+1,new.pid*1000+1)  FROM xt_product_category WHERE pid = new.pid);
ELSEIF new.pid LIKE '____' THEN	
SET new.pk_pcid =(select  IFNULL(max(xt_product_category.pk_pcid)+1,new.pid*1000+1)  FROM xt_product_category WHERE pid = new.pid);
ELSEIF new.pid LIKE '_______' THEN
SET new.pk_pcid =(select  IFNULL(max(xt_product_category.pk_pcid)+1,new.pid*1000+1)  FROM xt_product_category WHERE pid = new.pid);
END IF;
END IF;

END
;;
DELIMITER ;

-- ----------------------------
-- Auto increment value for xt_product_category
-- ----------------------------
ALTER TABLE `xt_product_category` AUTO_INCREMENT=1002001002;

-- ----------------------------
-- Auto increment value for xt_refunds
-- ----------------------------
ALTER TABLE `xt_refunds` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for xt_refunds_info
-- ----------------------------
ALTER TABLE `xt_refunds_info` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for xt_role
-- ----------------------------
ALTER TABLE `xt_role` AUTO_INCREMENT=11;

-- ----------------------------
-- Auto increment value for xt_role_menu
-- ----------------------------
ALTER TABLE `xt_role_menu` AUTO_INCREMENT=254;

-- ----------------------------
-- Auto increment value for xt_sales_order
-- ----------------------------
ALTER TABLE `xt_sales_order` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for xt_sales_order_info
-- ----------------------------
ALTER TABLE `xt_sales_order_info` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for xt_storehouse
-- ----------------------------
ALTER TABLE `xt_storehouse` AUTO_INCREMENT=4;

-- ----------------------------
-- Auto increment value for xt_supplier_product
-- ----------------------------
ALTER TABLE `xt_supplier_product` AUTO_INCREMENT=6;

-- ----------------------------
-- Auto increment value for xt_user
-- ----------------------------
ALTER TABLE `xt_user` AUTO_INCREMENT=7;

-- ----------------------------
-- Auto increment value for xt_user_role
-- ----------------------------
ALTER TABLE `xt_user_role` AUTO_INCREMENT=7;
