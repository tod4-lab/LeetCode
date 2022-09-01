package com.hikaru.Offer;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Offer32 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        List<Integer> row;

        while(!queue.isEmpty()) {
            int sz = queue.size();
            row = new ArrayList<>();
            // 使当前层全部遍历完
            while(sz-->0) {
                TreeNode front = queue.poll();
                row.add(front.val);
                if(front.left!=null) {
                    queue.add(front.left);
                }
                if(front.right!=null) {
                    queue.add(front.right);
                }
            }
            list.add(row);
        }
        return list;
    }
    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        root.left = left;
        root.right = right;

        TreeNode t1 = new TreeNode(4);
        TreeNode t2 = new TreeNode(5);
        left.left = t1;
        right.right = t2;
        System.out.println(levelOrder(root));
    }
}
