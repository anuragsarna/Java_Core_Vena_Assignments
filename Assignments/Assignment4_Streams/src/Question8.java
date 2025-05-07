import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question8 {
    public static void main(String[] args) {
        List<Integer> evenNos = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> stream = evenNos.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(stream);

    }
}
