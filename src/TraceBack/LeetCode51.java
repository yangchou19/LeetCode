package TraceBack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode51 {
    /**
     * n 皇后问题 研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
     * 给你一个整数 n ，返回所有不同的 n 皇后问题 的解决方案。
     * 每一种解法包含一个不同的 n 皇后问题 的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
     */
    List<List<String>> result = new ArrayList<List<String>>();
    public List<List<String>> solveNQueens(int n) {
        char[][] chessBoard = new char[n][n];
        for(char[] c : chessBoard){
            Arrays.fill(c,'.');
        }
        backtrack(n,0,chessBoard);
        return result;
    }
    public void backtrack(int n, int row, char[][] chessBoard) {
        if(row == n){
            result.add(Array2List(chessBoard));
            return;
        }
        for (int col = 0 ; col < n; col++){
            if(isValid(row, col,n, chessBoard)){
                chessBoard[row][col] = 'Q';
                backtrack(n, row+1, chessBoard);
                chessBoard[row][col] = '.';

            }
        }
    }

    private boolean isValid(int row, int col, int n, char[][] chessBoard){
        // 检查列
        for(int i = 0 ; i < row ; i++){
            if(chessBoard[i][col] == 'Q'){
                return false;
            }
        }
        // 检查45度, 上半部分
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(chessBoard[i][j] == 'Q') return false;
        }
        // 检查135度, 上半部分

        for(int i=row-1, j=col+1; i>=0&&j<n; i--,j++){
            if(chessBoard[i][j] == 'Q') return false;
        }
        return true;
    }

    private List<String> Array2List (char[][] chessBoard){
        ArrayList<String> result = new ArrayList<String>();
        for(char[] c:chessBoard){
            result.add(String.valueOf(c));
        }
        return result;
    }


}
