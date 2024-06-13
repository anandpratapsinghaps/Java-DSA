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
    public static void main(String[] args) {
        // System.out.println(5<<2);
        // System.out.println(5<<3);
        // System.out.println(6>>1);
        OddEven(2);
        OddEven(3);
        OddEven(10);
        OddEven(13);
    }

}
