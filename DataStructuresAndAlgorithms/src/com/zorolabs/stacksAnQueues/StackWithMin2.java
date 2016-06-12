/**
 * 
 */
package com.zorolabs.stacksAnQueues;

/**
 * @author zwoldeab
 *
 */


import java.util.Stack;
/*How would you design a stack which, in addition to push and pop, 
*also has a function min which returns the minimum element? Push,
* pop and min should all operate in O(1) time.
*/

public class StackWithMin2 extends Stack<Integer> {
	Stack<Integer> s2;

	public StackWithMin2() {
		s2 = new Stack<Integer>();
	}

	public void push(int value) {
		if (value <= min()) {
			s2.push(value);
		}
		super.push(value);
	}

	public Integer pop() {
		int value = super.pop();
		if (value == min()) {
			s2.pop();
		}
		return value;
	}

	public int min() {
		if (s2.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return s2.peek();
		}
	}

}
