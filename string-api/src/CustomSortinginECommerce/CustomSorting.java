package CustomSortinginECommerce;

import java.util.*;

public class CustomSorting {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", 70000, 4.5, 10),
                new Product("Mobile", 30000, 4.7, 20),
                new Product("Watch", 5000, 4.6, 15),
                new Product("Headphones", 2000, 4.3, 30)
        );

        // Sort by Price
        products.sort((a, b) -> Double.compare(a.price, b.price));
        System.out.println("Sort by Price:");
        products.forEach(System.out::println);

        // Sort by Rating
        products.sort((a, b) -> Double.compare(b.rating, a.rating));
        System.out.println("\nSort by Rating:");
        products.forEach(System.out::println);

        // Sort by Discount
        products.sort((a, b) -> Double.compare(b.discount, a.discount));
        System.out.println("\nSort by Discount:");
        products.forEach(System.out::println);
    }
}