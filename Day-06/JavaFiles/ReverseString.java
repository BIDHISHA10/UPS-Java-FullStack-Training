public class ReverseString {
    public static void main(String[] args) {
        String s = "Java Full Stack";
        String[] words = s.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}