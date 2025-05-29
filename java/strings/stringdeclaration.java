package strings;

public class stringdeclaration {
    public static void main(String[] args) {
        String s1 = "priya";
        String s2 = "priya";
        String s3 = new String("priya"); //which is in heap memory
        // Note: s1 and s2 are string literals, which are stored in the string pool.
        String s4 = "some other string";

        if(s1 != s2) {
            System.out.println("s1 and s2 are the same object in memory.");
        } else if ((s1 == s3) || (s2 == s3)) {
            System.out.println("s1 and s3 or s2 and s3 are the same object in memory.");
        } else {
            System.out.println("s1, s2 are same object in memory but s3 is different object in memory.");
        }
        if(s1==s4) {
            System.out.println("s1 and s4 are the same object in memory.");
        } else {
            System.out.println("s1 and s4 are different objects in memory.");
        }   
    }
    
}
