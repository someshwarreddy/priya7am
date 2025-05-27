package loops;

public class dowhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            if(i == 3) {
                System.out.println("Breaking the loop at i = " + i);
                continue; // Exit the loop when i equals 15
            }
            System.out.println("Hello World " + i);

        } while (i < 5);
    }
}
