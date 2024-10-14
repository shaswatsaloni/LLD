package problems.atm.repository.dao.impl;

import problems.atm.repository.dao.ITransactionDao;
import problems.atm.repository.entities.TransactionEntity;

import java.util.ArrayList;
import java.util.List;

public class TransactionDaoImpl implements ITransactionDao {
    private List<TransactionEntity> transactionData = new ArrayList<>();

    @Override
    public void addTransaction(TransactionEntity transaction) {
        transactionData.add(transaction);
    }

    @Override
    public List<TransactionEntity> getTransactionsByCardNumber(String cardNumber) {
        List<TransactionEntity> transactions = new ArrayList<>();
        for (TransactionEntity t : transactionData) {
            if (t.getCardNumber().equals(cardNumber)) {
                transactions.add(t);
            }
        }
        return transactions;
    }
}
