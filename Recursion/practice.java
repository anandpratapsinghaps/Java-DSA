package Recursion;
import java.util.Scanner;

public class practice {

    public static void findOcc(int arr[], int key,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        findOcc(arr, key, i+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        findOcc(arr, 5, 0);
    }
}
