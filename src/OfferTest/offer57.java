package OfferTest;

public class offer57 {
    /**
     * 输入一个递增排序的数组和一个数字s，
     * 在数组中查找两个数，
     * 使得它们的和正好是s。
     * 如果有多对数字的和等于s，
     * 则输出任意一对即可。
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int left=0, right=nums.length-1;
        while(left < right) {
            int sum = nums[left]+nums[right];
            if(sum == target){
                result[0] = nums[left];
                result[1] = nums[right];
                return result;
            } else if (sum < target) {
                left++;
            }else right--;
        }
        return new int[2];
    }
}
