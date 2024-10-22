class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");       // 문자열을 한글자씩 분리 후 배열저장
        for(int i=0; i<my_string.length(); i++){  
            answer += str[i].repeat(n);		  	 // 반복 후 String으로 저장	
        }
        return answer;
    }
}