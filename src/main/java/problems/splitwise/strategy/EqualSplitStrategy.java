package problems.splitwise.strategy;

import java.util.HashMap;
import java.util.Map;

public class EqualSplitStrategy implements SplitStrategy{


    @Override
    public Map<String, Double> split(double amount, String[] userIds, double[] values) {
        Map <String, Double> splits = new HashMap();
        int numOfUsers = userIds.length;
        double equalAmount = Math.round((amount/numOfUsers) * 100.0)/100.0;

        for(int i=0; i< numOfUsers; i++){
            splits.put(userIds[i], equalAmount);
        }
        return splits;
    }
}
