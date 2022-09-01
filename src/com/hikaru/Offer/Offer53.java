package com.hikaru.Offer;

public class Offer53 {
    public int binarySearch(int[] nums, int target, int low, int high) {
        if (nums.length == 0) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (low > high) {
            return -1;
        }
        if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, high);
        } else if (nums[mid] > target) {
            return binarySearch(nums, target, low, mid - 1);
        }
        return mid;
    }

    public int search(int[] nums, int target) {
        int index = binarySearch(nums, target, 0, nums.length - 1);
        if (index != -1) {
            int count = 0;
            for (int i = index; i < nums.length && nums[i] == target; i++) {
                count++;
            }
            for (int i = index - 1; i >= 0 && nums[i] == target; i--) {
                count++;
            }
            return count;
        }
        return 0;
    }
}
