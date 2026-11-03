USE college;

-- Employees earning more than Kumar
SELECT *
FROM employee
WHERE salary > (
    SELECT salary
    FROM employee
    WHERE employee_name = 'Kumar'
);

-- Employees earning above average salary
SELECT *
FROM employee
WHERE salary > (
    SELECT AVG(salary)
    FROM employee
);