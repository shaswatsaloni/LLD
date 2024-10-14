package problems.atm.repository.dao.impl;

import problems.atm.repository.dao.IAccountDao;
import problems.atm.repository.entities.AccountEntity;
import problems.atm.repository.entities.UserEntity;

import java.util.HashMap;
import java.util.Map;

public class AccountDaoImpl implements IAccountDao {
    private Map<String, AccountEntity> accountData = new HashMap<>();

    public AccountDaoImpl() {
        // Example accounts
        accountData.put("1234567890", new AccountEntity("1234567890", 1000));
        accountData.put("9876543210", new AccountEntity("9876543210", 2000));
    }

    @Override
    public AccountEntity getAccountByCardNumber(String cardNumber) {
        return accountData.get(cardNumber);
    }

    @Override
    public void updateAccount(AccountEntity account) {
        accountData.put(account.getAccountNumber(), account);
    }
}
