package LinkedListProgram;

/*LinkedList has been succesfully converted into CircularLinkedList
Displaying LinkedList [first--->last]: 11 22 33 44 55 66 33 44 55 66 33 44 
LinkedList is circular at Node: 33
Total number of nodes in LinkedList are: 6*/

public class LinkedListCircularCalculateNodes {

	public static void main(String[] args) {
		LinkedList9 linkedList=new LinkedList9();
        linkedList.insert(66);
        linkedList.insert(55);
        linkedList.insert(44);
        linkedList.insert(33);
        linkedList.insert(22);
        linkedList.insert(11);
        
        linkedList.makeLinkedListCircular();
        linkedList.displayLinkedList();
        
        linkedList.calculateNodesInCircularLikedList();

	}

}
class LinkedList9{
    
    Node first=null;
    Node circularPoint1; //points used to make LinkedList circular.
    Node circularPoint2;
    
    Node slowPointer; //will step over LinkedList by 1 Node.
    Node fastPointer; //will step over LinkedList by 2 Node.
 
    
    /**
     * Insert New Node at first position
     */
    public void insert(int data){
           
           Node newNode=new Node(data);
           newNode.next=first;
           first=newNode;
           
           /*
            * Below we have kept track of two Nodes so that later we can make LinkedList circular(If required).
            * Note:- I have kept track of below two nodes just for demonstration purpose. You may provide some other implementation for making LinkedList circular.
            */
           if(data==33)
                  circularPoint1=newNode;        
           if(data==66)
                  circularPoint2=newNode;
           
    }
    
    /**
     *This method makes LikedList circular- by making end Node point to some middle Node of LinkedList.
     *end Node--->middle Node.
     */
    public void makeLinkedListCircular(){
           circularPoint2.next=circularPoint1;
           System.out.println("LinkedList has been succesfully converted into CircularLinkedList");
    }
    
    /**
     * method calculates number of nodes in circular LinkedList.
     */
    public void calculateNodesInCircularLikedList(){
           slowPointer=first;
           fastPointer=first;
           
           while( (slowPointer!=fastPointer || slowPointer==first) //when first time condition is checked    slowPointer is equal to fastPointer -so that does not means LinkedList is circular and we exit while loop
                                                                                      //we got to be cautious by keeping extra check that whether we are on first node or not.
                        && fastPointer.next!=null  //used to avoid NullPointerException(in case we are are on last Node- than next is null, calling further next on null will cause NPE.)
                        && fastPointer.next.next!=null){
                  slowPointer=slowPointer.next;         // step over LinkedList by 1 Node.
                  fastPointer=fastPointer.next.next; // step over LinkedList by 2 Node.    
           }
           
           //we will exit above while loop when we have detected LinkedList is circular.
           
           int noOfNodes=0;  //initially keep number of nodes to zero.    
           
           /*make one of the pointer point to first,
            * & than make both pointers step over LinkedList by 1 Node, they will meet at intersection point giving number of elements before loop formation.
            */
           slowPointer=first;  
           while(slowPointer!=fastPointer){
                  slowPointer=slowPointer.next;  // step over LinkedList by 1 Node.
                  fastPointer=fastPointer.next;  // step over LinkedList by 1 Node.
                  noOfNodes++;
           }
           System.out.println("LinkedList is circular at Node: "+slowPointer.data);
           
           /*
            *Make  slow pointer step over LinkedList by 1 Node.
            *& Make  slow pointer step over LinkedList by 2 Node.
            *They both will meet after certain number of iterations giving length of loop.
            */
           boolean pointersJustmet=true;
           while(slowPointer!=fastPointer || pointersJustmet){ //initially slowPointer is equal to fastPointer so boolean variable ensures that we don't exit in first iteration.
                  slowPointer=slowPointer.next;  // step over LinkedList by 1 Node.
                  fastPointer=fastPointer.next.next; // step over LinkedList by 2 Node.
                  noOfNodes++;
                  pointersJustmet=false;
           }
           System.out.println("Total number of nodes in LinkedList are: "+noOfNodes);
    }
    
 
    /**
     * Display LinkedList
     */
    public void displayLinkedList(){
           Node tempDisplay=first;        
           int displayLimiterCtr=0;   //as our LinkedList is circular it will keep on displaying nodes till infinity...
                                                           //so this variable will help us in limiting the display to specific count.
           System.out.print("Displaying LinkedList [first--->last]: ");
           while(tempDisplay!=null){
                  tempDisplay.displayNode();
                  tempDisplay=tempDisplay.next;
                  if(++displayLimiterCtr >= 12)         //stops displaying after 12 Nodes.
                        break;
           }
           System.out.println();
    }
    
}