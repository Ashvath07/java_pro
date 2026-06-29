class Solution {
    public int rob(int[] nums) {

        int n = nums.length;

        // If there is only one house
        if (n == 1) {
            return nums[0];
        }

        // DP array
        int[] dp = new int[n];

        // Base cases
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        // Fill DP array
        for (int i = 2; i < n; i++) {

            // Either rob current house or skip it
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        // Maximum money that can be robbed
        return dp[n - 1];
    }
}
