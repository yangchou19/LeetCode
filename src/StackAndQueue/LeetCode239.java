package StackAndQueue;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode239 {
    /**
     * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。
     * 你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
     * 返回 滑动窗口中的最大值 。
     */
    class MyQueue{
        Deque<Integer> deque = new LinkedList<>();

        void poll(int val){
            if(!deque.isEmpty()&&val==deque.peek()){
                deque.poll();
            }
        }

        void add(int val){
            while(val >= deque.getLast() && !deque.isEmpty()){
                deque.removeLast();
            }
            deque.add(val);
        }

        int peek(){
            return deque.peek();
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==1) return nums;
        int len = nums.length;
        int[] res = new int[len-k+1];
        MyQueue queue = new MyQueue();
        for(int i = 0; i < k ; i++){
            queue.add(nums[i]);
        }
        int count = 0;
        for(int i=k; i<len; i++){
            queue.poll(nums[i-k]);
            queue.add(nums[i]);
            res[count++] = queue.peek();
        }
        return res;
    }
}
