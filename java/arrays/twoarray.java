package arrays;
import java.util.Scanner;
public class twoarray {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        // This is a simple Java program to demonstrate the use of a 2D array
        Scanner scanner = new Scanner(System.in); // Import the Scanner class for user input
        System.out.println("Enter the number of rows for the 2D array: ");
        int rows = scanner.nextInt(); // Read the number of rows from user input
        System.out.println("Enter the number of columns for the 2D array: ");
        int cols = scanner.nextInt(); // Read the number of columns from user input
        // int[][] twoDArray = new int[rows][cols]; // Declare and initialize a 2D array with user-defined dimensions
        int[][] twoDArray = create2DArray(rows, cols); // Create a 2D array using the method

        print2DArray(twoDArray); // Print the elements of the 2D array
        // int[][] twoDArray = new int[3][4]; // Declare and initialize a 2D array with 3 rows and 4 columns

        // Initialize the 2D array with values
        // for (int i = 0; i < twoDArray.length; i++) {
        //     for (int j = 0; j < twoDArray[i].length; j++) {
        //         twoDArray[i][j] = i + j; // Assigning the sum of indices as values
        //     }
        // }

        // // Print the elements of the 2D array
        // for (int i = 0; i < twoDArray.length; i++) {
        //     for (int j = 0; j < twoDArray[i].length; j++) {
        //         System.out.print(twoDArray[i][j] + " ");
        //     }
        //     System.out.println(); // New line after each row
        // }
        scanner.close(); // Close the scanner to prevent resource leaks
        System.out.println("2D array created and printed successfully.");
    }

    public static int[][] create2DArray(int rows, int cols) {
        return new int[rows][cols]; // Method to create and return a 2D array of specified size
    }
    
    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j; // Initialize the 2D array elements with the sum of indices
                System.out.print(arr[i][j] + " "); // Method to print the elements of the 2D array
            }
            System.out.println(); // New line after each row
        }
    }
}
