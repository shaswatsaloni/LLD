package problems.splitwise.strategy;

import java.util.HashMap;
import java.util.Map;

public class PercentSplitStrategy implements SplitStrategy{
    @Override
    public Map<String, Double> split(double amount, String[] userIds, double[] values) {
        Map<String, Double> splits = new HashMap();
        double total = 0;
        for(double i: values){
            total += i;
        }

        if(total != 100){
            throw new IllegalArgumentException("Total Percentages does not add up to 100%");
        }

        for(int i = 0; i<userIds.length; i++){
            splits.put(userIds[i], Math.round((amount * values[i] / 100) * 100.0) / 100.0);
        }
        return splits;
    }
}
