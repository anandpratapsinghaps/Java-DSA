package Hashing;
import java.util.*;
public class distinctElement {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,5,7,9,1,2,3,4};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
