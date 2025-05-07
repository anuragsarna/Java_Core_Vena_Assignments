import java.util.Arrays;
import java.util.List;

public class Question15 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Samiksha" , "Anurag" , "Sanjana" , "Priyanshee","Aryan");
        List<Integer> length = names.stream().map(x -> x.length()).toList();
        System.out.println(length);
    }
}
