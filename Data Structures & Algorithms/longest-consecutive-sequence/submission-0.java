class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        Arrays.sort(nums);
        int largest = 1, cnt = 0, lastSmaller = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] - 1 == lastSmaller) {
                cnt++;
                lastSmaller = nums[i];
            } else if (lastSmaller != nums[i]) {
                cnt = 1;
                lastSmaller = nums[i];
            }
            largest = Math.max(largest, cnt);
        }
        return largest;
    }
}
