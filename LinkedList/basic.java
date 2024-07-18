package LinkedList;

public class basic {

    public static class Node{
        int data;
        Node next;
    
        //constructor
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    //no need to make method static isko hum ll obj k through call krenge aur main method bhi static hai

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        
    }
    public static void main(String[] args) {
        basic ll = new basic();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}
