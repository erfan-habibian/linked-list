package linkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList list = new LinkedList(0);
		list.addATtail(1);
		list.addATtail(54);
		list.addATtail(3);
		list.addATtail(4);
		list.addATtail(26);
		System.out.println(list);
		//list.printRingList();
		//System.out.print("list after reverse: ");
		list.reverse();
		System.out.println(list);
	}

}
