import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        
        Map<Integer, Integer> countMap = new HashMap<>();
    
        for(int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int maxCount = 0; 
        int answer = 0; // 최빈값
        
        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            
            if(count > maxCount) {
                maxCount = count;
                answer = num;
            } else if(count == maxCount) {
                answer = -1;
            }
        }
        return answer;
    }
}