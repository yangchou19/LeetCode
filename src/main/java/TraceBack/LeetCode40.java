package TraceBack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode40 {
    /**
     * 给定一个候选人编号的集合 candidates 和一个目标数 target ，
     * 找出 candidates 中所有可以使数字和为 target 的组合。
     */
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Boolean[] used = new Boolean[candidates.length];
        Arrays.fill(used, false);
        Arrays.sort(candidates);
        combinationSum2(candidates, target, used, 0, 0);
        return result;
    }
    private void combinationSum2(int[] candidates, int target, Boolean[] used, int sum, int startIndex){
        if(sum == target){
            result.add(new ArrayList(path));
            return;
        }
        for(int i = startIndex; i < candidates.length && sum + candidates[i] <= target; i++){
            if(i>0 && candidates[i] == candidates[i-1] && used[i-1] == false) continue;
            path.add(candidates[i]);
            sum += candidates[i];
            used[i] = true;
            combinationSum2(candidates, target, used, sum, i+1);
            used[i] = false;
            sum -= candidates[i];
            path.removeLast();
        }
    }
}
