package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode77 {
    /**
     * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
     *
     * 你可以按 任何顺序 返回答案。
     */

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        combineHelper(n,k,1);
        return result;
    }
    private void combineHelper(int n, int k, int startIndex) {
        if(path.size()==k){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=startIndex; i <= n-(k-path.size())+1; i++){
            path.add(i);
            combineHelper(n,k,i+1);
            path.removeLast();
        }
    }
}
