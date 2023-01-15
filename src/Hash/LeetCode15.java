package Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15 {
    /**
     *给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
     * 同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
     * 你返回所有和为 0 且不重复的三元组。
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int length = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < length; i++) {
            if (nums[i] > 0) {
                return result;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {  // 去重a
                continue;
            }

            int l = i+1;
            int r = length - 1;
            while (l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    result.add(temp);
                    // 去重
                    while (r > l && nums[r] == nums[r - 1]) r--;
                    while (r > l && nums[l] == nums[l + 1]) l++;
                    r--;
                    l++;
                }else if(sum<0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return result;
    }
}
