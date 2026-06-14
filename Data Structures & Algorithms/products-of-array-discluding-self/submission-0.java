class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pre[] = new int[n];
        int suff[] = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;
        int product = 1;
        for (int i = 1; i < n; i++) {
            pre[i] = nums[i - 1] * product;
            product = pre[i];
        }
        product = 1;
        for (int j = n - 2; j >= 0; j--) {
            suff[j] = nums[j + 1] * product;
            product = suff[j];
        }
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i];
        }
        return ans;
    }
}
