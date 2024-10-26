class Solution {
    public int solution(int[] box, int n) {
        int answer, w, d, h = 0;
        
        w = box[0] / n;
        d = box[1] / n;
        h = box[2] / n;
        answer = w  * d * h;
        
        return answer;
    }
}