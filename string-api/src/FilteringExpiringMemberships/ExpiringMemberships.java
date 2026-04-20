package FilteringExpiringMemberships;

import java.util.*;
import java.time.LocalDate;

public class ExpiringMemberships {
    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
                new Member("Amit", LocalDate.now().plusDays(10)),
                new Member("Neha", LocalDate.now().plusDays(40)),
                new Member("Rohit", LocalDate.now().plusDays(25)),
                new Member("Priya", LocalDate.now().plusDays(5))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        members.stream()
                .filter(m -> !m.expiryDate.isBefore(today) &&
                        !m.expiryDate.isAfter(next30Days))
                .forEach(System.out::println);
    }
}