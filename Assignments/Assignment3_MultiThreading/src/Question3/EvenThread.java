package Question3;

public class EvenThread extends Thread {
    private final NumberPrinter printer;

    public EvenThread(NumberPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printEven();
    }
}

