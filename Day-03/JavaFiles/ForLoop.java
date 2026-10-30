import java.util.Scanner;

class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the table number: ");
        int table = sc.nextInt();

        System.out.print("Enter starting value: ");
        int start = sc.nextInt();

        System.out.print("Enter ending value: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println(table + " x " + i + " = " + (table * i));
        }

        sc.close();
    }
}

