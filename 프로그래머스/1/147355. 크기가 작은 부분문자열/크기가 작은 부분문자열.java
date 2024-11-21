class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        for(int i=0; i<=t.length()-len; i++) {
            Long temp = Long.parseLong(t.substring(i, i+len));
            if(temp <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}
