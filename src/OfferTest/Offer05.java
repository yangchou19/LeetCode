package OfferTest;

public class Offer05 {
    /**
     * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"
     */
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length();i++) {
            if(sb.charAt(i) == ' ') {
                sb.replace(i, i + 1,"%20");
            }
        }
       return sb.toString();
    }
}
