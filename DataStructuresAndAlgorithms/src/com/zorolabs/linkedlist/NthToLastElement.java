/**
 * 
 */
package com.zorolabs.linkedlist;

/**
 * @author zwoldeab
 * 
 */
public class NthToLastElement {

	/*
	 * Assumption: The minimum number of nodes in list is n. Algorithm:
	 * 
	 * Create two pointers, p1 and p2, that point to the beginning of the node.
	 * Increment p2 by n-1 positions, to make it point to the nth node from the
	 * beginning (to make the distance of n between p1 and p2). Check for
	 * p2->next == null if yes return value of p1, otherwise increment p1 and
	 * p2. If next of p2 is null it means p1 points to the nth node from the
	 * last as the distance between the two is n. Repeat Step 3.
	 */

	public Node nthToLastElement(Node head, int n) {
		if (head == null || n < 1) {
			return null;
		}
		Node p2 = head;
		Node p1 = head;
		for (int i = 0; i < n - 1; i++) {
			if (p2 == null) {
				return null; // not found since list size < n
			}
			p2 = p2.next;
		}

		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}

		return p1;

	}

}
