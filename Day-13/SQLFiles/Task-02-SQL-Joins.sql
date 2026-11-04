
USE test;

CREATE TABLE department (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

CREATE TABLE employee (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(100),
    department_id INT
);

INSERT INTO department VALUES
(101, 'HR'),
(102, 'IT'),
(104, 'Finance');

INSERT INTO employee VALUES
(1, 'Bidhisha', 101),
(2, 'Rahul', 102),
(3, 'Kavin', 103),
(4, 'Divya', NULL);

-- 1. INNER JOIN
SELECT employee.employee_name, department.department_name
FROM employee
INNER JOIN department
ON employee.department_id = department.department_id;

-- 2. LEFT JOIN
SELECT employee.employee_name, department.department_name
FROM employee
LEFT JOIN department
ON employee.department_id = department.department_id;

-- 3. RIGHT JOIN
SELECT employee.employee_name, department.department_name
FROM employee
RIGHT JOIN department
ON employee.department_id = department.department_id;

-- 4. FULL OUTER JOIN using UNION
SELECT employee.employee_name, department.department_name
FROM employee
LEFT JOIN department
ON employee.department_id = department.department_id

UNION

SELECT employee.employee_name, department.department_name
FROM employee
RIGHT JOIN department
ON employee.department_id = department.department_id;

-- 5. CROSS JOIN
SELECT employee.employee_name, department.department_name
FROM employee
CROSS JOIN department;
