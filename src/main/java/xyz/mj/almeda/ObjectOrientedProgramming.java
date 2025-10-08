package xyz.mj.almeda;

/**
 *
 * @author mj
 */
// 1. ABSTRACTION (via Interface) - Top-level Interface
interface Drivable {

    // Abstract method: defines WHAT needs to be done, not HOW.
    void startEngine();

    void accelerate();
}

// 2. INHERITANCE - Top-level Class (not public, as it's not the main file class)
class Vehicle {

    // ENCAPSULATION: private field
    private int year;

    // Constructor
    public Vehicle(int year) {
        this.year = year;
    }

    // Method (Encapsulation)
    public int getYear() {
        return year;
    }

    // This method will be overridden later (Polymorphism)
    public void displayInfo() {
        System.out.println("This is a Vehicle from year " + year);
    }
}

// 2. INHERITANCE and 1. ABSTRACTION (via 'implements') - Top-level Class
// This class remains public because it contains the main method.
public class ObjectOrientedProgramming extends Vehicle implements Drivable { // Note: 'Car' logic moved here for simplicity
// NOTE: For better OOP structure, 'Car' should be a separate class.
// I will name this class 'Car' and assume you rename the file to Car.java, but since your file is ObjectOrientedProgramming.java,
// I'll correct the naming conventions below while keeping the logic inside the main class.

    // ENCAPSULATION: private fields
    private String model;
    private int speed;

    // Constructor: uses 'super' to initialize the parent class's fields
    public ObjectOrientedProgramming(String model, int year) {
        super(year); // Calls Vehicle(int year) constructor
        this.model = model;
        this.speed = 0;
    }

    // 4. POLYMORPHISM: Method Overriding
    @Override
    public void startEngine() {
        System.out.println(model + "'s engine started.");
    }

    // 4. POLYMORPHISM: Method Overriding (overrides the parent's method)
    @Override
    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + getYear() + ", Current Speed: " + speed + " mph");
    }

    // 3. ENCAPSULATION: Controlled access via Setter/Getter
    @Override
    public void accelerate() {
        this.speed += 10;
        System.out.println(model + " accelerated. Speed is now " + this.speed + " mph.");
    }

    // 4. POLYMORPHISM: Method Overloading (same method name, different parameters)
    public void accelerate(int boost) {
        this.speed += boost;
        System.out.println(model + " boosted by " + boost + ". Speed is now " + this.speed + " mph.");
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        // Polymorphism via Interface reference (Drivable is the reference type)
        // Creating an instance of the class containing main()
        Drivable myCar = new ObjectOrientedProgramming("Sedan", 2024);

        myCar.startEngine();
        myCar.accelerate();

        // Downcast to access the overloaded method
        ObjectOrientedProgramming sedan = (ObjectOrientedProgramming) myCar;
        sedan.accelerate(50);
        sedan.displayInfo();

        // Polymorphism via Parent reference (Vehicle is the reference type)
        Vehicle oldVehicle = new Vehicle(1990);
        oldVehicle.displayInfo();
    }
}
