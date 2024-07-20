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
    public static int size;

    //no need to make method static isko hum ll obj k through call krenge aur main method bhi static hai

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLL(){
        if(head == null){
            System.out.println("kuch nhi hai");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        //i = idx-1 (temp-->prev)
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int remvoeFirst(){
        if(size==0){
            System.out.println("khaali hai");
            return Integer.MIN_VALUE;
        } else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("khaali hai");
            return Integer.MIN_VALUE;
        } else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        } 
        return idx + 1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node temp = null;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
    }

    public void delNthEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){   // if n is head
            head = head.next;
        }

        //sz-n
        int i = 1;
        int idx = sz - n;
        Node prev = head;
        while(i<idx){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public static void main(String[] args) {
        basic ll = new basic();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.printLL();
        // ll.add(2, 9);
        // ll.printLL();
        // ll.remvoeFirst();
        // ll.printLL();
        // System.out.println(basic.size);
        // ll.removeLast();
        // ll.printLL();
        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.recSearch(2));
        // System.out.println(ll.recSearch(3));
        // ll.reverse();
        // ll.printLL();
        ll.delNthEnd(3);
        ll.printLL();

    }
}
