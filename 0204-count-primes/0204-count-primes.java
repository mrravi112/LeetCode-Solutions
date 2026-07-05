class Solution {
    public int countPrimes(int n) {
        boolean[] arr = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (arr[i] == false) {
                count++;

                for (int j = i + i; j < n; j = j + i) {
                    arr[j] = true;
                }
            }
        }

        return count;
    }
}