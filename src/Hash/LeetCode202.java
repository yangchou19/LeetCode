package Hash;

import java.util.HashSet;

public class LeetCode202 {
    /**
     * 编写一个算法来判断一个数 n 是不是快乐数。
     * 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，
     * 也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
     * 如果 n 是快乐数就返回 True ；不是，则返回 False 。
     */
    public boolean isHappy(int n) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        while (!numbers.contains(n) && n!=1){
            numbers.add(n);
            n = getNextNumber(n);
        }
        return true;
    }
    public int getNextNumber(int n) {
        int res = 0;
        while (n > 0){
            int temp = n%10; // 取每位上的数字
            res += temp*temp;
            n=n/10;
        }
        return res;
    }
}
