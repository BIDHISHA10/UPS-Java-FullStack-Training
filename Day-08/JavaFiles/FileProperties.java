
import java.io.*;

public class FileProperties {
    public static void main(String[] args) {
        File file = new File("properties.txt");

        try {
            FileWriter fw = new FileWriter(file);
            fw.write("Java File Properties");
            fw.close();

            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length());
            System.out.println("Exists: " + file.exists());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
