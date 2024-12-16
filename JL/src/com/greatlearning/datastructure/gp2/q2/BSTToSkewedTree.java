package com.greatlearning.datastructure.gp2.q2;

import com.greatlearning.datastructure.gp2.q2.Node;


//BSTToSkewedTree.java
public class BSTToSkewedTree {
 private Node headNode = null;
 private Node prevNode = null;


 public void convertToSkewedTree(Node root) {
     if (root == null) {
         return;
     }

     // Process left subtree
     convertToSkewedTree(root.left);

     // Process current node
     if (headNode == null) {
         headNode = root;
     } else {
         prevNode.right = root;
     }
     root.left = null;
     prevNode = root;

     // Process right subtree
     convertToSkewedTree(root.right);
 }

 public void printSkewedTree(Node root) {
     
     while (root != null) {
         System.out.print(root.value + " ");
         root = root.right;
     }
     System.out.println();
 }

 
 public Node getHeadNode() {
     return headNode;
 }
 
}


