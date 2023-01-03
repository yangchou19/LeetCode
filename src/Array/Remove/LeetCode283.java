package Array.Remove;

public class LeetCode283 {
    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int slowindex = 0;
        for (int fastindex = 0; fastindex < nums.length; fastindex++){
            if (nums[fastindex] != 0) {
                nums[slowindex] = nums[fastindex]; // 快指针找出相应的非0index
                slowindex++;
            }
        }
        while (slowindex < nums.length) {
            nums[slowindex] = 0; // 剩余的赋予0
            slowindex++;
        }

    }
}
