# Day 13 – JDBC and SQL Joins

## 1. Topics Covered

### JDBC (Java Database Connectivity)
- Introduction to JDBC
- Connecting Java applications with MySQL
- JDBC Driver and Connection
- PreparedStatement
- ResultSet
- CRUD operations:
  - Create – Add student
  - Read – View students
  - Update – Update student details
  - Delete – Delete student details

### SQL Joins
- INNER JOIN
- LEFT JOIN
- RIGHT JOIN
- FULL OUTER JOIN (using UNION in MySQL)
- CROSS JOIN

## 2. SQL Practical Tasks

### Task 1 – Create Student Database

- Created the `test` database.
- Created the `student` table with `id` and `name`.
- Inserted a sample student record.

Expected output:

| id | name |
|---|---|
| 1 | Bidhisha |

### Task 2 – SQL Joins

Created `department` and `employee` tables with sample records.

Practised:

1. INNER JOIN – Displays matching employee and department records.
2. LEFT JOIN – Displays all employees, including those without a matching department.
3. RIGHT JOIN – Displays all departments, including those without matching employees.
4. FULL OUTER JOIN – Combines LEFT JOIN and RIGHT JOIN using UNION.
5. CROSS JOIN – Displays every possible employee and department combination.

## 3. JDBC Student Management System

### Project Structure

```text
JDBC-Student-Management/
├── lib/
│   └── mysql-connector-j-26.10.0.jar
└── src/
    └── com/ups/studentmanagement/
        ├── config/
        │   └── DatabaseConnection.java
        ├── model/
        │   └── Student.java
        ├── dao/
        │   └── StudentDAO.java
        ├── service/
        │   └── StudentService.java
        └── app/
            ├── ConnectionTest.java
            └── StudentManagementApp.java
```

### File Descriptions

- **DatabaseConnection.java:** Establishes a connection between Java and MySQL.
- **Student.java:** Stores student ID and name.
- **StudentDAO.java:** Performs database CRUD operations.
- **StudentService.java:** Handles student-related operations through the DAO.
- **StudentManagementApp.java:** Provides the menu-driven application.
- **ConnectionTest.java:** Checks whether the database connection works.

### Application Features

1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit

### Sample Output

```text
--- Student Management System ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit

Enter your choice: 1
Enter ID: 2
Enter Name: Rahul
Student added successfully!
```

Viewing students:

```text
ID: 1
Name: Bidhisha
ID: 2
Name: Rahul
```

Updating a student:

```text
Student updated successfully!
```

Deleting a student:

```text
Student deleted successfully!
```

## 4. Compilation and Execution

Open the terminal inside `JDBC-Student-Management`.

Compile:

```powershell
javac -cp "lib/*" -d out (Get-ChildItem -Recurse src -Filter *.java).FullName
```

Run:

```powershell
java -cp "out;lib/*" com.ups.studentmanagement.app.StudentManagementApp
```

## 5. Key Learnings

- Understood JDBC architecture and database connectivity.
- Connected Java applications with MySQL.
- Used PreparedStatement to execute SQL queries.
- Retrieved database records using ResultSet.
- Implemented CRUD operations using Java.
- Understood different types of SQL joins.
- Learned layered architecture using model, DAO, service and app packages.
