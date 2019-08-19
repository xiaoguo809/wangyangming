-- ----------------------------
-- Table 图标信息表
-- ----------------------------
DROP TABLE IF EXISTS `icon_data`;
CREATE TABLE `icon_data`
(
    `id`           bigint       not null auto_increment primary key,
    `name`         varchar(255) not null comment '图标的名称',
    `icon_type`    int          not null comment '图标类型',
    `size`      int(11)     default '0' comment '文件的大小单位B',
    `icon_file_type`    int          not null comment '图标文件的类型',
    `icon_file_id` bigint       not null comment '图标文件的id'
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='图标信息表';

-- ----------------------------
-- Table 图标文件表
-- ----------------------------
drop table if exists `icon_file_data`;
create table `icon_file_data`
(
    `id`        bigint(20) not null auto_increment,
    `name`      varchar(100) comment '图标文件的名称',
    `file_info` BLOB(1048576) comment '二进制文件信息最大1M',
    primary key (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='图标文件信息表';

# 添加外键约束
ALTER TABLE `icon_data` add CONSTRAINT `fk_icon_file_id` FOREIGN KEY(`icon_file_id`)
    REFERENCES `icon_file_data`(`id`) on  delete CASCADE;


