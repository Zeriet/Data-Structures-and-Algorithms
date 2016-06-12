/**
 * 
 */
package com.zorolabs.stacksAnQueues;

import com.zorolabs.linkedlist.Node;

/**
 * @author zwoldeab
 *
 */
public class Queue {

	
	Node first, last;
	
	void enqueu(int value){
		
		if(first == null){
			last  =  new Node(null,value);
			first = last;
		} else{
			last.next = new Node(null,value);
			last = last.next;
		}
	}
	
	Node dequeu(Node n){
		if(first != null){
			Node item = first;
			first  = first.next;
			return  item;
			
		}
		return null;
	}

}
