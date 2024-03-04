public class ErrorLogger implements Logger {
    private Logger nextLogger;

    @Override
    public void logMessage(LogLevel level, String message) {
        if (level == LogLevel.ERROR) {
            System.out.println("Error Console::Logger: " + message);
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