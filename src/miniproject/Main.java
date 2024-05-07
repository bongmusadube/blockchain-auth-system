package miniproject;

import acsse.csc03a3.Block;
import acsse.csc03a3.Blockchain;
import acsse.csc03a3.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create some sample transactions (user credentials updates and authentication attempts)
        AuthenticationData authData1 = new AuthenticationData(new UserCredentials("user1", "hashedPassword1", "user1@example.com"),
                                                              new AuthenticationAttempt("user1", System.currentTimeMillis(), true));
        AuthenticationData authData2 = new AuthenticationData(new UserCredentials("user2", "hashedPassword2", "user2@example.com"),
                                                              new AuthenticationAttempt("user2", System.currentTimeMillis(), false));
        
        // Create blocks to store transactions
        List<Transaction<AuthenticationData>> transactionsBlock1 = new ArrayList<>();
        transactionsBlock1.add(new AuthenticationTransaction("sender1", "receiver1", authData1));
        transactionsBlock1.add(new AuthenticationTransaction("sender2", "receiver2", authData2));
        Block<Transaction<AuthenticationData>> block1 = new Block<>("previousHash1", transactionsBlock1);

        // Create blockchain and add the first block
        Blockchain<Transaction<AuthenticationData>> blockchain = new Blockchain<>();
        blockchain.addBlock(transactionsBlock1);

        // Add more blocks as needed
        // ...

        // Print the blockchain
        System.out.println("Blockchain:");
        System.out.println(blockchain.toString());
    }
}
