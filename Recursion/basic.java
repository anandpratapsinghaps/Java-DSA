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

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fact1=fact(n-1);
        int fn=n*fact(n-1);
        return fn;
    }


    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int sum1=Sum(n-1);
        int totalSum=n+Sum(n-1);
        return totalSum;
    }

    public static int fibocnacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib1=fibocnacci(n-1);
        int fib2=fibocnacci(n-2);
        int fib=fib1 + fib2;
        return fib;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n=sc.nextInt();
        // printDec(n);5
        // System.out.println(fact(n));
        // System.out.println(Sum(n));
        System.out.println(fibocnacci(n));
        sc.close();
    }
}
