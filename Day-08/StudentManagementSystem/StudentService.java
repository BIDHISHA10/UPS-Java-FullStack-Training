
import java.util.Scanner;

public class StudentService {
    private Scanner sc;
    private StudentFile studentFile;

    public StudentService(Scanner sc) {
        this.sc = sc;
        studentFile = new StudentFile();
    }

    public void addStudent() {
        try {
            System.out.print("Enter student ID: ");
            int id = Integer.parseInt(sc.nextLine());

            if (id <= 0) {
                throw new IllegalArgumentException("Invalid ID");
            }

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter department: ");
            String department = sc.nextLine();

            System.out.print("Enter academic year (1-4): ");
            int year = Integer.parseInt(sc.nextLine());

            if (year < 1 || year > 4) {
                throw new IllegalArgumentException("Invalid year");
            }

            Student student = new Student(id, name, department, year);
            studentFile.saveStudent(student);

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void viewStudents() {
        studentFile.displayStudents();
    }
}
