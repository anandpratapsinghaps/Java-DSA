package Sliding_Window;

public class Subarray_Product_Less_Than_K {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 100;
        System.out.println(SubarrayProductLessThanK(arr, k));
    }
    public static int SubarrayProductLessThanK(int[] arr, int k){
        int end = 0, start = 0, p = 1, ans = 0;
        while(end < arr.length){

            //grow
            p = p * arr[end];

            //shrink
            while((p >= k) && (start <= end)){
                p = p/arr[start];
                start++;
            }

            //ans cal
            ans += (end - start + 1);
            end++;
        }
        return ans;
    }
}
