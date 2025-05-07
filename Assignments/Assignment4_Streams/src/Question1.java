import java.util.function.Predicate;

public class Question1 {
    public static void main(String[] args) {
        Predicate<String> startsWithA = x -> x.startsWith("A");
        System.out.println(startsWithA.test("Anurag"));
    }
}
