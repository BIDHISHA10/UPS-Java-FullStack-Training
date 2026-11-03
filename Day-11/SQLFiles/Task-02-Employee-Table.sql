USE college;

CREATE TABLE employee (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(100),
    salary DECIMAL(10,2),
    joining_date DATE,
    email VARCHAR(50) UNIQUE
);

SELECT * FROM employee;