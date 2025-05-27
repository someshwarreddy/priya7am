import java.util.Scanner;

public class SafeUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age = 0;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        boolean validAge = true;
        while (validAge) {
            System.out.print("Enter your age: ");
            try {
                age = Integer.parseInt(scanner.nextLine()); // Try to parse age
                validAge = false;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for age.");
            }
        }

        System.out.println("Hello " + name + ", you are " + age + " years old!");

        scanner.close();
    }
}
