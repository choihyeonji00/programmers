import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int len = board[0].length;
         Stack<Integer> st = new Stack<>();
         
        for(int mv:moves){
            mv -=1;
            for(int i=0; i<len; i++){  
                if(board[i][mv] != 0){     //인형집을 위치에 인형이 있는경우 board[mv][i] 
                    if(st.size() > 0  && st.peek() == board[i][mv] ){  //지금 뽑은 인형과 마지막 인형이 같다면
                        st.pop();
                        answer += 2;
                    }else{
                         st.push(board[i][mv]); //인형 넣기 
                    }
                    board[i][mv] = 0; //인형뽑았으니 0으로 세팅 
                    break; 
                }
            }  
        } 
        return answer;
    }
}