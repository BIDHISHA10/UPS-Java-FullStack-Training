import java.util.Scanner;

class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            total = total + i;
        }

        System.out.println("Sum of first " + n + " natural numbers is " + total);

        sc.close();
    }
}

