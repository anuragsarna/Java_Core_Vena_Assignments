import java.util.function.Function;

public class Question42 {
    public static void main(String[] args) {
        Function<String,Integer> stringParsing = Integer::parseInt;
        Function<Integer,Integer> doubleIt = x -> 2 * x;

        Function<String,Integer> process = stringParsing.andThen(doubleIt);
        int result = process.apply("26");

        System.out.println(result);
    }
}
