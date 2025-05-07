import java.util.function.Function;

public class Question41 {
    public static void main(String[] args) {
        Function<String, String> trim = s -> s.trim();
        Function<String, String> toLower = s -> s.toLowerCase();
        Function<String, String> removePunctuation = s -> s.replaceAll("\\p{Punct}", "");

        Function<String, String> cleanPipeline = trim
                .andThen(toLower)
                .andThen(removePunctuation);

        String input = "  Hello, World!!!  ";
        String result = cleanPipeline.apply(input);

        System.out.println(result);
    }
}
