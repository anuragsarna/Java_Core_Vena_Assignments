import java.util.Arrays;
import java.util.List;

public class Question10 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram","Yogini","Anurag","Kiara","Bhavesh");
        List<String> names2 = names.stream().filter(x -> x.length() > 4).toList();
        System.out.println(names2);
    }
}
