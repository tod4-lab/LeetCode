package com.hikaru.Offer;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class Offer68 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean preOrder(TreeNode root, TreeNode target) {
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while (!s.empty()) {
            TreeNode top = s.pop();
            if (top.val == target.val) {
                return true;
            }
            if (top.right != null) {
                s.push(top.right);
            }
            if (top.left != null) {
                s.push(top.left);
            }
        }
        return false;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p == null) {
            return q;
        }
        if (q == null) {
            return p;
        }
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(root);
        TreeNode ans = null;
        while (!queue.isEmpty()) {
            TreeNode front = queue.poll();
            if (preOrder(front, p) && preOrder(front, q)) {
                ans = front;
            }
            if (front == p || front == q) {
                break;
            }
            if (front.left != null) {
                queue.add(front.left);
            }
            if (front.right != null) {
                queue.add(front.right);
            }
        }
        return ans;
    }
}
