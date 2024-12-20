package problems.splitwise;

import problems.splitwise.models.User;
import problems.splitwise.service.ExpenseService;
import problems.splitwise.service.UserService;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        UserService userService = new UserService();
        ExpenseService expenseService = new ExpenseService();

        Map<String, User> userMap = new HashMap();

        User u1 = new User("u1", "User1", "user1@xyz.com", "1234567980");
        User u2 = new User("u2", "User2", "user2@xyz.com", "1234567981");
        User u3 = new User("u3", "User3", "user3@xyz.com", "1234567982");
        User u4 = new User("u4", "User4", "user4@xyz.com", "1234567983");

        userService.addUser(u1, userMap);
        userService.addUser(u2, userMap);
        userService.addUser(u3, userMap);
        userService.addUser(u4, userMap);

        System.out.println("Printing the balances after Equal split");
        expenseService.showBalances("u1");

        expenseService.addExpenses("u1", 1000, new String[]{"u1", "u2", "u3", "u4"}, "EQUAL", null);
        expenseService.showBalances("u4");
        expenseService.showBalances("u2");
        //expenseService.showBalances("u1");

        System.out.println("Printing the balances after Exact split");



        expenseService.addExpenses("u1", 1250, new String[]{"u2", "u3"}, "EXACT", new double[]{370, 880});
        expenseService.showBalances();

        System.out.println("Printing the balances after Percent split");

        expenseService.addExpenses("u4", 1200, new String[]{"u1", "u2", "u3", "u4"}, "PERCENT", new double[]{40, 20, 20, 20});
        expenseService.showBalances("u1");
        expenseService.showBalances();




    }
}
