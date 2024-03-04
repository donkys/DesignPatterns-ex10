public class ConsoleLogger implements Logger {
    private Logger nextLogger;

    @Override
    public void logMessage(LogLevel level, String message) {
        if (level == LogLevel.INFO || level == LogLevel.DEBUG || level == LogLevel.ERROR) {
            System.out.println("Standard Console::Logger: " + message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    @Override
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
}