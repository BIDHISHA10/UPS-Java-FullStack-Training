import java.util.HashMap;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> words = new HashMap<>();

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase().trim();

        if (sentence.isEmpty()) {
            System.out.println("Sentence is empty.");
            sc.close();
            return;
        }

        String[] arr = sentence.split("\\s+");

        for (String word : arr) {
            words.put(word, words.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word frequencies: " + words);

        String mostFrequent = "";
        int highestCount = 0;

        for (String word : words.keySet()) {
            if (words.get(word) > highestCount) {
                highestCount = words.get(word);
                mostFrequent = word;
            }
        }

        System.out.println("Most frequent word: " + mostFrequent);
        System.out.println("Frequency: " + highestCount);

        sc.close();
    }
}