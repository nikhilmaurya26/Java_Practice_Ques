class mylinkedlist{
    public Node head = null;    
    public Node tail = null; 

    class Node{
        int data; 
        Node next;

        public Node( int data){
            this.data=data;
            this.next=null;
        }
    }
   
    public void addatend(int data){

        Node newnode = new Node(data);

        if(head==null){
            
            head=newnode;
            tail=newnode;
            // tail.next=null;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
 }

 public void printList() {   

    Node currentNode = head;   
    if(head == null) {    
        System.out.println("Linked List is empty"); 
    }else {  
        System.out.println("Nodes of singly linked list: "); 
        //currentNode will point to head    
        // Node currentNode = head;      
        while(currentNode != null) {     
            System.out.print(currentNode.data + " ");    
            currentNode = currentNode.next;    
        }    
        System.out.println();
    }
}   
}




public class linkedlist2 {
    public static void main(String[] args) {
    
        mylinkedlist list = new mylinkedlist();
        list.printList();
        list.addatend(5);
        list.addatend(7);
    
        list.printList();
    }
}
