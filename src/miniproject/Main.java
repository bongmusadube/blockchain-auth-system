package miniproject;

import acsse.csc03a3.Block;
import acsse.csc03a3.Transaction;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        // Create some transactions
        List<Transaction<String>> transactions = new ArrayList<>();
        transactions.add(new Transaction<>("sender1", "receiver1", "data1"));
        transactions.add(new Transaction<>("sender2", "receiver2", "data2"));

        // Create a block with the specified previous hash and list of transactions
        Block<String> block = new Block<>("previousHash", transactions);

        // Print the block's information
        System.out.println("Block Hash: " + block.getHash());
        System.out.println("Previous Block Hash: " + block.getPreviousHash());
        System.out.println("Nonce: " + block.getNonce());
        System.out.println("Transactions: " + block.getTransactions());
    }
}
