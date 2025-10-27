/**
 * This class demonstrates the core principles of Object-Oriented Programming (OOP) in Java,
 * including Abstraction, Inheritance, Encapsulation, and Polymorphism.
 */
package BSIT1stSem;

/**
 * The Drivable interface defines the contract for classes that can be driven.
 * It specifies the essential behaviors, such as starting the engine and accelerating,
 * without detailing the implementation. This is a form of Abstraction.
 */
interface Drivable {

    /**
     * Starts the engine of the drivable object.
     */
    void startEngine();

    /**
     * Accelerates the drivable object.
     */
    void accelerate();
}

/**
 * The Vehicle class serves as a base class for different types of vehicles.
 * It demonstrates Inheritance and Encapsulation by providing a basic structure
 * and protecting its internal state.
 */
class Vehicle {

    /**
     * The manufacturing year of the vehicle. It is private to ensure Encapsulation.
     */
    private final int year;

    /**
     * Constructs a Vehicle with a specified manufacturing year.
     *
     * @param year The manufacturing year of the vehicle.
     */
    public Vehicle(int year) {
        this.year = year;
    }

    /**
     * Returns the manufacturing year of the vehicle.
     * This getter method provides controlled access to the private 'year' field.
     *
     * @return The manufacturing year.
     */
    public int getYear() {
        return year;
    }

    /**
     * Displays basic information about the vehicle.
     * This method is designed to be overridden by subclasses to provide more specific details (Polymorphism).
     */
    public void displayInfo() {
        System.out.println("This is a Vehicle from year " + year);
    }
}

/**
 * The ObjectOrientedProgramming class is the main class that demonstrates all four OOP principles.
 * It inherits from Vehicle and implements the Drivable interface, representing a specific type of car.
 *
 * This class showcases:
 * 1. Abstraction: By implementing the Drivable interface.
 * 2. Inheritance: By extending the Vehicle class.
 * 3. Encapsulation: With private fields and public methods to control access.
 * 4. Polymorphism: Through method overriding and overloading.
 */
public class ObjectOrientedProgramming extends Vehicle implements Drivable {

    /**
     * The model of the car.
     */
    private String model;
    /**
     * The current speed of the car.
     */
    private int speed;

    /**
     * Constructs a new car with a given model and year.
     *
     * @param model The model name of the car.
     * @param year The manufacturing year of the car.
     */
    public ObjectOrientedProgramming(String model, int year) {
        super(year); // Calls the constructor of the parent class (Vehicle).
        this.model = model;
        this.speed = 0;
    }

    /**
     * Starts the car's engine. This is an implementation of the startEngine method from the Drivable interface.
     */
    @Override
    public void startEngine() {
        System.out.println(model + "'s engine started.");
    }

    /**
     * Displays detailed information about the car, including its model, year, and current speed.
     * This method overrides the displayInfo method from the Vehicle class to provide more specific information.
     */
    @Override
    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + getYear() + ", Current Speed: " + speed + " mph");
    }

    /**
     * Accelerates the car by a default amount (10 mph).
     * This is an implementation of the accelerate method from the Drivable interface.
     */
    @Override
    public void accelerate() {
        this.speed += 10;
        System.out.println(model + " accelerated. Speed is now " + this.speed + " mph.");
    }

    /**
     * Accelerates the car by a specified amount (boost).
     * This is an example of method overloading, as it has the same name as the other accelerate method
     * but different parameters.
     *
     * @param boost The amount to increase the car's speed by.
     */
    public void accelerate(int boost) {
        this.speed += boost;
        System.out.println(model + " boosted by " + boost + ". Speed is now " + this.speed + " mph.");
    }

    /**
     * The main entry point of the program.
     * It creates instances of the classes and demonstrates the OOP principles in action.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Polymorphism via Interface reference (Drivable is the reference type).
        Drivable myCar = new ObjectOrientedProgramming("Sedan", 2024);

        myCar.startEngine();
        myCar.accelerate();

        // Downcast to access the overloaded method.
        ObjectOrientedProgramming sedan = (ObjectOrientedProgramming) myCar;
        sedan.accelerate(50);
        sedan.displayInfo();

        // Polymorphism via Parent reference (Vehicle is the reference type).
        Vehicle oldVehicle = new Vehicle(1990);
        oldVehicle.displayInfo();
    }
}
