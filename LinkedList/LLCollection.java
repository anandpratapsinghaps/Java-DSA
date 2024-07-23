package LinkedList;
import java.util.LinkedList;
public class LLCollection {
    public static void main(String[] args) {

        //create
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        System.out.println(ll);

        //remove
        ll.removeFirst();
        System.out.println(ll);
    }
}
