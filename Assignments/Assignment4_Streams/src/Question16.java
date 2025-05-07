import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question16 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Samiksha" , "Anurag" , "Sanjana" , "Priyanshee","Aryan");
        Map<Character,List<String>> groupedNames = names.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println(groupedNames);
    }
}
