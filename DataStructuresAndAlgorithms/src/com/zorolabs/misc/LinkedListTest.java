package com.zorolabs.misc;


public class LinkedListTest {
	public static nodeLinkedList nodeList;
 
	public static void main(String[] args) {
 
		// Default constructor - let's put "0" into head element.
		nodeList = new nodeLinkedList();
 
		// add more elements to LinkedList
		nodeList.add("1node");
		nodeList.add("2node");
		nodeList.add("3node");
		nodeList.add("4node");
		nodeList.add("5node");
		nodeList.add("6node");
		nodeList.add("7node");
 
		/*
		 * Please note that primitive values can not be added into LinkedList directly. They must be converted to their
		 * corresponding wrapper class.
		 */
 
		System.out.println("Print: nodeList: \t\t" + nodeList);
		System.out.println(".size(): \t\t\t\t" + nodeList.size());
		System.out.println(".get(3): \t\t\t\t" + nodeList.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".remove(2): \t\t\t\t" + nodeList.remove(2) + " (element removed)");
		System.out.println(".get(3): \t\t\t\t" + nodeList.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".size(): \t\t\t\t" + nodeList.size());
		System.out.println("Print again: nodeList: \t" + nodeList);
		
		// middle element print
		System.out.println("middle node is: "+nodeList.getMiddleNode(nodeList));
		
		// Is the list a loop
		System.out.println("Is the list a loop: "+nodeList.isListLoop(nodeList));
		
		
		// lastThird element print
		System.out.println("lastThird node is: "+nodeList.lastThirdNode(nodeList));

	}
 
}
 
class nodeLinkedList {
 
	private static int counter;
	private Node head;
 
	// Default constructor
	public nodeLinkedList() {
 
	}
	
	// appends the specified element to the end of this list.
	public void add(Object data) {
 
		// Initialize Node only incase of 1st element
		if (head == null) {
			head = new Node(data);
		}
 
		Node nodeTemp = new Node(data);
		Node nodeCurrent = head;
 
		// Let's check for NPE before iterate over nodeCurrent
		if (nodeCurrent != null) {
 
			// starting at the head node, crawl to the end of the list and then add element after last node
			while (nodeCurrent.getNext() != null) {
				nodeCurrent = nodeCurrent.getNext();
			}
 
			// the last node's "next" reference set to our new node
			nodeCurrent.setNext(nodeTemp);
		}
 
		// increment the number of elements variable
		incrementCounter();
	}
 
	private static int getCounter() {
		return counter;
	}
 
	private static void incrementCounter() {
		counter++;
	}
 
	private void decrementCounter() {
		counter--;
	}
 
	// inserts the specified element at the specified position in this list
	public void add(Object data, int index) {
		Node nodeTemp = new Node(data);
		Node nodeCurrent = head;
 
		// Let's check for NPE before iterate over nodeCurrent
		if (nodeCurrent != null) {
			// crawl to the requested index or the last element in the list, whichever comes first
			for (int i = 0; i < index && nodeCurrent.getNext() != null; i++) {
				nodeCurrent = nodeCurrent.getNext();
			}
		}
 
		// set the new node's next-node reference to this node's next-node reference
		nodeTemp.setNext(nodeCurrent.getNext());
 
		// now set this node's next-node reference to the new node
		nodeCurrent.setNext(nodeTemp);
 
		// increment the number of elements variable
		incrementCounter();
	}
 
	public Object get(int index)
	// returns the element at the specified position in this list.
	{
		// index must be 1 or higher
		if (index <= 0)
			return null;
		Node nodeCurrent = null;
		if (head != null) {
			nodeCurrent = head.getNext();
			for (int i = 0; i < index; i++) {
				if (nodeCurrent.getNext() == null)
					return null;
 
				nodeCurrent = nodeCurrent.getNext();
			}
			return nodeCurrent.getData();
		}
		return nodeCurrent;
 
	}
 
	// removes the element at the specified position in this list.
	public boolean remove(int index) {
 
		// if the index is out of range, exit
		if (index < 1 || index > size())
			return false;
 
		Node nodeCurrent = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (nodeCurrent.getNext() == null)
					return false;
 
				nodeCurrent = nodeCurrent.getNext();
			}
			nodeCurrent.setNext(nodeCurrent.getNext().getNext());
 
			// decrement the number of elements variable
			decrementCounter();
			return true;
 
		}
		return false;
	}
 
	// returns the number of elements in this list.
	public int size() {
		return getCounter();
	}
 
	public String toString() {
		String output = "";
 
		if (head != null) {
			Node nodeCurrent = head.getNext();
			while (nodeCurrent != null) {
				output += "[" + nodeCurrent.getData().toString() + "]";
				nodeCurrent = nodeCurrent.getNext();
			}
 
		}
		return output;
	}
	
	

	public Node getMiddleNode(nodeLinkedList nodeLinkedList){
		Node currentNode=null;		
		if(nodeLinkedList !=null){
			 currentNode = (Node)nodeLinkedList.head;
		}
		int length = 0;
		Node middle = currentNode;
		while(currentNode.getNext()!=null){
			length++;
			if(length%2==0){
				middle = middle.next;
			}
			currentNode = currentNode.getNext();
			
		}
		
		return middle;
		
	}
	
	// finding if the linkedlist is a loop
	public boolean isListLoop(nodeLinkedList nodeLinkedList){
		Node currentNode=null;		
		if(nodeLinkedList !=null){
			 currentNode = (Node)nodeLinkedList.head;
		}
		int length = 0;
		Node middle = currentNode;
		while(currentNode.getNext()!=null){
			length++;
			if(length%2==0){
				middle = middle.next;
			}
			currentNode = currentNode.getNext();
			
			if(middle.equals(currentNode)){
				return true;
			}
		
			
		}
		
		return false ;
		
	}
	
	// finding last third node
	public Node lastThirdNode(nodeLinkedList nodeLinkedList){
		Node currentNode=null;		
		if(nodeLinkedList !=null){
			 currentNode = (Node)nodeLinkedList.head;
		}
		int length = 0;
		Node lastThird = currentNode;
		while(currentNode.getNext()!=null){
			length++;
			if(length>=4){
				lastThird = lastThird.next;
			}
			currentNode = currentNode.getNext();
			
		
			
		}
		
		return lastThird ;
		
	}
 
 
	private class Node {
		// reference to the next node in the chain, or null if there isn't one.
		Node next;
 
		// data carried by this node. could be of any type you need.
		Object data;
 
		// Node constructor
		public Node(Object dataValue) {
			next = null;
			data = dataValue;
		}
 
		// another Node constructor if we want to specify the node to point to.
		@SuppressWarnings("unused")
		public Node(Object dataValue, Node nextValue) {
			next = nextValue;
			data = dataValue;
		}
 
		// these methods should be self-explanatory
		public Object getData() {
			return data;
		}
 
		@SuppressWarnings("unused")
		public void setData(Object dataValue) {
			data = dataValue;
		}
 
		public Node getNext() {
			return next;
		}
 
		public void setNext(Node nextValue) {
			next = nextValue;
		}

		@Override
		public String toString() {
			return "Node [next=" + next + ", data=" + data + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((data == null) ? 0 : data.hashCode());
			result = prime * result + ((next == null) ? 0 : next.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (data == null) {
				if (other.data != null)
					return false;
			} else if (!data.equals(other.data))
				return false;
			if (next == null) {
				if (other.next != null)
					return false;
			} else if (!next.equals(other.next))
				return false;
			return true;
		}

		private nodeLinkedList getOuterType() {
			return nodeLinkedList.this;
		}
		
		
 
	}
}