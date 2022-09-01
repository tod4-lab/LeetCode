package com.hikaru.Offer;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Offer28 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        if (root != null) {
            deque.add(root);
        }
        while (!deque.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            int sz = deque.size();
            int count = sz;
            while (sz-- > 0) {
                TreeNode front = deque.poll();
                row.add(front.val);
                if (front.left != null) {
                    deque.add(front.left);
                } else {
                    row.add(null);
                }
                if (front.right != null) {
                    deque.add(front.right);
                } else {
                    row.add(null);
                }
            }
            for (int i = 0; i < count; i++) {
                if ((row.get(i) == null && row.get(count- 1 - i) != null)
                        || (row.get(i) != null && row.get(count - 1 - i) == null)
                        || !row.get(i).equals(row.get(count - 1 - i))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        root.left = left;
        root.right = right;

        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(4);
        left.left = t1;
        left.right = t2;

        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(3);
        right.left = t3;
        right.right = t4;
        System.out.println(isSymmetric(root));
    }
}
