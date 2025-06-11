package source;

import java.util.Scanner;

// Custom Exception for Under Age
class UnderAgeException extends Exception {
    @Override
    public String getMessage() {
        return "You are under age! Not eligible.";
    }
}

// Custom Exception for Over Age
class OverAgeException extends Exception {
    @Override
    public String getMessage() {
        return "You are over age! Not eligible.";
    }
}

// Applicant Class
class Applicant {
    private int age;

    public void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age:");
        age = scan.nextInt();
    }

    public void validate() throws UnderAgeException, OverAgeException {
        if (age >= 18 && age <= 60) {
            System.out.println("Collect your License");
        } else if (age < 18) {
            UnderAgeException uae = new UnderAgeException();
            System.out.println(uae.getMessage());
            throw uae;
        } else {
            OverAgeException oae = new OverAgeException();
            System.out.println(oae.getMessage());
            throw oae;
        }
    }
}

// RTO Class
class RTO {
    public void acceptApplicant() {
        Applicant a = new Applicant();

        try {
            a.acceptInput();
            a.validate();
        } catch (Exception e) {
            try {
                System.out.println("Re-attempting...");
                a.acceptInput();  // fixed typo from acceptOnput
                a.validate();
            } catch (Exception f) {
                System.out.println("Apply again in 15 days.");
            }
        }
    }
}

// Main class
public class CustomExceptionRTO {
    public static void main(String[] args) {
        RTO r = new RTO();
        r.acceptApplicant(); // fixed method name
    }
}
