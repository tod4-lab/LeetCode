package com.hikaru.Offer;

public class Offer18 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteNode(ListNode head, int val) {
        ListNode p = head;
        ListNode q = p.next;
        if(p.val == val) {
            return q;
        }
        while (q != null && q.val != val) {
            p = p.next;
            q = q.next;
        }
        p.next = q.next;
        q = null;
        return head;
    }
}
