package problems.atm.repository.entities;

public class AccountEntity {
    private String accountNumber;
    private int balance;

    public AccountEntity(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
