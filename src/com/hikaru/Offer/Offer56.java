package com.hikaru.Offer;

public class Offer56 {
    public int[] singleNumbers(int[] nums) {
        int[] hash = new int[100000+5];
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++) {
            hash[nums[i]]++;
        }
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            if(hash[nums[i]]==1) {
                ans[count++]=nums[i];
            }
        }
        return ans;
    }
}
