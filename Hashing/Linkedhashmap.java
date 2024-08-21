package Hashing;
import java.util.*;
public class Linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("India",100);
        map.put("US",50);
        map.put("Russia",80);
        System.out.println(map);
        System.out.println(map.containsKey("US"));
        System.out.println(map.get("India"));
    }
}
