
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i - 1];
            int next = nums[i];
            for (int j = current + 1; j < next; j++) {
                result.add(j);
            }
        }

        return result;
    }
}