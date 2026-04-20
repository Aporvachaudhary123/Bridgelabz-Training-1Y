package org.example;

import java.util.regex.*;

public class ExtractCurrency {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        String regex = "(\\$\\d+\\.\\d{2}|\\b\\d+\\.\\d{2}\\b)";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.print(m.group() + ", ");
        }
    }
}
