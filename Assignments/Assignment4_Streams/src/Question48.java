import java.util.*;
import java.util.stream.Collectors;

public class Question48 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E");

        Optional<String> thirdElement = getThirdElement(list);

        thirdElement.ifPresentOrElse(
                element -> System.out.println("Third element: " + element),
                () -> System.out.println("Third element not found")
        );
    }

    public static <T> Optional<T> getThirdElement(List<T> list) {
        return list.stream()
                .skip(2)
                .findFirst();
    }
}
