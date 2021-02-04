
create table student (
	snum integer(9),
	sname varchar(30),
	major varchar(25),
	standing varchar(2),
	age integer(3),
	PRIMARY KEY(snum)
);
create table faculty(
	fid numeric(9,0) primary key,
	fname varchar(30),
	deptid numeric(2,0)
	);
create table class(
	name varchar(40) primary key,
	meets_at varchar(20),
	room varchar(10),
	fid numeric(9,0),
	foreign key(fid) references faculty(fid)
	);
create table enrolled(
	snum integer(9),
	cname varchar(40),
	primary key(snum,cname),
	foreign key(snum) references student(snum),
	foreign key(cname) references class(name)
	);
