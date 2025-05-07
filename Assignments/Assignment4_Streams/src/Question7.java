public class Question7 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> System.out.println("Hello Functional Java");

        Thread thread1 = new Thread(runnable);
        thread1.start();
        thread1.join();
    }
}
