class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        for (int i = 0; i < my_string.length() + 1; i++) {
            String sub = my_string.substring(i, my_string.length());
            if (is_suffix.equals(sub)) {
                return 1;
            }
        }
        
        return answer;
    }
}