import java.util.Arrays;

class Solution {
   	public int solution(int[] rank, boolean[] attendance) {
		int answer = 0;
		int sort[] = new int[rank.length];
        
        // sort 배열 생성
		for (int i = 0; i < rank.length; i++) {
			if (attendance[i]) {
				sort[i] = rank[i];
			} else {
				rank[i] = Integer.MAX_VALUE;
			}
		}
        
        // 오름차순 정렬
		Arrays.sort(rank);

		// 10000 × a + 100 × b + c 계산
		for (int i = 0; i < sort.length; i++) {
			if (rank[0] == sort[i]) {
				answer += i * 10000;
			} else if (rank[1] == sort[i]) {
				answer += i*100;
			} else if (rank[2] == sort[i]) {
				answer += i;
			}
		}

		return answer;
	}
}