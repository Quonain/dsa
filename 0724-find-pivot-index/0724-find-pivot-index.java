class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        int[] psum = new int[n];
        psum[0] = nums[0];

        for (int i = 1; i < n; i++) {
            psum[i] = psum[i - 1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            int leftSum = (i == 0) ? 0 : psum[i - 1];
            int rightSum = psum[n - 1] - psum[i];

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}