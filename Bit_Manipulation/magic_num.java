package Bit_Manipulation;

public class magic_num {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(Nth_MagicNum(n));
    }
    public static int Nth_MagicNum(int n){
        int ans = 0;
        int multi = 5;
        while(n > 0){
            if((n&1) != 0){
                ans += multi;
            }
            n >>= 1;
            multi *= 5;
        }
        return ans;
    }
}
