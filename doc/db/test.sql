drop table if exists `users`;
create table `t_user` (
     `id` varchar(255) not null default '' comment 'id',
     `username` varchar(255) comment '用户账号',
     `password` varchar(255) comment '用户密码',
     primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='用户表';

insert into `t_user` (`id`, `username`, `password`) values ('1', 'admin', 'admin');
insert into `t_user` (`id`, `username`, `password`) values ('2', 'user1', 'user1');
