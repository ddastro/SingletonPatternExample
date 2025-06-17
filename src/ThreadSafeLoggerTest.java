public class ThreadSafeLoggerTest {
    public static void main(String[] args) {
        ThreadSafeLogger logger1 = ThreadSafeLogger.getInstance();
        ThreadSafeLogger logger2 = ThreadSafeLogger.getInstance();

        logger1.log("First thread-safe log");
        logger2.log("Second thread-safe log");

        if (logger1 == logger2) {
            System.out.println("Both instances are the same (Thread-Safe Singleton).");
        }
    }
}