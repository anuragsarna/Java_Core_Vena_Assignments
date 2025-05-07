import java.util.Arrays;
import java.util.List;

public class Question28 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int product = numbers.stream()
                                .filter(x -> x % 2 == 0)
                                .reduce(1,(x,y) -> x * y);

        System.out.println(product);

    }
}
