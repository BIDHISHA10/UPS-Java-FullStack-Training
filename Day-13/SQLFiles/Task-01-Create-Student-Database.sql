
CREATE DATABASE test;

USE test;

CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

INSERT INTO student VALUES (1, 'Bidhisha');

SELECT * FROM student;
