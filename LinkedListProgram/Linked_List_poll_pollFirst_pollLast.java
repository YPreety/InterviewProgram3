package LinkedListProgram;

import java.util.LinkedList;

/*1. poll() : This method retrieves and removes the head (first element) of this list.
This function not only returns deletes the first element, but also displays them while being deleted

Declaration :   public E poll()
Return Value :  his method returns the first element of this list, or null if this list is empty.*/

/*2.pollFirst() : This method retrieves and removes the first element of this list, or returns null if this list is empty.
Declaration : public E pollFirst()
Return Value : This method returns the first element of this list, or null if this list is empty*/

/*3. pollLast() : This method retrieves and removes the last element of this list, or returns null if this list is empty.

Declaration :  public E pollLast()
Return Value : This method returns the last element of this list, or null if this list is empty.*/

public class Linked_List_poll_pollFirst_pollLast {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// adding elements
		list.add("Geeks");
		list.add(4);
		list.add("Geeks");
		list.add(8);

		// printing the list
		System.out.println("The initial Linked List is : " + list); //[Geeks, 4, Geeks, 8]

		// using poll() to retrieve and remove the head
		// removes and displays "Geeks"
		System.out.println("Head element of the list is : " + list.poll()); //Geeks
		// removes and displays "Geeks"
		System.out.println("Head element of the list is : " + list.pollFirst()); //4
		// removes and displays 8
		System.out.println("Tail element of the list is : " + list.pollLast()); //8

		// printing the resultant list
		System.out.println("Linked List after removal using poll() : " + list); //[Geeks]

	}

}
