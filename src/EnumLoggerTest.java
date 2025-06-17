public class EnumLoggerTest {
    public static void main(String[] args) {
        EnumLogger logger1 = EnumLogger.INSTANCE;
        EnumLogger logger2 = EnumLogger.INSTANCE;

        logger1.log("Log message from EnumLogger");
        logger2.log("Another message");

        if (logger1 == logger2) {
            System.out.println("EnumLogger is a singleton (recommended way).");
        }
    }
}