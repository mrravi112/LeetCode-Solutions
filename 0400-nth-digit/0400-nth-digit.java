class Solution {
    public int findNthDigit(int n) {
        long d = 1;
        long c = 9;
        long s = 1;

        while (n > d * c) {
            n -= d * c;
            d++;
            c *= 10;
            s *= 10;
        }

        long number = s + (n - 1) / d;
        int index = (int) ((n - 1) % d);

        return String.valueOf(number).charAt(index) - '0';
    }
}