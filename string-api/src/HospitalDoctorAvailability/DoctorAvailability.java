package HospitalDoctorAvailability;

import java.util.*;

public class DoctorAvailability {
    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Amit", "Cardiology", true),
                new Doctor("Dr. Neha", "Neurology", false),
                new Doctor("Dr. Ravi", "Orthopedic", true),
                new Doctor("Dr. Priya", "Dermatology", true)
        );

        doctors.stream()
                .filter(d -> d.weekendAvailable)   // available on weekends
                .sorted((d1, d2) -> d1.specialty.compareTo(d2.specialty)) // sort by specialty
                .forEach(System.out::println);
    }
}