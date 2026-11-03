USE college;

CREATE TABLE department (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(100) NOT NULL UNIQUE
);

INSERT INTO department (department_id, department_name)
VALUES
(1, 'CSE'),
(2, 'IT'),
(3, 'ECE'),
(4, 'EEE');

ALTER TABLE employee
ADD department_id INT,
ADD CONSTRAINT fk_employee_department
FOREIGN KEY (department_id)
REFERENCES department(department_id);

UPDATE employee
SET department_id = 1
WHERE employee_id = 101;

UPDATE employee
SET department_id = 2
WHERE employee_id = 102;

SELECT * FROM department;
SELECT * FROM employee;