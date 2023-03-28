package OfferTest;

public class Offer04 {
    /**
     *在一个 n * m 的二维数组中，每一行都按照从左到右 非递减 的顺序排序，
     * 每一列都按照从上到下 非递减 的顺序排序。
     * 请完成一个高效的函数，
     * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        // 寻找行
        int low=0, high=matrix.length-1;
        while(low<=high) {
            int mid = (low+high) / 2;
            if(matrix[mid][0] < target) low=mid+1;
            else if(matrix[mid][0] > target) high=mid-1;
            else return true;
        }
        int border = low;
        // 寻找列
        for(int i=0; i<border;i++){
            int left=0, right=matrix[0].length-1;
            while(left<=right) {
                int mid = (left+right) / 2;
                if(matrix[i][mid]==target) return true;
                else if(matrix[i][mid]<target) left=mid+1;
                else right=mid-1;
            }
        }
        return false;
    }
}
