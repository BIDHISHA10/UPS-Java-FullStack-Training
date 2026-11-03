
public class ExceptionHandling {

    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Not eligible to vote");
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        try {
            String input = "20";
            int age = Integer.parseInt(input);

            checkAge(age);

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program completed");
    }
}
