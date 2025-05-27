import java.util.Scanner;

public class IfSta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte imageHeader = (byte) 137; // PNG file header
        int a = 5;
        int b;
        int day;
        System.out.println("Enter b number: ");
        b = scanner.nextInt();
        System.out.println("Enter day number: ");
        day = scanner.nextInt();
       
        System.out.println("File starts with byte: " + imageHeader);
        if (imageHeader == 137) {
            System.out.println("This is a PNG file.");
        } else {
            System.out.println("This is not a PNG file.");
        }

        String isPng = (imageHeader == 137) ? "true" : "false";

        System.out.println("Is PNG? " + isPng);

        int result = a > b ? a : b;
        System.out.println("The greater number is: " + result);

        elseif(b);
        swtch(day);
        scanner.close();
    }

    public static void elseif(int y) {
        int x = 10;
        if (x < y) {
            System.out.println("x is less than" +y);
        } else if (x <= y) {
            System.out.println("x is less than" + y);
        } else {
            System.out.println("x is greater than or equal to " +y);
        }
    }

    public static void swtch(int day) {
      
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
