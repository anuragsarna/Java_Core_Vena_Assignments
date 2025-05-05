package Question1;

import java.util.concurrent.*;
import java.text.*;
import java.util.*;

public class Logger {
    private final BlockingQueue<String> logQueue = new LinkedBlockingQueue<>();
    private boolean isShutDown = false;
    private final boolean useFileLogging; // Flag to use file logging

    public enum LogLevel {
        INFO, WARN, ERROR
    }

    public Logger(boolean useFileLogging) {
        this.useFileLogging = useFileLogging;

        // Start a thread that flushes logs from the queue
        Thread logThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!isShutDown || !logQueue.isEmpty()) {
                    try {
                        String message = logQueue.take();  // Take a message from the queue
                        flushLog(message);  // Flush the log message
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });
        logThread.start();

        // Periodically flush logs every 5 seconds
        Thread periodicFlushThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!isShutDown) {
                    try {
                        Thread.sleep(5000);  // Wait for 5 seconds
                        flushRemainingLogs();  // Flush remaining logs
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });
        periodicFlushThread.start();
    }

    // Method to log a message
    public void log(String message, LogLevel level) {
        if (!isShutDown) {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String logMessage = String.format("[%s] [%s] %s", timestamp, level, message);
            try {
                logQueue.put(logMessage);  // Add message to queue (may block)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Method to flush log to console or file
    private void flushLog(String message) {
        if (useFileLogging) {
            // Simulating writing to a file
            System.out.println("Writing to file: " + message);
        } else {
            // Print to console
            System.out.println(message);
        }
    }

    // Method to flush all remaining logs
    private void flushRemainingLogs() {
        while (!logQueue.isEmpty()) {
            try {
                String message = logQueue.take();
                flushLog(message);  // Flush each log message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Graceful shutdown
    public void shutdown() {
        isShutDown = true;
    }

    // Main method to simulate logging
    public static void main(String[] args) {
        Logger logger = new Logger(false);  // Use console logging (true for file logging)

        // Simulating 100 threads logging 100 messages each
        for (int i = 0; i < 100; i++) {
            final int threadId = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100; j++) {
                        LogLevel level;
                        if (j % 3 == 0) {
                            level = LogLevel.INFO;
                        } else if (j % 3 == 1) {
                            level = LogLevel.WARN;
                        } else {
                            level = LogLevel.ERROR;
                        }
                        logger.log("Log message " + (threadId * 100 + j), level);

                    }
                }
            }).start();
        }

        try {
            Thread.sleep(10000); // Wait for 10 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        logger.shutdown();
    }
}

