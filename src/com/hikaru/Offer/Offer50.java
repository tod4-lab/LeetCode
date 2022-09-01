package com.hikaru.Offer;

import org.junit.Test;

public class Offer50 {
    public char firstUniqChar(String s) {
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'a'] ++;
        }
        for(int i = 0; i < s.length(); i++) {
            if(count[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }
        return ' ';
    }

    @Test
    public void test() {
        System.out.println(firstUniqChar("leetcode"));
    }
}
