import java.util.*;
public class WrapperConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int primitiveInt = sc.nextInt();
        Integer integerObject = Integer.valueOf(primitiveInt);

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Integer object: " + integerObject);

        Double doubleObject = 45.67;

        double primitiveDouble = doubleObject;
        int intValue = (int) primitiveDouble;

        System.out.println("Double object: " + doubleObject);
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Converted int: " + intValue);
    }
}
