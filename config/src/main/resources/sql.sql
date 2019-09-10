create table Members(
id varchar(32) not null,
name varchar(50),
age int,
job varchar(50),
hobbies varchar(50),
primary key(id)
);

create table UserInfo(
name varchar(50),
email varchar(50),
pwd varchar(50),
primary key(name)
);