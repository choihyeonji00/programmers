class Solution {
    public int solution(int chicken) {
        int answer = 0;

        while (chicken >= 10) {
            int ten = chicken / 10;  
            int rest = chicken % 10; 

            chicken = ten + rest;    
            answer += ten; 
        }

        return answer;
    }
}