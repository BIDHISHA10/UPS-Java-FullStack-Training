USE college;

-- Employees earning more than 30000
SELECT *
FROM employee
WHERE salary > 30000;

-- Sort employees by salary, highest first
SELECT *
FROM employee
ORDER BY salary DESC;