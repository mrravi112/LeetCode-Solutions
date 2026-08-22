class Solution {
    public boolean checkDivisibility(int n) {
        int z=n;
        int x=1;
        int c=0;
        // boolean q=true;
        while(z>0){
            int m=z%10;
            c=c+m;
            x=x*m;
            z=z/10;


        }
        return (n% (c+x) ==0);
    }
}