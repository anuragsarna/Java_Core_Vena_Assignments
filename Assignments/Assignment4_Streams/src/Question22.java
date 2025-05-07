import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question22 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Samiksha" , "Anurag" , "Sanjana" , "Priyanshee", "Aryan");
        Map<String, Integer> wordLengthMap = getWordLengthMap(names);
        System.out.println(wordLengthMap);
    }

    private static Map<String, Integer> getWordLengthMap(List<String> names) {
        return names.stream().collect(Collectors.toMap(word -> word,word -> word.length()));
    }
}
