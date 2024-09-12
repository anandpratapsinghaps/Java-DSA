package Bit_Manipulation;

public class Tavas_and_SaDDas {
    public static void main(String[] args) {
        String s = "474744";
        System.out.println(idxOfn(s));
    }
    public static int idxOfn(String s){
        int n = s.length();
        //n-1 digit tk k saare count
        int c = (1 << n) - 2;
        int pos = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == '7'){
                c = c + (1 << pos);
            }
            pos++;
        }
        return c;
    }
}
