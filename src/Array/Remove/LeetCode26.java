package Array.Remove;

public class LeetCode26 {
    /**
     * 给你一个升序排列的数组 nums ，请你原地删除重复出现的元素，使每个元素只出现一次 ，
     * 返回删除后数组的新长度。元素的相对顺序应该保持一致 。
     */
    public int removeDuplicates(int[] nums) {
        int slowindex = 0;
        int fastindex = 0;
        while(fastindex < nums.length) {
            int number = nums[fastindex];
            nums[slowindex] = number;
            slowindex++;
            while(fastindex < nums.length && nums[fastindex] == number) fastindex++; // 找到下一个不重复的index
        }
        return slowindex;
    }
}
