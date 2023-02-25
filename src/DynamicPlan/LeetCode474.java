package DynamicPlan;

public class LeetCode474 {
    /**
     * 给你一个二进制字符串数组 strs 和两个整数 m 和 n 。
     * 请你找出并返回 strs 的最大子集的长度，
     * 该子集中 最多 有 m 个 0 和 n 个 1 。
     * 如果 x 的所有元素也是 y 的元素，集合 x 是集合 y 的 子集 。
     */
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int i=0; i<strs.length;i++){
            int num0 = 0;
            int num1 = 0;
            for(char c : strs[i].toCharArray()) {
                if(c == '0') num0++;
                if (c == '1') num1++;
            }
            for(int j=m; j>=num0; j--){
                for(int k=n; k>=num1; k--){
                    dp[i][j] = Math.max(dp[i][j], dp[j-num0][k-num1]+1);
                }
            }
        }
        return dp[m][n];
    }
}
