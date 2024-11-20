import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
    	// 결과를 담을 배열 선언
        int[] answer = new int[score.length];
        
        // 순위를 담을 List 선언
        List<Integer> rank = new ArrayList<>();
        
        // score를 반복
        for (int i = 0; i < score.length; i++) {
            // score 추가
            rank.add(score[i]);
            
            // rank 리스트의 크기가 k보다 크면 가장 낮은 점수 제거 
            if (rank.size() > k) {
                rank.remove(Collections.min(rank));
            }
            
            // 남은 점수 중 가장 작은 점수 answer에 담기
            answer[i] = Collections.min(rank);
        }
        return answer;
    }
}