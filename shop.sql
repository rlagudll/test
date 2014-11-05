create table items
(
	item_id		int 	primary key,
	item_name	varchar2(20),
	price		int,
	description	varchar2(100),
	pictureUrl	varchar2(100)
)

create table users
(
	user_id		varchar2(10)	primary key,
	user_pwd	varchar2(10)	not null,
	user_name	varchar2(10)	not null
)

create table order_list
(
	order_num		int				primary key,
	user_id			varchar2(10),
	order_date		date			default sysdate,
	foreign key(user_id) references users(user_id)
)

create table order_detail
(
	order_num		int,
	item_id			int,
	count			int,
	primary key(order_num, item_id),
	foreign key(order_num) references order_list(order_num),
	foreign key(item_id) references items(item_id)
)

drop table items
drop table users
drop table order_list
drop table order_detail

select * from items

create sequence item_seq
create sequence order_seq

insert into users values('1111', '1111', '1111');



