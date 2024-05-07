package miniproject;

import acsse.csc03a3.Block;
import acsse.csc03a3.Blockchain;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Step 1: Create a Blockchain Instance
        Blockchain<AuthenticationTransaction> blockchain = new Blockchain<>();

        // Step 2: Create Authentication Transactions
        // Sample user credentials
        UserCredentials userCredentials1 = new UserCredentials("user1", "hashedPassword1", "user1@example.com");
        AuthenticationAttempt authenticationAttempt1 = new AuthenticationAttempt("user1", System.currentTimeMillis(), true);
        AuthenticationData authenticationData1 = new AuthenticationData(userCredentials1, authenticationAttempt1);
        AuthenticationTransaction authenticationTransaction1 = new AuthenticationTransaction("sender", "receiver", authenticationData1);

        UserCredentials userCredentials2 = new UserCredentials("user2", "hashedPassword2", "user2@example.com");
        AuthenticationAttempt authenticationAttempt2 = new AuthenticationAttempt("user2", System.currentTimeMillis(), false);
        AuthenticationData authenticationData2 = new AuthenticationData(userCredentials2, authenticationAttempt2);
        AuthenticationTransaction authenticationTransaction2 = new AuthenticationTransaction("sender", "receiver", authenticationData2);

        // Step 3: Create Blocks and Add Transactions
        // Create a list to hold transactions for block 1
        List<AuthenticationTransaction> transactionsBlock1 = new ArrayList<>();
        transactionsBlock1.add(authenticationTransaction1);

        // Create block 1 with the list of transactions
        //Block<AuthenticationTransaction> block1 = new Block<>("", transactionsBlock1);

        // Add block 1 to the blockchain
        //blockchain.addBlock(transactionsBlock1);

        // Create a list to hold transactions for block 2
        List<AuthenticationTransaction> transactionsBlock2 = new ArrayList<>();
        transactionsBlock2.add(authenticationTransaction2);

        // Create block 2 with the list of transactions
        //Block<AuthenticationTransaction> block2 = new Block<>(blockchain.getLatestBlock().getHash(), transactionsBlock2);

        // Add block 2 to the blockchain
        //blockchain.addBlock(transactionsBlock2);

        // Step 4: Verify the Blockchain
        boolean isChainValid = blockchain.isChainValid();
        System.out.println("Is blockchain valid? " + isChainValid);

        // Step 5: Print the Blockchain
        System.out.println("Blockchain:");
        System.out.println(blockchain);
    }
}
