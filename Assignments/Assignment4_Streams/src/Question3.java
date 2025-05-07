import java.util.function.Consumer;

public class Question3 {
    public static void main(String[] args) {
        Consumer<String> stringInUppercase = x -> System.out.println(x.toUpperCase());
        stringInUppercase.accept("Anurag Sarna");
    }
}
