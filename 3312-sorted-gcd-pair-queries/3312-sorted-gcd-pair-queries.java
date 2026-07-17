class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {

        int mx = 0;

        for (int x : nums) {
            mx = Math.max(mx, x);
        }

        int[] f = new int[mx + 1];

        for (int x : nums) {
            f[x]++;
        }

        long[] cnt = new long[mx + 1];

        for (int i = 1; i <= mx; i++) {

            int c = 0;

            for (int j = i; j <= mx; j += i) {
                c += f[j];
            }

            cnt[i] = 1L * c * (c - 1) / 2;
        }

        for (int i = mx; i >= 1; i--) {

            for (int j = i * 2; j <= mx; j += i) {
                cnt[i] -= cnt[j];
            }
        }

        long[] pre = new long[mx + 1];

        for (int i = 1; i <= mx; i++) {
            pre[i] = pre[i - 1] + cnt[i];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            long k = queries[i] + 1;

            int l = 1;
            int r = mx;

            while (l < r) {

                int m = l + (r - l) /2;

                if (pre[m] >= k) {
                    r = m;
                } else {
                    l = m + 1;
                }
            }

            ans[i] = l;
        }

        return ans;
    }
}