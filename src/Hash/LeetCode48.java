package Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeetCode48 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs == null) {
            List<String> temp = new ArrayList<>();
            temp.add("");
            result.add(temp);
            return result;
        }
        int[]  visited = new int[strs.length];
        for (int i = 0; i < strs.length; i++){
            if (visited[i]==0) {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                for (int j = i + 1; j < strs.length; j++) {
                    if (visited[j] == 0 && isAnagram(strs[i], strs[j])) {
                        temp.add(strs[j]);
                        visited[j] = 1;
                    }
                }
                result.add(temp);
            }
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

    public List<List<String>> groupAnagramsHash(String[] strs) {
        int len = strs.length;
        HashMap<String,List<String>> result = new HashMap();

        for (int i = 0; i < len; i++) {
            char[] c = strs[i].toCharArray(); // 将词重新排序
            Arrays.sort(c);
            String key = String.valueOf(c);

            if(result.containsKey(key) == false){
                result.put(key, new ArrayList<String>());
            }
            result.get(key).add(strs[i]);
        }
        ArrayList<List<String>> ans = new ArrayList<List<String>>(result.values());
        System.out.println(result.values());
        System.out.println(ans);
        return ans;
    }
}
