package loops;

public class justwhile {
    public static void main(String[] args) {
        int i = 10;
        while (i < 5) {
            System.out.println("Hello World " + i);
            i++;
        }
        System.out.println("Loop ended with i = " + i);
        // The loop will not execute because the condition is false
    }
    
}
