class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int a,b,temp;
  
        for(int i=0; i<queries.length; i++){
            a = queries[i][0];
            b = queries[i][1];
            
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        
        return arr;
    }
}