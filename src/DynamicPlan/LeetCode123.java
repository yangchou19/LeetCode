package DynamicPlan;

public class LeetCode123 {
    public int maxProfit(int[] prices) {
       int[][] dp = new int[prices.length][4];
       dp[0][0] = -prices[0]; // 第一次持有股票最大现金
       dp[0][1] = 0; // 第一次卖掉
       dp[0][2] = -prices[0]; // 第二次持有股票
       dp[0][3] = 0;// 第二次卖掉

       for(int i = 1; i < prices.length; i++) {
           dp[i][0] = Math.max(dp[i-1][0], -prices[i]);
           dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0]+prices[i]);
           dp[i][2] = Math.max(dp[i-1][2],dp[i-1][1]-prices[i]);
           dp[i][3] = Math.max(dp[i-1][3],dp[i-1][2]+prices[i]);
       }
       return dp[prices.length-1][3]>0?dp[prices.length-1][3]:0;
    }
}
