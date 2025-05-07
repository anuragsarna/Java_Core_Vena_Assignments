import java.util.Arrays;
import java.util.List;

public class Question14 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> squaredNums = nums.stream().map(x -> x * x).toList();
        System.out.println(squaredNums);
    }
}
