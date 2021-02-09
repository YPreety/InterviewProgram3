package LinkedListProgram;

/*Displaying in forward direction [first--->last] : 39 14 59 21 11 
Displaying in backward direction [last-->first] : 11 21 59 14 39 
Deleted Nodes: 39 14 
Displaying in forward direction [first--->last] : 59 21 11 
Displaying in backward direction [last-->first] : 11 21 59 */


public class DoublyLinkedListAtFirst {

	public static void main(String[] args) {
		LinkedList4 linkedList = new LinkedList4(); // creation of Linked List
        
        linkedList.insertFirst(11);
        linkedList.insertFirst(21);
        linkedList.insertFirst(59);
        linkedList.insertFirst(14);
        linkedList.insertFirst(39);

        linkedList.displayFrwd(); // display DoublyLinkedList
        linkedList.displayBckwrd();
                     
        System.out.print("Deleted Nodes: ");
        Node4 deletedNode = linkedList.deleteFirst(); //delete Node
        deletedNode.displayNode();                                 //display deleted Node.
        deletedNode = linkedList.deleteFirst();      //delete Node.
        deletedNode.displayNode();                                 //display deleted Node.
        
        System.out.println();// sysout used to format output
        
        linkedList.displayFrwd(); // display DoublyLinkedList
        linkedList.displayBckwrd();
	}
}
class LinkedList4 {
    private Node4 first; // ref to first link on LinkedList
    private Node4 last; // ref to last link on LinkedList
 
    /** Doubly LinkedList constructor */
    public LinkedList4(){
           first = null;
    }
  
    
    /** Insert New Node at first position of Doubly LinkedList  */
    
    public void insertFirst(int data){ // insert at front of list
           Node4 newNode = new Node4(data); // creation of new node.
           if (first == null) // means LinkedList is empty.
                  last = newNode; //  newNode <--- last
           else
                  first.previous = newNode; // newNode <-- old first
           newNode.next = first; // newNode --> old first
           first = newNode; // first --> newNode
    }
 
    /** Delete first node of Doubly linkedList.  */
    public Node4 deleteFirst() { 
                
           if(first==null){  //means LinkedList in empty, throw exception.              
                  throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
           }

           Node4 tempNode = first;
           if (first.next == null) // if only one item
                  last = null; // null <-- last
           else
                  first.next.previous = null; // null <-- old next
           first = first.next; // first --> old next
           return tempNode;
    }
 
    
    /** Display Doubly LinkedList in forward direction */
    public void displayFrwd() {
           System.out.print("Displaying in forward direction [first--->last] : ");
           Node4 tempDisplay = first; // start at the beginning of linkedList
           while (tempDisplay != null){ // Executes until we don't find end of list.
                  tempDisplay.displayNode();
                  tempDisplay = tempDisplay.next; // move to next Node
           }
           System.out.println("");
    }
 
 
    /** Display Doubly LinkedList in backward direction */
    public void displayBckwrd() {
           System.out.print("Displaying in backward direction [last-->first] : ");
           Node4 tempDisplay = last; // start at the end of linkedList
           while (tempDisplay != null) {// Executes until we don't find start of list.    
                  tempDisplay.displayNode();
                  tempDisplay = tempDisplay.previous; // move to previous Node
           }
           System.out.println("");
    }
    
 
}
class Node4 {
    public int data; // data in Node4.
    public Node4 next; // points to next Node4 in list.
    public Node4 previous; // points to previous Node4 in list.
 
    /** Constructor  */
    public Node4(int data){
           this.data = data;
    }
 
    /** Display Node4's data */
    public void displayNode() {
           System.out.print( data + " ");
    }
}

