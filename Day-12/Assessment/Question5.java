import java.util.HashSet;

public class Question5 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40, 50, 30};

        HashSet<Integer> numbers = new HashSet<>();

        for (int num : arr) {
            numbers.add(num);
        }

        System.out.println("Unique values: " + numbers);
        System.out.println("Number of unique values: " + numbers.size());

        if (numbers.contains(40)) {
            System.out.println("40 is present");
        } else {
            System.out.println("40 is not present");
        }
    }
}