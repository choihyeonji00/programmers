class Solution {
    public int[] solution(int[] arr) {
    	// 배열의 요소가 하나라면 -1 반환 (최소값 삭제 시 빈 배열)
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        
        // arr 길이보다 하나 작은 answer 배열 생성 (최소값이 삭제될 것이므로)
        int[] answer = new int[arr.length-1];
        int minIdx = 0; // 최소값을 가진 배열 인덱스
        
        // 최소값을 가진 배열 인덱스 탐색
        for(int i=0; i<arr.length; i++) {
            if(arr[minIdx] > arr[i]) minIdx = i;
        }
        
        // 최소값 인덱스부터 뒤 요소들 덮어쓰기 (최소값 삭제)
        for(int i=minIdx+1; i<arr.length; i++) {
            arr[i-1] = arr[i];
        }
        
        // answer 배열에 넣어주기
        for(int i=0; i<arr.length-1; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}