package DynamicPlan;

public class LeetCode96 {
    /**
     * 给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？
     */
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i=2;i<=n;i++){
            for(int j=0;j<=i-1;j++){
                dp[i] +=dp[j]*dp[i-1-j];
            }
        }
        return dp[n+1];
    }
}
