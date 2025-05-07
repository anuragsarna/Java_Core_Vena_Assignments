import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.net.URI;
import java.net.URISyntaxException;

public class Question49 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList(
                "https://www.example.com",
                "invalid-url",
                "ftp://ftp.example.com",
                "http://www.google.com",
                "htp://wrongprotocol.com"
        );

        Predicate<String> isValidURL = url -> {
            try {
                new URI(url);
                return true;
            } catch (URISyntaxException e) {
                return false;
            }
        };

        List<String> validUrls = urls.stream()
                .filter(isValidURL)
                .collect(Collectors.toList());

        validUrls.forEach(System.out::println);
    }
}
