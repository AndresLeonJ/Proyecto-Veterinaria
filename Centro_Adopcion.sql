CREATE DATABASE Proyecto_Web;
USE Proyecto_Web;

CREATE TABLE Cliente (
  id int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(45) NOT NULL,
  apellido1 varchar(45) NOT NULL,
  apellido2 varchar(45) NOT NULL,
  telefono varchar(9) NOT NULL,
  email varchar(75) DEFAULT NULL,
  PRIMARY KEY (id)
);

INSERT INTO Cliente VALUES (1,'Diana','Cascante','Gonzalez','7458-2356','diana@gmail.com');

CREATE TABLE Empleados (
  id_empleado int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(45) NOT NULL,
  apellido1 varchar(45) NOT NULL,
  apellido2 varchar(45) NOT NULL,
  telefono varchar(9) NOT NULL,
  email varchar(75) DEFAULT NULL,
  PRIMARY KEY (id_empleado),
  KEY fk_empleados_nombre_idx (nombre)
);

INSERT INTO Empleados VALUES (1,'Andres','Leon','Jimenez','85057877','andrescrcs04@gmail.com');

CREATE TABLE Donaciones (
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    cantidad DECIMAL(10,2) NOT NULL,
    fecha_de_donacion DATE NOT NULL,
    PRIMARY KEY (apellido)
);

INSERT INTO Donaciones VALUES ('María','Gómez', 100.50, '2022-02-15');

CREATE TABLE Mascotas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    edad INT NOT NULL,
    sexo VARCHAR(10) NOT NULL,
    raza VARCHAR(50) NOT NULL,
    fecha_de_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO Mascotas (nombre, tipo, edad, sexo, raza) VALUES ('Fido', 'Perro', 5, 'Macho', 'Golden Retriever');

-- Corrección: Agregar la sentencia CREATE TABLE para la tabla "adopciones" antes del INSERT INTO.

-- Corrección: Cambiar el nombre de la tabla a "mascotas_en_adopcion" y corregir la sintaxis del INSERT INTO.

CREATE TABLE adopciones (
    id INT AUTO_INCREMENT PRIMARY KEY,
    mascota_id INT NOT NULL,
    adoptante VARCHAR(50) NOT NULL,
    fecha_de_adopcion DATE NOT NULL,
    FOREIGN KEY (mascota_id) REFERENCES mascotas(id)
);

INSERT INTO adopciones (id,mascota_id, adoptante, fecha_de_adopcion) VALUES (1,1, 'Juan Pérez', '2022-01-01');



CREATE TABLE darenadopcion (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    edad INT NOT NULL,
    sexo VARCHAR(10) NOT NULL,
    raza VARCHAR(50) NOT NULL,
    fecha_de_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE reservar_cita (
  id int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(45) NOT NULL,
  apellido1 varchar(45) NOT NULL,
  apellido2 varchar(45) NOT NULL,
  cedula varchar(11) NOT NULL,
  email varchar(75) DEFAULT NULL,
  telefono varchar(9) NOT NULL,
  fecha varchar(10) NOT NULL,
  PRIMARY KEY (id)
) ;

INSERT INTO reservar_cita VALUES (1,'Jimena','Azofeifa','Porras','1-3278-4398','azofeifa@gmail.com','2378-2190', '12/04/2023');

 CREATE TABLE productos (
  id int(11) NOT NULL AUTO_INCREMENT,
  marca varchar(80) NOT NULL,
  descripcion varchar(45) NOT NULL,
  precio int(45) NOT NULL,
  PRIMARY KEY (id)
) ;