class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3=new int[m+n];
        int d=0;
        for(int i=0;i<m+n;i++){
            if(i<m){
                nums3[i]=nums1[i];
            }
            else{
                nums3[i]=nums2[d];
                d++;
            }
        }
        Arrays.sort(nums3);
        for(int i = 0; i < m + n; i++) {
            nums1[i] = nums3[i];
        }
    }
}