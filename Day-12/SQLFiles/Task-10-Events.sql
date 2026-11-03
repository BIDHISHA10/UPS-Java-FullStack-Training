USE college;

SET GLOBAL event_scheduler = ON;

DELIMITER //

CREATE EVENT delete_old_backups
ON SCHEDULE EVERY 1 DAY
DO
BEGIN
    DELETE FROM employee_backup
    WHERE backup_time < NOW() - INTERVAL 30 DAY;
END //

DELIMITER ;

-- Remove event when required
DROP EVENT IF EXISTS delete_old_backups;