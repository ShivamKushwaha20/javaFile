class DatabaseException extends Exception {
    DatabaseException(String message) {
        super(message);
    }
}

class ServiceException extends Exception {
    ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class ExceptionChainingDemo {
    public static void main(String[] args) {
        try {
            // Simulate a database exception
            throw new DatabaseException("Database connection error");
        } catch (DatabaseException dbEx) {
            try {
                // Wrap the database exception in a service exception
                throw new ServiceException("Service error", dbEx);
            } catch (ServiceException serviceEx) {
                // Print the stack trace of the chained exceptions
                System.out.println("Chained exception stack trace:");
                serviceEx.printStackTrace();
            }
        }
    }
}
