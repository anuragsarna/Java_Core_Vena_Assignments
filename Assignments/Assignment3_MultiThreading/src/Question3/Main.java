package Question3;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        NumberPrinter printer = new NumberPrinter();

        Thread odd = new OddThread(printer);
        Thread even = new EvenThread(printer);

        odd.start();
        even.start();

        try {
            odd.join();
            even.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        long endTime = System.currentTimeMillis();

        long executionTime = (endTime - startTime);
        System.out.println("\nTotal execution time: " + executionTime + " ms");
    }
}
