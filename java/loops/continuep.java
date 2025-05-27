package loops;

public class continuep {
    public static void main(String[] args) {
        // Continue statement example
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Skipping even number: " + i);
                continue; // Skip the rest of the loop body for even numbers

            }
            // System.out.println("Current odd number: " + i);
        }
        
        System.out.println("Loop ended after processing all numbers.");
        switch(1) {
            case 1:
                System.out.println("The loop will skip printing for even numbers and only print for odd numbers.");
                break;
            default:
                System.out.println("No other case matched.");
        }
        
        // The loop will skip printing for even numbers and only print for odd numbers
    }
    
}
