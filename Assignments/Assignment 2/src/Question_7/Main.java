package Question_7;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Integer>> movieRatings = new HashMap<>();

        movieRatings.put("Inception", Arrays.asList(5, 4, 5, 4, 5));
        movieRatings.put("The Matrix", Arrays.asList(4, 5, 5, 3));
        movieRatings.put("Interstellar", Arrays.asList(5, 5, 5, 4));
        movieRatings.put("Avatar", Arrays.asList(3, 4, 4, 3));

        Map<String, Double> averageRatings = new HashMap<>();

        for (Map.Entry<String, List<Integer>> entry : movieRatings.entrySet()) {
            String movie = entry.getKey();
            List<Integer> ratings = entry.getValue();
            int sum = 0;
            for (int rating : ratings) {
                sum += rating;
            }
            double average = (double) sum / ratings.size();
            averageRatings.put(movie, average);
        }

        List<Map.Entry<String, Double>> sortedList = new ArrayList<>(averageRatings.entrySet());
        sortedList.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        System.out.println("Movie Ratings (Highest to Lowest):");
        for (Map.Entry<String, Double> entry : sortedList) {
            System.out.printf("%s: %.2f\n", entry.getKey(), entry.getValue());
        }
    }
}

