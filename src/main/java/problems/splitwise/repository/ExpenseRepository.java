package problems.splitwise.repository;

import java.util.HashMap;
import java.util.Map;

public class ExpenseRepository {
    private Map<String, Map<String, Double>> balances = new HashMap();

    public void updateBalance(String fromUser, String toUser, double amount) {
        balances.putIfAbsent(fromUser, new HashMap<>());
        balances.putIfAbsent(toUser, new HashMap<>());

        double current = balances.get(toUser).getOrDefault(fromUser, 0.0);
        balances.get(toUser).put(fromUser, current + amount);
    }

    public Map<String, Map<String, Double>> getBalances() {
        return balances;
    }

}
