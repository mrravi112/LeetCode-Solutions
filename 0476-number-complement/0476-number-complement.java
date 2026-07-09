class Solution {
    public int findComplement(int num) {
        int a=0;
        int p=1;
        while(num>0){
            int bit=num%2;
            if(bit==0){
                a=a+p;
            }
            p=p*2;
            num=num/2;

        }
        return a;
    }
}