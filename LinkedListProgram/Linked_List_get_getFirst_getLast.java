package LinkedListProgram;

import java.util.LinkedList;

/*1. get(int index) : This method returns the element at the specified position in this list.

Declaration :  public E get(int index)
Parameters :  index :  index of the element to return
Return Value : This method returns the element at the specified position in this list
Exception :  IndexOutOfBoundsException : if the index is out of range

2. getFirst() : This method returns the first element in this list.

Declaration :  public E getFirst()
Return Value : This method returns the first element in this list
Exceptions : NoSuchElementException : if this list is empty

3. getLast() : This method returns the last element in this list.

Declaration : public E getLast()
Return Value : This method returns the last element in this list
Exceptions :  NoSuchElementException : if this list is empty*/

public class Linked_List_get_getFirst_getLast {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// adding elements using add()
		list.add("Geeks");
		list.add(4);
		list.add("Geeks");
		list.add("8");

		// printing the whole list
		System.out.println("The elements in List are : " + list); //[Geeks, 4, Geeks, 8]

		// using get() to print element at index 3 prints 8
		System.out.println("Element at index 3 is : " + list.get(3)); //8

		// using get() to print element at first index prints "Geeks"
		System.out.println("Element at 1st index is : " + list.getFirst()); // Geeks

		// using get() to print element at last index prints "8"
		System.out.println("Element at last index is : " + list.getLast()); //8

	}

}
