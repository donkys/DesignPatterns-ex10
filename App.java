public class App {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();
        Logger errorLogger = new ErrorLogger();

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        Logger loggerChain = errorLogger;

        loggerChain.logMessage(LogLevel.INFO, "This is an information.");
        System.out.println("----------------");
        loggerChain.logMessage(LogLevel.DEBUG, "This is a debug information.");
        System.out.println("----------------");
        loggerChain.logMessage(LogLevel.ERROR, "This is an error information.");
    }
}