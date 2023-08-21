CREATE DATABASE RNML21;

USE RNML21;

CREATE TABLE Libros (
    id INT  PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(255) NOT NULL,
    anio_publicacion INT NOT NULL,
    usuario_id INT,
);