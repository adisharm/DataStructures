package LinkedListCode;

public class LinkedList {
	Node root = null;

	public void insertAtEnd(Object val) {
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

	public void removeAtEnd() {
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

	public void reverseList() {
		Node finalList = null;
		Node curr = root;
		Node next;
		while (curr != null) {
			next = curr.next;
			curr.next = finalList;
			finalList = curr;
			curr = next;
		}
		root = finalList;
	}

	public void insertAtFront(Object val) {
		Node newNode = new Node(val, root);
		root = newNode;
	}

	public void removeAtFront() {
		Node temp = root;
		if (temp == null) {
			System.out.println("Nothing to remove as list is empty");
		} else if (temp.next != null) {
			temp.val = temp.next.val;
			temp.next = temp.next.next;
		} else {
			root = null;
		}
	}

	public void insertAtIndex(int index, Object val) {
		Node temp = root;
		int i = 0;
		if (temp == null) {
			insertAtFront(val);
		} else {
			while (temp.next != null) {
				temp = temp.next;
				i++;
				if (i == index - 1) {
					if (temp.next != null) {
						temp.next = new Node(val, temp.next);
					} else {
						temp.next = new Node(val, null);
					}
					break;
				}
			}
		}
		if (i < index - 1) {
			System.out.println("Index:" + index + " does not exist");
		}
	}

	public void addTwoLinkedList(Node root1, Node root2) {
		Node finalResult = null;
		Node result;
		Object val;
		boolean carryOver = false;
		while (root1.next != null || root2.next != null) {
			if (carryOver) {
				val = (((Integer) root1.val + (Integer) root2.val + 1) % 10);
			} else {
				val = (((Integer) root1.val + (Integer) root2.val) % 10);
			}
			if ((((Integer) root1.val + (Integer) root2.val) / 10) == 1) {
				carryOver = true;
			}
			result = new Node(val,null);
			result = re
		}
		if(carryOver)
	}
}
