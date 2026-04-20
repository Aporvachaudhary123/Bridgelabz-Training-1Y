package EventAttendeeWelcomeMessage;

import java.util.*;

public class EventWelcome {
    public static void main(String[] args) {

        List<String> attendees = Arrays.asList(
                "Amit",
                "Neha",
                "Rohit",
                "Priya"
        );

        attendees.forEach(name ->
                System.out.println("Welcome " + name + " to the Event!")
        );
    }
}