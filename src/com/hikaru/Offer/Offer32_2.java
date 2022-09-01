package com.hikaru.Offer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Offer32_2 {
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
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(root);
        List<Integer> row = new ArrayList<>();
        row.add(root.val);

        while(!queue.isEmpty()) {
            TreeNode front = queue.poll();
            row = new ArrayList<>();
            if(front.left !=null || front.right != null) {
                if (front.left != null) {
                    queue.add(front.left);
                    row.add(front.left.val);
                }
                if (front.right != null) {
                    queue.add(front.right);
                    row.add(front.right.val);
                }
                list.add(row);
            }
        }
        return list;
    }
    @Test
    public void test() {
        TreeNode root = new TreeNode(3);
        TreeNode right = new TreeNode(20);
        TreeNode left = new TreeNode(9);
        root.right = right;
        root.left = left;

        List<List<Integer>> lists = levelOrder(root);
        System.out.println(lists);
    }
}
