import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Question27 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "grape");

        OptionalDouble averageLength = words.stream()
                .mapToInt(String::length)
                .average();


        double result = averageLength.orElse(0.0);
        System.out.println("Average length: " + result);
    }
}
