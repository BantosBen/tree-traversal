package com.sanj;

import com.sanj.node.TreeNode;
import com.sanj.traversalAlgorithms.InOrder;
import com.sanj.traversalAlgorithms.PostOrder;
import com.sanj.traversalAlgorithms.PreOrder;
import sun.reflect.generics.tree.Tree;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static int  size,counter;

    public static void main(String[] args) {
        binaryTree();
    }

    private static void populateTree() {
        TreeNode root = new TreeNode();
        root.name = "15";
        root.left=new TreeNode();


        //LEFT SUB-TREE
        root.left.name = "5";
        root.left.left=new TreeNode();
        root.left.left.name = "3";
        root.left.right=new TreeNode();
        root.left.right.name = "12";
        root.left.right.left=new TreeNode();
        root.left.right.left.name = "10";
        root.left.right.right=new TreeNode();
        root.left.right.right.name = "13";
        root.left.right.left.left=new TreeNode();
        root.left.right.left.left.name = "6";
        root.left.right.left.left.right=new TreeNode();
        root.left.right.left.left.right.name = "7";

        //RIGHT SUB-TREE
        root.right=new TreeNode();
        root.right.name = "16";
        root.right.right=new TreeNode();
        root.right.right.name = "20";
        root.right.right.left=new TreeNode();
        root.right.right.left.name = "18";
        root.right.right.right=new TreeNode();
        root.right.right.right.name = "23";

        System.out.println("\n=======POST ORDER TRAVERSAL=======");
        new PostOrder().traverse(root);
        System.out.println("\n=======IN ORDER TRAVERSAL=======");
        new InOrder().traverse(root);
        System.out.println("\n=======PRE ORDER TRAVERSAL=======");
        new PreOrder().traverse(root);
    }

    private static void binaryTree(){
        counter=0;
        do {
            System.out.println("Enter number of trees");
            Scanner scanner=new Scanner(System.in);
            size=scanner.nextInt();
        }while (size<3);
        int rootValue=new Random().nextInt(1000);
        TreeNode root=new TreeNode();
        root.left=new TreeNode();
        root.left.value=rootValue;
        root.left.name=String.valueOf(rootValue);
        createTree(root,rootValue);
        new PostOrder().traverse(root);
    }
    private static void createTree(TreeNode root,int value){
        ++counter;
        if (size>counter){
            int leftVal,rightVal;
            do {
                leftVal=new Random().nextInt(value);
                rightVal=new Random().nextInt(1000);

            }while (leftVal>=value && rightVal<=value);

            root.value=value;
            root.name=String.valueOf(value);

            root.left=new TreeNode();
            root.left.value=leftVal;
            root.left.name=String.valueOf(leftVal);

            root.right=new TreeNode();
            root.right.value=rightVal;
            root.right.name=String.valueOf(rightVal);

            createTree(root.left,leftVal);
            createTree(root.right,rightVal);
        }
    }
}
