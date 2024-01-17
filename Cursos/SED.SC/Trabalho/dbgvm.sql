use db_gvm;

use dbamakha;

create database db_gvm;
insert into clientes (nome,idade,referencia) values ( 'kkkkk', 25,'Prof');
DELETE FROM `dbamakha`.`clientes` WHERE (`id_cliente` = '2');
create table clientes(
id_cliente int not null auto_increment primary key,
nome varchar(40),
idade int,
referencia varchar(100));

describe clientes;
select * from clientes;

create table motocicletas(
id_moto int not null auto_increment primary key,
marca varchar(20),
modelo varchar(20), 
cor varchar(20),
cilindrada int,
ano int,
preco double);

describe motocicletas;

select * from motocicletas;

create table vendas(
cod_venda int not null auto_increment primary key,
id_cliente int,
id_moto int,
dataVenda date,
obs varchar(200),
vendedor varchar(20),
desconto double,
acessorios double,
precoTotal double,
constraint fk_cliVenda foreign key(id_cliente) references clientes (id_cliente),
constraint fk_motoVenda foreign key (id_moto) references motocicletas (id_moto));

describe vendas;

select * from vendas;

describe usuarios;
SELECT * FROM usuarios WHERE login = 'ljde' and senha = '123';
select*from usuarios;

create table login(
id_usuario int not null auto_increment primary key,
nome varchar(20),
usuario varchar(10),
senha int,
acesso varchar(10));

describe login;

select * from login;