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
    public static void main(String[] args) {
        // System.out.println(5<<2);
        // System.out.println(5<<3);
        // System.out.println(6>>1);
        // OddEven(2);
        // OddEven(3);
        // OddEven(10);
        // OddEven(13);
        // System.out.println(getIthBit(5, 2));
        // System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
    }

}
