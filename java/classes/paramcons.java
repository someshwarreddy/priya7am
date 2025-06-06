package classes;

class Innerparamcons {
    String lazy;

    // Constructor with parameters
    public Innerparamcons(String name, int age, String lazy) {
        this.lazy = lazy;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("lazy " + lazy);
    }

    // Main method to test the constructor

}

public class paramcons {
    public static void main(String[] args) {
        // Creating an instance of Innerparamcons with parameters
        Innerparamcons person = new Innerparamcons("someshwar", 30, "sleepy");
        // Displaying the details of the person
        System.out.println("Person object created with name and age." + person);
        Innerparamcons persontwo = new Innerparamcons("priya", 25, "active");
        System.out.println("Person2 object created with name and age." + persontwo);
        Innerparamcons personthree = new Innerparamcons("blue", 28, "lazy");
        // Displaying the details of the person
        System.out.println("Person3 object created with name and age." + personthree);

    }
}
