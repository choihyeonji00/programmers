class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int index = 0;
        int[] answer = new int[num2 - num1 + 1];     // 배열의 크기 지정
        for (int i = num1; i <= num2; i++) {
            answer[index] = numbers[i];				// 여기서 값을 받기 위해 새로운 배열을 생성했음
            index++;								

          }
        return answer;
    }
}