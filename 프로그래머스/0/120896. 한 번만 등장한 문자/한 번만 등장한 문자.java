import java.util.Arrays;

class Solution {
	public String solution(String s) {
		String answer = "";

		//중복제거
		String[] arr = Arrays.stream(s.split(""))
        	.distinct()
        	.sorted()
        	.toArray(String[]::new);
		
        //중복횟수 확인
        for (int i = 0; i < arr.length; i++) {
			String a = arr[i];
			int duplication = (int) Arrays.stream(s.split(""))
            	.filter(x -> x.equals(a))
            	.count();

			if (duplication == 1) {
				answer += a;
			}
		}
		return answer;
	}
}