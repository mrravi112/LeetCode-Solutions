class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int INF = 1_000_000_000;

        int[] dp = new int[n + 1];
        java.util.Arrays.fill(dp, INF);

        // prefix sum -> index
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        map.put(0, 0);

        int prefix = 0;
        int ans = INF;

        for (int i = 1; i <= n; i++) {
            prefix += arr[i - 1];

            // By default, carry previous minimum
            dp[i] = dp[i - 1];

            int required = prefix - target;

            if (map.containsKey(required)) {
                int j = map.get(required);

                // Current subarray: [j, i-1]
                int len = i - j;

                // dp[j] = best subarray completely before j
                if (dp[j] != INF) {
                    ans = Math.min(ans, dp[j] + len);
                }

                // Current subarray can itself become the best
                dp[i] = Math.min(dp[i], len);
            }

            // Store latest index of this prefix sum
            map.put(prefix, i);
        }

        return ans == INF ? -1 : ans;
    }
}