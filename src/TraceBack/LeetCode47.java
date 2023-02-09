package TraceBack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode47 {
    /**
     * 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
     */
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        permuteUniqueHelper(nums, used);
        return result;
    }
    private void permuteUniqueHelper(int[] nums, boolean[] used) {
        if(path.size()==nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(i>0 && nums[i] == nums[i-1] && used[i-1] == false || used[i] == true) continue;
            used[i] = true;
            path.add(nums[i]);
            permuteUniqueHelper(nums, used);
            path.removeLast();
            used[i] = false;
        }
    }
}
