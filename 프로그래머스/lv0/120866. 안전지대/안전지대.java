class Solution {
    static boolean safety[][];
    static int len;
    static int answer;
    
    public int solution(int[][] board) {
        answer = 0;
        len = board.length;
        safety = new boolean[len][len];
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] == 1) check(i, j);
            }
        }
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (safety[i][j] == false) answer++;
            }
        }
        
        return answer;
    }
    
    public void check(int row, int col) {
        for (int i = row - 1; i <= row + 1; i++) {
            if (i < 0 || i >= len) continue;
            else {
                for (int j = col - 1; j <= col + 1; j++) {
                    if (j < 0 || j >= len) continue;
                    else safety[i][j] = true;
                }
            }
        }
    }
    
}