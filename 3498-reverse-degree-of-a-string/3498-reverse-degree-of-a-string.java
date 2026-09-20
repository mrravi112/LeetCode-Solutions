class Solution {
    public int reverseDegree(String s) {
        int t = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int reverse = 'z' - ch + 1;

            t += (i + 1) * reverse;
        }

        return t;
    }
}