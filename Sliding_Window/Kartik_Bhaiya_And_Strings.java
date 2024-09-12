package Sliding_Window;

public class Kartik_Bhaiya_And_Strings {
    public static void main(String[] args) {
        String s = "abababbaaaaba";
        int k = 2;
        int flipa = LongestLength(s, k, 'a');
        int flipb = LongestLength(s, k, 'b');
    }
    public static int LongestLength(String s, int k, char ch){
        int si = 0, ei = 0, ans = 0, flip = 0;
        while(ei < s.length()){
            //grow
            if(s.charAt(ei) == ch){
                flip++;
            }

            //shrink
            
        }
    }
}
