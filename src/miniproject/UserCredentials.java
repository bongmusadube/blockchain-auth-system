package miniproject;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UserCredentials {
    private String username;
    private String hashedPassword;
    private String email;
    
    // Constructor
    public UserCredentials(String username, String hashedPassword, String email) {
        this.username = username;
        this.hashedPassword = hashedPassword;
        this.email = email;
    }
    
    // Getters and Setters
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getHashedPassword() {
        return hashedPassword;
    }
    
    // Hash the password using SHA-256 algorithm before setting it
    public void setHashedPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            this.hashedPassword = hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            // Handle hashing error (e.g., log or throw exception)
        }
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    // Override toString() method for debugging purposes
    @Override
    public String toString() {
        return "UserCredentials{" +
                "username='" + username + '\'' +
                ", hashedPassword='" + hashedPassword + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
