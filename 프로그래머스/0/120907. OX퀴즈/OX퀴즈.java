class Solution {

	public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];

		for (int i = 0; i < quiz.length; i++) {
			String[] arr = quiz[i].split(" ");
			int result = Integer.valueOf(arr[0]);
			result = arr[1].equals("+") ? result + Integer.valueOf(arr[2]) : result - Integer.valueOf(arr[2]);

			answer[i] = result == Integer.valueOf(arr[4]) ? "O" : "X";
		}
		return answer;
	}
}