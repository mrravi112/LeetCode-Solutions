class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

        int n = profits.length;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = capital[i];
            arr[i][1] = profits[i];
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        int j = 0;

        for (int i = 0; i < k; i++) {

            while (j < n && arr[j][0] <= w) {
                pq.add(arr[j][1]);
                j++;
            }

            if (pq.isEmpty()) {
                break;
            }

            w += pq.poll();
        }

        return w;
    }
}