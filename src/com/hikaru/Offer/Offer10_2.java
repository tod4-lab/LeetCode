package com.hikaru.Offer;

public class Offer10_2 {
    public int numWays(int n) {
        int[] ans = new int[101];
        ans[0] = 1;
        ans[1] = 1;
        for(int i=2;i<=n;i++)
            ans[i] = (ans[i-1] + ans[i-2]) % (1000000007);
        return ans[n];
    }
    public static void main(String[] args) {
        Offer10_2 o = new Offer10_2();
        System.out.println(o.numWays(46));
    }
}
