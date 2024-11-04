class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[] dx = {-1,-1,0,1,1,1,0,-1};
        int[] dy = {0,1,1,1,0,-1,-1,-1};

        for (int i = 0; i< board.length; i++){
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1){
                    for (int k = 0; k < dx.length; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length && board[nx][ny] == 0){
                            board[nx][ny] = -1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0){
                    answer++;
                }
            }
        }
        return answer;
    }
}