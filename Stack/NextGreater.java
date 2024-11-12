package Stack;
import java.util.*;
public class NextGreater {
    // public static int[] nextGreater(int arr[]){
    //     int res[] = new int[arr.length];
    //     Arrays.fill(res, -1);
    //     for(int i=0; i<arr.length; i++){
    //         for(int j=i+1; j<arr.length; j++){
    //             if(arr[j]>arr[i]){
    //                 res[i] = arr[j];
    //                 break;
    //             }
    //         }
    //     }
    //     return res;
    // }

    //using stack
    public static int[] nextGreater(int arr[]){
        int res[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                res[i] = -1;
            } else{
                res[i] = arr[s.peek()];
            }
            s.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of arr: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result[] = nextGreater(arr);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}

