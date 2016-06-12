/**
 * 
 */
package com.zorolabs.stacksAnQueues;

import com.zorolabs.linkedlist.Node;

/**
 * @author zwoldeab
 *
 */
public class Stack {
	
	Node top;
	
	Node pop(){
		
		if(top != null){
			Node upperNode  = top;
			top = top.next;
			return upperNode  ;
		}
		return null;
	}
	
	void push(int value){
		Node t = new Node(null,value);
		t.next = top;
		top = t;
		
	}
	
	

}
