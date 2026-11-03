import java.io.*;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            try (BufferedWriter writer =
                    new BufferedWriter(new FileWriter("students.txt"))) {

                for (int i = 0; i < 5; i++) {
                    System.out.print("Enter student ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter student name: ");
                    String name = sc.nextLine().replace(",", " ");

                    System.out.print("Enter marks: ");
                    double marks = Double.parseDouble(sc.nextLine());

                    if (marks < 0 || marks > 100) {
                        System.out.println("Invalid marks.");
                        i--;
                        continue;
                    }

                    writer.write(id + "," + name + "," + marks);
                    writer.newLine();
                }
            }

            double highestMarks = -1;
            String topStudent = "";

            System.out.println("\nStudent records:");

            try (BufferedReader reader =
                    new BufferedReader(new FileReader("students.txt"))) {

                String line;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);

                    String[] data = line.split(",");
                    double marks = Double.parseDouble(data[2]);

                    if (marks > highestMarks) {
                        highestMarks = marks;
                        topStudent = data[1];
                    }
                }
            }

            System.out.println("Highest scorer: " + topStudent);
            System.out.println("Highest marks: " + highestMarks);

            System.out.print("\nEnter new student ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter new student name: ");
            String name = sc.nextLine().replace(",", " ");

            System.out.print("Enter new student marks: ");
            double marks = Double.parseDouble(sc.nextLine());

            if (marks >= 0 && marks <= 100) {
                try (BufferedWriter writer =
                        new BufferedWriter(new FileWriter("students.txt", true))) {

                    writer.write(id + "," + name + "," + marks);
                    writer.newLine();
                }

                System.out.println("New student added.");
            } else {
                System.out.println("Invalid marks. Student not added.");
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers.");
        }

        sc.close();
    }
}