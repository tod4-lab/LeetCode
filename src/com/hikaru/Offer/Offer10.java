package com.hikaru.Offer;

public class Offer10 {
    //    斐波那契（Fibonacci）数列
    public int fib(int n) {
        int[] f = new int[100 + 5];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 2] % 1000000007 + f[i - 1] % 1000000007;
        }
        return f[n] % 1000000007;
    }

    private int dp[];

    public int fibDP(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // 防止递归计算
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = fibDP(n - 1) + fibDP(n - 2);
        return dp[n];
    }

    public static void main(String[] args) {
        Offer10 offer10 = new Offer10();
        offer10.dp = new int[10];
        System.out.println(offer10.fib(5));
    }
}
