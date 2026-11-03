USE college;

CREATE TABLE employee_backup (
    employee_id INT,
    employee_name VARCHAR(100),
    salary DECIMAL(10,2),
    joining_date DATE,
    email VARCHAR(50),
    department_id INT,
    backup_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

DELIMITER //

CREATE TRIGGER backup_employee
AFTER INSERT ON employee
FOR EACH ROW
BEGIN
    INSERT INTO employee_backup
    (employee_id, employee_name, salary, joining_date, email, department_id)
    VALUES
    (NEW.employee_id, NEW.employee_name, NEW.salary,
     NEW.joining_date, NEW.email, NEW.department_id);
END //

DELIMITER ;

-- Check backup records
SELECT * FROM employee_backup;

-- Remove trigger when required
DROP TRIGGER IF EXISTS backup_employee;