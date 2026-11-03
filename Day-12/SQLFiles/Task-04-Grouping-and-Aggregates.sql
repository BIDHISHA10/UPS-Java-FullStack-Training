USE college;

-- Count employees in each department
SELECT department_id, COUNT(*) AS total_employees
FROM employee
GROUP BY department_id;

-- Departments with more than one employee
SELECT department_id, COUNT(*) AS total_employees
FROM employee
GROUP BY department_id
HAVING COUNT(*) > 1;

-- Unique department IDs
SELECT DISTINCT department_id
FROM employee;

-- Three highest-paid employees
SELECT *
FROM employee
ORDER BY salary DESC
LIMIT 3;

-- Aggregate functions
SELECT
    COUNT(*) AS total_employees,
    SUM(salary) AS total_salary,
    AVG(salary) AS average_salary,
    MIN(salary) AS minimum_salary,
    MAX(salary) AS maximum_salary
FROM employee;