create database wuliu;
use wuliu;
-- 01  消费者
create table dis_consumer( 
	c_id nvarchar(10) primary key not null,
	c_name nvarchar(10),
	c_sex int default 1, -- 1为男
	u_number nvarchar(10),-- 用户组id外键
	c_pwd nvarchar(10), -- 密码
	c_phone nvarchar(20),-- 联系电话
	c_brithday datetime, -- 出生日期
	c_address nvarchar(50), -- 地址
	c_remarks nvarchar(50), -- 备注
	 foreign key(u_number) references dis_usergroup(u_number)
)

insert into dis_consumer values
	('1','肖柏',1,0001,'221342','13616782895','1998-08-04','广东珠海斗门','');
 
	

-- 02  订单
create table dis_orders(
	o_id nvarchar(10) primary key not null, -- 订单Id
	o_style nvarchar(10), -- 订单类型
	o_handovernumber nvarchar(10), -- 交接单编号
	o_goodsname nvarchar(20), -- 货物名称
	o_goodsweight int, -- 货物重量
	o_mailer nvarchar(20), -- 邮寄人
	o_maileraddress nvarchar(50), -- 邮寄地址
	o_collectaddress nvarchar(50), -- 收货地址
	o_dis_ordersstate int, -- 订单状态
	o_mailerphone nvarchar(20), -- 邮寄人电话
	o_collecter nvarchar(20), -- 收货人
	o_collectphont nvarchar(20), -- 收货人电话
	o_startdis_city nvarchar(10), -- 起始城市
	o_midpointdis_city nvarchar(10), -- 中点城市
	o_enddis_city nvarchar(10),-- 终点城市
	o_shippingprice decimal(18,0),-- 运送价格
	o_Distribution decimal(18,0), -- 配送价格
	o_transport decimal(18,0), -- 运输价格
	o_price nvarchar(10), -- 总价格
	o_dis_vehicle nvarchar(10), -- 车辆
	o_remarks nvarchar(50) -- 备注
) ;
insert into dis_orders  values
('1','服饰','0012345','黑色上衣',250,'咿呀服饰','广东广州','广东珠海',0,'13936478239','程一','176520098761','广州','中山','珠海','5','4','5','14','货车','');



-- 03 车辆
create table dis_vehicle(
	v_id nvarchar(10) primary key not null, -- 车辆编号
	v_productionaddress nvarchar(20),-- 车辆型号
	v_model nvarchar(10), -- 产地
	v_dis_routenuber nvarchar(10), -- 路线编号
	v_productionday datetime, -- 生产日期
	v_purchaseday datetime, -- 购买日期
	v_remarks nvarchar(50)  -- 备注
);
insert into dis_vehicle values
('1','载货汽车','中国','001','1997-08-07','2003-04-02','');
  
  
-- 04 城市
create table dis_city(
	dis_city_id nvarchar(10) primary key not null, -- 城市id
	dis_city_name nvarchar(10),-- 城市名称
	p_id nvarchar(10), -- 省份id
	foreign key(p_id) references dis_province(p_id)
)
insert into dis_city values('1','珠海','1');

-- 05 城市区域
create table dis_cityregion(
	cg_id nvarchar(10) primary key not null,
	cg_name nvarchar(50),
	dis_city_id nvarchar(50),
	foreign key(dis_city_id) references dis_city(dis_city_id)
)

insert into dis_cityregion values('1','增城区','1');

-- 06 管理员
create table dis_administrators(
	a_id nvarchar(10) primary key not null, -- 管理员编号
	a_name nvarchar(10), -- 姓名
	a_sex int default 1, -- 性别
	u_number nvarchar(10), -- 用户组编号
	a_state int default 0, -- 状态
	a_thedis_city nvarchar(10), -- 所在城市
	a_adress nvarchar(10), -- 地址
	a_pwd nvarchar(10), -- 密码
	a_phone nvarchar(20), -- 联系电话
	a_remarks nvarchar(50),  -- 备注
	foreign key(u_number) references dis_usergroup(u_number)
)
insert into dis_administrators values('1','嘉怡',1,'1',0,'广州','番禺','223456','16745095429','');
 
 
-- 07 交接单
create table dis_handovers(
	h_startdis_city nvarchar(10) primary key not null, -- 起始城市
	h_enddis_city nvarchar(10),-- 终点城市
	h_arrive nvarchar(10), -- 已到城市
	h_state int , -- 状态
	h_generate datetime, -- 生成时间
	h_remarks nvarchar(50) -- 备注
)
insert into dis_handovers values('广州','珠海','中山',0,'2018-10-21','')

-- 08 路线
create table dis_route(
	r_id nvarchar(10) primary key not null, -- 路线编号
	r_name nvarchar(10), -- 路线名称
	p_startid nvarchar(10), -- 起始省份编号
	dis_city_startid nvarchar(10), -- 起始城市编号
	p_midpointid nvarchar(10), -- 中点省份编号
	dis_city_midpointid nvarchar(10), -- 中点城市编号
	p_endid nvarchar(10),  -- 终点省份编号
	dis_city_endid nvarchar(10), -- 终点城市编号
	r_price decimal(18,0), -- 运输价格
	r_remarks nvarchar(10), -- 备注
	foreign key(p_startid) references dis_province(p_id),
	foreign key (dis_city_startid) references dis_city(dis_city_id),
	foreign key(p_midpointid) references dis_province(p_id),
	foreign key(dis_city_midpointid) references dis_city(dis_city_id),
	foreign key(p_endid) references dis_province(p_id),
	foreign key(dis_city_endid) references dis_city(dis_city_id)
)
 


-- 09 配送点
create table dis_tributionpoint(
	d_id int primary key not null, -- 配送点id
	d_name nvarchar(10), -- 配送点名称
	p_id nvarchar(10), -- 省份id
	dis_city_id nvarchar(10), -- 城市id
	a_id nvarchar(10), -- 管理员id
	d_phone nvarchar(20),-- 联系电话
	d_prices nvarchar(50), -- 地址
	d_remarks nvarchar(50), -- 备注
	foreign key(p_id) references dis_province(p_id),	
	foreign key(dis_city_id) references dis_city(dis_city_id),
	foreign key(a_id) references dis_administrators(a_id)
)


-- 10 配送范围
create table dis_tributionscope(
	 ds_id int primary key not null, -- 配送区域id
	 ds_name nvarchar(10), -- 配送区域名称
	 ds_prices decimal(18,0), -- 配送价格
	 dis_city_id nvarchar(10), -- 所属城市id
	 foreign key(dis_city_id) references dis_city(dis_city_id),
	 ds_remarks nvarchar(50) -- 备注
)



-- 11 省份
create table dis_province(
	p_id nvarchar(10) primary key not null, -- 身份ID
	p_name nvarchar(10) -- 名称
)
insert into dis_province values('1','广东');
-- 12  用户组
create table dis_usergroup(
	u_number nvarchar(10) primary key not null,-- 用户组编号
	u_name nvarchar(10) not null, -- 用户组名称
	u_remarks nvarchar(50) -- 备注
)
insert into dis_usergroup values('1','1','')

show tables;

