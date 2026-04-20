package org.example;

public class ValidateSSN {
    public static void main(String[] args) {
        String text = "123-45-6789";

        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        if (text.matches(regex)) {
            System.out.println("Valid SSN");
        } else {
            System.out.println("Invalid SSN");
        }
    }
}
