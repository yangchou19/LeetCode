package OfferTest;

public class offer12 {
    /**
     * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。
     * 如果 word 存在于网格中，返回 true ；
     * 否则，返回 false 。
     */
    //todo:二刷
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j< board[0].length; j++) {
                if(dfs(board, words,i, j, 0)) return true;
            }
        }
        return false;
    }
    boolean dfs(char[][] board, char[] words, int i, int j, int k){
        if (i >=board.length || i<0 || j>=board[0].length || j<0 ||words[k]!=board[i][j]) return false;
        if ( k==words.length -1 ) return true;
        board[i][j] = '\0';
        boolean res = dfs(board, words, i+1, j, k+1) || dfs(board, words, i-1, j, k+1) || dfs(board, words, i, j-1, k+1) || dfs(board,words,i,j+1,k+1);
        board[i][j] = words[k];   //还原元素，用于其他循环遍历
        return res;
    }
}
