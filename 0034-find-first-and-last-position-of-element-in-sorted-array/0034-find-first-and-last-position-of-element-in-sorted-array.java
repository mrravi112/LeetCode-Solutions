class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a = new int[2];
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (j == 0) {
                    a[0] = i;
                }
                a[1] = i;
                j++;
            }
        }

        if (j == 0) {
            a[0] = -1;
            a[1] = -1;
        }

        return a;
    }
}