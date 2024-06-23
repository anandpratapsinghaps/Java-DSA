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

    static String digits[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static void printDigits(int number){
        if(number==0){
            return;
        }
        int lastDigit=number%10;
        printDigits(number/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for(int i=0; i<n; i++){
        //     arr[i]=sc.nextInt();
        // }
        // findOcc(arr, 5, 0);
        printDigits(1234);
    }
}
