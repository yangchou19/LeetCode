package Hash;

import java.util.ArrayList;
import java.util.HashMap;

public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] result = new int[2];
        int index=0;
        for (int i: nums) {
            int sub = target - i;
            if(map.containsKey(sub)){
                result[0] = index;
                result[1] = (int)map.get(sub);
            }
            map.put(i,index);
            index++;
        }
        return result;
    }
}
