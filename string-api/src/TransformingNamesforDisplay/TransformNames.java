package TransformingNamesforDisplay;

import java.util.*;

public class TransformNames {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Rohit",
                "Amit",
                "Priya",
                "Neha"
        );

        names.stream()
                .map(String::toUpperCase)  // convert to uppercase
                .sorted()                 // alphabetical order
                .forEach(System.out::println);
    }
}
