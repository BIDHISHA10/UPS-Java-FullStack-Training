import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Student {
    int id;
    String name;
    String department;
    int year;
    LocalDateTime addedDateTime;

    Student(int id, String name, String department, int year) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.year = year;
        this.addedDateTime = LocalDateTime.now();
    }

    void display() {
        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Year: " + year);
        System.out.println("Added On: " + addedDateTime.format(formatter));
        System.out.println("--------------------");
    }
}