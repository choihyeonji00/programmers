class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int col = board[1];
        int row = board[0];
        
        for(int i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("left") && answer[0]-1 >= -(row/2)){
                answer[0] = answer[0] - 1;
            }else if(keyinput[i].equals("right") && answer[0]+1 <= (row/2)){
                answer[0] = answer[0] + 1;
            }else if(keyinput[i].equals("up") && answer[1]+1 <= (col/2)){
                answer[1] = answer[1] + 1;
            }else if(keyinput[i].equals("down") && answer[1]-1 >= -(col/2)){
                answer[1] = answer[1] - 1;
            }
        }
        return answer;
    }
}