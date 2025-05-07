import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question19 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,6,14,32,67,85,98,100,43);
        int i = nums.stream().filter(x -> x % 5 == 0).findFirst().orElse(-1);
        System.out.println(i);
    }
}
