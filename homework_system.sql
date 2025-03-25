-- Active: 1736786939860@@127.0.0.1@3306@homework_system
CREATE TABLE User (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    account VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    department VARCHAR(255),
    class_num VARCHAR(255),
    icon VARCHAR(255),
    intro TEXT
);

CREATE TABLE homework (
    work_id VARCHAR(255) PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    manager VARCHAR(255),
    grade INT,
);    