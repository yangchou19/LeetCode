package Char;

public class LeetCode28 {
    /**
     * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle
     * 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
     */
    public int strStr(String haystack, String needle) {
        int lenH = haystack.length();
        int lenN = needle.length();
        int index_n = 0, index_h = 0;
        char[] char_h = haystack.toCharArray();
        char[] char_n = needle.toCharArray();
        if (lenH < lenN) return -1;
        while (index_h < lenH){
            if(char_h[index_h]==char_n[index_n]){
                if(lenH-index_h < lenN) return -1;
                int start = index_h;
                while(index_n<lenN){
                    if(char_n[index_n]!=char_h[index_h]){
                        break;
                    }
                    index_n++;
                    index_h++;
                }
                if (index_n == lenN) return start;
                index_n = 0;
                index_h = start;
            }
            index_h ++;
        }
        return -1;
    }
}
