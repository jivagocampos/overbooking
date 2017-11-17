create database overbooking;
use overbooking;
create table passageiro(
id smallint(6) not null auto_increment, 
cpf varchar (11) default null,
nome varchar(50) default null,
poltrona int (5) default null, 
primary key(id));