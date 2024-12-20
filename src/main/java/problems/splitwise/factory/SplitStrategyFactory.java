package problems.splitwise.factory;

import problems.splitwise.strategy.EqualSplitStrategy;
import problems.splitwise.strategy.ExactSplitStrategy;
import problems.splitwise.strategy.PercentSplitStrategy;
import problems.splitwise.strategy.SplitStrategy;

public class SplitStrategyFactory {
    public static SplitStrategy getStrategyBasedOnExpense(String expenseType){
        return switch (expenseType) {
            case "EQUAL" -> new EqualSplitStrategy();
            case "EXACT" -> new ExactSplitStrategy();
            case "PERCENT" -> new PercentSplitStrategy();
            default -> throw new IllegalArgumentException("Invalid Split Type: " + expenseType);
        };
    }
}
