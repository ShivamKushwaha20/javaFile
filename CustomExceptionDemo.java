// Custom exception class TimeException
class TimeException extends Exception {
    TimeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    // Method to check if the given time is valid (hh:mm format)
    static void checkTime(String time) throws TimeException {
        if (!time.matches("\\d{2}:\\d{2}")) {
            throw new TimeException("Invalid time format. Please use hh:mm format.");
        }
    }

    public static void main(String[] args) {
        String inputTime = "12:30"; // Valid time
        try {
            checkTime(inputTime);
            System.out.println("Time is valid: " + inputTime);
        } catch (TimeException ex) {
            System.out.println("Caught TimeException: " + ex.getMessage());
        }
    }
}
