
CREATE SCHEMA `bancotech` DEFAULT CHARACTER SET utf8mb4 ;

use bancotech;

CREATE TABLE vaga(
id int not null auto_increment,
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

CREATE TABLE candidato(
idcandidato int not null auto_increment,
nascimento     varchar (20),
nacionalidade  varchar(20),
sexo   varchar (15) ,
raca   varchar(15),
linkedin   varchar(50),
telefone  varchar (15),
celular varchar (15) unique,
cep varchar (10),
logadouro varchar (10),
endereco varchar (50),
numero varchar(30),
cidade varchar (50),
complemento  varchar (30),
idusuario int,
foreign key(idusuario) references usuario(id),
primary key (idcandidato)
);


CREATE TABLE formacao(
idformacao int not null auto_increment,
tipo    varchar (20),
nomeformacao     varchar (50),
instituicao  varchar(50),
inicio   varchar (15) ,
termino   varchar(15),
situacao   varchar(15), 
idcandidato int,
foreign key(idcandidato) references candidato(idcandidato),
primary key (idformacao)
);


CREATE TABLE curso(
idcurso int not null auto_increment,
nomecurso varchar (20),
instituicao  varchar(50),
conclusao   varchar (15),
nivel   varchar(15),
idioma   varchar(30),
idcandidato int,
foreign key(idcandidato) references candidato(idcandidato),
primary key (idcurso)
);


CREATE TABLE experiencia(
idexperiencia int not null auto_increment,
empresa    varchar (20),
cargo     varchar (50),
segmento  varchar(50),
inicio   varchar (15),
termino   varchar(15),
atual   varchar(15),  
descricao   varchar(500),
idcandidato int,
foreign key(idcandidato) references candidato(idcandidato),  
primary key (idexperiencia)
);

CREATE TABLE aplicado(
idaplicado int not null auto_increment,
dia timestamp default current_timestamp,
idcandidato int,
idvaga int,
titulovaga varchar(50),
foreign key(idcandidato) references candidato(idcandidato),
foreign key(idvaga) references vaga(id),
primary key (idaplicado));


select * from aplicado;

CREATE USER 'pro4tech'@'localhost' identified BY '12345';

GRANT select, insert, update, delete ON bancotech.vaga to 'pro4tech'@'localhost';

GRANT select, insert, update, delete ON bancotech.usuario to 'pro4tech'@'localhost';

GRANT select, insert, update, delete ON bancotech.candidato to 'pro4tech'@'localhost';

GRANT select, insert, update, delete ON bancotech.formacao to 'pro4tech'@'localhost';

GRANT select, insert, update, delete ON bancotech.experiencia to 'pro4tech'@'localhost';

GRANT select, insert, update, delete ON bancotech.curso to 'pro4tech'@'localhost';

GRANT select, insert, update, delete ON bancotech.aplicado to 'pro4tech'@'localhost';

insert into usuario (nome, cpf, email, senha, acesso, ativo) values ('rhpro4tec','111.111.111-11', 'rh@pro4tech.com', '8d79c3c06582cede889341b2afcae2fe', 'Rh', 'SIM');
insert into usuario (nome, cpf, email, senha, acesso, ativo) values ('adm', '000.000.000-00','adm@pro4tech.com', '80177534a0c99a7e3645b52f2027a48b', 'Admin','SIM' );