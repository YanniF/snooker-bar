DROP USER snooker CASCADE;

CREATE USER snooker IDENTIFIED BY snooker ACCOUNT UNLOCK;
GRANT DBA TO snooker;

CONNECT snooker/snooker;

CREATE TABLE  "COMANDA" 
   (    "cd_comanda" NUMBER(10,0) NOT NULL ENABLE, 
    "ic_ativa_inativa" CHAR(1) NOT NULL ENABLE, 
     CONSTRAINT "comanda_PK" PRIMARY KEY ("cd_comanda") ENABLE
   ) ;

CREATE TABLE  "PRODUTO" 
   (    "CD_PRODUTO" NUMBER(10,0) NOT NULL ENABLE, 
    "NM_PRODUTO" VARCHAR2(30) NOT NULL ENABLE, 
    "VL_PRODUTO" NUMBER(10,2) NOT NULL ENABLE, 
     CONSTRAINT "PRODUTO_PK" PRIMARY KEY ("CD_PRODUTO") ENABLE
   ) ;

CREATE TABLE  "ATENDIMENTO" 
   (    "CD_ATENDIMENTO" NUMBER(10,0) NOT NULL ENABLE, 
    "QT_PRODUTO" NUMBER(10,0), 
    "QT_HORA_SERVICO" NUMBER(10,0), 
    "VL_TOTAL_ATENDIMENTO" NUMBER(10,2), 
    "NM_PRODUTO" VARCHAR2(30) NOT NULL ENABLE,  
    "CD_SERVICO" NUMBER(10,0), 
    "CD_ABERTURA_COMANDA" NUMBER(10,0) NOT NULL ENABLE, 
     CONSTRAINT "ATENDIMENTO_PK" PRIMARY KEY ("CD_ATENDIMENTO") ENABLE
   ) ;

CREATE TABLE  "ABERTURA_COMANDA" 
   (    "cd_abertura_comanda" NUMBER(10,0) NOT NULL ENABLE, 
    "dt_hora_abertura" DATE, 
    "dt_hora_fechar" DATE, 
    "cd_comanda" NUMBER(10,0) NOT NULL ENABLE, 
     CONSTRAINT "abertura_comanda_PK" PRIMARY KEY ("cd_abertura_comanda") ENABLE
   ) ;

CREATE TABLE  "MESA" 
   (    "CD_MESA" NUMBER(10,0) NOT NULL ENABLE, 
    "NM_MESA" VARCHAR2(20) NOT NULL ENABLE, 
    "IC_ATIVA_SIM_NAO" CHAR(1) NOT NULL ENABLE, 
     CONSTRAINT "MESA_PK" PRIMARY KEY ("CD_MESA") ENABLE
   ) ; 

CREATE TABLE  "ABERTURA_MESA" 
   (    "cd_abertura_mesa" NUMBER(10,0) NOT NULL ENABLE, 
    "dt_hora_abertura" DATE, 
    "dt_hora_fechar" DATE, 
    "cd_comanda" NUMBER(10,0) NOT NULL ENABLE,
    "cd_mesa" NUMBER(10,0),
     CONSTRAINT "abertura_mesa_PK" PRIMARY KEY ("cd_abertura_mesa") ENABLE
   ) ;

CREATE TABLE  "USUARIO" 
   (    "CD_USUARIO" NUMBER(10,0) NOT NULL ENABLE, 
    "NM_LOGIN_USUARIO" VARCHAR2(20) NOT NULL ENABLE, 
    "NM_SENHA_USUARIO" VARCHAR2(32) NOT NULL ENABLE, 
    "IC_ADMINISTRADOR_SIM_NAO" CHAR(1) NOT NULL ENABLE,
     CONSTRAINT "USUARIO_PK" PRIMARY KEY ("CD_USUARIO") ENABLE
   ) ;

CREATE TABLE  "FUNCIONARIO" 
   (    "CD_FUNCIONARIO" NUMBER(10,0) NOT NULL ENABLE, 
    "NM_FUNCIONARIO" VARCHAR2(30) NOT NULL ENABLE, 
    "CD_TELEFONE_FUNCIONARIO" NUMBER(15,0) NOT NULL ENABLE, 
    "CD_CPF_FUNCIONARIO" NUMBER(11,0) NOT NULL ENABLE,
    "NM_CARGO_FUNCIONARIO" VARCHAR2(20) NOT NULL,  
    "CD_USUARIO" NUMBER(10,0) NOT NULL, 
     CONSTRAINT "FUNCIONARIO_PK" PRIMARY KEY ("CD_FUNCIONARIO") ENABLE
   ) ;

CREATE TABLE  "SERVICO" 
   (    "CD_SERVICO" NUMBER(10,0) NOT NULL ENABLE, 
    "NM_SERVICO" VARCHAR2(30) NOT NULL ENABLE, 
    "VL_SERVICO" NUMBER(10,2) NOT NULL ENABLE, 
     CONSTRAINT "SERVICO_PK" PRIMARY KEY ("CD_SERVICO") ENABLE
   ) ;


ALTER TABLE  "ABERTURA_COMANDA" ADD CONSTRAINT "ABERTURA_COMANDA_FK" FOREIGN KEY ("cd_comanda")
      REFERENCES  "COMANDA" ("cd_comanda") ENABLE;

ALTER TABLE  "ABERTURA_MESA" ADD CONSTRAINT "ABERTURA_MESA_CON" FOREIGN KEY ("cd_mesa")
      REFERENCES  "MESA" ("CD_MESA") ENABLE;

ALTER TABLE  "ABERTURA_MESA" ADD CONSTRAINT "ABERTURA_MESA_CON2" FOREIGN KEY ("cd_comanda")
      REFERENCES  "COMANDA" ("cd_comanda") ENABLE;

ALTER TABLE  "ATENDIMENTO" ADD CONSTRAINT "ATENDIMENTO_FK1" FOREIGN KEY ("CD_ABERTURA_COMANDA")
      REFERENCES  "ABERTURA_COMANDA" ("cd_abertura_comanda") ENABLE;

--ALTER TABLE  "ATENDIMENTO" ADD CONSTRAINT "ATENDIMENTO_FK2" FOREIGN KEY ("CD_PRODUTO")
--      REFERENCES  "PRODUTO" ("CD_PRODUTO") ENABLE;

ALTER TABLE  "ATENDIMENTO" ADD CONSTRAINT "ATENDIMENTO_FK3" FOREIGN KEY ("CD_SERVICO")
      REFERENCES  "SERVICO" ("CD_SERVICO") ENABLE;

ALTER TABLE  "FUNCIONARIO" ADD CONSTRAINT "FUNCIONARIO_CON" FOREIGN KEY ("CD_USUARIO")
      REFERENCES  "USUARIO" ("CD_USUARIO") ENABLE;

ALTER TABLE  "USUARIO" ADD CONSTRAINT "USUARIO_UNIQUE" UNIQUE ("NM_LOGIN_USUARIO");

ALTER TABLE  "FUNCIONARIO" ADD CONSTRAINT "FUNCIONARIO_UNIQUE" UNIQUE ("CD_USUARIO");

ALTER TABLE  "FUNCIONARIO" ADD CONSTRAINT "CPF_FUNCIONARIO_UNIQUE" UNIQUE ("CD_CPF_FUNCIONARIO");

CREATE SEQUENCE   "ABERTURA_COMANDA_SEQ"  MINVALUE 1 MAXVALUE 9999999999 INCREMENT BY 1 START WITH 1 NOORDER  NOCYCLE ; 

CREATE SEQUENCE  "ABERTURA_MESA_SEQ"  MINVALUE 1 MAXVALUE 9999999999 INCREMENT BY 1 START WITH 1 NOORDER  NOCYCLE;

CREATE SEQUENCE   "ATENDIMENTO_SEQ"  MINVALUE 1 MAXVALUE 9999999999 INCREMENT BY 1 START WITH 1 NOORDER  NOCYCLE ; 

CREATE SEQUENCE   "COMANDA_SEQ"  MINVALUE 1 MAXVALUE 9999999999 INCREMENT BY 1 START WITH 1  NOORDER  NOCYCLE ; 

CREATE SEQUENCE   "FUNCIONARIO_SEQ"  MINVALUE 1 MAXVALUE 9999999999 INCREMENT BY 1 START WITH 1 NOORDER  NOCYCLE ; 

CREATE SEQUENCE   "MESA_SEQ"  MINVALUE 1 MAXVALUE 9999999999 INCREMENT BY 1 START WITH 1 NOORDER  NOCYCLE ; 

CREATE SEQUENCE   "PRODUTO_SEQ"  MINVALUE 1 MAXVALUE 9999999999 INCREMENT BY 1 START WITH 1 NOORDER  NOCYCLE ; 

CREATE SEQUENCE   "SERVICO_SEQ"  MINVALUE 1 MAXVALUE 9999999999 INCREMENT BY 1 START WITH 1 NOORDER  NOCYCLE ; 

CREATE SEQUENCE   "USUARIO_SEQ"  MINVALUE 1 MAXVALUE 9999999999 INCREMENT BY 1 START WITH 1  NOORDER  NOCYCLE ;

INSERT INTO USUARIO VALUES (USUARIO_SEQ.NEXTVAL, 'admin', '21232f297a57a5a743894a0e4a801fc3', 'S');

COMMIT;