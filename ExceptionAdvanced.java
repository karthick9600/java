package source;


class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class ExceptionAdvanced {

    static void validate(int age) throws MyException {
        if (age < 18)
            throw new MyException("Not eligible to vote");
        else
            System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        try {
            validate(16);  // Try changing to 20 to test both cases
        } catch (MyException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Validation complete");
        }
    }
}
