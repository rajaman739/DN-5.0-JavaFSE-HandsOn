package singleton;

public class Logger {

    // Single instance of Logger
    private static Logger instance;

    // Private constructor
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Method to return the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to print log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
