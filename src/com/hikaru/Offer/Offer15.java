package com.hikaru.Offer;

import org.junit.Test;

import java.util.Stack;

public class Offer15 {
    public int hammingWeight(int n) {
        int ans = 0;
        while(n > 0) {
            System.out.println(n);
            if(n % 2 == 1) {
                ans++;
            }
            n = n / 2;
        }
        return ans;
    }
    @Test
    public void test() {
        System.out.println(hammingWeight(-3));
    }
}
