class Solution {
    public String reverseWords(String s) {
        String[] a = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        for (int i = a.length - 1; i >= 0; i--) {
            ans.append(a[i]);

            if (i > 0) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}