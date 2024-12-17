class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try {
            try {
                throw new InvalidAgeException("Age cannot be negative");
            } catch (InvalidAgeException e) {
                ArithmeticException ex = new ArithmeticException("Arithmetic error caused by invalid age");
                ex.initCause(e); // Chaining the InvalidAgeException to ArithmeticException
                throw ex;  // Throwing the chained exception
            }
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e);
            System.out.println("Caused by: " + e.getCause());
        }
    }
}

