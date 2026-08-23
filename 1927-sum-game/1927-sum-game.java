class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int l = 0, r = 0;
        int ql = 0, qr = 0;

        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?')
                ql++;
            else
                l += num.charAt(i) - '0';
        }

        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?')
                qr++;
            else
                r += num.charAt(i) - '0';
        }

        int diff = l - r;
        int qdiff = ql - qr;

        if (qdiff % 2 != 0)
            return true;

        return diff != -9 * (qdiff / 2);
    }
}