create database blog;
use blog;

create table users(
id int primary key auto_increment,
nam varchar(30),
age int);

insert into users (nam, age) values ('Szabó Zsófia', 30);
insert into users (nam, age) values ('Sanyi', 32);
insert into users (nam, age) values ('Béla', 33);

create table posts(
id int primary key auto_increment,
title varchar(100),
content text,
author_id int
);

insert into posts (title, content, author_id) values ('New blogpost', 'Nice new blogpost', 1);
insert into posts (title, content, author_id) values ('Newer blogpost', 'Nicer new blogpost', 1);
insert into posts (title, content, author_id) values ('Newest blogpost', 'Nicest new blogpost', 2);

/*select * from posts */
/*join users on posts.author_id = users.id; */

select nam, count(posts.id) from users
left join posts on posts.author_id = users.id
group by users.nam
order by users.nam;

