package DynamicPlan;

import java.util.Arrays;

public class LeetCode300 {
    /**
     * 给你一个整数数组 nums ，
     * 找到其中最长严格递增子序列的长度。
     */
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length]; //dp[i]代表num[i]之前的最长递增序列长度
        Arrays.fill(dp, 1);
        int result = 1;
        for (int i = 1; i < nums.length;i++){
            for(int j = 0; j<i; j++){
                if(nums[i] > nums[j]) dp[i] = Math.max(dp[i],dp[j]+1);
            }
            result = Math.max(result,dp[i]);
        }
        return result;
    }
}
