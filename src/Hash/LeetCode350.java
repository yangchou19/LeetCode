package Hash;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode350 {
    /**
     *给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。
     *返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length >= nums2.length){
            return intersect(nums2, nums1);
        }
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0));
        }
        int[] interaction = new int[nums2.length];
        int index =0;
        for(int i:nums2){
            int count = map.getOrDefault(i,0);
            if(count>0){
                interaction[index++]=i;
                count--;
                if(count>0){
                    map.put(i,count);
                }else{
                    map.remove(i);
                }
            }
        }
        return Arrays.copyOfRange(interaction,0,index);
    }
}
