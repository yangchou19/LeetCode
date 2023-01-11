package Hash;

import java.util.ArrayList;
import java.util.List;

public class LeetCode438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();
        int r = p.length();
        int l = 0;
        while(r<s.length()) {
            String substring = s.substring(l,r);
            if(isAnagram(p,substring)){
                result.add(l);
            }
            l++;
            r++;
        }
        return result;
    }
    public boolean isAnagram(String s, String t) {
        if (s.length()!= t.length()) {
            return false;
        }
        int[] record = new int[26];
        for (int i = 0; i < s.length(); i++) {
            record[s.charAt(i) - 'a']++; // 并不需要记住字符a的ASCII，只要求出一个相对数值就可以了
        }
        for (int i = 0; i < t.length(); i++) {
            record[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (record[i]!= 0) {
                return false;
            }
        }
        return true;
    }
}
