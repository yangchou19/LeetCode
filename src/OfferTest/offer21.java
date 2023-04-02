package OfferTest;

public class offer21 {
    /**
     * 输入一个整数数组，
     * 实现一个函数来调整该数组中数字的顺序，
     * 使得所有奇数在数组的前半部分，
     * 所有偶数在数组的后半部分。
     */
    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right) {
            if(nums[left] %2 ==0 && nums[right] %2 !=0) {
                int odd = nums[right];
                int even = nums[left];
                nums[left] = odd;
                nums[right] = even;
                left++;
                right--;
            } else if (nums[left] %2 ==0 && nums[right] %2 ==0) {
                right--;
            } else if (nums[left] %2 !=0 && nums[right] %2 !=0) {
                left++;
            }else{
                left++;
                right--;
            }
        }
        return nums;
    }
}
