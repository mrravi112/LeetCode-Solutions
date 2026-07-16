class Solution {

    int MOD = 1337;

    public int superPow(int a, int[] b) {
        int ans = 1;
        a %= MOD;

        for (int digit : b) {
            ans = pow(ans, 10);
            ans = (ans * pow(a, digit)) % MOD;
        }

        return ans;
    }

    private int pow(int a, int b) {
        int ans = 1;

        while (b > 0) {
            if ((b & 1) == 1)
                ans = (ans * a) % MOD;

            a = (a * a) % MOD;
            b /= 2;
        }

        return ans;
    }
}