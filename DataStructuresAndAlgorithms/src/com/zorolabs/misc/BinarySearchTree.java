package com.zorolabs.misc;

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
			System.out.println(t.element);
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
	
// this method will return true if the tree is balanced, false otherwise 
	public boolean isBalanced(BinaryNode root){
		if(root == null){
			return true;
		}
		if(getHeight(root) ==-1){
			return false;
		}
		return true;
		
	}
	
	public int getHeight(BinaryNode root){
		if(root == null){
			return 0;
		}
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		
		if(left == -1|| right ==-1)
			return -1;
		if(Math.abs(left-right)>1)
				return -1;	
		return Math.max(left, right)+1;
		
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
		 int[] input = {9, 3, 10, 8, 12, 4, 2};
		 BinarySearchTree myTree = new BinarySearchTree();
		 for(int x:input){
			 myTree.insert(x);
		 }
		 
		 myTree.printTree();
		 
		 System.out.println("Is the tree balanced: "+myTree.isBalanced(myTree.root));
		 	 
	 }
	

}
