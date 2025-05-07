import java.util.Arrays;
import java.util.List;

public class Question20 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        String firstName = names.stream()
                .findFirst()
                .orElse("Default Name");

        System.out.println(firstName);
    }
}


