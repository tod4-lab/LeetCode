package com.hikaru.Offer;

public class Offer22 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p = head;
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }
        p = head;
        for(int i = 0;i < count - k;i++) {
            p = p.next;
        }
        return p;
    }
}
