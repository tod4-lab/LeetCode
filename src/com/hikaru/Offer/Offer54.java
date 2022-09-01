package com.hikaru.Offer;

public class Offer54 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    private int count;
    private int ans;
    private int k;
    public void inOrder(TreeNode root) {
        if(root ==null) {
            return ;
        }
        inOrder(root.right);
        if(++count == k) {
            ans = root.val;
        }
        inOrder(root.left);
    }
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        inOrder(root);
        return this.ans;
    }
}
