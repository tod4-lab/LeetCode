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
        if(root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(root);
        int num = 1;
        while(!queue.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            int count = 0;
            while(num-- > 0) {
                TreeNode front = queue.poll();
                if(front.left != null) {
                    queue.add(front.left);
                    count++;
                    row.add(front.left.val);
                } else {
                    row.add(null);
                }
                if(front.right != null) {
                    queue.add(front.right);
                    count++;
                    row.add(front.right.val);
                } else {
                    row.add(null);
                }
            }
            num = count;
            int length = row.size();
            for(int i = 0; i < length / 2; i++) {
                if(row.get(i) != null && row.get(length - 1 - i) != null) {
                    if(!row.get(i).equals(row.get(length - 1 - i))) {
                        return false;
                    }
                } else if(row.get(i) == null && row.get(length - 1 - i) == null) {

                } else {
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

        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        right.left = t3;
        right.right = t4;
        System.out.println(isSymmetric(root));
    }
}
