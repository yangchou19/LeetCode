package DynamicPlan;

import java.util.Arrays;

public class LeetCode279 {
    /**
     * 给你一个整数 n ，返回 和为 n 的完全平方数的最少数量 。
     */
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        int max =Integer.MAX_VALUE;
        Arrays.fill(dp,max);
        dp[0] = 0;
        for(int i=0; i<=Math.sqrt(n);i++){
            int num = i*i;
            for(int j=num; j<=n;j++){
                if(dp[j]!=max){
                    dp[j] = Math.min(dp[j],dp[j-num]+1);
                }
            }
        }
        return dp[n];
    }
}
