package problems.splitwise.service;

import problems.splitwise.models.User;

import java.util.Map;

public class UserService {
    public void addUser(User user, Map<String, User> users){
        users.put(user.getId(), user);
    }
}
