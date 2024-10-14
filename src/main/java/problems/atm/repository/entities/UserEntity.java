package problems.atm.repository.entities;

public class UserEntity {
    private String name;
    private String cardNumber;
    private int pin;

    public UserEntity(String name, String cardNumber, int pin) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getPin() {
        return pin;
    }
}
