import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input length and breadth
        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        // Perimeter formula
        double perimeter = 2 * (length + breadth);

        // Output
        System.out.println("Perimeter of rectangle = " + perimeter);

        sc.close();
    }
}
