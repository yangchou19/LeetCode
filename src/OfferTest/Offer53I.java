package OfferTest;

import java.util.HashMap;
import java.util.HashSet;

public class Offer53I {
    /**
     * 统计一个数字在排序数组中出现的次数。
     */
    public int search(int[] nums, int target) {
        int left=0, right= nums.length-1;
        // 右边界
        while(left<=right) {
            int mid = (left+right)/2;
            if(nums[mid]<=target) left = mid+1;
            else right = mid-1;
        }
        int rightBorder = left;
        // 左边界
        left=0;
        right= nums.length-1;
        while(left<=right) {
            int mid = (left+right)/2;
            if(nums[mid]<target) left = mid+1;
            else right = mid-1;
        }
        int leftBorder = right;
        return rightBorder-leftBorder-1;
    }
}
