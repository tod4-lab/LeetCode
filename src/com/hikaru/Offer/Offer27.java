package com.hikaru.Offer;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class Offer27 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public void postOrder(TreeNode root) {
        if(root == null) {
            return ;
        }
        if(root.left != null) {
            postOrder(root.left);
        }
        if(root.right != null) {
            postOrder(root.right);
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    public TreeNode mirrorTree(TreeNode root) {
        postOrder(root);

        return root;
    }
}
