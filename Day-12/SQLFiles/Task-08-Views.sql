USE college;

CREATE VIEW high_salary_employees AS
SELECT employee_id, employee_name, salary
FROM employee
WHERE salary > 30000;

SELECT * FROM high_salary_employees;

DROP VIEW IF EXISTS high_salary_employees;