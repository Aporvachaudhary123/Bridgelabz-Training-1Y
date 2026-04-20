package org.example;

public class ValidateCard {
    public static void main(String[] args) {
        String card = "4123456789012345";

        String regex = "^(4\\d{15}|5\\d{15})$";

        if (card.matches(regex)) {
            System.out.println("Valid Card");
        } else {
            System.out.println("Invalid Card");
        }
    }
}
