class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddBuilder = new StringBuilder();
        StringBuilder evenBuilder = new StringBuilder();
        
        for (int num : num_list) {
            if (num % 2 == 0) {
                evenBuilder.append(num); // 짝수이면 추가
            } else {
                oddBuilder.append(num); // 홀수이면 추가
            }
        }
        
        // 홀수와 짝수 문자열을 정수로 변환하여 더함
        int oddSum = oddBuilder.length() > 0 ? Integer.parseInt(oddBuilder.toString()) : 0;
        int evenSum = evenBuilder.length() > 0 ? Integer.parseInt(evenBuilder.toString()) : 0;

        return oddSum + evenSum; // 최종 합 반환
    }
}
