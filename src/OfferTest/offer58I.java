package OfferTest;

public class offer58I {
    /**
     * 输入一个英文句子，
     * 翻转句子中单词的顺序，
     * 但单词内字符的顺序不变。
     * 为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
     */
    public String reverseWords(String s) {
        s = s.trim();
        StringBuffer sb = new StringBuffer();
        int left=s.length()-1,right=left;
        while(left>=0){
            while(left>=0 && s.charAt(left)!=' ') left--;
            sb.append(s.substring(left,right+1)+" ");
            while(left>=0 && s.charAt(left)==' ') left--;
            right = left;
        }
        return sb.toString();
    }
}
