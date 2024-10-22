import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        Stack<Integer> stack = new Stack<>();
        for(int num: num_list)
            stack.push(num);
        
        int index = 0;
        while(!stack.isEmpty())
            answer[index++] = stack.pop();
        
        return answer;
    }
}