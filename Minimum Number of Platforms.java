public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
       int platforms[] = new int[2360];
        
        int minNumOfPlatforms = 1;
        
        for(int i = 0; i < n; i++){
            for(int j = at[i]; j <= dt[i]; j++){
                platforms[j]++;
                
                minNumOfPlatforms = Math.max(minNumOfPlatforms, platforms[j]);
            }
        }
        return minNumOfPlatforms;
    }
}