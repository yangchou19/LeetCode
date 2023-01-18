package StackAndQueue;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode150 {
    /**
     * 根据 逆波兰表示法，求表达式的值。
     *
     * 有效的运算符包括 + ,  - ,  * ,  / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
     */
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList();
        for (String s : tokens) {
            if(s.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(s.equals("-")){
                stack.push(-stack.pop() + stack.pop());
            } else if ("*".equals(s)) {
                stack.push(stack.pop() * stack.pop());
            } else if ("/".equals(s)) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 / temp1);
            }else {
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();
    }
}
