public class Question1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int temp = i;
            int digits = String.valueOf(i).length();
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}