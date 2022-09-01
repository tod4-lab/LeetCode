package com.hikaru.Offer;

public class Offer68_solved {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root ==p || root == q) {
            return root;
        }
        TreeNode lTreeNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rTreeNode = lowestCommonAncestor(root.right, p, q);
        // 递归查找，如果左查询结果节点为空，则说明p、q均在右子树，返回右子树，右为空同理
        // 如果左右都不为空，则返回根节点
        if(lTreeNode == null) {
            return rTreeNode;
        }
        if(rTreeNode == null) {
            return lTreeNode;
        }
        return root;
    }
}
