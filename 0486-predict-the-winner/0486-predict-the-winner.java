class Solution {
    public boolean predictTheWinner(int[] nums) {
        int a=nums.length;
        if(a%2==0){
            return true;
        }
        int[] b=nums.clone();
        for(int i=a-2;i>=0;--i){
            for(int j=i+1;j<a;++j){
                b[j]=Math.max(nums[i]-b[j],nums[j]-b[j-1]);
            }
        }
        return b[a-1]>=0;
    }
}