package OfferTest;

import java.util.HashMap;

public class Offer03 {
    /**
     *在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
     *数组中某些数字是重复的，
     * 但不知道有几个数字重复了，
     * 也不知道每个数字重复了几次。
     * 请找出数组中任意一个重复的数字。
     */
    public int findRepeatNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i <nums.length;i++){
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
            if(hashMap.get(nums[i])>1){
                return nums[i];
            }
        }
        return -1;
    }
}
