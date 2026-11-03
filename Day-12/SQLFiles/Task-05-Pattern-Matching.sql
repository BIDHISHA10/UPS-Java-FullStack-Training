USE college;

-- Names starting with A
SELECT *
FROM employee
WHERE employee_name LIKE 'A%';

-- Names containing i
SELECT *
FROM employee
WHERE employee_name LIKE '%i%';

-- Names containing exactly four characters
SELECT *
FROM employee
WHERE employee_name LIKE '____';