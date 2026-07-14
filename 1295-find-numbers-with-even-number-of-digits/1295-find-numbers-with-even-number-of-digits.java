class Solution {
    public int findNumbers(int[] nums) {
        int z=0;
        for(int i=0;i<nums.length;i++){
            int b=0;
            while(nums[i]>0){
               nums[i]=nums[i]/10;
               b++;
            }
            if(b%2==0){
                z++;
                
            }
        }
        return z;
    }
}