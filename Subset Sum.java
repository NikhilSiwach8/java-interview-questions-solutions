import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<Integer> ans;
    private static void subset(int i, int sum, int[] num){
        if(i == num.length){
            ans.add(sum);
            return;
        }
        subset(i+1, sum+num[i], num);
        subset(i+1, sum, num);
    }
    public static ArrayList<Integer> subsetSum(int num[]) {
        ans = new ArrayList<Integer>();
        subset(0,0,num);
        Collections.sort(ans);
        return ans;
    }
}