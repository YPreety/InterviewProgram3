package LinkedListProgram;

import java.util.LinkedList;

/*1. indexOf(Object o) : This method returns the index of the first occurrence of the specified element in this list, 
or -1 if this list does not contain the element.

Declaration : public int indexOf(Object o)
Parameters :  o :  element to search for
Return Value :  This method returns the index of the first occurrence of the specified element in this list, 
or -1 if this list does not contain the element.

2. lastIndexOf(Object o) : This method returns the index of the last occurrence of the specified element in this list, 
or -1 if this list does not contain the element.

Declaration :  public int lastIndexOf(Object o)
Parameters :   o : element to search for
Return Value : This method returns the index of the last occurrence of the specified element in this list, or -1 if this
list does not contain the element*/

public class Linked_List_indexOf_and_lastIndexof {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// adding elements
		list.add("Geeks");
		list.add(4);
		list.add("Geeks");
		list.add(8);

		// printing the initial list
		System.out.println("The initial Linked List is : " + list); //[Geeks, 4, Geeks, 8]

		// Retrieving index of 1st occurrence of "Geeks" Prints 0
		System.out.println("Index of 1st occurrence of Geeks : " + list.indexOf("Geeks")); //0

		// Retrieving index of last occurrence of "Astha" Prints -1 element not
		// present
		System.out.println("Index of last occurrence of Astha : " + list.lastIndexOf("Astha")); //-1

	}

}
