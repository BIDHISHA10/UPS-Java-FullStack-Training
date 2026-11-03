USE college;

DELIMITER //

CREATE PROCEDURE get_employees()
BEGIN
    SELECT * FROM employee;
END //

CREATE PROCEDURE get_employee_by_id(IN emp_id INT)
BEGIN
    SELECT *
    FROM employee
    WHERE employee_id = emp_id;
END //

CREATE PROCEDURE get_employee_count(OUT total INT)
BEGIN
    SELECT COUNT(*) INTO total
    FROM employee;
END //

DELIMITER ;

-- Execute procedures
CALL get_employees();

CALL get_employee_by_id(101);

CALL get_employee_count(@total);
SELECT @total;

-- Remove procedures
DROP PROCEDURE IF EXISTS get_employees;
DROP PROCEDURE IF EXISTS get_employee_by_id;
DROP PROCEDURE IF EXISTS get_employee_count;