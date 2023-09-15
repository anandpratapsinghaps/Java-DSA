//contest 173 div 2---codeforces

import java.util.Scanner;

public class bitpro {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // int n=s.nextInt(),r=0;
        // while(n-->0)
        // r+=s.next().contains("+")?1:-1;
        // System.out.println(r);
        // s.close();
        char[] a=s.next().toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]>'4'){
                a[i]=(char)('9'-a[i]+'0');
                System.out.println(a);
            }
            if(a[i]=='0'){
                System.out.println('9');
            }
        }
    }
}
