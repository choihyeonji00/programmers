class Solution {
	public String solution(String letter) {
		String[] letterArr = letter.split(" ");
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String answer = "";
		for (int i = 0; i < letterArr.length; i++) {
			for (int j = 0; j < morse.length; j++) {
				if (letterArr[i].equals(morse[j])) {
					answer += alpha.charAt(j);
					break;
				}
			}
		}
		return answer;
	}
}