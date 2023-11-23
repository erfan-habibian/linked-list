package linkedList;

public class Node {
	
	private int value;
	private Node next;
	
	public Node(int v){
		value = v;
		this.next = null;
	}
	
	public Node(int v, Node next){
		value = v;
		//this.next = new Node(next);
		this.next = next;
	}
	
	public Node(Node node){
		value = node.value;
		this.next = node.next;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		//this.next = new Node(next);
		this.next = next;
	}
}
