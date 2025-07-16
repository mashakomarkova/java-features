package org.example.java8.partitioningby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

class Transaction {
    String id;
    boolean isFraudulent;

    Transaction(String id, boolean isFraudulent) {
        this.id = id;
        this.isFraudulent = isFraudulent;
    }
}

public class PartitioningByTransaction {
    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
                new Transaction("TXN1", false),
                new Transaction("TXN2", true),
                new Transaction("TXN3", false),
                new Transaction("TXN4", true),
                new Transaction("TXN5", false)
        );

        //[true=2, false=3]
        Map<Boolean, Long> countByFraud = transactions.stream()
                .collect(Collectors.partitioningBy(t-> t.isFraudulent, counting()));

        System.out.println("false: " + countByFraud.get(false));
        System.out.println("true: " + countByFraud.get(true));
    }
}
