package Question_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String paragraph = "Given a paragraph, calculate and print: Number of unique words.Frequency of each word. Display words sorted alphabetically.";

        paragraph = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        String[] words = paragraph.split("\\s+");

        Map<String, Integer> wordFrequency = new TreeMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        Set<String> uniqueWords = wordFrequency.keySet();
        System.out.println("Number of unique words: " + uniqueWords.size());

        System.out.print("---------------------------");
        System.out.println("\nWord Frequencies:");
        for (String word : wordFrequency.keySet()) {
            System.out.println(word + ": " + wordFrequency.get(word));
        }

        System.out.print("---------------------------");
        System.out.println("\nWords sorted alphabetically:");
        for (String word : wordFrequency.keySet()) {
            System.out.println(word);
        }
    }
}
