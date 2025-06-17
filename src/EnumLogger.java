public enum EnumLogger {
    INSTANCE;

    public void log(String message) {
        System.out.println("[ENUM LOG]: " + message);
    }
}