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

    public static boolean isSorted(int arr[] , int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOcc(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcc(arr, key, i+1);
    }

    public static int lastOcc(int arr[] , int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOcc(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }

    public static int powerOf(int x, int n){
        if(n==0) return 1;

        // int xn1=powerOf(x, n-1);
        // int xn=x*xn1;
        // return xn;
        return x*powerOf(x, n-1);
    }

    public static int optimizedPow(int x, int n){
        if(n==0) return 1;
        int halfPow=optimizedPow(x, n/2);
        int halfPowsq = halfPow*halfPow;

        if(n%2!=0){
            halfPowsq=x*halfPowsq;
        }
        return halfPowsq;
    }
    
    //tiling problem

    public static int tilingProblem(int n){
        if(n==0||n==1) return 1;

        //for vertical
        int v=tilingProblem(n-1);

        //for horizontal
        int h=tilingProblem(n-2);
        
        int totalWays=v+h;
        return totalWays;
    } 

    //remove duplicates

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    //pairing problem

    public static int fPair(int n){
        if(n==0||n==1||n==2) return n;

        //choice
        //single
        int f1=fPair(n-1);

        //pair
        int f2=fPair(n-2);
        int pairWays=(n-1)*f2;

        int totalWays=f1+pairWays;
        return totalWays;
    }

    //binary String

    public static void BinStr(int n, int lastPlace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        BinStr(n-1, 0, str+"0");
        if(lastPlace==0){
            BinStr(n-1,1, str+"1");
        }
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter your number: ");
        // int n=sc.nextInt();
        // printDec(n);5
        // System.out.println(fact(n));
        // System.out.println(Sum(n));
        // System.out.println(fibocnacci(n));
        // sc.close();
        // int arr[] = {1,5,3,4,5};
        // System.out.println(isSorted(arr, 4));
        // System.out.println(firstOcc(arr, 5, 0));
        // System.out.println(lastOcc(arr, 5, 0));
        // System.out.println(powerOf(2, 10));
        // System.out.println(optimizedPow(2, 10));
        // System.out.println(tilingProblem(n));
        // String str = "hello";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(fPair(n));
        BinStr(3, 1, "");
    }
}
