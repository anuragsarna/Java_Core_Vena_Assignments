package Question4;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ImageProcessor {
    public static void main(String[] args) {
        int numImages = 50;
        int poolSize = 5;
        ExecutorService executor = Executors.newFixedThreadPool(poolSize);

        List<Future<String>> results = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        // Submit 50 image processing tasks
        for (int i = 1; i <= numImages; i++) {
            final int imageId = i;
            Callable<String> task = new Callable<String>() {
                @Override
                public String call() throws Exception {
                    Thread.sleep(100);  // Simulate processing time
                    return "Image " + imageId + " processed";
                }
            };
            results.add(executor.submit(task));
        }

        // Retrieve and print results in order
        for (Future<String> future : results) {
            try {
                System.out.println(future.get());  // Blocks until result is available
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total Execution Time: " + (endTime - startTime) + " ms");

        executor.shutdown();
    }
}

