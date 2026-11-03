# Day 06 – Java Full Stack Training

## 1. Topics Covered

### Polymorphism
Polymorphism means one thing having many forms.

- **Compile-time polymorphism:** Achieved through method overloading.
- **Runtime polymorphism:** Achieved through method overriding.
- **Method overriding:** A child class provides its own implementation of a parent class method.
- **Abstract classes and methods:** Abstract classes cannot be directly instantiated. Abstract methods do not have a body in the parent class.

### Constructor Overloading
Constructor overloading means creating multiple constructors in the same class with different parameter lists.

- Multiple constructors can be created in one class.
- Each constructor can accept different parameters.
- Objects can be initialized in different ways.

### String and StringBuilder

- `charAt()` – Returns the character at a specified index.
- `length()` – Returns the length of a string.
- `split()` – Divides a string into an array.
- `toCharArray()` – Converts a string into a character array.
- `StringBuilder` – Used to create and modify mutable strings.
- `reverse()` – Reverses the contents of a StringBuilder.

### BSM – Logical Reasoning and Problem Solving

- Logical reasoning puzzles
- Critical thinking and analysis
- Identifying patterns and relationships
- Evaluating possible outcomes
- Decision-making through logical thinking

---

## 2. Practical Programs

### Task 1: Anagram – Manual Sorting
**File:** `Anagram.java`

Checks whether two strings contain the same characters by manually sorting their character arrays.

**Output:**
```text
Anagram
```

### Task 2: Reverse Words in a String
**File:** `ReverseString.java`

Reverses the order of words in a given sentence using `split()`.

**Output:**
```text
Stack Full Java
```

### Task 3: Constructor Overloading
**File:** `Student.java`

Demonstrates three constructors with different parameter lists.

**Output:**
```text
Constructor Overloading
Name: Bidhisha
Name: Bidhisha Dept: CSE
```

### Task 4: Runtime Polymorphism Using Abstract Classes
**Files:** `AbstractRbi.java` and `Main.java`

Demonstrates abstraction and method overriding using different bank classes.

**Output:**
```text
SBI Rules
Indian Bank Rules
```

### Task 5: Merge Two Character Arrays
**File:** `MergeChar.java`

Combines two character arrays into a single array using a loop.

**Output:**
```text
BIDHISHACSE
```

### Task 6: Remove Spaces from a String
**File:** `RemoveChar.java`

Removes spaces from a string using `charAt()` and an if condition.

**Output:**
```text
JavaFullStack
```

---

## 3. BSM – Logical Reasoning Questions and Answers

### Q1. River Crossing Puzzle
Four people Alex (90 kg), Bella (80 kg), Chris (60 kg), Dylan (40 kg), and 20 kg supplies need to cross a river. The boat capacity is 100 kg.

**Answer:** The puzzle cannot be solved as stated without additional rules or a change in capacity.

### Q2. Bridge Crossing Puzzle
Alice takes 1 minute, Ben 2 minutes, Chris 5 minutes, and Don 8 minutes to cross a bridge. Only two people can cross at a time, and they need one torch.

**Answer:**

1. Alice and Ben cross – 2 minutes.
2. Alice returns – 1 minute.
3. Chris and Don cross – 8 minutes.
4. Ben returns – 2 minutes.
5. Alice and Ben cross – 2 minutes.

**Total time = 15 minutes.**

### Q3. Married and Unmarried Person Puzzle
Jack is married and looks at Anne. Anne looks at George, who is unmarried. Is a married person looking at an unmarried person?

**Answer:** Yes. If Anne is married, she is looking at unmarried George. If Anne is unmarried, married Jack is looking at her.

### Q4. Matchstick Puzzle
You have one matchstick, an oil lamp, a fireplace, and a candle. What will you light first?

**Answer:** The matchstick.

### Q5. Duck Puzzle
Two ducks are in front of two ducks, two ducks are behind two ducks, and one duck is in the middle. What is the minimum number of ducks?

**Answer:** Three ducks.

### Q6. Apple Finishing Order
A finishes before B but behind C. D finishes before E but behind B. Find the order.

**Answer:**
1. C
2. A
3. B
4. D
5. E

### Q7. King's Punishment Puzzle
A king says:
- If the statement is true, the person will be killed by lions.
- If the statement is false, the person will be trampled by buffalo.

The person says, "You will kill me by trampling me with your wild buffalo."

**Answer:** The statement creates a contradiction. The king cannot choose either punishment without contradicting his rule, so the person must be released.

---

## 4. Java Homework

### HW1. Memory Storage

When an object is created using `new`, its instance variables are stored inside the object in heap memory.

- Primitive instance variables store their actual values inside the object.
- Reference instance variables store references inside the object.
- The referenced objects are generally stored separately in heap memory.
- Local variables and references are stored in the method's stack frame.

**Example:**
```java
class Student {
    int age = 20;
    String name = "Bidhisha";
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
```

**Memory explanation:**
- `age` – Stored inside the Student object in heap memory.
- `name` – Reference stored inside the Student object in heap memory.
- `"Bidhisha"` – String literal stored in the String Pool.
- `s` – Local reference in the `main()` stack frame.

**Output:** No output because the program does not contain any print statement.

### HW2. Variables in Interface

Interface variables are implicitly `public static final`. Therefore, they must be initialized when declared.

**Example:**
```java
interface Student {
    int age = 20;
    // int marks; // Invalid: must be initialized
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Student.age);
    }
}
```

**Output:**
```text
20
```

---

## 5. Learning Outcomes

- Understood compile-time and runtime polymorphism.
- Practiced constructor overloading.
- Learned String and StringBuilder concepts.
- Used character arrays to check anagrams.
- Practiced reversing words in a sentence.
- Applied abstraction and method overriding.
- Merged two character arrays using loops.
- Removed spaces from strings using conditional statements.
- Improved logical reasoning and problem-solving skills.

---

**End of Day 06**
