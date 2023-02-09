package TraceBack;

public class LeetCode37 {
    /**
     * 编写一个程序，通过填充空格来解决数独问题。
     * 一个数独的解法需遵循如下规则：
     * 数字 1-9 在每一行只能出现一次。
     * 数字 1-9 在每一列只能出现一次。
     * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。 空白格用 '.' 表示。
     */
    public void solveSudoku(char[][] board) {
        backtracking(board);
    }
    private boolean backtracking(char[][] board) {
        for(int i=0; i < 9; i++) {
            for(int j=0;i < 9;j++){
                if(board[i][j]!='.') continue;
                for(char k='1';k<='9';k++){
                    if(isValid(i,j,k,board)){
                        board[i][j] = k;
                        if (backtracking(board)) return true; // 如果找到合适一组立刻返回
                        board[i][j] = '.';
                    }
                }
                return false;   // 9个数都试完了，都不行，那么就返回false
            }
        }
        return true; // 遍历完没有返回false，说明找到了合适棋盘位置了
    }

    /**
     * 判断棋盘是否合法有如下三个维度:
     *     同行是否重复
     *     同列是否重复
     *     9宫格里是否重复
     */
    private boolean isValid(int row, int col, char val, char[][] board) {
        // 同行是否重复
        for (int i=0; i < 9; i++){
            if(board[row][i] == val) return false;
        }
        // 同列是否重复
        for(int j=0; j<9; j++){
            if(board[j][col] == val) return false;
        }

        // 9宫格里是否重复
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++){
            for (int j = startCol; j < startCol + 3; j++){
                if (board[i][j] == val){
                    return false;
                }
            }
        }
        return true;
    }
}
