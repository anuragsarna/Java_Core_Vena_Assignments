package Question3;

public class NumberPrinter {
    private int number = 1;
    private final int MAX = 100;

    public synchronized void printOdd() {
        while (number <= MAX) {
            if (number % 2 == 1) {
                System.out.print(number + " ");
                number++;
                notify(); // Notify even thread
            } else {
                try {
                    wait(); // Wait until it's this thread's turn
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        notify(); // Avoid deadlock at end
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
                number++;
                notify(); // Notify odd thread
            } else {
                try {
                    wait(); // Wait until it's this thread's turn
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        notify(); // Avoid deadlock at end
    }
}

