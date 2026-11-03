# Day 11 – MySQL and SQL Fundamentals

## Topics Covered
- Database fundamentals
- SQL vs NoSQL
- DBMS vs RDBMS
- DDL – Data Definition Language
- DML – Data Manipulation Language
- CREATE, ALTER, DROP, TRUNCATE
- INSERT, UPDATE, DELETE
- Primary Key and UNIQUE constraints

## Task 1 – Create College Database

**Description:** Create a database named `college` and a table named `students`.

**SQL:**
```sql
CREATE DATABASE college;
USE college;

CREATE TABLE students (
    student_id INT,
    student_name VARCHAR(50) NOT NULL,
    age INT,
    dept VARCHAR(50),
    email VARCHAR(50) NOT NULL
);

SELECT * FROM students;
```

**Expected Output:**
- Database `college` created successfully.
- Table `students` created successfully.
- Empty students table displayed.

## Task 2 – Create Employee Table

**Description:** Create an employee table with employee details and constraints.

**SQL:**
```sql
USE college;

CREATE TABLE employee (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(100),
    salary DECIMAL(10,2),
    joining_date DATE,
    email VARCHAR(50) UNIQUE
);

SELECT * FROM employee;
```

**Expected Output:**
- Table `employee` created successfully.
- Empty employee table displayed.

## Task 3 – Alter Students Table

**Description:** Perform different ALTER operations on the students table.

**SQL:**
```sql
USE college;

ALTER TABLE students ADD ph_number VARCHAR(15);

ALTER TABLE students ADD dob DATE;

ALTER TABLE students MODIFY student_name VARCHAR(150);

ALTER TABLE students RENAME COLUMN dept TO course;

ALTER TABLE students DROP COLUMN ph_number;

DESCRIBE students;
```

**Expected Output:**
- `ph_number` column added and later dropped.
- `dob` column added.
- `student_name` size changed to `VARCHAR(150)`.
- `dept` column renamed to `course`.
- Final table contains `student_id`, `student_name`, `age`, `course`, `email`, and `dob`.

## Task 4 – Insert Employee Records

**Description:** Insert two employee records into the employee table.

**SQL:**
```sql
USE college;

INSERT INTO employee
(employee_id, employee_name, salary, joining_date, email)
VALUES
(101, 'Bidhisha', 500000, '2027-02-01', 'bidhisha@gmail.com'),
(102, 'Rahul', 500000, '2027-02-02', 'rahul@gmail.com');

SELECT * FROM employee;
```

**Expected Output:**

| employee_id | employee_name | salary | joining_date | email |
|---:|---|---:|---|---|
| 101 | Bidhisha | 500000.00 | 2027-02-01 | bidhisha@gmail.com |
| 102 | Rahul | 500000.00 | 2027-02-02 | rahul@gmail.com |

## Task 5 – Update Employee Salaries

**Description:** Increase the salary of every employee by 2000.

**SQL:**
```sql
USE college;

UPDATE employee
SET salary = salary + 2000;

SELECT * FROM employee;
```

**Expected Output:**

| employee_id | employee_name | salary |
|---:|---|---:|
| 101 | Bidhisha | 502000.00 |
| 102 | Rahul | 502000.00 |

**Note:** Since there is no WHERE condition, the salary of every employee in the table is updated.

## Important Concepts

### SQL vs NoSQL
- SQL databases store data mainly in structured tables.
- NoSQL databases support flexible data models such as documents and key-value pairs.

### DBMS vs RDBMS
- DBMS is software used to store and manage data.
- RDBMS stores data in related tables and supports relationships using keys.

### DDL Commands
- `CREATE` – Creates database objects.
- `ALTER` – Modifies table structure.
- `DROP` – Deletes database objects.
- `TRUNCATE` – Removes all rows from a table while keeping its structure.

### DML Commands
- `INSERT` – Adds records.
- `UPDATE` – Modifies existing records.
- `DELETE` – Removes records.

### Constraints
- `PRIMARY KEY` – Uniquely identifies each record.
- `NOT NULL` – Prevents a column from storing NULL values.
- `UNIQUE` – Prevents duplicate values in a column.

## Learning Outcomes
- Understood database and SQL fundamentals.
- Created databases and tables using SQL.
- Practiced DDL and DML commands.
- Used ALTER operations to modify table structures.
- Inserted and updated employee records.
- Understood primary key, NOT NULL, and UNIQUE constraints.