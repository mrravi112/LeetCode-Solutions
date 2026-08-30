class Solution {
    public int minimumDeletions(int[] nums) {

        int a = 1;

        if(nums.length == 1){
            return a;
        }

        int min = 0;
        int max = 0;

        
        for(int i = 1; i < nums.length; i++){

            if(nums[i] < nums[min]){
                min = i;
            }

            if(nums[i] > nums[max]){
                max = i;
            }
        }

        
        int left = Math.min(min, max);
        int right = Math.max(min, max);

        
        int x = right + 1;

        
        int y = nums.length - left;

       
        int z = (left + 1) + (nums.length - right);

        a = Math.min(x, Math.min(y, z));

        return a;
    }
}