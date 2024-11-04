public class Solution {
    private double slope(int[] dot1, int[] dot2) {
        int x1 = dot1[0];
        int y1 = dot1[1];
        int x2 = dot2[0];
        int y2 = dot2[1];
        return (double)(y2 - y1) / (x2 - x1);
    }
    
    public int solution(int[][] dots){
        int answer = 0;
        
        for(int i=0; i<dots.length; i++){
            for(int j=i+1; j<dots.length; j++){
                double slope1 = slope(dots[i], dots[j]);
                
                for(int k=i+1; k<dots.length; k++){
                    if(k == j) continue;
                    
                    for(int l=k+1; l<dots.length; l++){
                        if(l == i || l == j) continue;
                        
                        double slope2 = slope(dots[k], dots[l]);
                        if(slope1 == slope2){
                            answer = 1;
                            break;
                        }
                    }
                }
            }
        }
        return answer;
    }
}