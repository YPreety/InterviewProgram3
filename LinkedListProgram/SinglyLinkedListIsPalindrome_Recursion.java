package LinkedListProgram;

/*Time Complexity: O(n)
Auxiliary Space: O(n)*/

public class SinglyLinkedListIsPalindrome_Recursion {

	Node head; 
	Node left;

	class Node {
		char data;
		Node next;

		Node(char d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		SinglyLinkedListIsPalindrome_Recursion llist = new SinglyLinkedListIsPalindrome_Recursion();
		char str[] = { 'a', 'b', 'a', 'c', 'a', 'b', 'a' };
		String string = new String(str);
		for (int i = 0; i < 7; i++) {
			llist.push(str[i]);
			llist.printList(llist.head);
			if (llist.isPalindrome(llist.head) != false) {
				System.out.println("Is Palindrome");
				System.out.println("");
			} else {
				System.out.println("Not Palindrome");
				System.out.println("");
			}
		}

	}

	public void push(char new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	void printList(Node ptr) {
		while (ptr != null) {
			System.out.print(ptr.data + "->");
			ptr = ptr.next;
		}
		System.out.println("NULL");
	}

	boolean isPalindrome(Node head) {
		boolean result = isPalindromeUtil(head);
		return result;
	}

	boolean isPalindromeUtil(Node right) {
		left = head;
		if (right == null)
			return true;
		boolean isp = isPalindromeUtil(right.next);
		if (isp == false)
			return false;
		boolean isp1 = (right.data == (left).data);
		left = left.next;
		return isp1;
	}

}
