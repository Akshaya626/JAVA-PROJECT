package log4;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class logDebbuger {
    private static final Logger logger = Logger.getLogger(logDebbuger.class.getName());

    public static void logDebug(String message) {
        logger.log(Level.INFO, message);
    }

    public static void logError(String message, Throwable throwable) {
        logger.log(Level.SEVERE, message, throwable);
    }

    public static void main(String[] args) {
        logDebug("This is a debug message.");
        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the divisor value:");
            int d = scanner.nextInt();
            scanner.close();
            int result = 10 / d;
            logDebug("Result of division: " + result);
        } catch (ArithmeticException e) {
            logError("An error occurred:", e);
        }
    }
}
