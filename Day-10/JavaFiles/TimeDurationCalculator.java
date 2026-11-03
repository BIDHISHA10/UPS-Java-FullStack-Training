import java.time.Duration;
import java.time.LocalTime;

public class TimeDurationCalculator {
    public static void main(String[] args) {
        LocalTime startTime = LocalTime.of(9, 30);
        LocalTime endTime = LocalTime.of(14, 45);

        Duration difference = Duration.between(startTime, endTime);

        System.out.println("Total Hours: " + difference.toHours());
        System.out.println("Total Minutes: " + difference.toMinutes());
    }
}