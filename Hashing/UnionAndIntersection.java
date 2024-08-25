package Hashing;
import java.util.*;
public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,2,3,8,9};

        //union
        HashSet<Integer> set1 = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set1.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            set1.add(arr2[i]);
        }

        System.out.println(set1.size());
        System.out.println(set1);

        //intersection
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set2.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            int count = 0;
            if(set2.contains(arr2[i])){
                count++;
                set2.remove(arr2[i]);
            }
        }

        System.out.println(set2);
        System.out.println(set2.size());

    }
}
