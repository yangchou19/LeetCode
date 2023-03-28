package OfferTest;

import java.util.HashMap;

public class offer50 {
    /**
     * 在字符串 s 中找出第一个只出现一次的字符。
     * 如果没有，返回一个单空格。
     * s 只包含小写字母。
     */
    public char firstUniqChar(String s) {
        if(s.length()==0) return ' ';
        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
        for(int i=0; i<s.length(); i++){
            hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i<s.length(); i++){
            if(hashMap.get(s.charAt(i))==1) return s.charAt(i);
        }
        return ' ';
    }
}
