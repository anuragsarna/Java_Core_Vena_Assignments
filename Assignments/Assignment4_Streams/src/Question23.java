import java.util.function.Function;

public class Question23 {
    public static void main(String[] args) {
        Function<String, String> toUpperCase = str -> str.toUpperCase();

        Function<String, String> appendExclamation = str -> str + "!";

        Function<String, String> combinedFunction = appendExclamation.andThen(toUpperCase);

        String result = combinedFunction.apply("hello");

        System.out.println(result);
    }
}
