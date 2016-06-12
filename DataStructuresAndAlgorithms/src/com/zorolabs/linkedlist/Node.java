/**
 * 
 */
package com.zorolabs.linkedlist;


/**
 * @author zwoldeab
 *
 */
public class Node {
	
		// reference to the next node in the chain, or null if there isn't one.
		public Node next;
 
		// data carried by this node. could be of any type you need.
		 public int data;

		/**
		 * @param next
		 * @param data
		 */
		public Node(Node next, int data) {
			super();
			this.next = next;
			this.data = data;
		}

		
		
}
