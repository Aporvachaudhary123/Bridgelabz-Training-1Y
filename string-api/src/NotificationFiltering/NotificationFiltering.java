package NotificationFiltering;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFiltering {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("Heart rate high", "CRITICAL"),
                new Alert("Medicine time", "REMINDER"),
                new Alert("Low battery", "INFO"),
                new Alert("Blood pressure low", "CRITICAL")
        );

        // User preference: show only CRITICAL alerts
        Predicate<Alert> criticalOnly = a -> a.type.equals("CRITICAL");

        alerts.stream()
                .filter(criticalOnly)
                .forEach(System.out::println);
    }
}
