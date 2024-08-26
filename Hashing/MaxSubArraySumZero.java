package Hashing;
import java.util.*;
public class MaxSubArraySumZero {
    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10};

        //brute force
        // int max = 0;
        // for(int i=0; i<arr.length; i++){
        //     int sum =0;
        //     for(int j=i; j<arr.length; j++){
        //         sum += arr[j];
        //         if(sum == 0 && (j-i+1)>max){
        //             max = j-i+1;
        //         }
        //     }
        // }
        // System.out.println(max);

        //using hashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int len = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(map.containsKey(sum)){
                len = Math.max(len, i-map.get(sum));
            } else{
                map.put(sum, i);
            }
        }
        System.out.println(len);
    }
}
