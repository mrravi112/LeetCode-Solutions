class Solution {
    public int distanceBetweenBusStops(int[] d, int s, int des) {

        if (s > des) {
            int t = s;
            s = des;
            des = t;
        }

        int cw = 0, tot = 0;

        for (int i = s; i < des; i++) {
            cw += d[i];
        }

        for (int x : d) {
            tot += x;
        }

        return Math.min(cw, tot - cw);
    }
}