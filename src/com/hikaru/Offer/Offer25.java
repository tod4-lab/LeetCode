package com.hikaru.Offer;

public class Offer25 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        ListNode head = null;
        ListNode tail = null;
        ListNode p = l1;
        ListNode q = l2;
        if(p.val < q.val) {
            head = p;
            tail = p;
            p = p.next;
        }else {
            head = q;
            tail = q;
            q = q.next;
        }
        while(p != null && q != null) {
            if(p.val < q.val) {
                tail.next = p;
                tail = p;
                p = p.next;
            }else {
                tail.next = q;
                tail = q;
                q = q.next;
            }
        }
        if(p == null) {
            tail.next = q;
        }else {
            tail.next = p;
        }
        return head;
    }
}
