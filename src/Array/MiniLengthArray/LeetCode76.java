package Array.MiniLengthArray;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LeetCode76 {
    /**
     * 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。
     * 如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 ""
     */
    Map<Character, Integer> ori = new HashMap<Character, Integer>();  //统计窗口的字符
    Map<Character, Integer> cnt = new HashMap<Character, Integer>(); //统计给出的字符串

    public String minWindow(String s, String t) {
        int tLen = t.length();
        for(int i=0; i < tLen; i++) {
            char c = t.charAt(i);
            ori.put(c, ori.getOrDefault(c,0)+1);
        }
        int l=0, r=0; // 滑动窗口位置
        int length = Integer.MAX_VALUE, ansL= -1, ansR = -1;  // 最终结果位置
        int sLen = s.length();
        while (r < sLen){
            if(ori.containsKey(s.charAt(r))){
                cnt.put(s.charAt(r), cnt.getOrDefault(s.charAt(r),0)+1);
            }
            while(check() && l <= r ){
                // 更新长度
                if(r-l+1 <= length){
                    ansL = l;
                    ansR = r;
                    length = r -l +1;
                }
                if(cnt.containsKey(s.charAt(l))){
                    cnt.put(s.charAt(l), cnt.getOrDefault(s.charAt(l), 0)-1);
                }
                l++;
            }
            ++r;
        }
        return ansL == -1 ? "": s.substring(ansL, ansR);
    }
    public boolean check() { // 判定字符串否匹配
        Iterator iter = ori.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();  // 映射项
            Character key = (Character) entry.getKey();
            Integer val = (Integer) entry.getValue();
            if (cnt.getOrDefault(key, 0) < val) {
                return false;
            }
        }
        return true;
    }
}
