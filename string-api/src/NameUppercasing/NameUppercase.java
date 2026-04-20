package NameUppercasing;
import java.util.*;
import java.util.stream.*;

public class NameUppercase {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Amit",
                "Neha",
                "Rohit",
                "Priya"
        );

        names.stream()
                .map(String::toUpperCase)   // method reference
                .forEach(System.out::println);
    }
}
