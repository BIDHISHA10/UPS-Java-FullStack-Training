
import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        File file = new File("sample.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }

            FileWriter fw = new FileWriter(file);
            fw.write("Hello Java");
            fw.close();
            System.out.println("Data written");

            BufferedReader br = new BufferedReader(
                new FileReader(file)
            );

            System.out.println("File content: " + br.readLine());
            br.close();

            FileWriter append = new FileWriter(file, true);
            append.write("\nFile Handling");
            append.close();
            System.out.println("Data appended");

            FileWriter update = new FileWriter(file);
            update.write("Java Full Stack");
            update.close();
            System.out.println("File updated");

            BufferedReader reader = new BufferedReader(
                new FileReader(file)
            );
            System.out.println("Updated content: " + reader.readLine());
            reader.close();

            if (file.delete()) {
                System.out.println("File deleted");
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
