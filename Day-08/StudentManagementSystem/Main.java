
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService(sc);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    service.addStudent();
                    break;
                case "2":
                    service.viewStudents();
                    break;
                case "3":
                    System.out.println("Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
