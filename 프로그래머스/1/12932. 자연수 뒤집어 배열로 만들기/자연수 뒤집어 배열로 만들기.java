class Solution {
    public int[] solution(long n) {
        
        String arrStr = Long.toString(n);
        int[] answer = new int[arrStr.length()];
 
        for(int i=arrStr.length() - 1; i>=0; i--){
            answer[arrStr.length()-1-i] = arrStr.charAt(i) - '0';
        }      
        return answer;
    }
}
