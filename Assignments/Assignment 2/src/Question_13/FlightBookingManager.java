package Question_13;

import java.util.*;

public class FlightBookingManager {
    private int totalSeats;
    private int nextAvailableSeat;
    private Queue<String> bookingQueue;
    private Map<String, Integer> confirmedBookings;

    public FlightBookingManager(int totalSeats) {
        this.totalSeats = totalSeats;
        this.nextAvailableSeat = 1;
        this.bookingQueue = new LinkedList<>();
        this.confirmedBookings = new HashMap<>();
    }

    // Request a booking (add to queue)
    public void requestBooking(String passengerId) {
        bookingQueue.offer(passengerId);
        System.out.println("Booking requested for " + passengerId);
    }

    // Process booking requests in FIFO and assign seat numbers
    public void processBookings() {
        while (!bookingQueue.isEmpty() && nextAvailableSeat <= totalSeats) {
            String passengerId = bookingQueue.poll();
            confirmedBookings.put(passengerId, nextAvailableSeat);
            System.out.println("Confirmed " + passengerId + " for seat " + nextAvailableSeat);
            nextAvailableSeat++;
        }
    }

    // Display confirmed bookings
    public void printConfirmedBookings() {
        System.out.println("\nFinal Confirmed Bookings:");
        for (Map.Entry<String, Integer> entry : confirmedBookings.entrySet()) {
            System.out.println("Passenger: " + entry.getKey() + ", Seat: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        FlightBookingManager manager = new FlightBookingManager(3);

        manager.requestBooking("Alice");
        manager.requestBooking("Bob");
        manager.requestBooking("Charlie");
        manager.requestBooking("David");

        manager.processBookings();
        manager.printConfirmedBookings();
    }
}

