class Solution {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int s = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((i == 0 || nums[i] != nums[i - 1]) &&
                (i == nums.length - 1 || nums[i] != nums[i + 1])) {
                s = s + nums[i];
            }
        }

        return s;
    }
}