class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        
        for(int igdt : ingredient) {
            sb.append(igdt);
            
            if(sb.length() >= 4) {
                if("1231".equals(sb.substring(sb.length() - 4))) {
                    sb.delete(sb.length() - 4, sb.length());
                    answer++;
                }
            }
        }
        
        return answer;
    }
}