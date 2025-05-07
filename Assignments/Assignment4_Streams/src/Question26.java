import java.util.Arrays;
import java.util.List;

public class Question26 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,6,43,14,32,67,2,85,98,6,100,100,43);
        List<Integer> result = nums.stream().distinct().toList();
        System.out.println(result);
    }
}
