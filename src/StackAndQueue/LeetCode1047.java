package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class LeetCode1047 {
    /**
     * 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
     * 在 S 上反复执行重复项删除操作，直到无法继续删除。
     * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
     */
    public String removeDuplicates(String s) {
        Deque<Character> deque = new LinkedList<>();
        char ch;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(deque.isEmpty()){
                deque.push(ch);
            }else{
                if(deque.peek() != ch){
                    deque.push(ch);
                }else {
                    deque.pop();
                }
            }

        }
        String str = "";
        //剩余的元素即为不重复的元素
        while (!deque.isEmpty()) {
            str = deque.pop() + str;
        }
        return str;
    }
}
