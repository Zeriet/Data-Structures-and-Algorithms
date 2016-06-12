package com.zorolabs.binaryTrees;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
	
	private BinaryNode root;
	
	//for adding the sorted nodes
	private List<Integer> theArray;
	
	public BinarySearchTree(){
		root = null;
	}
	
	//print the values in the nodes in a sorted order
	public void printTree(){
		if(root == null){
			System.out.println("Empty tree");
		}
		
		else printTree(root);
	}

	
	public void printTree(BinaryNode t){
		if (t!=null){
			printTree(t.left);
//			System.out.println(t.element);
			theArray.add(t.element);
			printTree(t.right);
		}
	}
	
	
	
	public void insert(Integer x){
		
		if(root==null){
		root = new BinaryNode(x,null,null);
		return;
			
		}
		
		BinaryNode n = root;
		boolean inserted = false;
		while(!inserted){
			if(x.compareTo(n.element) < 0){
				if(n.left == null){
					n.left = new BinaryNode(x,null,null);
					inserted = true;
				}
				else {
					n = n.left;
				}
			} 
			
			if(x.compareTo(n.element)>0){
				if(n.right == null){
					n.right = new BinaryNode(x,null,null);
					inserted = true;
				}
				else {
					n = n.right;
				}
			} 
			
		}
		
		
	}
	
	 private class BinaryNode{
		
		private Integer element;
		private BinaryNode left;
		private BinaryNode right;
		
		public BinaryNode(Integer theElement){
			this(theElement,null,null);
			
		}
		public BinaryNode(Integer theElement,BinaryNode left,BinaryNode right){
			
			this.element =theElement;
			this.left = left;
			this.right = right;
		}
			
	}
	 
	 public static void main(String[] args){
		 int[] input = {1, 9, 3, 8, 12, 4, 2};
		 BinarySearchTree myTree = new BinarySearchTree();
		 for(int x:input){
			 myTree.insert(x);
		 }
		 
		 myTree.printTree();
		 
		 
	 }
	

}
