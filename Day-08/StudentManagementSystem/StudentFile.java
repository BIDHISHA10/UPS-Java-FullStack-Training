
import java.io.*;

public class StudentFile {
    private final String fileName = "students.txt";

    public void saveStudent(Student student) {
        try {
            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(student.toString());
            bw.newLine();

            bw.close();
            System.out.println("Student saved successfully");

        } catch (IOException e) {
            System.out.println("Error saving student: " + e.getMessage());
        }
    }

    public void displayStudents() {
        try {
            File file = new File(fileName);

            if (!file.exists() || file.length() == 0) {
                System.out.println("No student records found");
                return;
            }

            BufferedReader br = new BufferedReader(
                new FileReader(file)
            );

            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",", 5);

                if (data.length == 5) {
                    System.out.println("ID: " + data[0]);
                    System.out.println("Name: " + data[1]);
                    System.out.println("Department: " + data[2]);
                    System.out.println("Year: " + data[3]);
                    System.out.println("Added Time: " + data[4]);
                    System.out.println("---------------------");
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
