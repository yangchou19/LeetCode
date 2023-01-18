package StackAndQueue;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode20 {
    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     */
    public boolean isValid(String s) {
        Deque<Character> deque = new LinkedList<>();
        char ch;
        for(int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            //碰到左括号，就把相应的右括号入栈
            if(ch == '('){
                deque.push(')');
            }else if (ch == '{') {
                deque.push('}');
            }else if (ch == '[') {
                deque.push(']');
            }else if(deque.isEmpty() || deque.peek() != ch){
                return false;
            }else {
                deque.pop();
            }
        }
        return deque.isEmpty();
    }
}
