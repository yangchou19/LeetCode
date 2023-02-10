package Greed;

public class LeetCode53 {
    /**
     * 给定一个整数数组 nums ，
     * 找到一个具有最大和的连续子数组（子数组最少包含一个元素），
     * 返回其最大和。
     */
    public int maxSubArray(int[] nums) {
        int count = nums[0];
        int result = nums[0];
        for (int i = 0; i < nums.length; i++){
            if ((count + nums[i]) < 0) {
                count = 0;
            }else{
                count += nums[i];
            }
            if(count >= result) result = count;
        }
        return result;
    }
}
