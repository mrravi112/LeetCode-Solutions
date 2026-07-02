class Solution {
    public int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {

            boolean f = true;

            for (int j = 0; j < s.length(); j++) {

                if (i != j && s.charAt(i) == s.charAt(j)) {
                    f = false;
                    break;
                }
            }

            if (f) {
                return i;
            }
        }

        return -1;
    }
}