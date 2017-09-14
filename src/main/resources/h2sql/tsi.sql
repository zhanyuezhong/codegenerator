
DROP TABLE IF EXISTS `tsi`;

CREATE TABLE `tsi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tsi` int(11) DEFAULT NULL COMMENT 'atpco 的 tsi 编号',
  `definition` varchar(100) DEFAULT NULL COMMENT 'tsi 的含义',
  `appl` varchar(10) DEFAULT NULL COMMENT '作用范围',
  `tsi_point` int(11) DEFAULT NULL COMMENT 'tsi 作用点',
  `io` varchar(10) DEFAULT NULL COMMENT '去回程限制',
  `location` varchar(20) DEFAULT NULL COMMENT '位置信息',
  `flag` int(11) DEFAULT NULL COMMENT '作用范围',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
);
