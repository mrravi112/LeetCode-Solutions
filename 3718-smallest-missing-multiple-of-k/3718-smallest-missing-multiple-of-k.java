class Solution {
    public int missingMultiple(int[] nums, int k) {
        int x = k;

        while (true) {
            boolean f = false;

            for (int num : nums) {
                if (num == x) {
                    f = true;
                    break;
                }
            }

            if (!f) {
                return x;
            }

            x += k;
        }
    }
}