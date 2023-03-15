package DynamicPlan;

public class LeetCode53 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length]; //dp[i]代表当前下标对应的最大值
        dp[0] = nums[0];
        int result = nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],dp[i-1]+nums[i]);
            result = Math.max(result,dp[i]);
        }
        return result;
    }
}
