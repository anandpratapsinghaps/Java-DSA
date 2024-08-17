package Queue;
import java.util.*;
public class DequeJCF {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        // System.out.println(d);
        d.addLast(4);
        d.addLast(5);
        // System.out.println(d);
        d.removeFirst();
        // System.out.println(d);
        System.out.println("First element is " + d.getFirst());
        System.out.println("Last element is " + d.getLast());

    }
}
