package com.hikaru.Offer;

public class Offer06<Item> {

    private class ListNode {
        Item item;
        ListNode next;
    }

    public int[] reversePrint(ListNode head) {
        ListNode tail = head;
        int[] a = new int[10000+5];
        int count = 0;
        while(tail != null) {
//            a[count++] = tail.val;
            tail = tail.next;
        }
        int[] b = new int[count];
        for(int i=0;i<count;i++)
            b[i] = a[count-i-1];
        return b;
    }

    public static void main(String[] args) {

    }
}
