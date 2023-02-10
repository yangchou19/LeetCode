package Greed;

public class LeetCode376 {
    /**
     * 给你一个整数数组 nums ，返回 nums 中作为 摆动序列 的 最长子序列的长度 。
     */
    public int wiggleMaxLength(int[] nums) {
        if(nums.length <=1) return nums.length;

        int curDiff = 0; // current
        int preDiff = 0; // previous
        int result = 1;
        for(int i = 1; i < nums.length; i++){
            curDiff = nums[i]- nums[i-1];
            if((curDiff > 0 && preDiff <=0) || (curDiff < 0 && preDiff >=0)){
                result ++;
                preDiff = curDiff;
            }
        }
        return result;
    }
}
