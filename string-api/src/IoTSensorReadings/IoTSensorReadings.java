package IoTSensorReadings;

import java.util.*;

public class IoTSensorReadings {
    public static void main(String[] args) {

        List<Integer> readings = Arrays.asList(
                45, 60, 72, 30, 85, 55, 90
        );

        int threshold = 60;

        readings.stream()
                .filter(r -> r > threshold)   // only values above threshold
                .forEach(System.out::println);
    }
}