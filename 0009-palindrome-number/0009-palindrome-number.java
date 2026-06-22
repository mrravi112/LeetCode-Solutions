class Solution {
    public boolean isPalindrome(int x) {
        int or=x;
        int r=0;
        if(x<0){
            return false;
        }
        else{
            while(x>0){
                int b=x%10;
                r=r*10+b;
                x=x/10;
            }


        }
        return or==r;
        
    }
}