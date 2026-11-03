USE college;

INSERT INTO employee
(employee_id, employee_name, salary, joining_date, email, department_id)
VALUES
(103, 'Kumar', 30000.00, '2026-10-23', 'kumar@gmail.com', 1),
(104, 'Priya', 35000.00, '2026-10-20', 'priya@gmail.com', 2),
(105, 'Arun', 40000.00, '2026-10-15', 'arun@gmail.com', 3),
(106, 'Divya', 45000.00, '2026-10-10', 'divya@gmail.com', 4);

SELECT * FROM employee;