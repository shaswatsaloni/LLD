package problems.splitwise.service;

import problems.splitwise.factory.SplitStrategyFactory;
import problems.splitwise.repository.ExpenseRepository;
import problems.splitwise.strategy.SplitStrategy;

import java.util.Map;

public class ExpenseService {

    private ExpenseRepository repository = new ExpenseRepository();

    public void addExpenses(String paidBy, double amount, String[] userIds, String type, double[] values){
        SplitStrategy splitStrategy = SplitStrategyFactory.getStrategyBasedOnExpense(type);
        Map<String, Double> splits = splitStrategy.split(amount, userIds, values);
        
        for(Map.Entry<String, Double> entry : splits.entrySet()){
            if(!entry.getKey().equals(paidBy)) {
                repository.updateBalance(paidBy, entry.getKey(), entry.getValue());
            }
        }


    }

    public void showBalances(){
        Map<String, Map<String, Double>> balances = repository.getBalances();
        boolean noBalances = true;

        for (Map.Entry<String, Map<String, Double>> entry : balances.entrySet()) {
            String fromUser = entry.getKey();
            for (Map.Entry<String, Double> balance : entry.getValue().entrySet()) {
                if (balance.getValue() != 0) {
                    System.out.println(fromUser + " owes " + balance.getKey() + ": " + balance.getValue());
                    noBalances = false;
                }
            }
        }

        if (noBalances) {
            System.out.println("No balances");
        }
    }

    public void showBalances(String userId) {
        Map<String, Map<String, Double>> balances = repository.getBalances();
        boolean noBalances = true;

        if (balances.containsKey(userId)) {
            for (Map.Entry<String, Double> balance : balances.get(userId).entrySet()) {
                if (balance.getValue() != 0) {
                    System.out.println(userId + " owes " + balance.getKey() + ": " + balance.getValue());
                    noBalances = false;
                }
            }
        }

        if (noBalances) {
            System.out.println("No balances");
        }
    }

}
