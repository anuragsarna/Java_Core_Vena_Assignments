import java.util.Arrays;
import java.util.List;

public class Question12 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Samiksha" , "Anurag" , "Sanjana" , "Priyanshee");
        String longest = names.stream()
                                .reduce((s1, s2) -> s1.length() >= s2.length() ? s1 : s2)
                                .orElse("");
        System.out.println(longest);

    }
}
