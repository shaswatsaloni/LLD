package problems.atm.repository.dao.impl;

import problems.atm.repository.dao.IUserDao;
import problems.atm.repository.entities.UserEntity;

import java.util.HashMap;
import java.util.Map;

public class UserDaoImpl implements IUserDao{
    private Map<String, UserEntity> userData = new HashMap<>();

    public UserDaoImpl() {
        // Example users
        userData.put("1234567890", new UserEntity("John Doe", "1234567890", 1234));
        userData.put("9876543210", new UserEntity("Jane Smith", "9876543210", 1342));
    }

    @Override
    public UserEntity getUserByCardNumber(String cardNumber) {
        return userData.get(cardNumber);
    }

    public boolean validatePin(String cardNumber, int pin) {
        UserEntity user = userData.get(cardNumber);
        return user != null && user.getPin() == pin;
    }
}
