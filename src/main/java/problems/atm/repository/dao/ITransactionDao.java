package problems.atm.repository.dao;

import problems.atm.repository.entities.TransactionEntity;

import java.util.List;

public interface ITransactionDao {
    void addTransaction(TransactionEntity transaction);
    List<TransactionEntity> getTransactionsByCardNumber(String cardNumber);
}
