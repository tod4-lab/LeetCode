package com.hikaru.Offer;

public class Offer42 {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int ans = dp[0];
        for (int i = 1; i < len; i++) {
            if(nums[i] + dp[i-1] > nums[i]) {
                dp[i] = dp[i-1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
            if(dp[i] > ans) {
                ans = dp[i];
            }
        }

        return ans;
    }
}
