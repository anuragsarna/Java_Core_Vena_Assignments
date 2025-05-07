import java.util.function.Supplier;

public class Question4 {
    public static void main(String[] args) {
        Supplier<Double> generatesRandomNumber = () -> (double)Math.random() * 100;
        System.out.println(generatesRandomNumber.get());
    }
}
