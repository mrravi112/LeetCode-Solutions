class Solution {
    Integer[][] dp;

    public int findRotateSteps(String ring, String key) {
        dp = new Integer[ring.length()][key.length()];

        return solve(ring, key, 0, 0);
    }

    public int solve(String ring, String key, int pos, int index) {

        if (index == key.length()) {
            return 0;
        }

        if (dp[pos][index] != null) {
            return dp[pos][index];
        }

        int ans = Integer.MAX_VALUE;
        int n = ring.length();

        for (int i = 0; i < n; i++) {

            if (ring.charAt(i) == key.charAt(index)) {

                int diff = Math.abs(pos - i);
                int rotate = Math.min(diff, n - diff);

                int steps = rotate + 1 +
                        solve(ring, key, i, index + 1);

                ans = Math.min(ans, steps);
            }
        }

        return dp[pos][index] = ans;
    }
}