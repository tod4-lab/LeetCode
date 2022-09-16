package com.hikaru.Offer;

import org.junit.Test;

public class Offer56_2 {
    class LinkNode {
        int val;
        int count;
        LinkNode next;

        LinkNode(int val) {
            this.val = val;
            this.count = 1;
            this.next = null;
        }
    }

    public int singleNumber(int[] nums) {
        LinkNode head = new LinkNode(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            LinkNode p = head;
            while (p != null) {
                if(nums[i] == p.val) {
                    p.count++;
                    break;
                }
                p = p.next;
            }
            if(p == null) {
                LinkNode s = new LinkNode(nums[i]);
                s.next = head.next;
                head.next = s;
            }
        }
        LinkNode p = head;
        while(p!=null) {
            if(p.count != 3) {
                return p.val;
            }
            p = p.next;
        }
        return head.val;
    }

    @Test
    public void test() {
        int[] nums = new int[]{5, 2, 2, 2, 5, 5, 4};
        System.out.println(singleNumber(nums));
    }
}
