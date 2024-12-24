import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int hap = 0;
        
        Arrays.sort(d);
        for (int i : d) {
            hap += i;
            if (hap > budget) {
                continue;
            }
            answer++;
        }   
        return answer;
    }
}