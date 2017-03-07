-- 创建老师班级表 - 实现表关联
 create table teacher(t_id int primary key auto_increment,t_name varchar(20) );
 create table   class(c_id int primary key auto_increment,c_name varchar(20),teacher_id int);
 alter table class add constraint fk_teacher_id foreign key(teacher_id) references teacher(t_id);
 insert into teacher(t_name) values('teacher1');
 insert into teacher(t_name) values('teacher2');
 insert into class(c_name,teacher_id) values('class_a',1);
 insert into class(c_name,teacher_id) values('class_b',2);


 
 
--一对多的相关查询
 create table student(s_id int primary key auto_increment,s_name varchar(20),class_id int);
 insert into student(s_name,class_id) values('student_A',1);
 insert into student(s_name,class_id) values('student_B',1);
  insert into student(s_name,class_id) values('student_C',1);
 insert into student(s_name,class_id) values('student_D',2);
  insert into student(s_name,class_id) values('student_E',2);
 insert into student(s_name,class_id) values('student_F',2);
 
 
 
 
 
 
 
 
 