package DynamicPlan;

import java.util.Arrays;

public class LeetCode718 {
    /**
     * 给两个整数数组 A 和 B ，
     * 返回两个数组中公共的、长度最长的子数组的长度。
     */
    public int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length+1][nums2.length+1]; //以下标i - 1为结尾的A，和以下标j - 1为结尾的B，最长重复子数组长度为dp[i][j]
        int result = 0;
        for(int i = 1; i < nums1.length+1; i++) {
            for(int j = 1; j <nums2.length+1; j++) {
                if(nums1[i-1]==nums2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                    result = Math.max(result, dp[i][j]);
                }
            }
        }
        return  result;
    }
}
