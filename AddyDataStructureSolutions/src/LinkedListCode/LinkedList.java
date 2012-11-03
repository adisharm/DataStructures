package LinkedListCode;

public class LinkedList {
	Node root = null;

	public void insert(Object val) {
		Node temp = null;
		if (root == null) {
			temp = new Node(val, null);
			root = temp;
		} else {
			temp = root;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(val, null);
		}
	}

	public void remove() {
		Node temp = root;
		if (temp == null) {
			System.out.println("List is empty hence nothing to remove");
		} else if (temp.next == null) {
			root = null;
		} else {
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}
	}

	public void printList() {
		Node temp = root;
		if (temp == null) {
			System.out.println("List is empty");
		} else {
			System.out.print(root.val);
			while (temp.next != null) {
				temp = temp.next;
				System.out.print(":" + temp.val);
			}
		}
		System.out.println("\n");
	}
	
	
	public void reverseList()
	{
		Node finalList = null;
		Node curr=root;
		Node next;
		while(curr!=null)
		{
			next = curr.next;
			curr.next = finalList;
			finalList = curr;
			curr = next;		}
		root = finalList;
	}
}
