public class DataTypesDemo {
    public static void main(String[] args) {

        // Primitive Data Types
        byte myByte = 10;
        short myShort = 1000;
        int myInt = 100000;
        long myLong = 10000000000L;

        float myFloat = 5.75f;
        double myDouble = 19.99;

        char myChar = 'A';
        boolean myBoolean = true;

        // Printing primitive types
        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);

        // Reference (Non-Primitive) Data Types
        String myString = "Hello, Java!";
        int[] myArray = {1, 2, 3, 4, 5};

        System.out.println("\nReference Data Types:");
        System.out.println("String: " + myString);
        System.out.print("Array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}

