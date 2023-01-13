package Hash;

import java.util.HashMap;

public class LeetCode383 {
    /**
     * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
     * 如果可以，返回 true ；否则返回 false 。
     * magazine 中的每个字符只能在 ransomNote 中使用一次。
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Integer,Integer> magazineMap = new HashMap<Integer,Integer>();
        char[] ranbytes = ransomNote.toCharArray();
        char[] magByetes = magazine.toCharArray();
        for(int i: magByetes){
            magazineMap.put(i, magazineMap.getOrDefault(i, 0)+1);
        }
        for(int i:ranbytes){
            if (magazineMap.containsKey(i)) {
                int count = magazineMap.get(i);
                if (count > 0) {
                    magazineMap.put(i, magazineMap.getOrDefault(i, 0) - 1);
                } else {
                    return false;
                }
            }else return false;
        }
        return true;
    }
}
