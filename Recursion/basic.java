package Recursion;

import java.util.Scanner;

public class basic {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number");
        int n=sc.nextInt();
        printDec(n);
    }
}
