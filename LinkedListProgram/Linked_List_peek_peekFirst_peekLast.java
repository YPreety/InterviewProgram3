package LinkedListProgram;

import java.util.LinkedList;

/*Linked list class offers the functionality to “look into” the first and last elements of the list and hence can be 
useful in cases where only the retrieval is required and not necessarily the deletion is required. 

1. peek() : This method retrieves, but does not remove, the head (first element) of this list.

Declaration : public E peek()
Return Value : This method returns the head of this list, or null if this list is empty.

2. peekFirst() : This method retrieves, but does not remove, the first element of this list, or returns null if 
this list is empty. This works similar to peek().

Declaration : public E peekFirst()
Return Value : This method returns the first element of this list, or null if this list is empty

3. peekLast() : This method retrieves, but does not remove, the last element of this list, or returns null if this list is empty.

Declaration : public E peekLast()
Return Value : This method returns the last element of this list, or null if this list is empty*/
public class Linked_List_peek_peekFirst_peekLast {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// adding elements
		list.add("Geeks");
		list.add(4);
		list.add("Geeks");
		list.add("8");

		// printing the list
		System.out.println("The initial list is :" + list); //[Geeks, 4, Geeks, 8]

		// peek at the head of the list Prints 1st element, "Geeks"
		System.out.println("Head of the list : " + list.peek()); //Geeks
		// peek at the first element of the list Prints 1st element, "Geeks"
		System.out.println("First element of the list is : " + list.peekFirst()); //Geeks
		// peek at the last element of the list Prints last element, 8
		System.out.println("Last element of the list is : " + list.peekLast()); //8

	}

}
