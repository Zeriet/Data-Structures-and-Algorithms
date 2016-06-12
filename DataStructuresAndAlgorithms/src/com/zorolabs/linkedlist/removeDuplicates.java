/**
 * 
 */
package com.zorolabs.linkedlist;

import java.util.Hashtable;

/**
 * @author zwoldeab
 * 
 */
public class removeDuplicates {

	public static void deletepDup(Node n) {
		Hashtable<Integer,Boolean> table = new Hashtable<Integer,Boolean>();
		Node previous = null;

		while (n != null) {

			if(table.containsKey(n.data))
				previous.next = n.next;
			else{
				table.put(n.data, true);
				previous = n;
			}
				n = n.next;
		}
	}
}
