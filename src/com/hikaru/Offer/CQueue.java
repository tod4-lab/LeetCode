package com.hikaru.Offer;

/**
 * Offer 09
 */
public class CQueue {
    private int[] stack1;
    private int[] stack2;
    private int N1;

    public CQueue() {
        stack1 = new int[10000+5];
        stack2 = new int[10000+5];
    }

    public void appendTail(int value) {
        stack1[N1++] = value;
    }

    public int deleteHead() {
        if(N1==0)
            return -1;
        for(int i=0;i<N1;i++)
            stack2[i] = stack1[N1-1-i];
        for(int i=0;i<N1-1;i++)
            stack1[i] = stack2[N1-2-i];
        return stack2[--N1];
    }


}
