package classes;
class check {
    void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Inside swap: x = " + x + ", y = " + y + ", temp = " + temp);
    }
}

public class callbyval {
   public static void main(String[] args) {
      // Call by value example
        // In Java, primitive types are passed by value, meaning a copy of the value is passed to the method.
      int a = 10;
      int b = 20;
      System.out.println("Before swap: a = " + a + ", b = " + b);
      System.out.println("After swap: a = " + a + ", b = " + b);
      // Create an instance of the check class
      check obj = new check();
        // Call the swap method
        obj.swap(a, b);
   }

    
}
