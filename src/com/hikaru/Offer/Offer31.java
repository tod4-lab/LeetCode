package com.hikaru.Offer;

public class Offer31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int[] stack = new int[1000+1];
        int i = 0, j = 0;
        int top = -1;
        while(i<pushed.length) {
            if(top!=-1 && popped[j]==stack[top]) {
                top--;
                j++;
            }
            else if(pushed[i]!=popped[j]) {
                stack[++top] = pushed[i++];
            }
            else {
                i++;
                j++;
            }
        }
        while(top>-1) {
            if(popped[j++] != stack[top--])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Offer31 o = new Offer31();
        int[] a = new int[]{2, 1, 0};
        int[] b = new int[]{1, 2, 0};
        System.out.println(o.validateStackSequences(a, b));
    }
}
