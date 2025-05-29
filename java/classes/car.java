package classes;

class vehicle {
    // Attributes of the vehicle class
    // instace variables no neded to be initialized
    // instance variables are stored in heap memory
    static String type = "Car"; // Static variable, shared across all instances

    String vehicletype;
    String brand;
    String color;
    double price;

    // Method to display car details
    public void displayDetails() {
        // Initializing attributes
        // local varibales must be initialized if not we get the compilation error
        // local variables are stored in stack memory
        // int , double are stored in constant pool memory which is a part of heap
        // memory
        // String is stored in heap memory
        vehicletype = "Sedan";
        brand = "Toyota";
        color = "Red";
        price = 30000.0;

        // Local variable
        // local variables are stored in stack memory
        // local variables must be initialized before use
        // local variables are not stored in constant pool memory
        // local variables are not stored in heap memory
        // local variables are not stored in method area memory
        int year;

        System.out.println("Car Type: " + vehicletype);
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Year: " + price);
        System.out.println("Car Color: " + color);
        // System.out.println("Updated Car Year: " + year);
    }
}

public class car {

    public static void main(String[] args) {

        // Creating an instance of cartype
        vehicle myCar = new vehicle();

        // Displaying car details
        myCar.displayDetails();

        // Modifying the car's color

        // Displaying updated car details
        System.out.println("Updated Car Color: " + myCar.brand);
        System.out.println("Updated Car Price: " + myCar.price);
        vehicle.type = "SUV"; // Changing the static variable
        System.out.println("Vehicle Type: " + vehicle.type); // Accessing static variable
        // Static variables are shared across all instances of the class
        // Static variables are stored in method area memory
        // Static variables are not stored in heap memory
        // Static variables are not stored in stack memory
    }
}