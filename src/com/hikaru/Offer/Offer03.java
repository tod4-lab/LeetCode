package com.hikaru.Offer;

public class Offer03 {
    public int findRepeatNumber(int[] nums) {
        int[] hash = new int[100000+5];
        for(int i=0;i<nums.length;i++) {
            if (hash[nums[i]] != 0)
                return nums[i];
            hash[nums[i]]++;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
