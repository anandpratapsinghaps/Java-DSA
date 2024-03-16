package LinkedList;

public class SinglyLinkedList {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    //display list
    public void display(){
        ListNode current = head;
        while(current!=null){
        System.out.print(current.data+"->");
        current=current.next;
        }
        System.out.println("null");
    }

    //count length
    public int length(){
        if(head==null){
            return 0;
        }
        int count =0;
        ListNode current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    //insert first

    public void insert(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }

    //insert at end
    public void insertlast(int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while (current.next!=null) {
            current=current.next;
        }
        current.next=newNode;
    }

    //delete_first
    public ListNode deletefirst(){
        if(head==null){
            return null;
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return temp;
    }
    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        // sll.head=new ListNode(10);
        // ListNode second =new ListNode(1);
        // ListNode third =new ListNode(8);
        // ListNode fourth =new ListNode(11);

        // sll.head.next=second;
        // second.next=third;
        // third.next=fourth;

        sll.insert(11);
        sll.insert(3);
        sll.insert(8);
        sll.insertlast(19);
        sll.insertlast(20);
        sll.insertlast(9);
        sll.display();
        System.out.println(sll.deletefirst().data);
        System.out.println(sll.deletefirst().data);
        sll.display();
        System.out.print("length is: "+sll.length());
    }
}
