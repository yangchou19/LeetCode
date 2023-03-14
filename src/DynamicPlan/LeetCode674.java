package DynamicPlan;

import java.util.Arrays;

public class LeetCode674 {
    /**
     * 给定一个未经排序的整数数组，
     * 找到最长且 连续递增的子序列，
     * 并返回该序列的长度。
     */
    public int findLengthOfLCIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int result = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]>nums[i-1]) dp[i] = Math.max(dp[i],dp[i-1]+1);
            result = Math.max(result,dp[i]);
        }
        return result;
    }
}
