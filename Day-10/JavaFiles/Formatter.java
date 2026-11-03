import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatter {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Formatted Date and Time: "
                + dateTime.format(formatter));
    }
}