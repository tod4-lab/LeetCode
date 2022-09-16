package com.hikaru.Offer;

public class Offer53_2 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = (n + 1) * n / 2;
        for(int i = 0; i < n; i++) {
            ans -= nums[i];
        }
        return ans;
    }
}
