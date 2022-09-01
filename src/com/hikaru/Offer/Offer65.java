package com.hikaru.Offer;

import org.junit.Test;

public class Offer65 {
    public int add(int a, int b) {
        if (b == 0) {
            return a;
        }
        // 按位异或
        int sum = a ^ b;
//        System.out.println(sum);
        // 进位左移
        int carry = (a & b) << 1;
        return add(sum, carry);
    }

    @Test
    public void test() {
        System.out.println(add(1, 3));
    }
}
