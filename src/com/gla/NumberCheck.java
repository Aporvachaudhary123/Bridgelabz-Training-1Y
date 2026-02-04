import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Define an integer array of 5 elements
        int[] arr = new int[5];

        // Take user input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // b & c. Loop through the array and check conditions
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                System.out.print(arr[i] + " is Positive and
