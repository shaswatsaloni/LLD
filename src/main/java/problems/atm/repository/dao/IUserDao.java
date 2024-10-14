package problems.atm.repository.dao;

import problems.atm.repository.entities.UserEntity;

public interface IUserDao {
    UserEntity getUserByCardNumber(String cardNumber);
    boolean validatePin(String cardNumber, int pin);
}
