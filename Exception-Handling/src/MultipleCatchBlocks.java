import java.util.Scanner;
public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter array size: ");
            int size = scanner.nextInt();
            Integer[] array = new Integer[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + i + ": ");
                array[i] = scanner.nextInt();
            }
            System.out.print("Enter index to retrieve: ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
        scanner.close();
    }
}