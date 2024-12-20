package problems.splitwise.strategy;

import java.util.Map;

public interface SplitStrategy {
    Map<String, Double> split(double amount, String[] userIds, double[] values);
}
