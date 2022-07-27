import java.util.*;
import java.lang.*;

public class Solution {
    public static class customCompare implements Comparator<Pair>
    {
        public int compare(Pair a, Pair b){
            int r1 = a.value * b.weight;
            int r2 = b.value * a.weight;
            return r2 - r1;
        }
    }

    public static double maximumValue(Pair[] items, int n, int w) {

            Arrays.sort(items, new customCompare());
            
            double maxValue = 0;
            int currWeight = 0;

            for (int i = 0; i < n; i++)
            {
                if (currWeight + items[i].weight <= w)
                {
                    currWeight += items[i].weight;
                    maxValue += items[i].value;
                }
                else
                {
                    int remainingWeight = w - currWeight;

                    maxValue += items[i].value * ((double)remainingWeight / items[i].weight);
                    break;
                }
            }

            return maxValue;
    }
}