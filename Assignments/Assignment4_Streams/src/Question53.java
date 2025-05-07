import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Question53 {
    public static void main(String[] args) {
        // List of LocalDate objects
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2023, 1, 1),
                LocalDate.of(2021, 3, 10),
                LocalDate.of(2022, 8, 15),
                LocalDate.of(2025, 7, 20)
        );

        Optional<LocalDate> earliestDate = findEarliestDate(dates);
        Optional<LocalDate> latestDate = findLatestDate(dates);

        earliestDate.ifPresent(date -> System.out.println("Earliest Date: " + date));
        latestDate.ifPresent(date -> System.out.println("Latest Date: " + date));
    }

    public static Optional<LocalDate> findEarliestDate(List<LocalDate> dates) {
        return dates.stream()
                .min(Comparator.naturalOrder());
    }

    public static Optional<LocalDate> findLatestDate(List<LocalDate> dates) {
        return dates.stream()
                .max(Comparator.naturalOrder());
    }
}
