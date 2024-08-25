package Hashing;
import java.util.*;
public class IteratorInSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("India");
        set.add("China");
        set.add("US");
        set.add("UK");

        //using iterator
        Iterator i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        
        //using for each
        for(String s:set){
            System.out.println(s);
        }
    }
}
