import java.util.Arrays;
import java.util.List;

public class Question9 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Samiksha","Yogini","Anurag","Kiara","Bhavesh");
        List<String> uppercaseNames = names.stream().map(x -> x.toUpperCase()).toList();
        System.out.println(uppercaseNames);
    }
}
