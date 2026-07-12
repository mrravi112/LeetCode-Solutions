import java.util.Arrays;

class Solution {
    public boolean reorderedPowerOf2(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);

        for (int i = 0; i < 31; i++) {
            int num = 1 << i;

            char[] a = String.valueOf(num).toCharArray();
            Arrays.sort(a);

            if (Arrays.equals(arr, a)) {
                return true;
            }
        }

        return false;
    }
}