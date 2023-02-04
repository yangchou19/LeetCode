package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode216 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int sum = 0;
        combinationSumHelper(k, n,sum, 1);
        return result;
    }
    private void combinationSumHelper(int k, int n, int sum, int startIndex) {
        if(path.size()==k){
            if(sum==n) result.add(new ArrayList<Integer>(path));
            return;
        }
        for(int i=startIndex; i < 9; i++) {
            path.add(i);
            sum+=i;
            combinationSumHelper(k,n,sum,i+1);
            sum-=i;
            path.removeLast();
        }
    }
}
