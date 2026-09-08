class Solution {
    public int countCommas(int n) {
        int c=0;
        int d=0;
        if(n<1000){
            c=0;
        }
        else{
            d=n-1000;
            c=d+1;
        }
        return c;
    }
}