package LinkedListCode;

public class Test {

	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.insert(1);
		l.insert(3);
		l.insert("adi");
		l.printList();
//		l.remove();
//		l.remove();
//		l.remove();
		l.reverseList();
		l.printList();
	}
}
