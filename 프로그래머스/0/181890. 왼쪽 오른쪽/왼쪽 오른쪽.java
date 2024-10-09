import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
        	    answer = Arrays.copyOfRange(str_list, 0, i);
                break;
            } else if (str_list[i].equals("r")) {
        	    answer = Arrays.copyOfRange(str_list, i + 1, str_list.length);
                break;
            }
        }
        
        return answer;
    }
}