public class WrappertoPrimitiveConversion {
        public static void main(String[] args) {
            Double doubleObject = 45.67;

            double primitiveDouble = doubleObject;
            int intValue = (int) primitiveDouble;

            System.out.println("Double object: " + doubleObject);
            System.out.println("Primitive double: " + primitiveDouble);
            System.out.println("Converted int: " + intValue);
        }
    }

