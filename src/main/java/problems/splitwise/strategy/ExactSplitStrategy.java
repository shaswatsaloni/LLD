package problems.splitwise.strategy;

import java.util.HashMap;
import java.util.Map;

public class ExactSplitStrategy implements SplitStrategy{
    @Override
    public Map<String, Double> split(double amount, String[] userIds, double[] values) {
        Map<String, Double> splits = new HashMap();
        double total = 0;
        for(double i : values){
            total += i;
        }

        if(Math.abs(total - amount) > 0.01){
            throw new IllegalArgumentException("The sum of values does not match with the total amount");
        }

        for(int i = 0; i< userIds.length; i++){
            splits.put(userIds[i], values[i]);
        }
        return splits;
    }
}
