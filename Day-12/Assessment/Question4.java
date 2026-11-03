import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Question4 {

    static class Student {
        int rollNo;
        String name;
        int mark;

        Student(int rollNo, String name, int mark) {
            this.rollNo = rollNo;
            this.name = name;
            this.mark = mark;
        }

        void display() {
            System.out.println(rollNo + " " + name + " " + mark);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter mark: ");
            int mark = sc.nextInt();

            students.add(new Student(roll, name, mark));
        }

        System.out.println("\nStudents scoring above 75:");
        for (Student s : students) {
            if (s.mark > 75) {
                s.display();
            }
        }

        System.out.print("\nEnter roll number to search: ");
        int searchRoll = sc.nextInt();

        Student found = null;

        for (Student s : students) {
            if (s.rollNo == searchRoll) {
                found = s;
                break;
            }
        }

        if (found != null) {
            found.display();

            System.out.print("Enter new mark: ");
            found.mark = sc.nextInt();

            System.out.println("Updated successfully.");
        } else {
            System.out.println("Student not found.");
        }

        System.out.print("Enter roll number to remove: ");
        int removeRoll = sc.nextInt();

        students.removeIf(s -> s.rollNo == removeRoll);

        students.sort(Comparator.comparingInt(s -> s.mark));

        System.out.println("\nStudents sorted by marks:");
        for (Student s : students) {
            s.display();
        }

        sc.close();
    }
}