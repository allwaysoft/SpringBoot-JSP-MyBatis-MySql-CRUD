# SpringBoot-JSP-MyBatis-MySql-CRUD

create table post
 
(
 
    id int not null primary key auto_increment,
 
    title varchar(500)  null,
 
    content varchar(500)  null,
 
    userId int null,
 
    createDate Timestamp null
 
)
