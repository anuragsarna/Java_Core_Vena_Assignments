import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question24 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,6,14,32,67,85,98,100,43);
        List<Integer> result = nums.stream()
                                    .filter(x -> x % 2 == 0)
                                    .map(x -> x * x)
                                    .sorted((o1, o2) -> o1 - o2)
                                    .collect(Collectors.toList());

        System.out.println(result);
    }
}
