package com.hikaru.Offer;

import org.junit.Test;

import java.util.Map;

public class Offer39 {
    private class ListNode {
        int val;
        int count;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.count = 0;
        }
    }

    public int majorityElement(int[] nums) {
        ListNode head = new ListNode(nums[0]);
        head.count = 1;
        for (int i = 1; i < nums.length; i++) {
            ListNode q = head;
            while (q != null && q.val != nums[i]) {
                q = q.next;
            }
            if (q == null) {
                q = new ListNode(nums[i]);
                q.next = head;
                head = q;
            }
            q.count++;
            if (q.count >= Math.ceil(nums.length * 1.0 / 2)) {
                return q.val;
            }
        }
        return nums[0];
    }

    @Test
    public void test() {
        int[] nums = new int[]{1};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }
}
