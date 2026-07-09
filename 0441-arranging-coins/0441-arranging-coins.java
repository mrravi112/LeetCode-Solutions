class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        int c=0;
        while(n>=i){
            n=n-i;
            c++;
            i++;
        }
        return c;
    }
}