package DivideAndConqure;
import java.util.Scanner;
public class RotatedArray {

    public static int SearchInRotatedArr(int arr[], int target, int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[si]<=arr[mid]){
            if(arr[si]<=target && target<=arr[mid]){
                return SearchInRotatedArr(arr, target, si, mid-1);
            }
            else{
                return SearchInRotatedArr(arr, target, mid+1, ei);
            }
        }
        else{
            if(arr[mid]<=target && target<=arr[si]){
                return SearchInRotatedArr(arr, target, mid+1, ei);
            }
            else{
                return SearchInRotatedArr(arr, target, si, mid-1);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[] =new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter your target element: ");
        int target=sc.nextInt();
        int idx =SearchInRotatedArr(arr, target, 0, arr.length-1);
        System.out.print("Target is at index " + idx + " of given array");
        sc.close();
    }
}
