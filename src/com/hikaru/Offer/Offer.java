package com.hikaru.Offer;

public class Offer {
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    public void preOrder(Node root, Node preNode) {
        if (root == null) {
            return;
        }
        preOrder(root.left, root);
        if (preNode != null && preNode.right == null) {
            preNode.right = root;
        }
        if (root.left == null) {
            root.left = preNode;
        }
        preOrder(root.right, root);
    }

    public Node treeToDoublyList(Node root) {
        preOrder(root, null);
        Node p = root, q = root;
        while(p.left != null) {
            p = p.left;
        }
        while(q.right != null) {
            q = q.right;
        }
        p.left = q;
        q.right = p;
        return p;
    }
}
