package com.sanj.traversalAlgorithms;

import com.sanj.node.TreeNode;

//LEFT - ROOT - RIGHT
public class InOrder {
    public void traverse(TreeNode root) {
        if (root != null) {
            traverse(root.left);
            System.out.print(root.name + " -> ");
            traverse(root.right);
        }
    }
}
