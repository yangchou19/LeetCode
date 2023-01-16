package StackAndQueue;

import java.util.Stack;

public class LeetCode232 {
    /**
     * 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：
     * 实现 MyQueue 类：
     * void push(int x) 将元素 x 推到队列的末尾
     * int pop() 从队列的开头移除并返回元素
     * int peek() 返回队列开头的元素
     * boolean empty() 如果队列为空，返回 true ；否则，返回 false
     */
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;
    public LeetCode232() {
        stackIn = new Stack<>(); // 负责进栈
        stackOut = new Stack<>(); // 负责出栈
    }
    public void push(int x) {
        stackIn.push(x);
    }
    public int pop() {
        dumpstackIn();
        return stackOut.pop();
    }
    public int peek() {
        dumpstackIn();
        return stackOut.peek();
    }
    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
    // 如果stackOut为空，那么将stackIn中的元素全部放到stackOut中
    private void dumpstackIn(){
        if (!stackOut.isEmpty()) return;
        while (!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }
    }
}
