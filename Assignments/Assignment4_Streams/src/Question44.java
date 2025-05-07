import java.util.function.Function;

public class Question44 {
    public static void main(String[] args) {
        Function<Integer, Integer> addFive = x -> x + 5;
        Function<Integer, Integer> multiplyByTwo = x -> x * 2;

        Function<Integer, Integer> resultFunction = addFive.andThen(multiplyByTwo);
        Function<Integer, Integer> resultFunction2 = addFive.compose(multiplyByTwo);

        int result = resultFunction.apply(3);
        int result2 = resultFunction2.apply(3);

        System.out.println(result);
        System.out.println(result2);
    }
}
