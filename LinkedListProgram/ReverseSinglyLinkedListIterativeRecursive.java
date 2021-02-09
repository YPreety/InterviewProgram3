package LinkedListProgram;

/*Output: linked list before reversing : A-->B-->C-->D-->E-->F 
linked list after reversing : F-->E-->D-->C-->B-->A 
linked list after reversing recursively: A-->B-->C-->D-->E-->F
*/

public class ReverseSinglyLinkedListIterativeRecursive {

	public static void main(String args[]) {
		SinglyLinkedList11 linkedlist = getDefaultList();
		System.out.println("linked list before reversing : " + linkedlist);
		linkedlist.reverseIteratively();
		System.out.println("linked list after reversing : " + linkedlist);
		linkedlist.reverseRecursively();
		System.out.println("linked list after reversing recursively: " + linkedlist);
	}

	private static SinglyLinkedList11 getDefaultList() {
		SinglyLinkedList11 linkedlist = new SinglyLinkedList11();
		linkedlist.append("A");
		linkedlist.append("B");
		linkedlist.append("C");
		linkedlist.append("D");
		linkedlist.append("E");
		linkedlist.append("F");
		return linkedlist;
	}

}

class SinglyLinkedList11<T> {
	private Node11 head;

	public SinglyLinkedList11() {
		// TODO Auto-generated constructor stub
	}

	public void append(T data) {
		if (head == null) {
			head = new Node11(data);
			return;
		}
		tail().next = new Node11(data);
	}

	public void reverseRecursively() {
		head = reverseRecursively(head);
	}

	private Node11 reverseRecursively(Node11 head2) {
		Node11 newHead;
		if ((head2.next == null)) {
			return head2;
		}
		newHead = reverseRecursively(head2.next);
		head2.next.next = head2;
		head2.next = null;
		return newHead;
	}

	public void reverseIteratively() {
		Node11 current = head;
		Node11 previous = null;
		Node11 forward = null;
		while (current.next != null) {
			forward = current.next;
			current.next = previous;
			previous = current;
			current = forward;
		}
		head = current;
		head.next = previous;

	}

	private Node11 tail() {
		Node11 tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		return tail;
	}

	@Override 
	public String toString(){ 
		StringBuilder sb = new StringBuilder(); 
		Node11 current = head; 
		while(current != null){ 
			sb.append(current).append("-->"); 
			current = current.next;
			} 
		if(sb.length()>=3){
			sb.delete(sb.length() - 3, sb.length()); 
			// to remove --> from last node 
			} 
			return sb.toString(); 
			}

	class Node11 {
		private Node11 next;
		private T data;

		public Node11(T data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return data.toString();
		}
	}


}
