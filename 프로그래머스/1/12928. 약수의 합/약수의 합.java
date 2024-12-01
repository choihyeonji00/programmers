class Solution {
	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n / 2; i++) { 
			if (n % i == 0) // 1부터 ~ n/2 까지 나누어 떨어지면 약수
				answer += i;
		}
		return answer + n; //자기 자신 더하기
	}
}