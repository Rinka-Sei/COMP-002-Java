/**
 * This class represents a user with a unique ID, name, and email address.
 * It demonstrates the basic structure of a Java class, including fields, a constructor,
 * and methods.
 */
package BSIT1stSem;

/**
 * The User class is a simple model for representing a user. Each User object
 * holds information about a specific user, such as their ID, name, and email.
 * This class is a fundamental example of object-oriented programming, showcasing
 * how data (fields) and behavior (methods) are encapsulated within an object.
 *
 * @author Jules
 * @version 1.0
 */
public class User {

    /**
     * The unique identifier for the user.
     */
    private final int userId;
    /**
     * The name of the user.
     */
    private final String name;
    /**
     * The email address of the user.
     */
    private final String email;

    /**
     * Constructs a new User object with the specified ID, name, and email.
     * The constructor is called when a new instance of the User class is created.
     *
     * @param id The unique identifier for the user.
     * @param userName The name of the user.
     * @param userEmail The email address of the user.
     */
    public User(int id, String userName, String userEmail) {
        // 'this' refers to the current object being created.
        this.userId = id;
        this.name = userName;
        this.email = userEmail;

        System.out.println("New User object initialized!");
    }

    /**
     * Displays the user's information, including their ID, name, and email, to the console.
     * This method provides a simple way to view the state of a User object.
     */
    public void displayUserInfo() {
        System.out.println("\n--- User Profile ---");
        System.out.println("ID: " + this.userId);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
    }

    /**
     * The main entry point of the program.
     * It demonstrates how to create and use User objects.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // A. Create Object 1: The constructor is called here!
        User user1 = new User(101, "Alice Smith", "alice.s@example.com");

        // B. Create Object 2: The constructor is called again for a new object!
        User user2 = new User(102, "Bob Johnson", "bob.j@example.com");

        // C. Use the methods to display the unique state of each object
        user1.displayUserInfo();
        user2.displayUserInfo();
    }
}
