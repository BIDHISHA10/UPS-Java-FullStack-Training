import java.util.Scanner;

public class Func {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element " + (i + 1) + ": " + arr[i]);
        }
        sc.close();
    }
}
