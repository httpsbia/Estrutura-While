CREATE DATABASE exercicio02;
USE exercicio02;

CREATE TABLE ESTADOS(
 ID_estados char(2) Primary Key Identity,
 Nome varchar(120) Not Null);

CREATE TABLE CIDADES(
 ID_cidades smallint Primary Key Identity,
 Nome varchar(120) Not Null);

CREATE TABLE BAIRRO(
 ID_bairro int Primary Key Identity,
 Nome varchar(120) Not Null,
 ID_cidade Smallint Not Null
  Foreign Key REFERENCES CIDADES(ID_cidades);
  
CREATE TABLE LOGRADOUROS(
 ID_TIPO_LOGRADOUROS Smallint Primary Key Identity,
 Nome varchar(100);

CREATE TABLE LOGRADOURO(
 ID_Logradouro int Primary Key Identity,
 CEP int Not Null,
 ID_TIPO_LOGRADOURO Smallint Not Null,
  Foreign Key REFERENCES LOUGRADOUROS(ID_TIPO_LOGRADOURO),
 ID_bairro int Not Null,
  Foreign Key REFERENCES BAIRRO(ID_bairro),
