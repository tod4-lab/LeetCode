package com.hikaru.Offer;

public class Offer17 {
    public int[] printNumbers(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += Math.pow(10, i) * 9;
        }
        int[] ans = new int[count];
        for (int i = 0; i < count; i++) {
            ans[i] = i + 1;
        }
        return ans;
    }
}
