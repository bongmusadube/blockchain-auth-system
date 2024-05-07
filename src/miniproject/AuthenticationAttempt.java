package miniproject;

public class AuthenticationAttempt {
    private String username;
    private long timestamp;
    private boolean success;

    // Constructor
    public AuthenticationAttempt(String username, long timestamp, boolean success) {
        this.username = username;
        this.timestamp = timestamp;
        this.success = success;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    // Override toString() method for debugging purposes
    @Override
    public String toString() {
        return "AuthenticationAttempt{" +
                "username='" + username + '\'' +
                ", timestamp=" + timestamp +
                ", success=" + success +
                '}';
    }
}
