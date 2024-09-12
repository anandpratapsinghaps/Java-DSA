package Sliding_Window;

public class max_sum_window_size {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 2, 7, 5, 9, 3, 2, 4};
        int k = 3;
    }
    public static int maxSum(int[] arr, int k){
        int ans = 0, sum = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        ans = sum;
        for(int i=k; i<arr.length; i++){
            sum += arr[i]; //window grow
            sum -= arr[i - k]; //window shrink
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
