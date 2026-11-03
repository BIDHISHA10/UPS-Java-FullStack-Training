public class Question2 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 45, 32, 18};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("Second largest not found");
        } else {
            System.out.println("Second largest: " + second);
        }
    }
}