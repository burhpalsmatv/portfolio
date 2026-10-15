drop database if exists portfolio;
create database portfolio;
use portfolio;

create table vinyls
(
id int unsigned auto_increment primary key,
albumName varchar(250) not null,
artistName varchar(250) not null,
releaseYear int not null,
story varchar(1000) not null
img varchar(300) not null
);