package LinkedList;

public class ZIgZagLL {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void printLL(){
        if(head == null){
            System.out.println("kuch nhi hai");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void zigzag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse second half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node LH = head;
        Node RH = prev;
        Node nextL, nextR;

        //merge in zig zag
        while(LH != null && RH != null){
            nextL = LH.next;
            LH.next = RH;
            nextR= RH.next;
            RH.next = nextL;
            LH = nextL;
            RH = nextR;
        }
    }

    public static void main(String[] args) {
        ZIgZagLL ll = new ZIgZagLL();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLL();
        ll.zigzag();
        ll.printLL();
    }
}

