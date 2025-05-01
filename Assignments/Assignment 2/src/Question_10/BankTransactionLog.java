package Question_10;

import java.util.*;

class BankTransactionLog{
    private Map<String, List<Transaction>> transactionMap;

    public BankTransactionLog() {
        transactionMap = new HashMap<>();
    }

    public void addTransaction(String accountNumber, Transaction tx) {
        transactionMap
                .computeIfAbsent(accountNumber, k -> new ArrayList<>())
                .add(tx);
    }

    public void generateStatement(String accountNumber) {
        List<Transaction> txList = transactionMap.get(accountNumber);
        if (txList == null || txList.isEmpty()) {
            System.out.println("No transactions for account " + accountNumber);
            return;
        }

        txList.sort(Comparator.comparing(t -> t.timestamp));

        System.out.println("Statement for account: " + accountNumber);
        for (Transaction tx : txList) {
            System.out.println(tx);
        }
    }
}
