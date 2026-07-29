class Solution {
    long limit;

    public String smallestPalindrome(String s, int k) {
        limit = k;

        int n = s.length();
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        char middle = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                middle = (char) ('a' + i);
            }
            freq[i] /= 2;
        }

        int halfLen = n / 2;

        if (countPermutations(freq, halfLen) < k) {
            return "";
        }

        StringBuilder left = new StringBuilder();

        for (int pos = 0; pos < halfLen; pos++) {

            for (int c = 0; c < 26; c++) {

                if (freq[c] == 0) continue;

                freq[c]--;

                long count = countPermutations(
                    freq,
                    halfLen - pos - 1
                );

                if (k > count) {
                    k -= count;
                    freq[c]++;
                } else {
                    left.append((char) ('a' + c));
                    break;
                }
            }
        }

        String right = new StringBuilder(left).reverse().toString();

        if (middle != 0) {
            return left.toString() + middle + right;
        }

        return left.toString() + right;
    }

    private long countPermutations(int[] freq, int total) {

        long result = 1;
        int remaining = total;

        for (int f : freq) {

            if (f == 0) continue;

            long comb = combination(remaining, f);

            if (comb >= limit ||
                result > limit / comb) {
                return limit;
            }

            result *= comb;
            remaining -= f;
        }

        return Math.min(result, limit);
    }

    private long combination(int n, int r) {

        if (r > n - r) {
            r = n - r;
        }

        long result = 1;

        for (int i = 1; i <= r; i++) {

            result = result * (n - r + i) / i;

            if (result >= limit) {
                return limit;
            }
        }

        return result;
    }
}