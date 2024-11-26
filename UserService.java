import java.util.List;
import java.util.ArrayList;

public class UserService {

    // Hardcoded database credentials (security flaw)
    private static final String DB_USER = "admin";
    private static final String DB_PASSWORD = "password123";  // Hardcoded sensitive data
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";

    // Method to get users from database
    public List<String> getUsers() {
        List<String> users = new ArrayList<>();
        try {
            // Simulating a database connection (not real connection code)
            connectToDatabase();
            
            // Simulated data (in reality, data should come from DB)
            users.add("Alice");
            users.add("Bob");
            users.add("Charlie");
            
        } catch (Exception e) {
            // Empty catch block (ignoring errors)
            // TODO: Log the error, instead of just catching and doing nothing
        }
        return users;
    }

    // Method to simulate database connection (dummy function)
    private void connectToDatabase() throws Exception {
        // Simulating an error during DB connection
        if (true) {  // Always simulating an error
            throw new Exception("Database connection failed");
        }
    }

    // A duplicate method, which is similar to getUsers() but slightly different
    public List<String> fetchUsers() {
        List<String> users = new ArrayList<>();
        try {
            connectToDatabase();
            users.add("Alice");
            users.add("Bob");
            users.add("Charlie");
        } catch (Exception e) {
            // Empty catch block, similar issue
        }
        return users;
    }

    // Method with potential null pointer dereference
    public void displayUser(String userId) {
        String user = null;
        if (userId.equals("123")) {
            user = "Alice";
        }
        System.out.println(user.toUpperCase());  // Null pointer dereference if user is null
    }

    public static void main(String[] args) {
        UserService service = new UserService();
        service.getUsers();

        // Simulating call to method with potential null dereference
        service.displayUser("123");
        service.displayUser("456");
    }
}
