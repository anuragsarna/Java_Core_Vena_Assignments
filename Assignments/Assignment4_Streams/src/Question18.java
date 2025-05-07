import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question18 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Samiksha" , "Anurag" , "Sanjana" , "Priyanshee", "Aryan");
        String result = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println(result);

    }
}
