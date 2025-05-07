import java.util.*;
import java.util.stream.Collectors;

public class Question54 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "apple", "banana", "kiwi", "watermelon", "grapefruit", "orange", "pear"
        );

        List<String> top3longestStrings = getTop3LongestStrings(strings);

        System.out.println("Top 3 Longest Strings : " + top3longestStrings);
    }

    public static List<String> getTop3LongestStrings(List<String> strings) {
        return strings.stream()
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                .limit(3)
                .collect(Collectors.toList());
    }
}
