package LinkedList;

public class DoubleLL {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("bhag ja bsdk kuch nhi hai");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public int removeLast(){
        if(head == null){
            System.out.println("khaali hai");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node curr = head;
        for(int i=0; i<size-2; i++){
            curr = curr.next;
        }
        int val = curr.next.data;
        curr.next = null;
        tail.prev = curr;
        tail = curr;
        size--;
        return val;
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.printLL();
        // System.out.println(dll.size);
        // dll.addLast(6);
        // dll.printLL();
        // System.out.println(dll.size);
        // dll.removeLast();
        // dll.printLL();
        // System.out.println(dll.size);
        dll.reverse();
        dll.printLL();

        // dll.removeFirst();
        // dll.printLL();
        // System.out.println(dll.size);
    }
}
