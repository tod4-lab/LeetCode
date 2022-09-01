package com.hikaru.Offer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class Offer55 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public int maxDepth(TreeNode root) {
        int ans = 0;
        Deque<TreeNode> deque = new ArrayDeque<>();
        if(root!=null) {
            deque.add(root);
        }
        while(!deque.isEmpty()) {
            int sz = deque.size();
            while(sz-->0) {
                TreeNode front = deque.poll();
                if(front.left!=null) {
                    deque.add(front.left);
                }
                if(front.right!=null) {
                    deque.add(front.right);
                }
            }
            ans++;
        }
        return ans;
    }
}
