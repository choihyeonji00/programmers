class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int count = 0;
        int[] newArr = new int[arr.length];
        long startTime = System.currentTimeMillis(); // 시작 시간 저장
        
        while(count != arr.length){
            count = 0;
            newArr = arr.clone();
            
            for(int i=0; i<arr.length; i++){
                if(arr[i]%2==0&&arr[i]>=50){
                    arr[i] /= 2;
                }else if(arr[i]%2!=0&&arr[i]<50){
                    arr[i] = arr[i] * 2 + 1;
                }
                if(arr[i] == newArr[i]){
                    count++;
                }
            }
            answer++;
        }
        
        long endTime = System.currentTimeMillis(); // 종료 시간 저장
        long executionTime = endTime - startTime; // 실행 시간 계산

        System.out.println("Execution Time: " + executionTime + "ms"); // 실행 시간 출력
        
        return answer-1;
    }
}