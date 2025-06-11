package source;

import java.util.Scanner;

// Custom Exception
class InvalidUserException extends Exception {

    // Override getMessage() method to provide custom message
    @Override
    public String getMessage() {
        return "Invalid card details. Try again!";
    }
}
