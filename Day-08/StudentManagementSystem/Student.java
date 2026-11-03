
import java.time.LocalDateTime;

public class Student {
    private int id;
    private String name;
    private String department;
    private int year;
    private String addedTime;

    public Student(int id, String name, String department, int year) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.year = year;
        this.addedTime = LocalDateTime.now().toString();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getYear() {
        return year;
    }

    public String getAddedTime() {
        return addedTime;
    }

    public String toString() {
        return id + "," + name + "," + department + ","
                + year + "," + addedTime;
    }
}
