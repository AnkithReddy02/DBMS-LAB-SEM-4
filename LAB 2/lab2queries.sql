    
 #1)
 select sname as name,age from student;
 #2)
 select snum,sname,major,standing,age from student where age > 18;
 #3)
 select student.snum from student,enrolled where student.snum = enrolled.snum and enrolled.cname = 'Operating System Design';
 #4)
 select sname as name from student,enrolled where student.snum = enrolled.snum and enrolled.cname = 'Database Systems';
 #5)
  select fname from faculty where deptid=20 or deptid=68;
