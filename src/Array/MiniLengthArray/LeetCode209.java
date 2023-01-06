package Array.MiniLengthArray;

public class LeetCode209 {
    /**
     * 给定一个含有n个正整数的数组和一个正整数 target 。
     * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组[numsl, numsl+1, ..., numsr-1, numsr] ，
     * 并返回其长度。如果不存在符合条件的子数组，返回 0 。
     */
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0; // 左边窗口
        int sum = 0 ; // 数组
        int sublength = 0; // 数组长度；
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++){
            sum = sum+nums[right];
            while(sum >= target){
                sublength = right - left + 1;
                result = result < sublength ? result : sublength;
                sum -= nums[left++];
            }
        }
        return result = result==Integer.MAX_VALUE ? 0: result;
    }
}
