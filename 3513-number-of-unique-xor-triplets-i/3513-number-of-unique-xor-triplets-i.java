class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if (n <= 2)
            return n;

        int a = 1;

        while (a <= n)
            a <<= 1;

        return a;
    }
}