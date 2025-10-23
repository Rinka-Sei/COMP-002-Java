package Practice;

/**
 *
 * @author mj
 */
public class User {

    // 1. Data/Fields (Attributes)
    private final int userId;
    private final String name;
    private final String email;

    // 2. Constructor
    // This method has the same name as the class (User) and no return type.
    // It is automatically called when a new object is created using 'new'.
    public User(int id, String userName, String userEmail) {
        // 'this' refers to the current object being created.
        this.userId = id;
        this.name = userName;
        this.email = userEmail;

        System.out.println("New User object initialized!");
    }

    // 3. Method (Behavior)
    // A regular method to display the object's state.
    public void displayUserInfo() {
        System.out.println("\n--- User Profile ---");
        System.out.println("ID: " + this.userId);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
    }

    // 4. Main method to demonstrate object creation and usage
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
