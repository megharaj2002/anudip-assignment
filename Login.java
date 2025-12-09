//encapsulation
public class Login {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password != null && password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Error: Password must be at least 8 characters long.");
        }
    }

    public static void main(String[] args) {
        Login user = new Login();
        user.setUsername("user123");

        System.out.println("Attempting to set short password 'pass':");
        user.setPassword("pass");

        System.out.println("\nAttempting to set valid password 'password123':");
        user.setPassword("password123");

        System.out.println("\nFinal User Details:");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
    }
}
