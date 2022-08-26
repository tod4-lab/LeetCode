package com.hikaru.Offer;

public class Offer61 {
    public boolean isStraight(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int count = 0;
        while (nums[count] == 0)
            count++;
        for (int i = count; i < nums.length - 1; i++) {
            if(nums[i]==nums[i+1])
                return false;
            if(nums[i+1]-nums[i]>1) {
                count -= nums[i+1] - nums[i] - 1;
                if(count < 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Offer61 offer61 = new Offer61();
        System.out.println(offer61.isStraight(new int[]{0, 0, 1, 2, 5}));
    }
}
