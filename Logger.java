public interface Logger {
    void logMessage(LogLevel level, String message);
    void setNextLogger(Logger nextLogger);
}