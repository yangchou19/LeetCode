package Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int length = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < length; i++) {
            if (nums[i]>0 && nums[i] > target) {
                return result;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {  // 去重a
                continue;
            }
            for (int j = i+1; j < length; j++) {
                if (j > i+1 && nums[j] == nums[j - 1]) {  // 去重b
                    continue;
                }
                int l = j+1;
                int r = length - 1;
                while (l < r){
                    long sum = (long) nums[i] +nums[j]+ nums[l] + nums[r];
                    if(sum > target){
                        r--;
                    }else if(sum<target){
                        l++;
                    }else{
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[l]);
                        temp.add(nums[r]);
                        result.add(temp);
                        // 去重
                        while (r > l && nums[r] == nums[r - 1]) r--;
                        while (r > l && nums[l] == nums[l + 1]) l++;
                        r--;
                        l++;
                    }
                }
            }
        }
        return result;
    }
}
