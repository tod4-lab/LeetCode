package com.hikaru.Offer;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Offer62 {

    public int lastRemaining(int n, int m) {
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
            System.out.println(ans);
        }
        return ans;
    }

    @Test
    public void test() {
        System.out.println(lastRemaining(5, 3));
    }
}
