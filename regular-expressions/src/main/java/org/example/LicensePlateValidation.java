package org.example;


public class LicensePlateValidation {
    public static void main(String[] args) {
        String plate = "AB1234";

        String regex = "^[A-Z]{2}[0-9]{4}$";

        if (plate.matches(regex)) {
            System.out.println("Valid License Plate");
        } else {
            System.out.println("Invalid License Plate");
        }
    }
}