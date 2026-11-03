# UPS Training – Day 07

## 1. Topics Covered

### 1. Interfaces in Java

- Introduction to interfaces.
- Implementing an interface using `implements`.
- Extending an interface using `extends`.
- Interface-to-interface inheritance.
- Implementing interfaces in concrete classes.
- Runtime polymorphism using interfaces.

### 2. Built-in Functions of Arrays and Strings

**Array methods:**

- `Arrays.sort()` – Sorts array elements.
- `Arrays.toString()` – Converts an array into a readable string.
- `Arrays.equals()` – Compares two arrays.

**String methods:**

- `String.length()` – Returns the length of a string.
- `String.charAt()` – Returns a character at a specified index.
- `String.substring()` – Extracts a part of a string.
- `String.equals()` – Compares two strings.
- `String.split()` – Splits a string into an array.

### 3. StringBuffer

StringBuffer is a mutable sequence of characters. It allows us to modify strings without creating a new object every time.

Methods:

- `append()` – Adds characters at the end.
- `insert()` – Inserts characters at a specified position.
- `replace()` – Replaces a part of the string.
- `delete()` – Deletes characters from a specified range.
- `reverse()` – Reverses the string.

### 4. Jagged Arrays

A jagged array is a two-dimensional array in which each row can have a different number of columns.

- Creating arrays with different numbers of columns in each row.
- Accessing elements using nested loops.
- Using `arr.length` and `arr[i].length`.

### 5. Common Array Errors

- `ArrayIndexOutOfBoundsException` – Occurs when accessing an invalid array index.
- Accessing invalid indexes.
- Understanding array length.
- Avoiding incorrect loop conditions.

### 6. Exception Handling

Exception handling is used to handle runtime errors and prevent abnormal program termination.

- Introduction to exceptions.
- `try` and `catch`.
- Using `throw` to throw exceptions manually.
- Handling invalid user input.
- Displaying exception messages using `getMessage()`.

---

## 2. Practical Programs

### Task 1: ATM Application with Exception Handling

**File:** `AtmExpection.java`

**Description:**

This program demonstrates an ATM application using exception handling. It supports balance checking, depositing money, withdrawing money and exiting the application.

It uses:

- `try` and `catch`
- `throw`
- `getMessage()`
- `InputMismatchException`
- `Scanner`
- `switch` statement

**Sample Output – Insufficient Balance:**

```text
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice:
3
Enter amt to withdraw:
2000
Please enter sufficient amount
```

**Sample Output – Check Balance:**

```text
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice:
1
Balance: 1000
```

### Task 2: Jagged Array

**File:** `JaggedArray.java`

**Description:**

This program creates a jagged array with two rows. The first row contains three elements, while the second row contains two elements. Nested loops are used to access and display the elements.

**Code:**

```java
public class JaggedArray {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

**Output:**

```text
1 2 3
4 5
```

### Task 3: Payment Method Application Using Interfaces

**File:** `PaymentMethod.java`

**Description:**

This program demonstrates interfaces and runtime polymorphism using three payment methods: UPI, Cash and Card.

- `Payment` is an interface.
- `Upi`, `Cash` and `Card` implement the interface.
- The `pay()` method is implemented differently in each class.
- The user selects a payment method using a switch statement.

**Sample Output – Cash Payment:**

```text
1. UPI
2. Cash
3. Card
Please Select payment method
2
Payment successful Through Cash
```

**Sample Output – UPI Payment:**

```text
1. UPI
2. Cash
3. Card
Please Select payment method
1
Please UPI PIN: 1234
Payment successful Through UPI
```

**Sample Output – Card Payment:**

```text
1. UPI
2. Cash
3. Card
Please Select payment method
3
Please PIN: 1234
Payment successful Through Card
```

---

## 3. Learning Outcomes

- Understood interface inheritance using `extends` and implementation using `implements`.
- Practiced built-in methods of the `Arrays` and `String` classes.
- Learned string manipulation using `StringBuffer`.
- Created and traversed jagged arrays using nested loops.
- Identified common array errors and learned how to avoid them.
- Applied exception handling using `try`, `catch`, and `throw`.
- Developed ATM and payment applications using Java concepts.

---

**End of Day 07**
