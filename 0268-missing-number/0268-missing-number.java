class Solution {
    public int missingNumber(int[] nums) {

        int s = 0;
        int t = 0;

        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
            t += i;
        }

        t += nums.length;

        return t - s;
    }
}