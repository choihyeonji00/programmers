class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int a=i; a<=j; a++){
            String[] numA = String.valueOf(a).split("");
            
            for(String n : numA){
                if(n.equals(String.valueOf(k))) answer++;
            }
        }
        
        return answer;
    }
}