
#1)
drop view ok;


create view ok(sname,age) as
select distinct student.sname,student.age from student,enrolled,class,faculty where 
 major = 'Finance' or 
 (
 student.snum = enrolled.snum 
and enrolled.cname = class.name and  class.fid = faculty.fid and fname = 'Linda Davis' 
)
;

select sname from ok where age = (select max(age) from ok );

#2)

select distinct name from class where room = '20 AVW' or 
(select count(cname) from enrolled where cname = name) >= 5;

#3 (3) Find the names of faculty members who teach in every room in which some class is taught.


select faculty.fname as facutlyName from faculty,class where faculty.fid = class.fid
 group by faculty.fid having count(faculty.fid) = (select count(distinct room) from class);

 
 #4) Find the names of faculty members who teach the maximum number of classes.
 
select faculty.fname from class,faculty where faculty.fid = class.fid
group by faculty.fid
having count(class.name) = 
(
select max(count) from 
		(
		select count(class.name) as count from faculty,class where faculty.fid = class.fid group by faculty.fid
		) as temporaryTable
)
;

#5) Find the names of faculty members who do not teach any class.

select distinct fname from faculty where fid not in (select fid from class);

#6) For each age value that appears in Students, find the level value that appears most often. For example, if there
#  are more FR level students aged 18 than SR, JR, or SO students aged 18, you should print the pair (18, FR).

#7)
select room,count(distinct class.name) as numCourses from class group by room;


#8) Find the courses conducted in room R128 for which at least one student has enrolled.

select * from enrolled;
select * from class;
select * from student;

select distinct  class.name from class where class.room = 'R128' 
and
class.name in (select distinct enrolled.cname from enrolled ) ;

#9) Find the times at which classes occur for those courses for which at least one student has enrolled.

select class.name,class.meets_at from class 
where class.name in (select distinct enrolled.cname from enrolled ) ;


 #10) Find the students of standing JR who have enrolled in some course which is conducted in room R128.
 
 select * from student ;
 select * from enrolled;
 select * from class;
 
 select student.sname from student,enrolled,class where 
 student.standing = 'JR'
 and
 student.snum = enrolled.snum 
 and
 enrolled.cname = class.name 
 and 
 room = 'R128';
 
 






 







