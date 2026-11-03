import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Bidhisha");
        students.put(102, "Rahul");
        students.put(103, "Priya");

        System.out.println("Student with ID 101: " + students.get(101));

        System.out.println("All Student IDs: " + students.keySet());
        System.out.println("All Student Names: " + students.values());

        System.out.println("All Student Details:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        students.remove(103);
        System.out.println("After Removal: " + students);
    }
}