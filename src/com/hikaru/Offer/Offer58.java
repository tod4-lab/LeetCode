package com.hikaru.Offer;

public class Offer58 {
    public String reverseLeftWords(String s, int n) {
        String substring = s.substring(n) + s.substring(0, n) ;
        return substring;
    }
}
