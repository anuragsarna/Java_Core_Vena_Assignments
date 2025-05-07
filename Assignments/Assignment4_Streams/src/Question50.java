import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Question50 {
    public static void main(String[] args) {
        // Create LocalDate instances for specific dates
        LocalDate date1 = LocalDate.of(2023, Month.FEBRUARY, 15); // Year, Month, Day
        LocalDate date2 = LocalDate.of(2023, Month.FEBRUARY, 10);
        LocalDate date3 = LocalDate.of(2023, Month.MARCH, 5);
        LocalDate date4 = LocalDate.of(2023, Month.APRIL, 18);

        // Sample list of purchases (id, totalAmount, date)
        List<Purchase> purchases = Arrays.asList(
                new Purchase("P1", 100.50, date1),
                new Purchase("P2", 150.75, date2),
                new Purchase("P3", 200.00, date3),
                new Purchase("P4", 75.25, date4)
        );

        // Define the date range for filtering
        LocalDate startDate = LocalDate.of(2023, Month.FEBRUARY, 1);
        LocalDate endDate = LocalDate.of(2023, Month.MARCH, 31);

        // Chain operations: filter by date, map to totalAmount, sum all totals
        double totalAmountInRange = purchases.stream()
                .filter(purchase -> !purchase.getDate().isBefore(startDate) && !purchase.getDate().isAfter(endDate))  // Filter by date range
                .mapToDouble(Purchase::getTotalAmount)  // Map to total amount
                .sum();  // Sum all totals

        // Print the result
        System.out.println("Total amount of purchases within the date range: " + totalAmountInRange);
    }
}

class Purchase {
    private String id;
    private double totalAmount;
    private LocalDate date;

    public Purchase(String id, double totalAmount, LocalDate date) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public LocalDate getDate() {
        return date;
    }
}
