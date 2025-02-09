import java.util.*;
class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int maxValue = Arrays.stream(diffs).max().getAsInt();
        int minValue = 1;

        while (minValue < maxValue) { 
            int level = (maxValue + minValue) / 2;
            long time = calTime(diffs, times, level);
 
            if(limit >= time) {
                maxValue = level;
            } else {
                minValue = level+1;
            }
        }
        
        return maxValue;
    }
    
    private long calTime(int[] diffs, int[] times, int level) {
        long time = 0;
        for(int i=0; i<diffs.length; i++) {
            int levDiff = diffs[i] - level;
            
            if(levDiff <= 0) {
                time += times[i];
            } else {
                int preTime = i == 0 ? 0 : times[i-1]; 
                int nowTime = times[i];
                int addValue = (preTime + nowTime) * levDiff + nowTime;

                time += addValue;
            } 
        }
        
        return time;
    }
}