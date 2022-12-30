package Array.BinarySearch;

public class LeetCode367 {
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        int middle;
        while(left <=right) {
            middle = left + (right-left) / 2;
            long square = (long) middle * middle;
            if(square == num) {
                return true;
            }else if(square < num){
                left = middle + 1;
            }else{
                right = middle -1;
            }
        }
        return false;
    }
}
