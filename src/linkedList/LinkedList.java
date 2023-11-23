package linkedList;



public class LinkedList {
	
	private Node first;
	private int length = 0;
	
	
	public LinkedList(int v){
		this.first = new Node(v);
		length = 1;
	}
	
	/*public LinkedList(){
		this.first = null;
		length = 0;
	}*/
	
	public void addATtail(int v){
		Node current = first;
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		current.setNext(new Node(v));
		length++;
	}
	
	public void add(int index, int v){
		Node current = first;
		for(int i = 0; i < index-1 && current.getNext() != null; i++)
		{
			current = current.getNext();
		}
		Node temp = current.getNext();
		current.setNext(new Node(v));
		current.getNext().setNext(temp);
		length++;
	}
	
	public void reverse() { 
        /*
         * reverses this list
         * */
		Node previous = first;
		Node curr = first.getNext();
		Node next = curr.getNext();
		
		first.setNext(null);

		while(curr.getNext() != null)
		{
			curr.setNext(previous);
			previous = curr;
			curr = next;
			next = curr.getNext();	
		}
		curr.setNext(previous);
		first = curr;
		//first = previous;
		/*Node curr2 = first;
		while(curr2.getNext() != null)
		{
			System.out.print(curr2.getValue() + " ");
			curr2 = curr2.getNext();
		}*/
		
    } 
	
	public void ringList()
	{
		Node curr = first;
		while(curr.getNext() != null)
		{
			curr = curr.getNext();
		}
		curr.setNext(first);
	}
	
	
	public void printRingList()
	{
		ringList();
		Node curr = first;
		System.out.print("Ring Linklist: (");
		while(curr.getNext() != first)
		{
			System.out.print(curr.getValue() + " - ");
			curr = curr.getNext();
		}
		System.out.print(curr.getValue() + ")");
	}
	

	
	public String toString(){
		Node current = first;
		String str = "( " + first.getValue() + " ";
		while(current.getNext() != null)
		{
			current = current.getNext();
			str = str + current.getValue() + " ";
		}
		str = str + " )";
		return str;
	}

}
