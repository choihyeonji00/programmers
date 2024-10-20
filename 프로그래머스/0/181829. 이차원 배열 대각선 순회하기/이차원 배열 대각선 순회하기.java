class Solution {
    public int solution(int[][] board, int k) {
        int sum = 0;

        for (int i = 0; i <= k; i++) {
            for (int j = 0; j <= k - i; j++) {
                if (i < board.length && j < board[i].length) {
                    sum += board[i][j];
                }
            }
        }

        return sum;
    }
}