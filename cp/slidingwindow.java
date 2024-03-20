package cp;

public class slidingwindow {
    public static int maxSum(int arr[], int k){
        int maxSum = 0;
        int windowSum=0;
        int start=0;
        for(int end=0;end<arr.length;end++){
            windowSum=windowSum+arr[end];
            if(end>=k-1){
                maxSum=Math.max(maxSum,windowSum);
                windowSum=windowSum-arr[start];
                start++;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {2,7,3,5,8,1};
        System.out.println(maxSum(arr, 3));

    }
}
