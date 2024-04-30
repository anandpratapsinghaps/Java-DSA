package Strings;

public class substring {
    public static String SubString(String str ,int start , int end){
        String substr="";
        for(int i=start; i<end; i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        // String str= "HelloWorld";
        // System.out.println(SubString(str, 0, 2));
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
