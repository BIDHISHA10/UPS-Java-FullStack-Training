# Day 10 – Java Date & Time API, Collections Framework and Student Management

## Topics Covered
- Java Date and Time API
- LocalDate, LocalTime, LocalDateTime and ZonedDateTime
- DateTimeFormatter
- Period and Duration
- ArrayList, LinkedList and Vector
- HashSet, LinkedHashSet and TreeSet
- Queue and PriorityQueue
- Map and its methods
- Generics
- Functional Interfaces and Lambda Expressions
- Student Management System using ArrayList

## 1. Java Date and Time API

### today.java
Displays the current date and demonstrates date operations using `LocalDate`.

**Expected output (sample):**
```text
Current Date: 2026-11-03
Year: 2026
Month: NOVEMBER
Day: 3
After 5 days: 2026-11-08
3 months before: 2026-08-03
```

### Formatter.java
Formats the current date and time using `DateTimeFormatter`.

**Expected output (sample):**
```text
Formatted Date and Time: 03-11-2026 14:28:35
```

### PeriodExample.java
Calculates the difference between two dates using `Period`.

**Expected output:**
```text
Years: 5
Months: 3
Days: 10
```

### TimeDurationCalculator.java
Calculates the time difference using `Duration`.

**Expected output:**
```text
Total Hours: 5
Total Minutes: 315
```

## 2. Collections Framework

### CollectionsExample.java
Demonstrates:
- ArrayList
- LinkedList
- Vector
- HashSet
- LinkedHashSet
- TreeSet
- Queue
- PriorityQueue

**Expected output (sample):**
```text
ArrayList: [Arun, Priya, Bidhisha]
LinkedList: [Ravi, Arun, Priya]
Vector: [Java, Python]
HashSet: [10, 30]
LinkedHashSet: [Arun, Priya]
TreeSet: [10, 20, 30]
Queue removed: Arun
Queue next: Priya
PriorityQueue removed: 10
```

Note: HashSet does not guarantee iteration order.

## 3. Map

### MapExample.java
Demonstrates storing and retrieving student details using key-value pairs.

Methods covered:
- put()
- get()
- keySet()
- values()
- entrySet()
- remove()

**Expected output (sample):**
```text
Student with ID 101: Bidhisha
All Student IDs: [101, 102, 103]
All Student Names: [Bidhisha, Rahul, Priya]
All Student Details:
101 - Bidhisha
102 - Rahul
103 - Priya
After Removal: {101=Bidhisha, 102=Rahul}
```

Note: HashMap does not guarantee iteration order.

## 4. Generics

### GenericExample.java
Demonstrates a generic Box class that can store different data types.

**Expected output:**
```text
Name: Bidhisha
Number: 100
```

## 5. Functional Interface

### FunctionalExample.java
Demonstrates a functional interface implemented using a lambda expression.

**Expected output:**
```text
Hello Java
```

## 6. Student Management System Using ArrayList

### Project Files
- `Main.java` – accepts menu choices and student details.
- `Student.java` – stores student information and the date and time of creation.
- `StudentService.java` – manages student objects using ArrayList.

### Features
- Add a student.
- View all students.
- Record the date and time when a student is added.
- Display student details using a for-each loop.
- Exit the application.

### Sample Output
```text
--- Student Management System ---
1. Add Student
2. View Students
3. Exit
Enter your choice: 1
Enter ID: 101
Enter Name: Bidhisha
Enter Department: CSE
Enter Year: 4
Student added successfully!

--- Student Management System ---
1. Add Student
2. View Students
3. Exit
Enter your choice: 2
ID: 101
Name: Bidhisha
Department: CSE
Year: 4
Added On: 03-11-2026 14:30:00
--------------------

--- Student Management System ---
1. Add Student
2. View Students
3. Exit
Enter your choice: 3
Exiting Student Management System.
```

Note: Date and time depend on when the program is executed. Student records are stored in memory and are lost when the application terminates.

## 7. Compilation and Execution

### JavaFiles

Open PowerShell inside the `JavaFiles` folder.

Compile all files:
```powershell
javac (Get-ChildItem -Filter *.java).Name
```

Run each program:
```powershell
java today
java Formatter
java PeriodExample
java TimeDurationCalculator
java CollectionsExample
java MapExample
java GenericExample
java FunctionalExample
```

### Student Management System

Open PowerShell inside the `StudentManagement` folder.

Compile:
```powershell
javac (Get-ChildItem -Filter *.java).Name
```

Run:
```powershell
java Main
```

## 8. Advantages and Limitations

**Advantages**
- Date and Time API makes date calculations easier.
- Collections provide reusable data structures.
- Generics improve type safety.
- Lambda expressions reduce boilerplate code.
- ArrayList makes managing student objects straightforward.

**Limitations**
- Date formatting requires correct pattern symbols.
- HashSet does not preserve insertion order.
- LinkedList has slower indexed access than ArrayList.
- Student records are not permanently stored in the updated project.

## 9. Learning Outcomes
- Used Java Date and Time API classes.
- Formatted date and time values.
- Calculated differences using Period and Duration.
- Practiced different collection types.
- Used Map to store key-value pairs.
- Understood Generics and Functional Interfaces.
- Implemented lambda expressions.
- Updated Student Management System to use ArrayList.
- Recorded and displayed student creation date and time.

**Training:** UPS Java Full Stack Training  
**Day:** 10  
**Focus:** Date and Time API, Collections Framework, Generics, Functional Interfaces and Student Management