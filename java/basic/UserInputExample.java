import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read user input

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read integer input

        System.out.println("Hello " + name + ", you are " + age + " years old!");

        scanner.close(); // Close the scanner
    }
}

