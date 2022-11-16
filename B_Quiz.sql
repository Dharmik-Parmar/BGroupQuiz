use  b_quiz;

create table quizresult(
student_id int primary key,
student_name varchar(255),
student_marks int,
student_grade varchar(5) );

select * from quizresult;
alter table quizresult drop student_marks;
alter table quizresult drop student_grade;
alter table quizresult add student_marks int;
alter table quizresult add student_grade varchar(10);
delete from  quizresult where id = 1;
