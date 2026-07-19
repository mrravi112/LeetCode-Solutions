class Solution {
    public String smallestSubsequence(String s) {

        int[] count = new int[26];
        boolean[] visit = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            count[ch - 'a']--;

            if (visit[ch - 'a']) {
                continue;
            }

            while (!st.isEmpty() && st.peek() > ch && count[st.peek() - 'a'] > 0) {
                visit[st.pop() - 'a'] = false;
            }

            st.push(ch);
            visit[ch - 'a'] = true;
        }

        String ans = "";

        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }

        return ans;
    }
}