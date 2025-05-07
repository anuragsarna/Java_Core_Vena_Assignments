import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Question21 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,6,43,14,32,67,2,85,98,6,100,100,43);
        Set<Integer> numSet = nums.stream().collect(Collectors.toSet());
        System.out.println(numSet);
    }
}
