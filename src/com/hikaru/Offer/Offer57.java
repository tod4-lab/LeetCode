package com.hikaru.Offer;

public class Offer57 {
    public int binarySearch(int[] nums, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] > target) {
            return binarySearch(nums, target, low, mid - 1);
        }
        return binarySearch(nums, target, mid + 1, high);
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (binarySearch(nums, target - nums[i], 0, nums.length - 1) != -1) {
                return new int[]{nums[i], target-nums[i]};
            }
        }
        return new int[]{};
    }
}
