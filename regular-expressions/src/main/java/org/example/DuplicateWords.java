package org.example;

import java.util.regex.*;

public class DuplicateWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        String regex = "\\b(\\w+)\\s+\\1\\b";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.print(m.group(1) + ", ");
        }
    }
}
