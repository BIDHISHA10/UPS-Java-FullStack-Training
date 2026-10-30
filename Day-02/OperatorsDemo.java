public class OperatorsDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));

        // Logical Operators
        System.out.println("Logical AND: " + (a > 5 && b < 10));
        System.out.println("Logical OR: " + (a > 15 || b < 10));
        System.out.println("Logical NOT: " + !(a > b));

        // Assignment Operator
        a += 5;
        System.out.println("After Assignment: " + a);

        // Unary Operators
        a++;
        System.out.println("After Increment: " + a);

        b--;
        System.out.println("After Decrement: " + b);
    }
}