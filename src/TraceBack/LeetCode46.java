package TraceBack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode46 {
    /**
     * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
     */
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        permuteHelper(nums, used);
        return result;
    }
    private void permuteHelper(int[] nums, boolean[] used){
        if(path.size()==nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0; i<nums.length; i++){
            if(used[i]== true) continue;
            used[i] = true;
            path.add(nums[i]);
            permuteHelper(nums, used);
            used[i] = false;
            path.removeLast();
        }
    }
}
