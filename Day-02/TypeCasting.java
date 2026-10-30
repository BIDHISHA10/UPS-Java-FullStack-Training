public class TypeCasting {
    public static void main(String[] args) {

        // Widening Type Casting
        int a = 100;
        double b = a;

        System.out.println("Widening Casting:");
        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);

        // Narrowing Type Casting
        double x = 25.75;
        int y = (int) x;

        System.out.println("Narrowing Casting:");
        System.out.println("Double: " + x);
        System.out.println("Integer: " + y);
    }
}