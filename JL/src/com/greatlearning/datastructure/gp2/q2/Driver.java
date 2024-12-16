package com.greatlearning.datastructure.gp2.q2;
import com.greatlearning.datastructure.gp2.q2.Node;
import com.greatlearning.datastructure.gp2.q2.BSTToSkewedTree;

//Driver.java
public class Driver {
 public static void main(String[] args) {
     // Constructing the BST
     Node root = new Node(50);
     root.left = new Node(30);
     root.right = new Node(60);
     root.left.left = new Node(10);
     root.right.left = new Node(55);

     // Converting BST to a right-skewed tree
     BSTToSkewedTree treeConverter = new BSTToSkewedTree();
     treeConverter.convertToSkewedTree(root);

     // Printing the right-skewed tree
     System.out.println("The resultant right-skewed tree is:");
     treeConverter.printSkewedTree(treeConverter.getHeadNode());
 }
}


