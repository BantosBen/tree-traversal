package com.sanj.traversalAlgorithms;

import com.sanj.node.TreeNode;

//LEFT  - RIGHT - ROOT
public class PostOrder {
    public void traverse(TreeNode root) {
        if (root != null) {
            traverse(root.left);
            traverse(root.right);
            System.out.print(root.name + " -> ");
        }
    }
}
