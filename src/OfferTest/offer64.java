package OfferTest;

public class offer64 {
    public int sumNums(int n) {
        if(n==1) return 1;
        else return n+sumNums(n-1);
    }
}
