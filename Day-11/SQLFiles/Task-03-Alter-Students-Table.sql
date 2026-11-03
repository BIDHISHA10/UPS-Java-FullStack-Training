USE college;

ALTER TABLE students
ADD ph_number VARCHAR(10);

ALTER TABLE students
ADD dob DATE,
MODIFY student_name VARCHAR(150) NOT NULL,
RENAME COLUMN dept TO course,
DROP COLUMN ph_number;

DESCRIBE students;

DESCRIBE employee;