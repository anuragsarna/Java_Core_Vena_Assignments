import java.util.Arrays;
import java.util.List;

public class Question11 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Samiksha" , "Anurag" , "Sanjana" , "Priyanshee");
        List<String> filteredNames = names.stream().map(String::toLowerCase).filter(x -> x.startsWith("s")).toList();
        System.out.println(filteredNames);
    }
}
