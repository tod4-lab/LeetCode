package com.hikaru.Offer;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Offer32_3 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        Queue<TreeNode> q = new LinkedBlockingQueue<>();
        List<Integer> row;
        q.add(root);
        int num = 1;
        boolean flag = true;
        while(!q.isEmpty()) {
            int count = 0;
            row = new ArrayList<>();
            while(num-- > 0) {
                TreeNode front = q.poll();
                row.add(front.val);
                if(front.left != null) {
                    q.add(front.left);
                    count++;
                }
                if(front.right != null) {
                    q.add(front.right);
                    count++;
                }
            }
            if(!flag) {
                Collections.reverse(row);
            }
            flag = !flag;
            ans.add(row);
            num = count;
        }
        return ans;
    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(3);
        TreeNode right = new TreeNode(20);
        TreeNode left = new TreeNode(9);
        root.right = right;
        root.left = left;
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);


        List<List<Integer>> lists = levelOrder(root);
        System.out.println(lists);
    }
}
