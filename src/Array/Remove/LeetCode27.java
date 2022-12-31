package Array.Remove;

public class LeetCode27 {
    /**
     * 双指针法（快慢指针法）： 通过一个快指针和慢指针在一个for循环下完成两个for循环的工作。
     * 定义快慢指针
     * 快指针：寻找新数组的元素 ，新数组就是不含有目标元素的数组
     * 慢指针：指向更新 新数组下标的位置
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int slowindex=0;
        for (int fastindex=0; fastindex < nums.length;fastindex++){
            if(nums[fastindex] != val){
                nums[slowindex] = nums[fastindex];
                slowindex++;
            }
        }
        return slowindex;
    }

    /**
     * 相向双指针方法，基于元素顺序可以改变的题目描述改变了元素相对位置，确保了移动最少元素
     * @param nums
     * @param val
     * @return
     */
    //相向双指针法
    public int removeElementDouble(int[] nums, int val) {
        int left=0;
        int right=nums.length-1;
        while(right >=0 && nums[right] == val) right--;
        while(left <=right){
            if(nums[left] == val){ //left位置的元素需要移除
                nums[left] = right; //将right位置的元素移到left（覆盖），right位置移除
                right--;
            }
            left++;
            while(right >=0 && nums[right] == val) right--;
        }
        return left;
    }
}
