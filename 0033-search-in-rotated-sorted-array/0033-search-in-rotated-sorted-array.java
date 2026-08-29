class Solution {
    public int search(int[] nums, int target) {
        int a=nums.length;
        int b=-1;
        for(int i=0;i<a;i++){
            if(nums[i]==target){
                b=i;
            }
        }
        return b;
    }
}