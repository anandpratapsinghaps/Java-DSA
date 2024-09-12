package Strings;

public class ReverseWordInString {
    public static void main(String[] args) {
        String s = "  the   sky is blue ";
        System.out.println(reverseWord(s));
    }
    public static String reverseWord(String s){
        s = s.trim();
        String[] arr = s.split(" +");
        String ans = "";
        for(int i=arr.length-1; i>=0; i--){
            ans = ans + arr[i] + " ";
        }
        return ans.trim();
    }
}
