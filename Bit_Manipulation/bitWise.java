package Bit_Manipulation;

public class bitWise {
    public static void OddEven(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }


    public static int getIthBit(int n, int i){
        int mask=1<<i;
        if((n&mask)==0){
            return 0;
        }
        return 1;
    }

    public static int setIthBit(int n, int i){
        int bitMask=1<<i;
        return n|bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }

    public static int updateBit(int n, int i, int newBit){
        n=clearIBits(n, i);
        int mask=newBit<<i;
        return n|mask;
    }

    public static int clearIBits(int n, int i){
        // int mask = (~0)<<i;
        int mask = -1<<i;
        return n&mask;
    }

    public static int clearRange(int n, int i, int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int mask=a|b;
        return n&mask;
    }

    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            if((n&1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int fastExpo(int n, int a){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }


    public static int modExpo(int n, int a, int p){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans%p;
    }
    public static void main(String[] args) {
        // System.out.println(5<<2);
        // System.out.println(5<<3);
        // System.out.println(6>>1);
        // OddEven(2);
        // OddEven(3);
        // OddEven(10);
        // OddEven(13);
        // System.out.println(getIthBit(5, 2));
        System.out.println(setIthBit(8, 1));
        // System.out.println(clearIthBit(10, 1));
        // System.out.println(updateBit(10, 2, 1));
        // System.out.println(clearIBits(15, 2));
        // System.out.println(clearRange(10, 2, 4));
        // System.out.println(isPowerOfTwo(5));
        // System.out.println(countSetBits(10));
        // System.out.println(fastExpo(3, 2));
        // System.out.println(modExpo(3, 2, 5));
    }

}
