package miniproject;

public class AuthenticationData {
    private UserCredentials userCredentials;
    private AuthenticationAttempt authenticationAttempt;

    public AuthenticationData(UserCredentials userCredentials, AuthenticationAttempt authenticationAttempt) {
        this.userCredentials = userCredentials;
        this.authenticationAttempt = authenticationAttempt;
    }

    public UserCredentials getUserCredentials() {
        return userCredentials;
    }

    public void setUserCredentials(UserCredentials userCredentials) {
        this.userCredentials = userCredentials;
    }

    public AuthenticationAttempt getAuthenticationAttempt() {
        return authenticationAttempt;
    }

    public void setAuthenticationAttempt(AuthenticationAttempt authenticationAttempt) {
        this.authenticationAttempt = authenticationAttempt;
    }

    @Override
    public String toString() {
        return "AuthenticationData{" +
                "userCredentials=" + userCredentials +
                ", authenticationAttempt=" + authenticationAttempt +
                '}';
    }
}
