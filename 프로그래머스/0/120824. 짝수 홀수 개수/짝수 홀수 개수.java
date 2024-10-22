class Solution {
	public int[] solution(int[] num_list) {
		int[] result = { 0, 0 };
		for (int i : num_list) {
			if (i % 2 == 0) {
				result[0]++;
			} else {
				result[1]++;
			}
		}
		return result;
	}
}