import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question43 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Function<Integer, Integer> squareFunction = x -> x * x;

        List<Integer> squaredNumbers = applyFunctionToList(numbers, squareFunction);

        System.out.println(squaredNumbers);

    }

    public static <T, R> List<R> applyFunctionToList(List<T> list, Function<T, R> function) {
        return list.stream()
                .map(function)
                .collect(Collectors.toList());
    }
}
