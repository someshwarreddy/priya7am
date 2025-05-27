import java.util.ArrayList;

public class IntVsIntegerExample {
    public static void main(String[] args) {
        // Primitive int
        int num1 = 100;
        int num2 = 200;
        int sum = num1 + num2;
        System.out.println("Sum using int: " + sum);

        // Wrapper Integer
        Integer obj1 = 300; // auto-boxing from int to Integer
        Integer obj2 = 400;
        Integer sumObj = obj1 + obj2; // auto-unboxing to int, then addition
        System.out.println("Sum using Integer objects: " + sumObj);

        // Integer can be null, int cannot
        Integer maybeNull = null;
        System.out.println("This Integer can be null: " + maybeNull);

        // Use Integer in a List (collection)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(num1);  // auto-boxed
        list.add(150);
        list.add(obj2);

        System.out.println("Values in ArrayList:");
        for (Integer val : list) {
            System.out.println(val);
        }
    }
}

