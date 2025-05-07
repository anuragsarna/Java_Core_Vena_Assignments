import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Question6 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> sum = (x,y) -> (x + y);
        System.out.println(sum.apply(5,14));

        //Another Approach
        BinaryOperator<Integer> sum2 = (x , y) -> (x + y);
        System.out.println(sum.apply(5,14));
    }
}
