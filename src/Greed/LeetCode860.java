package Greed;

public class LeetCode860 {
    /**
     * 在柠檬水摊上，每一杯柠檬水的售价为 5 美元。
     * 顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。
     * 每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。
     * 你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。
     * 注意，一开始你手头没有任何零钱。
     * 给你一个整数数组 bills ，其中 bills[i] 是第 i 位顾客付的账。
     * 如果你能给每位顾客正确找零，返回 true ，否则返回 false 。
     */
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0, twenty = 0;
        for(int bill: bills) {
            if(bill==5) five++;
            if(bill==10){
                if(five>0) {
                    five--;
                    ten++;
                }
                else return false;
            }
            if(bill==20){
                if(ten>0){
                    ten--;
                    if(five>0) {
                        five--;
                        twenty++;
                    }
                    else return false;
                }else {
                    if(five > 2){
                        five -=3;
                        twenty++;
                    }else return false;
                }
            }
        }
        return true;
    }
}
