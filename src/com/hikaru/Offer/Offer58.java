package com.hikaru.Offer;

import org.junit.Test;

public class Offer58 {
    public String reverseWords(String s) {
        s = s.trim();
        int end = s.length();
        int count = 0;
        String substring = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ') {
                if(s.charAt(i + 1) != ' ') {
                    substring += " ";
                }
                end = i;
            } else if(i==0 || (s.charAt(i) != ' ' && s.charAt(i-1) == ' ')) {
                substring += s.substring(i, end);
                end = i;
            }
        }

        return substring;
    }

    @Test
    public void test() {
        System.out.println(reverseWords("a good   example"));
    }
}
