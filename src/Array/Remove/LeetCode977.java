package Array.Remove;

public class LeetCode977 {
    /**
     * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {
        int negative = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] <=0 ){
                negative = i;
            }else{
                break;
            }
        }
        int positive = negative + 1;
        int[] ans = new int[nums.length];
        int index = 0;
        while(negative >= 0 || positive < nums.length ){
            if(negative < 0){
                ans[index] = nums[positive]*nums[positive];
                positive++;
            }
            else if(positive == nums.length){
                ans[index] = nums[negative]*nums[negative];
                negative--;
            }else if (nums[negative]*nums[negative] < nums[positive]*nums[positive]){
                ans[index] = nums[negative]*nums[negative];
                negative--;
            }else  {
            ans[index] = nums[positive] * nums[positive];
            positive++;
            }
            index++;
        }
        return ans;
    }
}
