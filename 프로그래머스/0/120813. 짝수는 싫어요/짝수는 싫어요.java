class Solution {
    public int[] solution(int n) {
        int count = (n + 1) / 2; //홀수의 개수        
        int[] answer = new int[count];
        
       //오름차순으로 홀수를 배열에 담기
        for(int i=0; i<count; i++) {
            answer[i] = 2 * i + 1;
        }
        
        return answer;
    }
}