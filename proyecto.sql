CREATE DATABASE Proyecto_Web;
USE Proyecto_Web;

CREATE TABLE Roles (
  id INT PRIMARY KEY,
  descripcion VARCHAR(50) NOT NULL
);

INSERT INTO Roles (id, descripcion)
VALUES (1, 'admin'), (2, 'cliente');


CREATE TABLE Persona (
  id int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(45) NOT NULL,
  apellido1 varchar(45) NOT NULL,
  apellido2 varchar(45) NOT NULL,
  telefono int(9) NOT NULL,
  email varchar(75) DEFAULT NULL,
  rol_id INT(11) NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_rol FOREIGN KEY (rol_id) REFERENCES Roles(id)
)ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

INSERT INTO Persona VALUES (1,'Diana','Cascante','Gonzalez',74582356,'diana@gmail.com', 2);
INSERT INTO Persona VALUES (2,'Andres','Leon','Jimenez',85057877,'andres@gmail.com', 1);

CREATE TABLE Donaciones (
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    cantidad DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (apellido)
);

INSERT INTO Donaciones VALUES ('María','Gómez', 100.50);

CREATE TABLE Mascotas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    edad INT NOT NULL,
    sexo VARCHAR(10) NOT NULL,
    raza VARCHAR(50) NOT NULL
);

INSERT INTO Mascotas (nombre, tipo, edad, sexo, raza) VALUES ('Fido', 'Perro', 5, 'Macho', 'Golden Retriever');

-- Corrección: Agregar la sentencia CREATE TABLE para la tabla "adopciones" antes del INSERT INTO.

-- Corrección: Cambiar el nombre de la tabla a "mascotas_en_adopcion" y corregir la sintaxis del INSERT INTO.

CREATE TABLE adopciones (
    id INT AUTO_INCREMENT PRIMARY KEY,
    mascota_id INT NOT NULL,
    adoptante VARCHAR(50) NOT NULL,
   constraint fk_mascota_id FOREIGN KEY (mascota_id) REFERENCES mascotas(id)
);

INSERT INTO adopciones (id,mascota_id, adoptante) VALUES (1,1, 'Juan Pérez');

CREATE TABLE mascotas_en_adopcion (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    edad INT NOT NULL,
    sexo VARCHAR(10) NOT NULL,
    raza VARCHAR(50) NOT NULL
) ;

CREATE TABLE productos (
  id INT NOT NULL AUTO_INCREMENT,
  marca VARCHAR(80) NOT NULL,
  descripcion VARCHAR(45) NOT NULL,
  precio DECIMAL(10, 2) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE reserva (
  id BIGINT NOT NULL AUTO_INCREMENT,
  apellido1 VARCHAR(255),
  apellido2 VARCHAR(255),
  cedula BIGINT NOT NULL,
  email VARCHAR(255),
  nombre VARCHAR(255),
  telefono VARCHAR(255),
  PRIMARY KEY (id)
);
