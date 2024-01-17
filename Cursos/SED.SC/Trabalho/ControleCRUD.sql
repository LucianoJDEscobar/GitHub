create database crud;

create table clientes(
ID_cliente int not null auto_increment primary key,
nome varchar(40),
cpf int,
endereco varchar(100),
email varchar(100),
idade int);

describe clientes;
UPDATE CLIENTES  SET NOME = "JOAO CARLOS AUGUSTO", IDADE = 25 WHERE ID_cliente = 2;
select * from clientes;

create table motocicletas(
ID_moto int not null auto_increment primary key,
marca varchar(20),
modelo varchar(20), 
cor varchar(20),
cilindrada int,
ano int,
preco double);

describe motocicletas;

select * from motocicletas;

create table vendas(
codVenda int not null auto_increment primary key,
preco double,
dataVenda date,
obs varchar(200),
ID_cliente int,
ID_moto int,
constraint fk_cliVenda foreign key(ID_cliente) references clientes (ID_cliente),
constraint fk_motoVenda foreign key (ID_moto) references motocicletas (ID_moto));

describe vendas;

select * from vendas;

create table login(
usuario varchar(20),
senha int);

alter table login add column acesso varchar(20) not null;

describe login;
insert into login (usuario, senha, acesso) values ("admin", 123, "admin");
select * from login;

update login set acesso='vendedor' where ID_usuario = 1;

alter table login add column ID_usuario int not null auto_increment primary key;

