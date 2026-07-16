class Solution {
    public int lastRemaining(int n) {
        int h = 1;
        int s = 1;
        boolean l = true;
        int r = n;

        while (r > 1) {

            if (l || r % 2 == 1) {
                h += s;
            }

            r/= 2;
            s *= 2;
            l= !l;
        }

        return h;
    }
}