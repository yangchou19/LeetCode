package OfferTest;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {
    /**
     * 定义栈的数据结构，
     * 请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，
     * 调用 min、push 及 pop 的时间复杂度都是 O(1)
     */
    Deque<Integer> xStack;
    Deque<Integer> minStack;
    public MinStack() {
        xStack = new ArrayDeque<Integer>();
        minStack = new ArrayDeque<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        if(x<minStack.peek()){
            minStack.push(x);
        }else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
