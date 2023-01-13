package Hash;

import java.util.HashMap;

public class LeetCode454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        HashMap<Integer,Integer> mapAB = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> mapCD = new HashMap<Integer,Integer>();
        for (int i: nums1) {
            for(int j:nums2) {
                int sum = i+j;
                mapAB.put(sum,mapAB.getOrDefault(sum,0)+1);
            }
        }
        for(int i:nums3){
            for(int j:nums4){
                int sum = i+j;
                mapCD.put(sum,mapCD.getOrDefault(sum,0)+1);
            }
        }
        for(int i: mapAB.keySet()){
            int oppo = -i;
            if(mapCD.containsKey(oppo)){
                int ans = mapAB.get(i)*mapCD.get(oppo);
                count += ans;
            }
        }
        return count;
    }
}
