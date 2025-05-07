import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Question33 {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(4, 5, 6, 7),
                Arrays.asList(8, 2, 10)
        );

        List<Integer> evenDistinct = listOfLists.stream()
                .flatMap(Collection::stream)
                .filter(n -> n % 2 == 0)
                .distinct()
                .toList();

        System.out.println(evenDistinct);
    }
}
