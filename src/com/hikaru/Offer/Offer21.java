package com.hikaru.Offer;

public class Offer21 {
    public int[] exchange(int[] nums) {
        int[] a = new int[nums.length];
        int[] b = new int[nums.length];
        int count1 = 0, count2 = 0;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] % 2 == 0) {
                b[count2++] = nums[i];
            }
            else {
                a[count1++] = nums[i];
            }
        }
        for(int i = 0;i < count2;i++) {
            a[count1+i] = b[i];
        }
        return a;
    }
}
