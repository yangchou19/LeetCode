package Hash;

import java.util.HashSet;
import java.util.Set;

public class LeetCode349 {
    /**
     * 题意：给定两个数组，编写一个函数来计算它们的交集。
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for (int i: nums1){
            set1.add(i);
        }

        for (int i: nums2){
            if (set1.contains(i)){
                set2.add(i);
            }
        }

        int[] result = new int[set2.size()];
        Object[] obj = set2.toArray();
        for (int i=0; i < result.length; i++){
            result[i] = (int)obj[i];
        }
        return result;
    }
}
