package miniproject;

import acsse.csc03a3.Transaction;

public class AuthenticationTransaction extends Transaction<AuthenticationData> {
    public AuthenticationTransaction(String sender, String receiver, AuthenticationData data) {
        super(sender, receiver, data);
    }

    @Override
    public String toString() {
        return "AuthenticationTransaction{" +
                "data=" + getData() +
                '}';
    }
}
