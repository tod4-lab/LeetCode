package com.hikaru.Offer;

public class Offer10 {
//    斐波那契（Fibonacci）数列
    public int fib(int n) {
        int[] f = new int[100+5];
        f[0] = 0;
        f[1] = 1;
        for(int i=2;i<=n;i++) {
            f[i] = f[i-2] % 1000000007 + f[i-1] % 1000000007;
        }
        return f[n] % 1000000007;
    }

    public static void main(String[] args) {
        Offer10 offer10 = new Offer10();
        System.out.println(offer10.fib(5));
    }
}
