package problems.atm.repository.entities;

public class TransactionEntity {
    private String cardNumber;
    private int amount;
    private String type;

    public TransactionEntity(String cardNumber, int amount, String type) {
        this.cardNumber = cardNumber;
        this.amount = amount;
        this.type = type;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}
