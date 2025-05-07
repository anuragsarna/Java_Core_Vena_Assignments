import java.util.Arrays;
import java.util.List;

public class Question5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Samiksha","Yogini","Anurag","Kiara","Bhavesh");
        names.sort(String::compareTo);
        System.out.println(names);
    }
}
