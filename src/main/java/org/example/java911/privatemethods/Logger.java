package org.example.java911.privatemethods;

public interface Logger {
    // Public default method using a private method
    default void logInfo(String message) {
        log(message, "INFO");
    }

    default void logError(String message) {
        log(message, "ERROR");
    }

    // Private helper method (cannot be accessed outside)
    private void log(String message, String level) {
        System.out.println(level + ": " + message);
    }

    // Private static method for utility purposes
    private static void logTimestamp() {
        System.out.println("Timestamp: " + System.currentTimeMillis());
    }

    // Public static method using private static method
    static void logDebug(String message) {
        logTimestamp();
        System.out.println("DEBUG: " + message);
    }
}
class PrivateMethodDemo {
    public static void main(String[] args) {
        Logger logger = new Logger() {}; // Anonymous class since interfaces can't be instantiated
        logger.logInfo("Application started");  // INFO: Application started
        logger.logError("An error occurred");   // ERROR: An error occurred

        Logger.logDebug("Debugging mode");      // Includes timestamp
    }
}