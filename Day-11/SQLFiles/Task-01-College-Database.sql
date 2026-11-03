CREATE DATABASE college;

USE college;

CREATE TABLE students (
    student_id INT,
    student_name VARCHAR(50) NOT NULL,
    age INT,
    dept VARCHAR(50),
    email VARCHAR(50) NOT NULL
);

SELECT * FROM students;