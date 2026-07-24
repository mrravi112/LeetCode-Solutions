class Solution {
    public int uniqueXorTriplets(int[] nums) {

        int n = nums.length;

        if (n == 1)
            return 1;

        HashSet<Integer> pairs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                pairs.add(nums[i] ^ nums[j]);
            }
        }

        HashSet<Integer> ans = new HashSet<>();

        for (int x : pairs) {
            for (int num : nums) {
                ans.add(x ^ num);
            }
        }

        return ans.size();
    }
}