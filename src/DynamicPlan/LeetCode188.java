package DynamicPlan;

public class LeetCode188 {
    /**
     * 给定一个整数数组 prices ，
     * 它的第 i 个元素 prices[i] 是一支给定的股票在第 i 天的价格。
     * 设计一个算法来计算你所能获取的最大利润。
     * 你最多可以完成 k 笔交易。
     */
    public int maxProfit(int k, int[] prices) {
        int[][] dp = new int[prices.length][2*k]; //偶数买入，奇数卖出
        for (int i = 0; i < 2*k; i++){
            if(i%2==1){
                dp[0][i] = 0;
            }else {
                dp[0][i] = -prices[0];
            }
        };
        for(int i = 1; i <prices.length; i++){
            dp[i][0] = Math.max(dp[i-1][0], -prices[i]);
            for(int j =1;j<2*k;j++){
                if(j%2==1){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]+prices[i]);
                }else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]-prices[i]);
                }
            }
        }
        return dp[prices.length-1][2*k-1]>0?dp[prices.length-1][2*k-1]:0;

    }
}
