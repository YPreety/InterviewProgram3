package LinkedListProgram;

import java.util.LinkedList;

/*Linked list also has a function that does the work of flexible addition of elements

1. offer(E e) : This method adds the specified element as the tail (last element) of this list.

Declaration : public boolean offer(E e)
Parameters : e: the element to add
Return Value :  This method returns true

2. offerFirst(E e) : This method inserts the specified element at the front of this list.

Declaration : public boolean offerFirst(E e)
Parameters :  e : the element to add
Return Value :  This method returns true

3. offerLast(E e) : This method inserts the specified element at the end of this list.

Declaration : public boolean offerLast(E e)
Parameters :  e:the element to add
Return Value :  This method returns true*/

public class Linked_List_offer_offerFirst_offerLast {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// adding elements
		list.add("Geeks");
		list.add(4);
		list.add("Geeks");
		list.add(8);

		// printing the list
		System.out.println("The initial Linked list is : " + list); //[Geeks, 4, Geeks, 8]

		// offering a new element adds element at tail.
		list.offer("Astha");
		// offering a new element adds element at head.
		list.offerFirst("Astha");
		// offering a new element adds element at end.
		list.offerLast("Astha");

		// printing the new list
		System.out.println("LinkedList after insertion using offer() : " + list); //[Astha, Geeks, 4, Geeks, 8, Astha, Astha]

	}

}
