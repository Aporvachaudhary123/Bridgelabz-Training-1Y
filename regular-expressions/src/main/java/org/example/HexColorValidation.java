package org.example;
public class HexColorValidation {
    public static void main(String[] args) {
        String color = "#FFA500";

        String regex = "^#[0-9A-Fa-f]{6}$";

        if (color.matches(regex)) {
            System.out.println("Valid Hex Color");
        } else {
            System.out.println("Invalid Hex Color");
        }
    }
}

