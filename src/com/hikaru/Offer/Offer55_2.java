package com.hikaru.Offer;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Offer55_2 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * height被重复调用
     * @param root
     * @return
     */
//    public int depth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        return depth(root.left) > depth(root.right) ? depth(root.left) + 1 : depth(root.right) + 1;
//    }

    /**
     * 自底向上递归，height记录高度，同时-1代表节点不平衡
     * @param root
     * @return
     */
    public int depth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int lHeight = depth(root.left);
        int rHeight = depth(root.right);
        // 记忆化搜索，不平衡不需要计算
        if(lHeight == -1 || rHeight == -1 || Math.abs(lHeight - rHeight) > 1) {
            return -1;
        }
        return Math.max(lHeight, rHeight) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        return depth(root) >= 0;
    }
}
