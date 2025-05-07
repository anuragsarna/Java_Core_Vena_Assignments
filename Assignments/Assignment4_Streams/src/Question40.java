import java.util.*;
import java.util.stream.Collectors;

public class Question40 {
    public static void main(String[] args) {
        String csv = "1,2,3,4";

        List<Integer> numbers = Arrays.stream(csv.split(","))
                .map(Integer::parseInt)
                .toList();

        System.out.println(numbers);
    }
}
