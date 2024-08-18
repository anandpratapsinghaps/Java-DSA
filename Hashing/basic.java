package Hashing;
import java.util.HashMap;
import java.util.Set;
public class basic {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //add
        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);
        System.out.println(map); 

        //get
        System.out.println(map.get("India"));
        System.out.println(map.get("Uk"));

       //contains
        System.out.println(map.containsKey("US"));
        
        //remove
        System.out.println(map.remove("US"));
        System.out.println(map);

        //size
        System.out.println(map.size());

         //isEmpty
        System.out.println(map.isEmpty());

        //iterate
        Set<String> keys = map.keySet();
        System.out.println(keys);
        
        for(String k : keys){
            System.out.println("Key = " + k + ", value = "+ map.get(k));
        }

    }
}
