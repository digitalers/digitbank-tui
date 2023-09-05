USE digitBank;

CREATE DATABASE IF NOT EXISTS digitBank;

CREATE TABLE IF NOT EXISTS cliente (
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre varchar(72) NOT NULL,
    calle varchar(56) NOT NULL,
    altura varchar(56) NOT NULL,
    cuit varchar(14) NOT NULL,
    apellido varchar(56) NOT NULL,
    email varchar(56) NOT NULL,
    dni varchar(56) NOT NULL,
    codigopostal tinyint(5) NOT NULL,
    ciudad varchar(72) NOT NULL,
    provincia varchar(100) NOT NULL,
    pais varchar(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS cuenta (
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    moneda int NOT NULL,
    fechavencimiento varchar(128) NOT NULL,
    saldo int NOT NULL,
    fechaapertura datetime DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS cliente_cuenta (
	cuenta_id int NOT NULL,
    cliente_id int NOT NULL,
    
    CONSTRAINT FOREIGN KEY(cuenta_id) REFERENCES cuenta(id),
    CONSTRAINT FOREIGN KEY(cliente_id) REFERENCES cliente(id)
);