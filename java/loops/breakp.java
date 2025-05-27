package loops;

public class breakp {
    public static void main(String[] args) {
        // Break statement example
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break; // Exit the loop when i equals 5
            }
            System.out.println("Current value of i: " + i);
        }
        
        System.out.println("Loop ended prematurely due to break statement.");
        
        // The loop will execute until i equals 5, at which point it will break out of the loop
    }
}
