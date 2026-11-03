# Day 12 – Advanced SQL and Java Practical Assessment

## Part 1: Advanced SQL

### Topics Covered
- Foreign key relationships
- SQL filtering and sorting
- Aggregate functions
- GROUP BY and HAVING
- Pattern matching using LIKE
- Subqueries
- Stored procedures
- Views
- Triggers
- Backup tables
- Events and scheduled operations

### SQL Tasks

| Task | Description | Expected Result |
|---|---|---|
| Task 1 | Create a department table and establish a foreign key relationship with employees. | Employees are assigned to departments using `department_id`. |
| Task 2 | Insert four additional employee records. | Four new employees with IDs 103–106 are added. |
| Task 3 | Filter employees with salary above 30,000 and sort by salary in descending order. | Employees earning more than 30,000 are displayed from highest to lowest salary. |
| Task 4 | Use GROUP BY, HAVING, DISTINCT, LIMIT and aggregate functions. | Department counts and employee salary statistics are displayed. |
| Task 5 | Perform pattern matching using LIKE. | Employee names are filtered using different patterns. |
| Task 6 | Use subqueries to find employees earning above Kumar's salary and above the average salary. | Matching employee records are displayed. |
| Task 7 | Create and execute stored procedures using IN and OUT parameters. | Employee details and employee count are retrieved. |
| Task 8 | Create and use a view for employees earning above 30,000. | Only high-salary employees are displayed through the view. |
| Task 9 | Create an employee backup table and an AFTER INSERT trigger. | Newly inserted employee records are copied to the backup table. |
| Task 10 | Create a scheduled database event. | Backup records older than 30 days are scheduled for deletion. |

**Important:** Execute the SQL files in order. Task 1 depends on the employee table created on Day 11, and Task 2 depends on Task 1. Run the table creation, alteration and insertion scripts only once to avoid duplicate errors.

The scheduled event in Task 10 deletes old backup records. Use it carefully.

---

## Part 2: Java Practical Test 2

### Topics Covered
- Loops and conditional statements
- Arrays and strings
- Object-oriented programming
- Inheritance and polymorphism
- ArrayList
- HashSet and HashMap
- Multithreading
- Synchronization
- Inter-thread communication using wait() and notifyAll()
- File handling
- Exception handling

### Assessment Programs

| File | Problem | Expected Result |
|---|---|---|
| Question1.java | Find Armstrong numbers between 1 and 1000. | 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407 |
| Question2.java | Find the second-largest distinct element in an array. | 32 |
| Question3.java | Calculate salaries using employee inheritance and polymorphism. | Full-time salary: 36000; Part-time salary: 16000 |
| Question4.java | Manage student records using ArrayList. | Add, display, search, update, remove and sort student records. |
| Question5.java | Remove duplicates using HashSet. | 5 unique elements; 40 is present. |
| Question6.java | Count word frequencies using HashMap. | Java and is each occur twice in the sample sentence. |
| Question7.java | Simulate synchronized ticket booking. | 10 tickets are booked; the remaining request fails when tickets run out. |
| Question8.java | Implement producer-consumer communication. | Numbers 1–5 are produced and consumed using wait() and notifyAll(). |
| Question9.java | Perform file operations on student records. | Save and read five records, find the highest scorer and append a sixth record. |
| Question10.java | Develop an Employee Record Manager. | Add, search, update, delete, display and save employee records. |

### Compilation and Execution

Open PowerShell and navigate to the Assessment folder:

```powershell
cd "C:\Users\Bidhisha\Desktop\UPS-Java-FullStack-Training\Day-12\Assessment"
```

Compile all Java files:

```powershell
javac (Get-ChildItem -Filter *.java).Name
```

Run each program separately:

```powershell
java Question1
java Question2
java Question3
java Question4
java Question5
java Question6
java Question7
java Question8
java Question9
java Question10
```

**Note:** Question9 and Question10 create text files in the current working directory. Question10 saves employee records when the Save and Exit option is selected. Thread execution order and HashSet/HashMap display order may vary.

---

## Learning Outcomes

By completing Day 12, I learned to:

- Work with relational tables and foreign key constraints.
- Use advanced SQL queries, aggregate functions and subqueries.
- Create stored procedures, views, triggers and events.
- Solve programming problems using arrays, strings and loops.
- Apply inheritance, polymorphism and Java Collections.
- Understand multithreading and synchronization.
- Perform file operations and handle exceptions.
- Build a menu-driven employee management application with file persistence.