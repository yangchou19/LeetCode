package OfferTest;

public class Offer11 {
    /**
     * 旋转数组的最小数字
     */
    public int minArray(int[] numbers) {
        for (int i = numbers.length-1; i >=1; i--) {
            int temp = numbers[i-1];
            if (temp > numbers[i]){
                return numbers[i];
            }
        }
        return numbers[0];
    }
}
