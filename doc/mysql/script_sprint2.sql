CREATE SCHEMA `bancotech` DEFAULT CHARACTER SET utf8mb4 ;
USE bancotech;
CREATE TABLE vaga(
id int NOT NULL auto_increment,
titulo    varchar (50) not null,
cargo     varchar(50),
formacao  varchar(40),
periodo   varchar (20),
regime    varchar(15),
descricao varchar (500),
salario   varchar(10),
ativo     varchar(5),
primary key (id)
);

CREATE TABLE usuario(
id int not null auto_increment,
nome    varchar (70) not null,
cpf     varchar (20) unique not null,
email  varchar(100) unique not null,
senha   varchar (260) not null,
acesso   varchar(15),
ativo   varchar(5),  
primary key (id)
);

select * from usuario;

CREATE USER 'pro4tech'@'localhost' identified BY '12345';

GRANT select, insert, update, delete ON bancotech.vaga to 'pro4tech'@'localhost';

GRANT select, insert, update, delete ON bancotech.usuario to 'pro4tech'@'localhost';

insert into usuario (nome, cpf, email, senha, acesso, ativo) values ('rhpro4tec','111.111.111-11', 'rh@pro4tech.com', '8d79c3c06582cede889341b2afcae2fe', 'Rh', 'Sim');
insert into usuario (nome, cpf, email, senha, acesso, ativo) values ('adm', '000.000.000-00','adm@pro4tech.com', '80177534a0c99a7e3645b52f2027a48b', 'Admin','Sim' );