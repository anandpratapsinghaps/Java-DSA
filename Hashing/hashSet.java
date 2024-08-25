package Hashing;
import java.util.*;
public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);

        System.out.println(set);
        set.remove(2);
        if(set.contains(2)){
            System.out.println("yes");
        } else{
            System.out.println("nikal ja yaha se");
        }
        System.out.println(set.size());
    }
}
