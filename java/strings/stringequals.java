package strings;

public class stringequals {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Hello, World!";
        String str3 = new String("Hello, World!");

        // Using equals method which compares the content(values or literals) of the strings
        // This is a simple Java program to demonstrate the use of equals method for string comparison
        System.out.println("Using equals:");
        System.out.println("str1 equals str2: " + str1.equals(str2)); // true
        System.out.println("str1 equals str3: " + str1.equals(str3)); // true

        // Using == operator
        System.out.println("\nUsing == operator:");
        System.out.println("str1 == str2: " + (str1 == str2)); // true, because both refer to the same string literal
        System.out.println("str1 == str3: " + (str1 == str3)); // false, because str3 is a new object in heap memory

        // Using equalsIgnoreCase method
        String str4 = "hello, world!";
        System.out.println("\nUsing equalsIgnoreCase:");
        System.out.println("str1 equalsIgnoreCase str4: " + str1.equalsIgnoreCase(str4)); // true
    }
}
