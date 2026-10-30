import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        if (start % 2 != 0) {
            start++;
        }

        System.out.println("Even numbers between " + start + " and " + end + ":");

        while (start <= end) {
            System.out.println(start);
            start += 2;
        }

        sc.close();
    }
}

