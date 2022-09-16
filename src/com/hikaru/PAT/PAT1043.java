package com.hikaru.PAT;

import java.util.Scanner;

public class PAT1043 {
    static class BStNode {
        private int val;
        private BStNode left;
        private BStNode right;

        BStNode(int val) {
            this.val = val;
        }
    }

    public static void insert(BStNode root, int x) {
        if(root == null) {
            root = new BStNode(x);
        } else if(x > root.val) {
            insert(root.right, x);
        } else {
            insert(root.left, x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0) {
            int x = sc.nextInt();
            BStNode root = null;
            insert(root, x);
        }

    }
}
