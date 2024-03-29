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
   

    public void addatstart(int data){

        Node newnode = new Node(data);

        if(head==null){
            head=newnode;
            newnode.next=null;
            tail=newnode;
        }
        else{
            newnode.next=head;
            head = newnode;
        }
 }

 public void addatend(int data){

    Node newnode = new Node(data);

    if(head==null){
        
        head=newnode;
        tail=newnode;
    }
    else{
        tail.next=newnode;
        tail=newnode;

    }
 }

 public void printList() {   
    if(head == null) {    
        System.out.println("Linked List is empty"); 
    }else {  
        System.out.println("Nodes of singly linked list: "); 
        //currentNode will point to head    
        Node currentNode = head;      
        while(currentNode != null) {     
            System.out.print(currentNode.data + " ");    
            currentNode = currentNode.next;    
        }    
        System.out.println();
    }
}   
}

public class Linklist1{

public static void main(String[] args) {
    
    mylinkedlist list = new mylinkedlist();

    list.addatstart(2);
    list.addatstart(4);

    list.printList();
    list.addatend(9);
    list.printList();
}

}
