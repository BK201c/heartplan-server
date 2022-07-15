CREATE TABLE `inspection`  (
  `inspection_id` bigint NOT NULL,
  `name` varchar(255) NOT NULL COMMENT '检查事项名称',
  `remark` varchar(255) NULL COMMENT '注意事项',
  `location` varchar(255) NULL COMMENT '检查地点',
  `manager` varchar(255) NULL COMMENT '负责人',
  `contact` int NULL COMMENT '联系方式',
  PRIMARY KEY (`inspection_id`)
) COMMENT = '检查项目';

CREATE TABLE `inspection_schedule`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `inspection_id` bigint NOT NULL COMMENT '检查事项ID',
  `open_date` date NOT NULL COMMENT '当前时间',
  `stock_num` int NOT NULL COMMENT '剩余可预约量',
  `start_time` varchar(32) NOT NULL COMMENT '开始时间',
  `end_time` varchar(32) NOT NULL COMMENT '结束时间',
  PRIMARY KEY (`id`)
);

CREATE TABLE `role`  (
  `rid` int NOT NULL,
  `name` varchar(255) NOT NULL COMMENT '角色名称',
  PRIMARY KEY (`rid`)
);

CREATE TABLE `user`  (
  `uid` bigint NOT NULL,
  `wechat_openid` int NULL,
  `username` varchar(255) NOT NULL COMMENT '用户名',
  `name` varchar(255) NOT NULL,
  `phone` int NOT NULL,
  `sex` varchar(255) NULL,
  `age` int NULL,
  `createdAt` datetime NOT NULL,
  `password` varchar(255) NULL,
  `updatedAt` datetime NULL,
  PRIMARY KEY (`uid`)
);

CREATE TABLE `user_inspection`  (
  `uid` bigint NOT NULL COMMENT '体检人员用户id',
  `inspection_id` bigint NOT NULL COMMENT '检查项目id',
  `checked_time` date NOT NULL COMMENT '检查时间',
  `createdAt` date NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`uid`)
) COMMENT = '用户体检表';

CREATE TABLE `user_role`  (
  `id` int NOT NULL,
  `uid` bigint NOT NULL COMMENT '用户id',
  `rid` int NOT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
);

CREATE TABLE `user_token`  (
  `uid` bigint NOT NULL,
  `access_token` varchar(255) NULL,
  `expired_time` datetime NULL,
  `update_time` datetime NULL,
  `created_time` datetime NULL,
  PRIMARY KEY (`uid`),
  UNIQUE INDEX `uq_token`(`access_token`)
);

