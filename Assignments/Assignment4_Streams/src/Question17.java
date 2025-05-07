import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question17 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean, List<Integer>> partitioned = nums.stream()
                                                      .collect(Collectors.partitioningBy(x-> x % 2 == 0));

        System.out.println("Even Numbers : " + partitioned.get(true));
        System.out.println("Even Numbers : " + partitioned.get(false));

    }
}
