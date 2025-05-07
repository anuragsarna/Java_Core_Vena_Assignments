import java.util.*;
import java.util.function.Predicate;

public class Question52 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        Predicate<String> startsWithA = name -> name.startsWith("A");

        filterAndLog(names, startsWithA);
    }

    public static <T> void filterAndLog(List<T> list, Predicate<T> predicate) {
        list.stream()
                .filter(predicate)
                .forEach(item ->
                        System.out.println(item));
    }
}
