class Solution {
    public int solution(int n, int t) {
        // n = 세균의 수, t = 증식하는 과정에서 경과된 시간
        
        int answer = n; 
        // 초기 세균의 수 n을 answer 변수에 할당하는 코드이다.
        // 이를 통해 반복문에서 세균의 수를 계산할 때마다 answer 변수를 사용하여 값을 갱신한다.
        
        for (int i = 0; i < t; i++) {
            // t보다 작을 때 마다 i를 0부터 1씩 증가시켰다.  
            // t 시간까지만 증식이 되기 때문.
            
            answer *= 2;
            // answer = n이고 1시간에 2배 증식하기 때문에 answer *= 2를 해줌.
            
        }
        return answer;
    }
}