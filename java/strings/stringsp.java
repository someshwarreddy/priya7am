package strings;

public class stringsp {
    public static void main(String[] args) {
        // Declare and initialize a string
        String str = "Hello, World!";
        
        // Print the original string
        System.out.println("Original String: " + str);
        
        // Convert the string to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase String: " + upperStr);
        
        // Convert the string to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase String: " + lowerStr);
        
        // Find the length of the string
        int length = str.length();
        System.out.println("Length of String: " + length);
        
        // Check if the string contains a substring
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);
        
        // Replace a substring in the string
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);
        
        // Split the string into an array of substrings
        String[] words = str.split(", ");
        System.out.println("Split String: ");
        for (String word : words) {
            System.out.println(word);
        }
    }   
}
