interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}


public class Question29 {
    public static void main(String[] args) {
        // A TriFunction that adds three integers
        TriFunction<Integer, Integer, Integer, Integer> sumThree = (a, b, c) -> a + b + c;

        int result = sumThree.apply(10, 20, 30);
        System.out.println("Sum: " + result);  // Output: Sum: 60
    }
}

