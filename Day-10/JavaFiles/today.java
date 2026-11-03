import java.time.LocalDate;

public class today {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println("Current Date: " + date);
        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDayOfMonth());

        System.out.println("After 5 days: " + date.plusDays(5));
        System.out.println("3 months before: " + date.minusMonths(3));
    }
}