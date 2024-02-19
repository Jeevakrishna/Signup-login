public class HelperClass {

    String name, email, username, password;

    // Getter method for retrieving name
    public String getName() {
        return name;
    }

    // Setter method for setting name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for retrieving email
    public String getEmail() {
        return email;
    }

    // Setter method for setting email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter method for retrieving username
    public String getUsername() {
        return username;
    }

    // Setter method for setting username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter method for retrieving password
    public String getPassword() {
        return password;
    }

    // Setter method for setting password
    public void setPassword(String password) {
        this.password = password;
    }

    // Constructor with parameters to initialize object with values
    public HelperClass(String name, String email, String username, String password) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    // Default constructor
    public HelperClass() {
    }
}
