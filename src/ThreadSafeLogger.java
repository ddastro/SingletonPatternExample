public class ThreadSafeLogger {
    private static ThreadSafeLogger instance;

    private ThreadSafeLogger() {
        System.out.println("ThreadSafeLogger instance created");
    }

    public static synchronized ThreadSafeLogger getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLogger();
        }
        return instance;
    }

    public void log(String msg) {
        System.out.println("[THREAD-SAFE LOG]: " + msg);
    }
}