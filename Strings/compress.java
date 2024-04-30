package Strings;

public class compress {
    public static String Compress(String str){
        String newstr="";
        for(int i=0; i<str.length(); i++){
            Integer count=0;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr+=str.charAt(i);
        if(count>1){
            newstr+=count.toString();
        }
        }
        return newstr;
    }
    public static String stringcompress(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count=0;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="aaaaabbbbbcccc";
        // System.out.println(Compress(str));
        System.out.println(stringcompress(str));
    }
}
