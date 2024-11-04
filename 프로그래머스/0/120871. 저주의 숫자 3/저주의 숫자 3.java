class Solution {
    public int solution(int n) {
        int answer = 0;
 
        for (int i = 0; i < n; i++) { 
            answer++;            
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) { // 3의 배수거나 "3"을 포함하고 있으면
                answer++;         
            }
        }
                   
        return answer;
    }
}