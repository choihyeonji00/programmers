import java.util.Arrays;
import java.util.Collections;

class Solution {
	public int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];
		
        //1. emergency를 내림차순으로 정렬
        int[] sortEmergency = Arrays.stream(emergency).boxed().sorted(Collections.reverseOrder())
				.mapToInt(Integer::valueOf).toArray();
		
        for (int i = 0; i < emergency.length; i++) {
			for (int j = 0; j < emergency.length; j++) {
				if (sortEmergency[i] == emergency[j]) {
					answer[j] = i+1;
				}
			}
		}
		return answer;
	}
}