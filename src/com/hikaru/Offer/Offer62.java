package com.hikaru.Offer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Offer62 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public int lastRemaining(int n, int m) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        for (int i = 1; i < n; i++) {
            ListNode t = new ListNode(i);
            tail.next = t;
            tail = t;
            t.next = head;
        }
        for (int i = 0; i < n - 1; i++) {
            ListNode p = tail;
            ListNode q = head;
            for (int j = 0; j < m - 1; j++) {
                p = p.next;
                q = q.next;
            }
            p.next = q.next;
            q = p.next;
        }
        return head.val;
    }

    @Test
    public void test() {
        List coll = new ArrayList(Arrays.asList(new String[]{"123", "456"}));
        System.out.println(coll);//[123, 456]

        Iterator iterator = coll.iterator();
        while(iterator.hasNext()) {
            Object obj = iterator.next();
            if("456".equals(obj)) {
                iterator.remove();
            }
        }

        iterator = coll.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
