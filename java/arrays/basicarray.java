package arrays;

import java.util.Scanner;

// import java.util.Scanner.*; // Import the Scanner class for user input
public class basicarray {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[5]; // Declare and initialize an array of integers with size 5
        int[] numbers2 = { 1, 2, 3, 4 }; // Another way to declare and initialize an array of integers with size 5
        System.out.println("Array length: " + numbers2.length); // Print the length of the array
        System.out.println("Array length: " + numbers.length); // Print the length of the array
        System.out.println("Array elements before initialization:" + numbers[0] + ", " + numbers[1] + ", " + numbers[2]
                + ", " + numbers[3] + ", " + numbers[4]);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
            System.out.println(numbers[i]);
        }

        System.out.println("Array elements after initialization: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]
                + ", " + numbers[3] + ", " + numbers[4]);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // Calculate the sum of the array elements
        }
        System.out.println("Sum of array elements: " + sum); // Print the sum of the array elements

        // Prompt the user to enter the size of the array they want to create
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        System.out.println("Enter the size of the array you want to create: ");

        int size = scanner.nextInt(); // Specify the size of the array

        int[] myArray = createArray(size); // Create an array of specified size
        printArray(myArray); // Print the elements of the array

        scanner.close(); // Close the scanner to prevent resource leaks
        System.out.println("Array created and printed successfully.");

    }

    public static int[] createArray(int size) {
        return new int[size]; // Method to create and return an array of specified size
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i; // Initialize the array elements with multiples of 3
            System.out.print(arr[i] + " "); // Method to print the elements of the array
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // sum += arr[i]; // Calculate the sum of the array elements
            sum= sum + arr[i]; // Calculate the sum of the array elements
            System.out.println("Sum of array elements: " + sum); // Print the sum of the array elements
        }
    }
}
