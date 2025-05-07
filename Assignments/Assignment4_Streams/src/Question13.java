import java.util.Arrays;
import java.util.List;

public class Question13 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> descNums = nums.stream().sorted((o1, o2) -> o2 - o1).toList();
        System.out.println(descNums);
    }
}
