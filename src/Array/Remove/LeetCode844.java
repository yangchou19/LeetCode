package Array.Remove;

public class LeetCode844 {
    /**
     * 给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。
     * @param s
     * @param t
     * @return
     */
    public boolean backspaceCompare(String s, String t) {
        int indexS = s.length()-1;
        int indexT = t.length()-1;
        int skipS = 0;
        int skipT = 0;
        while (indexS >=0 || indexT >=0) {
            while (indexS >=0){  // 找到退格后的下一个字符
                if(s.charAt(indexS) == '#'){
                    skipS++;
                    indexS--;
                }else if(skipS > 0){
                    skipS--;
                    indexS--;
                }else {
                    break;
                }
            }
            while (indexT >= 0){
                if(t.charAt(indexT) == '#'){
                    skipT++;
                    indexT--;
                }else if(skipT>0){
                    skipT--;
                    indexT--; // 产生负数情况，即字符串都没
                }else {
                    break;
                }
            }
            if(indexS >= 0 && indexT >= 0){
                if(s.charAt(indexS) != t.charAt(indexT)){
                    return false;
                }
            }
            else {
                if (indexS >= 0 || indexT >= 0) {
                    return false;
                }
            }
            indexT--; // 比较下一个字符
            indexS--;
        }
        return true;
    }
}
