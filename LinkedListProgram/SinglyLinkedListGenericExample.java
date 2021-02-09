package LinkedListProgram;

/*Displaying LinkedList [first--->last]: Employee [id=39, name=pat]    Employee [id=14, name=sai]    Employee [id=59, name=katy]    
		Employee [id=21, name=amy]    Employee [id=11, name=sam]    
Deleted Nodes: Employee [id=39, name=pat]    Employee [id=14, name=sai]    
Displaying LinkedList [first--->last]: Employee [id=59, name=katy]    Employee [id=21, name=amy]    Employee [id=11, name=sam] */

public class SinglyLinkedListGenericExample {

	public static void main(String[] args) {
		LinkedList11<Employee11> linkedList = new LinkedList11<Employee11>(); 
		linkedList.insertFirst(new Employee11("11", "sam"));
		linkedList.insertFirst(new Employee11("21", "amy"));
		linkedList.insertFirst(new Employee11("59", "katy"));
		linkedList.insertFirst(new Employee11("14", "sai"));
		linkedList.insertFirst(new Employee11("39", "pat"));
		linkedList.displayLinkedList(); 
		System.out.print("Deleted Nodes: ");
		Node11<Employee11> deletedNode = linkedList.deleteFirst(); 
		deletedNode.displayNode(); 
		deletedNode = linkedList.deleteFirst();
		deletedNode.displayNode(); 
		System.out.println();
		linkedList.displayLinkedList(); 
	}
}

class LinkedList11<T> {
	private Node11<T> first; 
	public LinkedList11() {
		first = null;
	}
	public void insertFirst(T data) {
		Node11<T> newNode = new Node11<T>(data); 
		newNode.next = first; 
		first = newNode; 
	}
	public Node11<T> deleteFirst() {
		if (first == null) { 
			throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
		}
		Node11<T> tempNode = first; 
		first = first.next; 
		return tempNode; 
	}
	public void displayLinkedList() {
		System.out.print("Displaying LinkedList [first--->last]: ");
		Node11<T> tempDisplay = first; 
		while (tempDisplay != null) { 
			tempDisplay.displayNode();
			tempDisplay = tempDisplay.next; 
		}
		System.out.println();
	}
}

class Node11<T> {
	public T data; 
	public Node11<T> next; 
	public Node11(T data) {
		this.data = data;
	}
	public void displayNode() {
		System.out.print(data + " ");
	}
}

class Employee11 {
	private String id;
	private String name;
	public Employee11(String id, String name) { 
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]   ";
	}
}