package problems.atm.repository.dao;

import problems.atm.repository.entities.AccountEntity;

public interface IAccountDao {
    AccountEntity getAccountByCardNumber(String cardNumber);
    void updateAccount(AccountEntity account);
}
