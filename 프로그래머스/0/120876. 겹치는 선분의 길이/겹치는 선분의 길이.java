class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int coordinate[] = new int[500];
        
        for(int i = 0; i < 3; i++) {
            for(int k = lines[i][0]; k < lines[i][1]; k++) {
                coordinate[100+k]++;
            }
        }
        
        for(int j = 0; j < 206; j++) {
            if(coordinate[j] > 1) answer++;
        }
        
        return answer;
    }
}