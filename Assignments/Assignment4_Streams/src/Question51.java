import java.util.*;
import java.util.stream.Collectors;

public class Question51 {
    public static void main(String[] args) {
        String paragraph = "Hello world! This is a test. Hello world world.";

        Map<String, Long> wordFrequency = analyzeText(paragraph);

        wordFrequency.forEach((word, frequency) -> {
            System.out.println(word + " → " + frequency);
        });
    }

    public static Map<String, Long> analyzeText(String paragraph) {

        return Arrays.stream(paragraph.split("\\W+"))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
    }
}
