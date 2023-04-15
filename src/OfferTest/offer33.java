package OfferTest;

public class offer33 {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }
    boolean recur(int[] postorder, int left, int right){
        if(left >= right) return true;
        int index = left;
        while(postorder[index] < postorder[right]) index++; //找出大于根节点元素
        int indexRight = index;
        while(postorder[indexRight] > postorder[right]) indexRight++;
        return right==indexRight&&recur(postorder, left, index-1) && recur(postorder, index, right-1);
    }
}
