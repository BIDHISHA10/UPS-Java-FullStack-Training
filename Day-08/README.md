# Day 8 – Java File I/O, Exception Handling, Multithreading & Layered Architecture

**Training:** UPS Java Full Stack Training  
**Day:** 8  
**Focus:** Exception Handling, File I/O, Multithreading, Lambda Expressions, Synchronization and Student Management System

## 1. Exception Handling

**Program:** `ExceptionHandling.java`

Topics covered:
- try and catch blocks
- throw and throws keywords
- IllegalArgumentException
- IOException
- NumberFormatException
- Input validation

**Expected output:**
```text
Eligible to vote
Program completed
```

## 2. Java File I/O

**Programs:** `FileHandling.java`, `FileProperties.java`

Topics covered:
- File creation using `createNewFile()`
- Writing using `FileWriter`
- Reading using `FileReader` and `BufferedReader`
- Appending and updating file content
- Deleting files using `delete()`
- File information using `getName()`, `length()`, `exists()`, `canRead()` and `canWrite()`
- Exception handling using IOException

**FileHandling.java – Expected output:**
```text
File created
Data written
File content: Hello Java
Data appended
File updated
Updated content: Java Full Stack
File deleted
```

**FileProperties.java – Expected output:**
```text
Name: properties.txt
Path: [your JavaFiles folder]\properties.txt
Size: 21
Exists: true
Readable: true
Writable: true
```

## 3. Multithreading and Runnable

**Program:** `RunnableExample.java`

Topics covered:
- Runnable interface
- run() method
- Thread creation
- start() method
- sleep() method
- Concurrent execution

**Expected output (order may vary):**
```text
Thread 1: 1
Thread 2: 1
Thread 1: 2
Thread 2: 2
Thread 1: 3
Thread 2: 3
Thread 1: 4
Thread 2: 4
Thread 1: 5
Thread 2: 5
```

## 4. Thread Methods

**Program:** `ThreadMethods.java`

Topics covered:
- sleep()
- join()
- interrupt()
- InterruptedException
- Thread execution coordination

**Expected output:**
```text
Main waiting
Worker started
Worker completed
Main completed
```

## 5. Lambda Expressions

**Program:** `LambdaThreadExample.java`

Topics covered:
- Lambda expression syntax
- Functional interfaces
- Runnable using lambda expressions
- Thread creation using lambda expressions

**Expected output (order may vary):**
```text
Main method completed
Thread is running
```

## 6. Synchronization and Inter-Thread Communication

**Program:** `WaitNotifyExample.java`

Topics covered:
- synchronized methods
- Shared objects
- wait()
- notify()
- Monitor locks
- Thread communication

**Expected output:**
```text
Producer is waiting
Consumer is working
Consumer sent notification
Producer received notification
```

## 7. ATM Example – Synchronization

**Program:** `ATMExample.java`

Topics covered:
- Shared account balance
- Synchronized deposit and withdrawal
- wait()
- notifyAll()
- Checking available balance
- Thread coordination

**Expected output:**
```text
Withdrawal requested: 1000
Insufficient balance. Waiting...
Deposited: 1000
Current balance: 1500
Withdrawal successful: 1000
Remaining balance: 500
```

## 8. Student Management System

**Project:** `StudentManagementSystem/`

A console-based application using object-oriented programming, file handling and exception handling.

### Project files

| File | Responsibility |
|---|---|
| Main.java | Menu and user interaction |
| Student.java | Student details and object creation |
| StudentService.java | Input validation and business logic |
| StudentFile.java | Saving and displaying records |
| students.txt | Persistent student records |

### Features
- Add student details
- Create student objects
- Save student information in a text file
- View saved student records
- Validate student IDs and academic years
- Handle invalid numeric input
- Store the time when a student is created
- Retain records between program executions

**Sample output:**
```text
1. Add Student
2. View Students
3. Exit
Enter choice: 1
Enter student ID: 101
Enter student name: Bidhisha
Enter department: CSE
Enter academic year (1-4): 4
Student saved successfully
```

## 9. Important Comparisons

### throw vs throws

| throw | throws |
|---|---|
| Explicitly throws an exception | Declares possible exceptions |
| Used inside a method or block | Used in method declaration |
| Throws an exception object | Specifies exception types |

### Thread vs Runnable

| Thread | Runnable |
|---|---|
| Extend Thread class | Implement Runnable interface |
| Override run() | Override run() |
| Uses class inheritance | Allows extending another class |
| Combines task and thread management | Separates task and thread management |

### FileWriter vs BufferedWriter vs PrintWriter

| FileWriter | BufferedWriter | PrintWriter |
|---|---|---|
| Writes character data | Buffers character data | Convenient text output |
| write() | write(), newLine() | print(), println() |
| Simple file writing | Efficient repeated writing | Convenient formatted output |

## 10. Compilation and Execution

### Standalone Java programs

```powershell
cd JavaFiles
javac *.java
java ExceptionHandling
java FileHandling
java FileProperties
java RunnableExample
java ThreadMethods
java LambdaThreadExample
java WaitNotifyExample
java ATMExample
```

Run each Java program separately.

### Student Management System

```powershell
cd StudentManagementSystem
javac *.java
java Main
```

## 11. Key Learnings

- Handle exceptions using try, catch, throw and throws.
- Perform file operations using Java I/O classes.
- Read and write persistent data.
- Understand process and thread concepts.
- Create threads using Thread and Runnable.
- Use lambda expressions for concise thread creation.
- Coordinate threads using sleep(), join() and interrupt().
- Protect shared resources using synchronization.
- Communicate between threads using wait(), notify() and notifyAll().
- Build a basic layered application using multiple Java classes.