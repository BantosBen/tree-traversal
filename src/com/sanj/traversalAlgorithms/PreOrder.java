package com.sanj.traversalAlgorithms;

import com.sanj.node.TreeNode;

//ROOT - LEFT  - RIGHT
public class PreOrder {
    public void traverse(TreeNode root) {
        if (root != null) {
            System.out.print(root.name + " -> ");
            traverse(root.left);
            traverse(root.right);
        }
    }
}
