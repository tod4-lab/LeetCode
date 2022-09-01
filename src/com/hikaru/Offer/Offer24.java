package com.hikaru.Offer;

public class Offer24 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode p = head;
        ListNode ans = null;
        while(p != null) {
            ListNode q = p.next;
            if(ans == null) {
                ans = p;
                p.next = null;
            }
            else {
                p.next = ans;
                ans = p;
            }
            p = q;
        }
        return ans;
    }
}
