import java.util.function.Function;

public class Question2 {
    public static void main(String[] args) {
        Function<String,Integer> lengthOfaString = (name) -> name.length();
        System.out.println(lengthOfaString.apply("Anurag Sarna"));
    }
}
