package Strings;
import java.util.*;

public class basic1 {
    public static void printletter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // String name;
        // name=sc.next();
        // name=sc.nextLine();
        // System.out.println(name);
        String firstname = "Anand";
        String lastname = "Singh";
        String fullname= firstname+" "+lastname;
        // System.out.println(fullname.length());
        printletter(fullname);
    }
}
