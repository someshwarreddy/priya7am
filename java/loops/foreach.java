package loops;
public class foreach {
    public static void main(String[] args) {
        // For-each loop example
        String[] names = {"Alice", "Bob", "Charlie"};
        
        for (String name : names) {
            System.out.println("Hello " + name);
        }
        
        System.out.println("Loop ended after iterating through all names.");
        
        // The loop will iterate through each element in the names array, printing "Hello" followed by the name
    }
}
